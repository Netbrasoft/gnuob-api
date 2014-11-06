package com.netbrasoft.gnuob.api;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.11 2014-12-04T22:21:51.314+01:00
 * Generated source version: 2.7.11
 * 
 */
@WebServiceClient(name = "PayPalExpressCheckOutWebServiceImplService", wsdlLocation = "http://localhost:8080/gnuob-soap/PayPalExpressCheckOutWebServiceImpl?wsdl", targetNamespace = "http://gnuob.netbrasoft.com/")
public class PayPalExpressCheckOutWebServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

	public final static QName SERVICE = new QName("http://gnuob.netbrasoft.com/", "PayPalExpressCheckOutWebServiceImplService");
	public final static QName PayPalExpressCheckOutWebServiceImplPort = new QName("http://gnuob.netbrasoft.com/", "PayPalExpressCheckOutWebServiceImplPort");
	static {
		URL url = null;
		try {
			url = new URL(System.getProperty("gnuob.paypal.site", "http://localhost:8080/gnuob-soap/PayPalExpressCheckOutWebServiceImpl?wsdl"));
		} catch (MalformedURLException e) {
			java.util.logging.Logger.getLogger(PayPalExpressCheckOutWebServiceImplService.class.getName()).log(java.util.logging.Level.INFO, "Can not initialize the default wsdl from {0}",
					"http://localhost:8080/gnuob-soap/PayPalExpressCheckOutWebServiceImpl?wsdl");
		}
		WSDL_LOCATION = url;
	}

    public PayPalExpressCheckOutWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PayPalExpressCheckOutWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PayPalExpressCheckOutWebServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    // This constructor requires JAX-WS API 2.2. You will need to endorse the
    // 2.2
    // API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS
    // 2.1
    // compliant code instead.
    public PayPalExpressCheckOutWebServiceImplService(WebServiceFeature... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    // This constructor requires JAX-WS API 2.2. You will need to endorse the
    // 2.2
    // API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS
    // 2.1
    // compliant code instead.
    public PayPalExpressCheckOutWebServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE, features);
    }

    // This constructor requires JAX-WS API 2.2. You will need to endorse the
    // 2.2
    // API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS
    // 2.1
    // compliant code instead.
    public PayPalExpressCheckOutWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return returns PayPalExpressCheckOutWebServiceImpl
     */
    @WebEndpoint(name = "PayPalExpressCheckOutWebServiceImplPort")
    public PayPalExpressCheckOutWebServiceImpl getPayPalExpressCheckOutWebServiceImplPort() {
        return super.getPort(PayPalExpressCheckOutWebServiceImplPort, PayPalExpressCheckOutWebServiceImpl.class);
    }

    /**
     * 
     * @param features
     *            A list of {@link javax.xml.ws.WebServiceFeature} to configure
     *            on the proxy. Supported features not in the
     *            <code>features</code> parameter will have their default
     *            values.
     * @return returns PayPalExpressCheckOutWebServiceImpl
     */
    @WebEndpoint(name = "PayPalExpressCheckOutWebServiceImplPort")
    public PayPalExpressCheckOutWebServiceImpl getPayPalExpressCheckOutWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(PayPalExpressCheckOutWebServiceImplPort, PayPalExpressCheckOutWebServiceImpl.class, features);
    }

}
