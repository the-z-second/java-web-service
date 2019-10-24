/**
 * Email_functionServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package email_webservice;

public class Email_functionServiceLocator extends org.apache.axis.client.Service implements email_webservice.Email_functionService {

    public Email_functionServiceLocator() {
    }


    public Email_functionServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Email_functionServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for email_function
    private java.lang.String email_function_address = "http://localhost:8080/email_webservice/services/email_function";

    public java.lang.String getemail_functionAddress() {
        return email_function_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String email_functionWSDDServiceName = "email_function";

    public java.lang.String getemail_functionWSDDServiceName() {
        return email_functionWSDDServiceName;
    }

    public void setemail_functionWSDDServiceName(java.lang.String name) {
        email_functionWSDDServiceName = name;
    }

    public email_webservice.Email_function getemail_function() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(email_function_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getemail_function(endpoint);
    }

    public email_webservice.Email_function getemail_function(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            email_webservice.Email_functionSoapBindingStub _stub = new email_webservice.Email_functionSoapBindingStub(portAddress, this);
            _stub.setPortName(getemail_functionWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setemail_functionEndpointAddress(java.lang.String address) {
        email_function_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (email_webservice.Email_function.class.isAssignableFrom(serviceEndpointInterface)) {
                email_webservice.Email_functionSoapBindingStub _stub = new email_webservice.Email_functionSoapBindingStub(new java.net.URL(email_function_address), this);
                _stub.setPortName(getemail_functionWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("email_function".equals(inputPortName)) {
            return getemail_function();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://email_webservice", "email_functionService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://email_webservice", "email_function"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("email_function".equals(portName)) {
            setemail_functionEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
