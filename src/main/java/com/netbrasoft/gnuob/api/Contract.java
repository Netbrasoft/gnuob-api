
package com.netbrasoft.gnuob.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for contract complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="contract"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://gnuob.netbrasoft.com/}access"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customer" type="{http://gnuob.netbrasoft.com/}customer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contract", propOrder = { "contractId", "customer" })
public class Contract extends Access implements Serializable {

   private static final long serialVersionUID = 1063097896490794439L;
   @XmlElement(required = true)
   protected String contractId;
   @XmlElement(required = true)
   protected Customer customer;

   /**
    * Gets the value of the contractId property.
    * 
    * @return possible object is {@link String }
    * 
    */
   public String getContractId() {
      return contractId;
   }

   /**
    * Sets the value of the contractId property.
    * 
    * @param value
    *           allowed object is {@link String }
    * 
    */
   public void setContractId(String value) {
      this.contractId = value;
   }

   /**
    * Gets the value of the customer property.
    * 
    * @return possible object is {@link Customer }
    * 
    */
   public Customer getCustomer() {
      return customer;
   }

   /**
    * Sets the value of the customer property.
    * 
    * @param value
    *           allowed object is {@link Customer }
    * 
    */
   public void setCustomer(Customer value) {
      this.customer = value;
   }

}
