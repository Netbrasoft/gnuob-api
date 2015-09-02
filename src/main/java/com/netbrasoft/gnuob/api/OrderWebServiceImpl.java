package com.netbrasoft.gnuob.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.5
 * 2015-09-02T18:54:39.626+02:00
 * Generated source version: 3.0.5
 * 
 */
@WebService(targetNamespace = "http://gnuob.netbrasoft.com/", name = "OrderWebServiceImpl")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface OrderWebServiceImpl {

    @WebResult(name = "findOrderResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public FindOrderResponse findOrder(
        @WebParam(partName = "parameters", name = "findOrder", targetNamespace = "http://gnuob.netbrasoft.com/")
        FindOrder parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebResult(name = "countOrderResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public CountOrderResponse countOrder(
        @WebParam(partName = "parameters", name = "countOrder", targetNamespace = "http://gnuob.netbrasoft.com/")
        CountOrder parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebResult(name = "persistOrderResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public PersistOrderResponse persistOrder(
        @WebParam(partName = "parameters", name = "persistOrder", targetNamespace = "http://gnuob.netbrasoft.com/")
        PersistOrder parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebResult(name = "refreshOrderResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public RefreshOrderResponse refreshOrder(
        @WebParam(partName = "parameters", name = "refreshOrder", targetNamespace = "http://gnuob.netbrasoft.com/")
        RefreshOrder parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebResult(name = "removeOrderResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "result")
    @WebMethod
    public RemoveOrderResponse removeOrder(
        @WebParam(partName = "parameters", name = "removeOrder", targetNamespace = "http://gnuob.netbrasoft.com/")
        RemoveOrder parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebResult(name = "findOrderByIdResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public FindOrderByIdResponse findOrderById(
        @WebParam(partName = "parameters", name = "findOrderById", targetNamespace = "http://gnuob.netbrasoft.com/")
        FindOrderById parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebResult(name = "mergeOrderResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public MergeOrderResponse mergeOrder(
        @WebParam(partName = "parameters", name = "mergeOrder", targetNamespace = "http://gnuob.netbrasoft.com/")
        MergeOrder parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );
}
