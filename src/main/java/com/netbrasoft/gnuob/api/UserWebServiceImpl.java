package com.netbrasoft.gnuob.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-08-07T14:31:48.870+02:00
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "http://gnuob.netbrasoft.com/", name = "UserWebServiceImpl")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface UserWebServiceImpl {

    @WebResult(name = "countUserResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public CountUserResponse countUser(
        @WebParam(partName = "parameters", name = "countUser", targetNamespace = "http://gnuob.netbrasoft.com/")
        CountUser parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "findUserResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public FindUserResponse findUser(
        @WebParam(partName = "parameters", name = "findUser", targetNamespace = "http://gnuob.netbrasoft.com/")
        FindUser parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "findUserByIdResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public FindUserByIdResponse findUserById(
        @WebParam(partName = "parameters", name = "findUserById", targetNamespace = "http://gnuob.netbrasoft.com/")
        FindUserById parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "refreshUserResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public RefreshUserResponse refreshUser(
        @WebParam(partName = "parameters", name = "refreshUser", targetNamespace = "http://gnuob.netbrasoft.com/")
        RefreshUser parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "mergeUserResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public MergeUserResponse mergeUser(
        @WebParam(partName = "parameters", name = "mergeUser", targetNamespace = "http://gnuob.netbrasoft.com/")
        MergeUser parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "persistUserResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public PersistUserResponse persistUser(
        @WebParam(partName = "parameters", name = "persistUser", targetNamespace = "http://gnuob.netbrasoft.com/")
        PersistUser parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "removeUserResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "result")
    @WebMethod
    public RemoveUserResponse removeUser(
        @WebParam(partName = "parameters", name = "removeUser", targetNamespace = "http://gnuob.netbrasoft.com/")
        RemoveUser parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;
}