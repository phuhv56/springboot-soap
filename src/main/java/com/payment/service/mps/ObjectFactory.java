//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.27 at 10:47:33 AM ICT 
//


package com.payment.service.mps;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.payment.service.mps package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.payment.service.mps
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContentRequestResponse }
     * 
     */
    public ContentRequestResponse createContentRequestResponse() {
        return new ContentRequestResponse();
    }

    /**
     * Create an instance of {@link MoRequest }
     * 
     */
    public MoRequest createMoRequest() {
        return new MoRequest();
    }

    /**
     * Create an instance of {@link DoNotify }
     * 
     */
    public DoNotify createDoNotify() {
        return new DoNotify();
    }

    /**
     * Create an instance of {@link MoRequestResponse }
     * 
     */
    public MoRequestResponse createMoRequestResponse() {
        return new MoRequestResponse();
    }

    /**
     * Create an instance of {@link ContentRequest }
     * 
     */
    public ContentRequest createContentRequest() {
        return new ContentRequest();
    }

    /**
     * Create an instance of {@link MpschargeResponse }
     * 
     */
    public MpschargeResponse createMpschargeResponse() {
        return new MpschargeResponse();
    }

    /**
     * Create an instance of {@link MpschargeRequest }
     * 
     */
    public MpschargeRequest createMpschargeRequest() {
        return new MpschargeRequest();
    }

    /**
     * Create an instance of {@link DoNotifyResponse }
     * 
     */
    public DoNotifyResponse createDoNotifyResponse() {
        return new DoNotifyResponse();
    }

}
