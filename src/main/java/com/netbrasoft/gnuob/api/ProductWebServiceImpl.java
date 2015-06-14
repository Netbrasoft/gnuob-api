package com.netbrasoft.gnuob.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.4 2015-06-13T20:33:55.929+02:00
 * Generated source version: 3.0.4
 * 
 */
@WebService(targetNamespace = "http://gnuob.netbrasoft.com/", name = "ProductWebServiceImpl")
@XmlSeeAlso({ ObjectFactory.class })
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ProductWebServiceImpl {

   @WebMethod
   @WebResult(name = "countProductResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
   public CountProductResponse countProduct(@WebParam(partName = "parameters", name = "countProduct", targetNamespace = "http://gnuob.netbrasoft.com/") CountProduct parameters,
         @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true) MetaData metaData);

   @WebMethod
   @WebResult(name = "findProductResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
   public FindProductResponse findProduct(@WebParam(partName = "parameters", name = "findProduct", targetNamespace = "http://gnuob.netbrasoft.com/") FindProduct parameters,
         @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true) MetaData metaData);

   @WebMethod
   @WebResult(name = "removeProductResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "result")
   public RemoveProductResponse removeProduct(@WebParam(partName = "parameters", name = "removeProduct", targetNamespace = "http://gnuob.netbrasoft.com/") RemoveProduct parameters,
         @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true) MetaData metaData);

   @WebMethod
   @WebResult(name = "findProductByIdResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
   public FindProductByIdResponse findProductById(@WebParam(partName = "parameters", name = "findProductById", targetNamespace = "http://gnuob.netbrasoft.com/") FindProductById parameters,
         @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true) MetaData metaData);

   @WebMethod
   @WebResult(name = "persistProductResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
   public PersistProductResponse persistProduct(@WebParam(partName = "parameters", name = "persistProduct", targetNamespace = "http://gnuob.netbrasoft.com/") PersistProduct parameters,
         @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true) MetaData metaData);

   @WebMethod
   @WebResult(name = "refreshProductResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
   public RefreshProductResponse refreshProduct(@WebParam(partName = "parameters", name = "refreshProduct", targetNamespace = "http://gnuob.netbrasoft.com/") RefreshProduct parameters,
         @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true) MetaData metaData);

   @WebMethod
   @WebResult(name = "mergeProductResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
   public MergeProductResponse mergeProduct(@WebParam(partName = "parameters", name = "mergeProduct", targetNamespace = "http://gnuob.netbrasoft.com/") MergeProduct parameters,
         @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true) MetaData metaData);
}
