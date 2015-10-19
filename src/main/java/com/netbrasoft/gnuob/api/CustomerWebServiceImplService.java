package com.netbrasoft.gnuob.api;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.2-jbossorg-2 2015-10-23T20:19:18.454+02:00 Generated
 * source version: 3.1.2-jbossorg-2
 * 
 */
@WebServiceClient(name = "CustomerWebServiceImplService", wsdlLocation = "http://localhost:8080/gnuob-soap/CustomerWebServiceImpl?wsdl",
    targetNamespace = "http://gnuob.netbrasoft.com/")
public class CustomerWebServiceImplService extends Service {

  public final static URL WSDL_LOCATION;

  public final static QName SERVICE = new QName("http://gnuob.netbrasoft.com/", "CustomerWebServiceImplService");
  public final static QName CustomerWebServiceImplPort = new QName("http://gnuob.netbrasoft.com/", "CustomerWebServiceImplPort");

  static {
    URL url = null;
    try {
      url = new URL("http://localhost:8080/gnuob-soap/CustomerWebServiceImpl?wsdl");
    } catch (MalformedURLException e) {
      java.util.logging.Logger.getLogger(CustomerWebServiceImplService.class.getName()).log(java.util.logging.Level.INFO, "Can not initialize the default wsdl from {0}",
          "http://localhost:8080/gnuob-soap/CustomerWebServiceImpl?wsdl");
    }
    WSDL_LOCATION = url;
  }

  public CustomerWebServiceImplService(URL wsdlLocation) {
    super(wsdlLocation, SERVICE);
  }

  public CustomerWebServiceImplService(URL wsdlLocation, QName serviceName) {
    super(wsdlLocation, serviceName);
  }

  public CustomerWebServiceImplService() {
    super(WSDL_LOCATION, SERVICE);
  }

  public CustomerWebServiceImplService(WebServiceFeature... features) {
    super(WSDL_LOCATION, SERVICE, features);
  }

  public CustomerWebServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
    super(wsdlLocation, SERVICE, features);
  }

  public CustomerWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
    super(wsdlLocation, serviceName, features);
  }

  /**
   *
   * @return returns CustomerWebServiceImpl
   */
  @WebEndpoint(name = "CustomerWebServiceImplPort")
  public CustomerWebServiceImpl getCustomerWebServiceImplPort() {
    return super.getPort(CustomerWebServiceImplPort, CustomerWebServiceImpl.class);
  }

  /**
   * 
   * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.
   *        Supported features not in the <code>features</code> parameter will have their default
   *        values.
   * @return returns CustomerWebServiceImpl
   */
  @WebEndpoint(name = "CustomerWebServiceImplPort")
  public CustomerWebServiceImpl getCustomerWebServiceImplPort(WebServiceFeature... features) {
    return super.getPort(CustomerWebServiceImplPort, CustomerWebServiceImpl.class, features);
  }

}
