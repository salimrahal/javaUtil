
package com.safirasoft;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ParserConfigurationException", targetNamespace = "http://safirasoft.com/")
public class ParserConfigurationException_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ParserConfigurationException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public ParserConfigurationException_Exception(String message, ParserConfigurationException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ParserConfigurationException_Exception(String message, ParserConfigurationException faultInfo, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.safirasoft.ParserConfigurationException
     */
    public ParserConfigurationException getFaultInfo() {
        return faultInfo;
    }

}
