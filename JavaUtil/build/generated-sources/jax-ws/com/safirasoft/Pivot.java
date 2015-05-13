
package com.safirasoft;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Pivot", targetNamespace = "http://safirasoft.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Pivot {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getConfLoc", targetNamespace = "http://safirasoft.com/", className = "com.safirasoft.GetConfLoc")
    @ResponseWrapper(localName = "getConfLocResponse", targetNamespace = "http://safirasoft.com/", className = "com.safirasoft.GetConfLocResponse")
    @Action(input = "http://safirasoft.com/Pivot/getConfLocRequest", output = "http://safirasoft.com/Pivot/getConfLocResponse")
    public String getConfLoc();

    /**
     * 
     * @return
     *     returns com.safirasoft.PrtStstVoList
     * @throws IOException_Exception
     * @throws ParserConfigurationException_Exception
     * @throws SAXException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPrtSts", targetNamespace = "http://safirasoft.com/", className = "com.safirasoft.GetPrtSts")
    @ResponseWrapper(localName = "getPrtStsResponse", targetNamespace = "http://safirasoft.com/", className = "com.safirasoft.GetPrtStsResponse")
    @Action(input = "http://safirasoft.com/Pivot/getPrtStsRequest", output = "http://safirasoft.com/Pivot/getPrtStsResponse", fault = {
        @FaultAction(className = ParserConfigurationException_Exception.class, value = "http://safirasoft.com/Pivot/getPrtSts/Fault/ParserConfigurationException"),
        @FaultAction(className = SAXException_Exception.class, value = "http://safirasoft.com/Pivot/getPrtSts/Fault/SAXException"),
        @FaultAction(className = IOException_Exception.class, value = "http://safirasoft.com/Pivot/getPrtSts/Fault/IOException")
    })
    public PrtStstVoList getPrtSts()
        throws IOException_Exception, ParserConfigurationException_Exception, SAXException_Exception
    ;

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://safirasoft.com/", className = "com.safirasoft.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://safirasoft.com/", className = "com.safirasoft.HelloResponse")
    @Action(input = "http://safirasoft.com/Pivot/helloRequest", output = "http://safirasoft.com/Pivot/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @return
     *     returns com.safirasoft.CodecVoList
     * @throws ParserConfigurationException_Exception
     * @throws IOException_Exception
     * @throws SAXException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getcodecs", targetNamespace = "http://safirasoft.com/", className = "com.safirasoft.Getcodecs")
    @ResponseWrapper(localName = "getcodecsResponse", targetNamespace = "http://safirasoft.com/", className = "com.safirasoft.GetcodecsResponse")
    @Action(input = "http://safirasoft.com/Pivot/getcodecsRequest", output = "http://safirasoft.com/Pivot/getcodecsResponse", fault = {
        @FaultAction(className = ParserConfigurationException_Exception.class, value = "http://safirasoft.com/Pivot/getcodecs/Fault/ParserConfigurationException"),
        @FaultAction(className = SAXException_Exception.class, value = "http://safirasoft.com/Pivot/getcodecs/Fault/SAXException"),
        @FaultAction(className = IOException_Exception.class, value = "http://safirasoft.com/Pivot/getcodecs/Fault/IOException")
    })
    public CodecVoList getcodecs()
        throws IOException_Exception, ParserConfigurationException_Exception, SAXException_Exception
    ;

}
