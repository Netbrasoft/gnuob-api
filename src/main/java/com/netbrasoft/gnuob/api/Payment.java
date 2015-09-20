
package com.netbrasoft.gnuob.api;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for payment complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="payment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://gnuob.netbrasoft.com/}type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="exchangeRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="feeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="grossAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="holdDecision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="installmentCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="paymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="paymentRequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pendingReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="protectionEligibilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="settleAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="storeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="terminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment", propOrder = { "exchangeRate", "feeAmount", "grossAmount", "holdDecision", "installmentCount", "paymentDate", "paymentRequestId", "paymentStatus", "paymentType", "pendingReason", "protectionEligibilityType", "reasonCode",
      "settleAmount", "storeId", "taxAmount", "terminalId", "transactionId", "transactionType" })
public class Payment extends Type implements Serializable {

   private static final long serialVersionUID = 2340662684512087852L;
   protected String exchangeRate;
   protected BigDecimal feeAmount;
   @XmlElement(required = true)
   protected BigDecimal grossAmount;
   protected String holdDecision;
   protected BigInteger installmentCount;
   @XmlSchemaType(name = "dateTime")
   protected XMLGregorianCalendar paymentDate;
   protected String paymentRequestId;
   @XmlElement(required = true)
   protected String paymentStatus;
   @XmlElement(required = true)
   protected String paymentType;
   protected String pendingReason;
   protected String protectionEligibilityType;
   protected String reasonCode;
   protected BigDecimal settleAmount;
   protected String storeId;
   protected BigDecimal taxAmount;
   protected String terminalId;
   @XmlElement(required = true)
   protected String transactionId;
   @XmlElement(required = true)
   protected String transactionType;

   /**
    * Gets the value of the exchangeRate property.
    * 
    * @return possible object is {@link String }
    * 
    */
   public String getExchangeRate() {
      return exchangeRate;
   }

   /**
    * Sets the value of the exchangeRate property.
    * 
    * @param value
    *           allowed object is {@link String }
    * 
    */
   public void setExchangeRate(String value) {
      this.exchangeRate = value;
   }

   /**
    * Gets the value of the feeAmount property.
    * 
    * @return possible object is {@link BigDecimal }
    * 
    */
   public BigDecimal getFeeAmount() {
      return feeAmount;
   }

   /**
    * Sets the value of the feeAmount property.
    * 
    * @param value
    *           allowed object is {@link BigDecimal }
    * 
    */
   public void setFeeAmount(BigDecimal value) {
      this.feeAmount = value;
   }

   /**
    * Gets the value of the grossAmount property.
    * 
    * @return possible object is {@link BigDecimal }
    * 
    */
   public BigDecimal getGrossAmount() {
      return grossAmount;
   }

   /**
    * Sets the value of the grossAmount property.
    * 
    * @param value
    *           allowed object is {@link BigDecimal }
    * 
    */
   public void setGrossAmount(BigDecimal value) {
      this.grossAmount = value;
   }

   /**
    * Gets the value of the holdDecision property.
    * 
    * @return possible object is {@link String }
    * 
    */
   public String getHoldDecision() {
      return holdDecision;
   }

   /**
    * Sets the value of the holdDecision property.
    * 
    * @param value
    *           allowed object is {@link String }
    * 
    */
   public void setHoldDecision(String value) {
      this.holdDecision = value;
   }

   /**
    * Gets the value of the installmentCount property.
    * 
    * @return possible object is {@link BigInteger }
    * 
    */
   public BigInteger getInstallmentCount() {
      return installmentCount;
   }

   /**
    * Sets the value of the installmentCount property.
    * 
    * @param value
    *           allowed object is {@link BigInteger }
    * 
    */
   public void setInstallmentCount(BigInteger value) {
      this.installmentCount = value;
   }

   /**
    * Gets the value of the paymentDate property.
    * 
    * @return possible object is {@link XMLGregorianCalendar }
    * 
    */
   public XMLGregorianCalendar getPaymentDate() {
      return paymentDate;
   }

   /**
    * Sets the value of the paymentDate property.
    * 
    * @param value
    *           allowed object is {@link XMLGregorianCalendar }
    * 
    */
   public void setPaymentDate(XMLGregorianCalendar value) {
      this.paymentDate = value;
   }

   /**
    * Gets the value of the paymentRequestId property.
    * 
    * @return possible object is {@link String }
    * 
    */
   public String getPaymentRequestId() {
      return paymentRequestId;
   }

