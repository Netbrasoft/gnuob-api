package com.netbrasoft.gnuob.api;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 2.7.11 2014-08-31T16:53:20.295+02:00
 * Generated source version: 2.7.11
 *
 */
@WebServiceClient(name = "GroupWebServiceImplService", wsdlLocation = "http://localhost:8080/gnuob-soap/GroupWebServiceImpl?wsdl", targetNamespace = "http://gnuob.netbrasoft.com/")
public class GroupWebServiceImplService extends Service {

	public final static URL WSDL_LOCATION;

	public final static QName SERVICE = new QName("http://gnuob.netbrasoft.com/", "GroupWebServiceImplService");
	public final static QName GroupWebServiceImplPort = new QName("http://gnuob.netbrasoft.com/", "GroupWebServiceImplPort");
	static {
		URL url = null;
		try {
			url = new URL(System.getProperty("gnuob.group.site", "http://localhost:8080/gnuob-soap/GroupWebServiceImpl?wsdl"));
		} catch (MalformedURLException e) {
			java.util.logging.Logger.getLogger(GroupWebServiceImplService.class.getName()).log(java.util.logging.Level.INFO, "Can not initialize the default wsdl from {0}", "http://localhost:8080/gnuob-soap/GroupWebServiceImpl?wsdl");
		}
		WSDL_LOCATION = url;
	}

	public GroupWebServiceImplService() {
		super(WSDL_LOCATION, SERVICE);
	}

	public GroupWebServiceImplService(URL wsdlLocation) {
		super(wsdlLocation, SERVICE);
	}

	public GroupWebServiceImplService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	// This constructor requires JAX-WS API 2.2. You will need to endorse the
	// 2.2
	// API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS
	// 2.1
	// compliant code instead.
	public GroupWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
		super(wsdlLocation, serviceName, features);
	}

	// This constructor requires JAX-WS API 2.2. You will need to endorse the
	// 2.2
	// API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS
	// 2.1
	// compliant code instead.
	public GroupWebServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
		super(wsdlLocation, SERVICE, features);
	}

	// This constructor requires JAX-WS API 2.2. You will need to endorse the
	// 2.2
	// API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS
	// 2.1
	// compliant code instead.
	public GroupWebServiceImplService(WebServiceFeature... features) {
		super(WSDL_LOCATION, SERVICE, features);
	}

	/**
	 *
	 * @return returns GroupWebServiceImpl
	 */
	@WebEndpoint(name = "GroupWebServiceImplPort")
	public GroupWebServiceImpl getGroupWebServiceImplPort() {
		return super.getPort(GroupWebServiceImplPort, GroupWebServiceImpl.class);
	}

	/**
	 * 
	 * @param features
	 *            A list of {@link javax.xml.ws.WebServiceFeature} to configure
	 *            on the proxy. Supported features not in the
	 *            <code>features</code> parameter will have their default
	 *            values.
	 * @return returns GroupWebServiceImpl
	 */
	@WebEndpoint(name = "GroupWebServiceImplPort")
	public GroupWebServiceImpl getGroupWebServiceImplPort(WebServiceFeature... features) {
		return super.getPort(GroupWebServiceImplPort, GroupWebServiceImpl.class, features);
	}

}
