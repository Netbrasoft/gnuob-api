package com.netbrasoft.gnuob.generic.order;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;
import java.util.UUID;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.netbrasoft.gnuob.api.Address;
import com.netbrasoft.gnuob.api.Contract;
import com.netbrasoft.gnuob.api.Customer;
import com.netbrasoft.gnuob.api.GNUOpenBusinessServiceException_Exception;
import com.netbrasoft.gnuob.api.Invoice;
import com.netbrasoft.gnuob.api.MetaData;
import com.netbrasoft.gnuob.api.Order;
import com.netbrasoft.gnuob.api.OrderRecord;
import com.netbrasoft.gnuob.api.Product;
import com.netbrasoft.gnuob.api.Shipment;
import com.netbrasoft.gnuob.api.Stock;
import com.netbrasoft.gnuob.api.SubCategory;
import com.netbrasoft.gnuob.api.order.OrderWebServiceRepository;
import com.netbrasoft.gnuob.api.order.PagseguroCheckOutWebServiceRepository;
import com.netbrasoft.gnuob.api.product.ProductWebServiceRepository;
import com.netbrasoft.gnuob.generic.utils.Utils;

@RunWith(Arquillian.class)
public class PagseguroCheckOutWebServiceRepositoryTest {

   @Deployment(testable = false)
   public static Archive<?> createDeployment() {
      return Utils.createDeployment();
   }

   @Drone
   private WebDriver driver;

   private ProductWebServiceRepository<Product> productWebServiceRepository = new ProductWebServiceRepository<Product>();
   private OrderWebServiceRepository<Order> orderWebServiceRepository = new OrderWebServiceRepository<Order>();
   private PagseguroCheckOutWebServiceRepository<Order> pagseguroCheckOutWebServiceRepository = new PagseguroCheckOutWebServiceRepository<Order>();
   private MetaData metaData = null;
   private Customer customer = null;
   private Contract contract = null;
   private Address address = null;
   private Product product = null;
   private Order order = null;
   private Invoice invoice = null;
   private Shipment shipment = null;

   @Before
   public void testBefore() {
      Random randomGenerator = new Random();

      metaData = new MetaData();
      customer = new Customer();
      address = new Address();
      contract = new Contract();
      product = new Product();
      order = new Order();
      invoice = new Invoice();
      shipment = new Shipment();

      metaData.setUser("administrator");
      metaData.setPassword("administrator");
      metaData.setSite("www.netbrasoft.com");

      address.setCityName(UUID.randomUUID().toString());
      address.setStreet1(UUID.randomUUID().toString());
      address.setNumber("815");
      address.setCountry("BR");
      address.setStateOrProvince("ES");
      address.setPostalCode("29072-230");

      customer.setFirstName("Bernard Arjan");
      customer.setLastName("Draaisma");
      customer.setBuyerEmail("c77487489899036884556@sandbox.pagseguro.com.br");
      customer.setAddress(address);
      customer.setDateOfBirth("2014-12-31");

      contract.setCustomer(customer);

      product.setName(UUID.randomUUID().toString());
      product.setDescription(UUID.randomUUID().toString());
      product.setNumber(UUID.randomUUID().toString());
      product.setAmount(BigDecimal.valueOf(10.00));
      product.setTax(BigDecimal.ZERO);
      product.setDiscount(BigDecimal.ZERO);
      product.setRecommended(randomGenerator.nextBoolean());
      product.setRating(randomGenerator.nextInt());
      product.setBestsellers(randomGenerator.nextBoolean());
      product.setShippingCost(BigDecimal.valueOf(7.95));
      product.setItemWeight(BigDecimal.ZERO);

      Stock stock = new Stock();
      stock.setMaxQuantity(BigInteger.valueOf(100));
      stock.setMinQuantity(BigInteger.ZERO);
      stock.setQuantity(BigInteger.valueOf(30));

      product.setStock(stock);

      SubCategory subCategory = new SubCategory();
      subCategory.setName(UUID.randomUUID().toString());
      subCategory.setDescription(UUID.randomUUID().toString());

      product.getSubCategories().add(subCategory);

      invoice.setAddress(address);

      shipment.setShipmentType("NOT_SPECIFIED");
      shipment.setAddress(address);

      order.setInsuranceTotal(BigDecimal.ZERO);
      order.setHandlingTotal(BigDecimal.ZERO);
      order.setExtraAmount(BigDecimal.ZERO);
      order.setShippingDiscount(BigDecimal.ZERO);
      order.setContract(contract);
      order.setInvoice(invoice);
      order.setShipment(shipment);
   }

   @Test
   public void testPersistOrderAndDoCheckOut() throws GNUOpenBusinessServiceException_Exception, InterruptedException {
      String productName = product.getName();
      String productDescription = product.getDescription();

      Product persistProduct = productWebServiceRepository.persist(metaData, product);

      Assert.assertTrue("Product id has no value bigger than zero.", persistProduct.getId() > 0);
      Assert.assertEquals("Product name is not equal.", productName, persistProduct.getName());
      Assert.assertEquals("Product description is not equal.", productDescription, persistProduct.getDescription());

      OrderRecord orderRecord = new OrderRecord();
      orderRecord.setQuantity(BigInteger.ONE);
      orderRecord.setProduct(persistProduct);

      order.getRecords().add(orderRecord);

      Order persistOrder = orderWebServiceRepository.persist(metaData, order);

      Assert.assertTrue("Order id has no value bigger than zero.", persistOrder.getId() > 0);

      Order checkoutOrder = pagseguroCheckOutWebServiceRepository.doCheckout(metaData, persistOrder);
      checkoutOrder = orderWebServiceRepository.find(metaData, checkoutOrder);

      Assert.assertNotNull("Order token has no value.", checkoutOrder.getToken());

      WebDriverWait webDriverWait = new WebDriverWait(driver, 60);

      driver.get("https://sandbox.pagseguro.uol.com.br/v2/checkout/payment.html?code=" + checkoutOrder.getToken());
      driver.findElement(By.id("senderPassword")).sendKeys("pC4u57FT8060Cw7d");
      driver.findElement(By.tagName("button")).click();
      driver.findElement(By.id("creditCardCVV_wallet")).sendKeys("123");
      driver.findElement(By.id("walletInstallmentQuantity")).findElements(By.tagName("option")).get(1).click();
      driver.findElement(By.id("walletHolderCPF")).sendKeys("553.887.423-00");
      driver.findElement(By.id("walletHolderBornDate")).sendKeys("20/05/1980");
      driver.findElement(By.id("senderCPF")).sendKeys("553.887.423-00");
      driver.findElement(By.id("continueToPayment")).click();

      webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("backToShop")));
      driver.findElement(By.id("backToShop")).click();

      Thread.sleep(5000);

      checkoutOrder.setTransactionId(driver.getTitle().split("transaction_id=")[1].split(" ")[0]);
      Assert.assertNotNull("Order transaction id has no value.", checkoutOrder.getTransactionId());

      driver.close();

      Order checkoutDetailsOrder = pagseguroCheckOutWebServiceRepository.doCheckoutDetails(metaData, checkoutOrder);
      checkoutDetailsOrder = orderWebServiceRepository.find(metaData, checkoutDetailsOrder);

      Order checkoutPaymentOrder = pagseguroCheckOutWebServiceRepository.doCheckoutPayment(metaData, checkoutDetailsOrder);
      checkoutPaymentOrder = orderWebServiceRepository.find(metaData, checkoutPaymentOrder);

      Assert.assertNotNull("Order transaction id has no value.", checkoutPaymentOrder.getTransactionId());

   }
}
