package com.netbrasoft.gnuob.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.5 2015-09-22T18:42:32.238+02:00
 * Generated source version: 3.0.5
 * 
 */
@WebService(targetNamespace = "http://gnuob.netbrasoft.com/", name = "PagseguroCheckOutWebServiceImpl")
@XmlSeeAlso({ ObjectFactory.class })
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface PagseguroCheckOutWebServiceImpl {

   @WebResult(name = "doRefundTransactionResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
   @WebMethod
   public DoRefundTransactionResponse doRefundTransaction(@WebParam(partName = "parameters", name = "doRefundTransaction", targetNamespace = "http://gnuob.netbrasoft.com/") DoRefundTransaction parameters,
         @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true) MetaData metaData);

   @WebResult(name = "doCheckoutPaymentResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
   @WebMethod
   public DoCheckoutPaymentResponse doCheckoutPayment(@WebParam(partName = "parameters", name = "doCheckoutPayment", targetNamespace = "http://gnuob.netbrasoft.com/") DoCheckoutPayment parameters,
         @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true) MetaData metaData);

   @WebResult(name = "doCheckoutResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
   @WebMethod
   public DoCheckoutResponse doCheckout(@WebParam(partName = "parameters", name = "doCheckout", targetNamespace = "http://gnuob.netbrasoft.com/") DoCheckout parameters,
         @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true) MetaData metaData);

   @WebResult(name = "doCheckoutDetailsResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
   @WebMethod
   public DoCheckoutDetailsResponse doCheckoutDetails(@WebParam(partName = "parameters", name = "doCheckoutDetails", targetNamespace = "http://gnuob.netbrasoft.com/") DoCheckoutDetails parameters,
         @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true) MetaData metaData);

   @WebResult(name = "doNotificationResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
   @WebMethod
   public DoNotificationResponse doNotification(@WebParam(partName = "parameters", name = "doNotification", targetNamespace = "http://gnuob.netbrasoft.com/") DoNotification parameters,
         @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true) MetaData metaData);

   @WebResult(name = "doTransactionDetailsResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
   @WebMethod
   public DoTransactionDetailsResponse doTransactionDetails(@WebParam(partName = "parameters", name = "doTransactionDetails", targetNamespace = "http://gnuob.netbrasoft.com/") DoTransactionDetails parameters,
         @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true) MetaData metaData);
}
