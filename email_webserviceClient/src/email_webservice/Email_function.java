/**
 * Email_function.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package email_webservice;

public interface Email_function extends java.rmi.Remote {
    public java.lang.String validateEmailAddress(java.lang.String _url) throws java.rmi.RemoteException;
    public void sendEmail(java.lang.String _url, java.lang.String _payload) throws java.rmi.RemoteException;
    public void sendEmailBatch(java.lang.String url, java.lang.String _payload) throws java.rmi.RemoteException;
}
