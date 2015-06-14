package com.netbrasoft.gnuob.api;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.4 2015-06-13T20:34:04.552+02:00
 * Generated source version: 3.0.4
 * 
 */
@WebServiceClient(name = "ContentWebServiceImplService", wsdlLocation = "http://localhost:8080/gnuob-soap/ContentWebServiceImpl?wsdl", targetNamespace = "http://gnuob.netbrasoft.com/")
public class ContentWebServiceImplService extends Service {

   public final static URL WSDL_LOCATION;

   public final static QName SERVICE = new QName("http://gnuob.netbrasoft.com/", "ContentWebServiceImplService");
   public final static QName ContentWebServiceImplPort = new QName("http://gnuob.netbrasoft.com/", "ContentWebServiceImplPort");

   static {
      URL url = null;
      try {
         url = new URL("http://localhost:8080/gnuob-soap/ContentWebServiceImpl?wsdl");
      } catch (MalformedURLException e) {
         java.util.logging.Logger.getLogger(ContentWebServiceImplService.class.getName()).log(java.util.logging.Level.INFO, "Can not initialize the default wsdl from {0}", "http://localhost:8080/gnuob-soap/ContentWebServiceImpl?wsdl");
      }
      WSDL_LOCATION = url;
   }

   public ContentWebServiceImplService(URL wsdlLocation) {
      super(wsdlLocation, SERVICE);
   }

   public ContentWebServiceImplService(URL wsdlLocation, QName serviceName) {
      super(wsdlLocation, serviceName);
   }

   public ContentWebServiceImplService() {
      super(WSDL_LOCATION, SERVICE);
   }

   // This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
   // API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS
   // 2.1
   // compliant code instead.
   public ContentWebServiceImplService(WebServiceFeature... features) {
      super(WSDL_LOCATION, SERVICE, features);
   }

   // This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
   // API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS
   // 2.1
   // compliant code instead.
   public ContentWebServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
      super(wsdlLocation, SERVICE, features);
   }

   // This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
   // API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS
   // 2.1
   // compliant code instead.
   public ContentWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
      super(wsdlLocation, serviceName, features);
   }

   /**
    *
    * @return returns ContentWebServiceImpl
    */
   @WebEndpoint(name = "ContentWebServiceImplPort")
   public ContentWebServiceImpl getContentWebServiceImplPort() {
      return super.getPort(ContentWebServiceImplPort, ContentWebServiceImpl.class);
   }

   /**
    * 
    * @param features
    *           A list of {@link javax.xml.ws.WebServiceFeature} to configure on
    *           the proxy. Supported features not in the <code>features</code>
    *           parameter will have their default values.
    * @return returns ContentWebServiceImpl
    */
   @WebEndpoint(name = "ContentWebServiceImplPort")
   public ContentWebServiceImpl getContentWebServiceImplPort(WebServiceFeature... features) {
      return super.getPort(ContentWebServiceImplPort, ContentWebServiceImpl.class, features);
   }

}
