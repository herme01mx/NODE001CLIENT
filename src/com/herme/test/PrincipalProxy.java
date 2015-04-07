package com.herme.test;

public class PrincipalProxy implements com.herme.test.Principal {
  private String _endpoint = null;
  private com.herme.test.Principal principal = null;
  
  public PrincipalProxy() {
    _initPrincipalProxy();
  }
  
  public PrincipalProxy(String endpoint) {
    _endpoint = endpoint;
    _initPrincipalProxy();
  }
  
  private void _initPrincipalProxy() {
    try {
      principal = (new com.herme.test.PrincipalServiceLocator()).getPrincipal();
      if (principal != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)principal)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)principal)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (principal != null)
      ((javax.xml.rpc.Stub)principal)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.herme.test.Principal getPrincipal() {
    if (principal == null)
      _initPrincipalProxy();
    return principal;
  }
  
  public java.lang.String saludar(java.lang.String x) throws java.rmi.RemoteException{
    if (principal == null)
      _initPrincipalProxy();
    return principal.saludar(x);
  }
  
  public int sumar(int n1, int n2) throws java.rmi.RemoteException{
    if (principal == null)
      _initPrincipalProxy();
    return principal.sumar(n1, n2);
  }
  
  public java.lang.String mensaje() throws java.rmi.RemoteException{
    if (principal == null)
      _initPrincipalProxy();
    return principal.mensaje();
  }
  
  
}