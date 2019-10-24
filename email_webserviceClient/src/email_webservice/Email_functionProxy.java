package email_webservice;

public class Email_functionProxy implements email_webservice.Email_function {
  private String _endpoint = null;
  private email_webservice.Email_function email_function = null;
  
  public Email_functionProxy() {
    _initEmail_functionProxy();
  }
  
  public Email_functionProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmail_functionProxy();
  }
  
  private void _initEmail_functionProxy() {
    try {
      email_function = (new email_webservice.Email_functionServiceLocator()).getemail_function();
      if (email_function != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)email_function)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)email_function)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (email_function != null)
      ((javax.xml.rpc.Stub)email_function)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public email_webservice.Email_function getEmail_function() {
    if (email_function == null)
      _initEmail_functionProxy();
    return email_function;
  }
  
  public java.lang.String validateEmailAddress(java.lang.String _url) throws java.rmi.RemoteException{
    if (email_function == null)
      _initEmail_functionProxy();
    return email_function.validateEmailAddress(_url);
  }
  
  public void sendEmail(java.lang.String _url, java.lang.String _payload) throws java.rmi.RemoteException{
    if (email_function == null)
      _initEmail_functionProxy();
    email_function.sendEmail(_url, _payload);
  }
  
  public void sendEmailBatch(java.lang.String url, java.lang.String _payload) throws java.rmi.RemoteException{
    if (email_function == null)
      _initEmail_functionProxy();
    email_function.sendEmailBatch(url, _payload);
  }
  
  
}