
package com.safirasoft;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.safirasoft package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetConfLoc_QNAME = new QName("http://safirasoft.com/", "getConfLoc");
    private final static QName _ParserConfigurationException_QNAME = new QName("http://safirasoft.com/", "ParserConfigurationException");
    private final static QName _GetcodecsResponse_QNAME = new QName("http://safirasoft.com/", "getcodecsResponse");
    private final static QName _GetPrtStsResponse_QNAME = new QName("http://safirasoft.com/", "getPrtStsResponse");
    private final static QName _IOException_QNAME = new QName("http://safirasoft.com/", "IOException");
    private final static QName _HelloResponse_QNAME = new QName("http://safirasoft.com/", "helloResponse");
    private final static QName _SAXException_QNAME = new QName("http://safirasoft.com/", "SAXException");
    private final static QName _GetConfLocResponse_QNAME = new QName("http://safirasoft.com/", "getConfLocResponse");
    private final static QName _Getcodecs_QNAME = new QName("http://safirasoft.com/", "getcodecs");
    private final static QName _Hello_QNAME = new QName("http://safirasoft.com/", "hello");
    private final static QName _GetPrtSts_QNAME = new QName("http://safirasoft.com/", "getPrtSts");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.safirasoft
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Getcodecs }
     * 
     */
    public Getcodecs createGetcodecs() {
        return new Getcodecs();
    }

    /**
     * Create an instance of {@link GetConfLocResponse }
     * 
     */
    public GetConfLocResponse createGetConfLocResponse() {
        return new GetConfLocResponse();
    }

    /**
     * Create an instance of {@link GetPrtSts }
     * 
     */
    public GetPrtSts createGetPrtSts() {
        return new GetPrtSts();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link SAXException }
     * 
     */
    public SAXException createSAXException() {
        return new SAXException();
    }

    /**
     * Create an instance of {@link GetcodecsResponse }
     * 
     */
    public GetcodecsResponse createGetcodecsResponse() {
        return new GetcodecsResponse();
    }

    /**
     * Create an instance of {@link GetPrtStsResponse }
     * 
     */
    public GetPrtStsResponse createGetPrtStsResponse() {
        return new GetPrtStsResponse();
    }

    /**
     * Create an instance of {@link GetConfLoc }
     * 
     */
    public GetConfLoc createGetConfLoc() {
        return new GetConfLoc();
    }

    /**
     * Create an instance of {@link ParserConfigurationException }
     * 
     */
    public ParserConfigurationException createParserConfigurationException() {
        return new ParserConfigurationException();
    }

    /**
     * Create an instance of {@link PrtStsVo }
     * 
     */
    public PrtStsVo createPrtStsVo() {
        return new PrtStsVo();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link CodecVo }
     * 
     */
    public CodecVo createCodecVo() {
        return new CodecVo();
    }

    /**
     * Create an instance of {@link PrtStstVoList }
     * 
     */
    public PrtStstVoList createPrtStstVoList() {
        return new PrtStstVoList();
    }

    /**
     * Create an instance of {@link CodecVoList }
     * 
     */
    public CodecVoList createCodecVoList() {
        return new CodecVoList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfLoc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://safirasoft.com/", name = "getConfLoc")
    public JAXBElement<GetConfLoc> createGetConfLoc(GetConfLoc value) {
        return new JAXBElement<GetConfLoc>(_GetConfLoc_QNAME, GetConfLoc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParserConfigurationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://safirasoft.com/", name = "ParserConfigurationException")
    public JAXBElement<ParserConfigurationException> createParserConfigurationException(ParserConfigurationException value) {
        return new JAXBElement<ParserConfigurationException>(_ParserConfigurationException_QNAME, ParserConfigurationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetcodecsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://safirasoft.com/", name = "getcodecsResponse")
    public JAXBElement<GetcodecsResponse> createGetcodecsResponse(GetcodecsResponse value) {
        return new JAXBElement<GetcodecsResponse>(_GetcodecsResponse_QNAME, GetcodecsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrtStsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://safirasoft.com/", name = "getPrtStsResponse")
    public JAXBElement<GetPrtStsResponse> createGetPrtStsResponse(GetPrtStsResponse value) {
        return new JAXBElement<GetPrtStsResponse>(_GetPrtStsResponse_QNAME, GetPrtStsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://safirasoft.com/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://safirasoft.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SAXException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://safirasoft.com/", name = "SAXException")
    public JAXBElement<SAXException> createSAXException(SAXException value) {
        return new JAXBElement<SAXException>(_SAXException_QNAME, SAXException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfLocResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://safirasoft.com/", name = "getConfLocResponse")
    public JAXBElement<GetConfLocResponse> createGetConfLocResponse(GetConfLocResponse value) {
        return new JAXBElement<GetConfLocResponse>(_GetConfLocResponse_QNAME, GetConfLocResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getcodecs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://safirasoft.com/", name = "getcodecs")
    public JAXBElement<Getcodecs> createGetcodecs(Getcodecs value) {
        return new JAXBElement<Getcodecs>(_Getcodecs_QNAME, Getcodecs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://safirasoft.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrtSts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://safirasoft.com/", name = "getPrtSts")
    public JAXBElement<GetPrtSts> createGetPrtSts(GetPrtSts value) {
        return new JAXBElement<GetPrtSts>(_GetPrtSts_QNAME, GetPrtSts.class, null, value);
    }

}