   /**
    * Sets the value of the paymentRequestId property.
    * 
    * @param value
    *           allowed object is {@link String }
    * 
    */
   public void setPaymentRequestId(String value) {
      this.paymentRequestId = value;
   }

   /**
    * Gets the value of the paymentStatus property.
    * 
    * @return possible object is {@link String }
    * 
    */
   public String getPaymentStatus() {
      return paymentStatus;
   }

   /**
    * Sets the value of the paymentStatus property.
    * 
    * @param value
    *           allowed object is {@link String }
    * 
    */
   public void setPaymentStatus(String value) {
      this.paymentStatus = value;
   }

   /**
    * Gets the value of the paymentType property.
    * 
    * @return possible object is {@link String }
    * 
    */
   public String getPaymentType() {
      return paymentType;
   }

   /**
    * Sets the value of the paymentType property.
    * 
    * @param value
    *           allowed object is {@link String }
    * 
    */
   public void setPaymentType(String value) {
      this.paymentType = value;
   }

   /**
    * Gets the value of the pendingReason property.
    * 
    * @return possible object is {@link String }
    * 
    */
   public String getPendingReason() {
      return pendingReason;
   }

   /**
    * Sets the value of the pendingReason property.
    * 
    * @param value
    *           allowed object is {@link String }
    * 
    */
   public void setPendingReason(String value) {
      this.pendingReason = value;
   }

   /**
    * Gets the value of the protectionEligibilityType property.
    * 
    * @return possible object is {@link String }
    * 
    */
   public String getProtectionEligibilityType() {
      return protectionEligibilityType;
   }

   /**
    * Sets the value of the protectionEligibilityType property.
    * 
    * @param value
    *           allowed object is {@link String }
    * 
    */
   public void setProtectionEligibilityType(String value) {
      this.protectionEligibilityType = value;
   }

   /**
    * Gets the value of the reasonCode property.
    * 
    * @return possible object is {@link String }
    * 
    */
   public String getReasonCode() {
      return reasonCode;
   }

   /**
    * Sets the value of the reasonCode property.
    * 
    * @param value
    *           allowed object is {@link String }
    * 
    */
   public void setReasonCode(String value) {
      this.reasonCode = value;
   }

   /**
    * Gets the value of the settleAmount property.
    * 
    * @return possible object is {@link BigDecimal }
    * 
    */
   public BigDecimal getSettleAmount() {
      return settleAmount;
   }

   /**
    * Sets the value of the settleAmount property.
    * 
    * @param value
    *           allowed object is {@link BigDecimal }
    * 
    */
   public void setSettleAmount(BigDecimal value) {
      this.settleAmount = value;
   }

   /**
    * Gets the value of the storeId property.
    * 
    * @return possible object is {@link String }
    * 
    */
   public String getStoreId() {
      return storeId;
   }

   /**
    * Sets the value of the storeId property.
    * 
    * @param value
    *           allowed object is {@link String }
    * 
    */
   public void setStoreId(String value) {
      this.storeId = value;
   }

   /**
    * Gets the value of the taxAmount property.
    * 
    * @return possible object is {@link BigDecimal }
    * 
    */
   public BigDecimal getTaxAmount() {
      return taxAmount;
   }

   /**
    * Sets the value of the taxAmount property.
    * 
    * @param value
    *           allowed object is {@link BigDecimal }
    * 
    */
   public void setTaxAmount(BigDecimal value) {
      this.taxAmount = value;
   }

   /**
    * Gets the value of the terminalId property.
    * 
    * @return possible object is {@link String }
    * 
    */
   public String getTerminalId() {
      return terminalId;
   }

   /**
    * Sets the value of the terminalId property.
    * 
    * @param value
    *           allowed object is {@link String }
    * 
    */
   public void setTerminalId(String value) {
      this.terminalId = value;
   }

   /**
    * Gets the value of the transactionId property.
    * 
    * @return possible object is {@link String }
    * 
    */
   public String getTransactionId() {
      return transactionId;
   }

   /**
    * Sets the value of the transactionId property.
    * 
    * @param value
    *           allowed object is {@link String }
    * 
    */
   public void setTransactionId(String value) {
      this.transactionId = value;
   }

   /**
    * Gets the value of the transactionType property.
    * 
    * @return possible object is {@link String }
    * 
    */
   public String getTransactionType() {
      return transactionType;
   }

   /**
    * Sets the value of the transactionType property.
    * 
    * @param value
    *           allowed object is {@link String }
    * 
    */
   public void setTransactionType(String value) {
      this.transactionType = value;
   }

}
