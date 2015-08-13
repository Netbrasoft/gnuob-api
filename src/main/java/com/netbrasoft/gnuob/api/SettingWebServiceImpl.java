package com.netbrasoft.gnuob.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.5
 * 2015-08-15T14:37:13.931+02:00
 * Generated source version: 3.0.5
 * 
 */
@WebService(targetNamespace = "http://gnuob.netbrasoft.com/", name = "SettingWebServiceImpl")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SettingWebServiceImpl {

    @WebMethod
    @WebResult(name = "mergeSettingResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    public MergeSettingResponse mergeSetting(
        @WebParam(partName = "parameters", name = "mergeSetting", targetNamespace = "http://gnuob.netbrasoft.com/")
        MergeSetting parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebMethod
    @WebResult(name = "persistSettingResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    public PersistSettingResponse persistSetting(
        @WebParam(partName = "parameters", name = "persistSetting", targetNamespace = "http://gnuob.netbrasoft.com/")
        PersistSetting parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebMethod
    @WebResult(name = "findSettingResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    public FindSettingResponse findSetting(
        @WebParam(partName = "parameters", name = "findSetting", targetNamespace = "http://gnuob.netbrasoft.com/")
        FindSetting parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebMethod
    @WebResult(name = "countSettingResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    public CountSettingResponse countSetting(
        @WebParam(partName = "parameters", name = "countSetting", targetNamespace = "http://gnuob.netbrasoft.com/")
        CountSetting parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebMethod
    @WebResult(name = "findSettingByIdResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    public FindSettingByIdResponse findSettingById(
        @WebParam(partName = "parameters", name = "findSettingById", targetNamespace = "http://gnuob.netbrasoft.com/")
        FindSettingById parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebMethod
    @WebResult(name = "refreshSettingResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    public RefreshSettingResponse refreshSetting(
        @WebParam(partName = "parameters", name = "refreshSetting", targetNamespace = "http://gnuob.netbrasoft.com/")
        RefreshSetting parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebMethod
    @WebResult(name = "removeSettingResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "result")
    public RemoveSettingResponse removeSetting(
        @WebParam(partName = "parameters", name = "removeSetting", targetNamespace = "http://gnuob.netbrasoft.com/")
        RemoveSetting parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );
}
