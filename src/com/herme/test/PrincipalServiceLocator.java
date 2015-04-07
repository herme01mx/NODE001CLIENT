/**
 * PrincipalServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.herme.test;

public class PrincipalServiceLocator extends org.apache.axis.client.Service implements com.herme.test.PrincipalService {

    public PrincipalServiceLocator() {
    }


    public PrincipalServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PrincipalServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Principal
    private java.lang.String Principal_address = "http://localhost:8101/NODO001/services/Principal";

    public java.lang.String getPrincipalAddress() {
        return Principal_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PrincipalWSDDServiceName = "Principal";

    public java.lang.String getPrincipalWSDDServiceName() {
        return PrincipalWSDDServiceName;
    }

    public void setPrincipalWSDDServiceName(java.lang.String name) {
        PrincipalWSDDServiceName = name;
    }

    public com.herme.test.Principal getPrincipal() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Principal_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPrincipal(endpoint);
    }

    public com.herme.test.Principal getPrincipal(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.herme.test.PrincipalSoapBindingStub _stub = new com.herme.test.PrincipalSoapBindingStub(portAddress, this);
            _stub.setPortName(getPrincipalWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPrincipalEndpointAddress(java.lang.String address) {
        Principal_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.herme.test.Principal.class.isAssignableFrom(serviceEndpointInterface)) {
                com.herme.test.PrincipalSoapBindingStub _stub = new com.herme.test.PrincipalSoapBindingStub(new java.net.URL(Principal_address), this);
                _stub.setPortName(getPrincipalWSDDServiceName());
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
        if ("Principal".equals(inputPortName)) {
            return getPrincipal();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://test.herme.com", "PrincipalService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://test.herme.com", "Principal"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Principal".equals(portName)) {
            setPrincipalEndpointAddress(address);
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
