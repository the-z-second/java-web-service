
package client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "email_functionService", targetNamespace = "http://email_webservice", wsdlLocation = "http://localhost:8080/email_webservice/services/email_function?WSDL")
public class EmailFunctionService
    extends Service
{

    private final static URL EMAILFUNCTIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException EMAILFUNCTIONSERVICE_EXCEPTION;
    private final static QName EMAILFUNCTIONSERVICE_QNAME = new QName("http://email_webservice", "email_functionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/email_webservice/services/email_function?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EMAILFUNCTIONSERVICE_WSDL_LOCATION = url;
        EMAILFUNCTIONSERVICE_EXCEPTION = e;
    }
    
    public EmailFunctionService() {
        super(__getWsdlLocation(), EMAILFUNCTIONSERVICE_QNAME);
    }

    public EmailFunctionService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EMAILFUNCTIONSERVICE_QNAME, features);
    }

    public EmailFunctionService(URL wsdlLocation) {
        super(wsdlLocation, EMAILFUNCTIONSERVICE_QNAME);
    }

    public EmailFunctionService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EMAILFUNCTIONSERVICE_QNAME, features);
    }

    public EmailFunctionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmailFunctionService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EmailFunction
     */
    @WebEndpoint(name = "email_function")
    public EmailFunction getEmailFunction() {
        return super.getPort(new QName("http://email_webservice", "email_function"), EmailFunction.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmailFunction
     */
    @WebEndpoint(name = "email_function")
    public EmailFunction getEmailFunction(WebServiceFeature... features) {
        return super.getPort(new QName("http://email_webservice", "email_function"), EmailFunction.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EMAILFUNCTIONSERVICE_EXCEPTION!= null) {
            throw EMAILFUNCTIONSERVICE_EXCEPTION;
        }
        return EMAILFUNCTIONSERVICE_WSDL_LOCATION;
    }

}
