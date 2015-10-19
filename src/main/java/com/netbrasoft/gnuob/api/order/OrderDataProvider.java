package com.netbrasoft.gnuob.api.order;

import javax.annotation.Resource;

import org.javasimon.aop.Monitored;
import org.springframework.stereotype.Controller;

import com.netbrasoft.gnuob.api.Order;
import com.netbrasoft.gnuob.api.generic.AbstractGenericTypeDataProvider;
import com.netbrasoft.gnuob.api.generic.GenericTypeWebServiceRepository;

@Monitored
@Controller("OrderDataProvider")
public class OrderDataProvider<O extends Order> extends AbstractGenericTypeDataProvider<O> implements GenericOrderCheckoutDataProvider<O> {

  public enum CheckOut {
    PAY_PAL, PAGSEGURO;

    public static CheckOut fromValue(String v) {
      return valueOf(v);
    }

    public String value() {
      return name();
    }
  }

  private static final long serialVersionUID = 1434788743241708993L;

  @Resource(name = "OrderWebServiceRepository")
  private transient GenericTypeWebServiceRepository<O> orderWebServiceRepository;

  @Resource(name = "PayPalExpressCheckOutWebServiceRepository")
  private transient CheckoutWebServiceRepository<O> payPalExpressCheckoutWebServiceRepository;

  @Resource(name = "PagseguroCheckOutWebServiceRepository")
  private transient CheckoutWebServiceRepository<O> pagseguroCheckoutWebServiceRepository;

  private CheckOut checkOut;

  @SuppressWarnings("unchecked")
  public OrderDataProvider() {
    super((O) new Order());
    checkOut = CheckOut.PAY_PAL;
  }

  @Override
  public O doCheckout(O paramOrder) {
    if (checkOut == CheckOut.PAGSEGURO) {
      return pagseguroCheckoutWebServiceRepository.doCheckout(metaData, paramOrder);
    }
    return payPalExpressCheckoutWebServiceRepository.doCheckout(metaData, paramOrder);
  }

  @Override
  public O doCheckoutDetails(O paramOrder) {
    if (checkOut == CheckOut.PAGSEGURO) {
      return pagseguroCheckoutWebServiceRepository.doCheckoutDetails(metaData, paramOrder);
    }
    return payPalExpressCheckoutWebServiceRepository.doCheckoutDetails(metaData, paramOrder);
  }

  @Override
  public O doCheckoutPayment(O paramOrder) {
    if (checkOut == CheckOut.PAGSEGURO) {
      return pagseguroCheckoutWebServiceRepository.doCheckoutPayment(metaData, paramOrder);
    }
    return payPalExpressCheckoutWebServiceRepository.doCheckoutPayment(metaData, paramOrder);
  }

  @Override
  public O doNotification(O paramOrder) {
    if (checkOut == CheckOut.PAGSEGURO) {
      return pagseguroCheckoutWebServiceRepository.doNotification(metaData, paramOrder);
    }
    return payPalExpressCheckoutWebServiceRepository.doNotification(metaData, paramOrder);
  }

  @Override
  public O doRefundTransaction(O paramOrder) {
    if (checkOut == CheckOut.PAGSEGURO) {
      return pagseguroCheckoutWebServiceRepository.doRefundTransaction(metaData, paramOrder);
    }
    return payPalExpressCheckoutWebServiceRepository.doRefundTransaction(metaData, paramOrder);
  }

  @Override
  public O doTransactionDetails(O paramOrder) {
    if (checkOut == CheckOut.PAGSEGURO) {
      return pagseguroCheckoutWebServiceRepository.doTransactionDetails(metaData, paramOrder);
    }
    return payPalExpressCheckoutWebServiceRepository.doTransactionDetails(metaData, paramOrder);
  }

  @Override
  public CheckOut getCheckOut() {
    return checkOut;
  }

  @Override
  public GenericTypeWebServiceRepository<O> getGenericTypeWebServiceRepository() {
    return orderWebServiceRepository;
  }

  @Override
  public void setCheckOut(CheckOut checkOut) {
    this.checkOut = checkOut;
  }
}
