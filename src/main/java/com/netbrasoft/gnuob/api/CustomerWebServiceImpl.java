package com.netbrasoft.gnuob.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-08-07T14:31:44.811+02:00
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "http://gnuob.netbrasoft.com/", name = "CustomerWebServiceImpl")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CustomerWebServiceImpl {

    @WebResult(name = "refreshCustomerResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public RefreshCustomerResponse refreshCustomer(
        @WebParam(partName = "parameters", name = "refreshCustomer", targetNamespace = "http://gnuob.netbrasoft.com/")
        RefreshCustomer parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "mergeCustomerResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public MergeCustomerResponse mergeCustomer(
        @WebParam(partName = "parameters", name = "mergeCustomer", targetNamespace = "http://gnuob.netbrasoft.com/")
        MergeCustomer parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "findCustomerByIdResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public FindCustomerByIdResponse findCustomerById(
        @WebParam(partName = "parameters", name = "findCustomerById", targetNamespace = "http://gnuob.netbrasoft.com/")
        FindCustomerById parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "removeCustomerResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "result")
    @WebMethod
    public RemoveCustomerResponse removeCustomer(
        @WebParam(partName = "parameters", name = "removeCustomer", targetNamespace = "http://gnuob.netbrasoft.com/")
        RemoveCustomer parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "findCustomerResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public FindCustomerResponse findCustomer(
        @WebParam(partName = "parameters", name = "findCustomer", targetNamespace = "http://gnuob.netbrasoft.com/")
        FindCustomer parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "countCustomerResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public CountCustomerResponse countCustomer(
        @WebParam(partName = "parameters", name = "countCustomer", targetNamespace = "http://gnuob.netbrasoft.com/")
        CountCustomer parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "persistCustomerResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public PersistCustomerResponse persistCustomer(
        @WebParam(partName = "parameters", name = "persistCustomer", targetNamespace = "http://gnuob.netbrasoft.com/")
        PersistCustomer parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;
}