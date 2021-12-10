
package org.soa.ws.tp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Maker", targetNamespace = "http://tp.ws.soa.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Maker {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "toUpperString", targetNamespace = "http://tp.ws.soa.org/", className = "org.soa.ws.tp.ToUpperString")
    @ResponseWrapper(localName = "toUpperStringResponse", targetNamespace = "http://tp.ws.soa.org/", className = "org.soa.ws.tp.ToUpperStringResponse")
    @Action(input = "http://tp.ws.soa.org/Maker/toUpperStringRequest", output = "http://tp.ws.soa.org/Maker/toUpperStringResponse")
    public String toUpperString(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "Moy")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Moy", targetNamespace = "http://tp.ws.soa.org/", className = "org.soa.ws.tp.Moy")
    @ResponseWrapper(localName = "MoyResponse", targetNamespace = "http://tp.ws.soa.org/", className = "org.soa.ws.tp.MoyResponse")
    @Action(input = "http://tp.ws.soa.org/Maker/MoyRequest", output = "http://tp.ws.soa.org/Maker/MoyResponse")
    public double moy(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        double arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        double arg3);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "toLowerString", targetNamespace = "http://tp.ws.soa.org/", className = "org.soa.ws.tp.ToLowerString")
    @ResponseWrapper(localName = "toLowerStringResponse", targetNamespace = "http://tp.ws.soa.org/", className = "org.soa.ws.tp.ToLowerStringResponse")
    @Action(input = "http://tp.ws.soa.org/Maker/toLowerStringRequest", output = "http://tp.ws.soa.org/Maker/toLowerStringResponse")
    public String toLowerString(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMaxValue", targetNamespace = "http://tp.ws.soa.org/", className = "org.soa.ws.tp.GetMaxValue")
    @ResponseWrapper(localName = "getMaxValueResponse", targetNamespace = "http://tp.ws.soa.org/", className = "org.soa.ws.tp.GetMaxValueResponse")
    @Action(input = "http://tp.ws.soa.org/Maker/getMaxValueRequest", output = "http://tp.ws.soa.org/Maker/getMaxValueResponse")
    public double getMaxValue(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMinValue", targetNamespace = "http://tp.ws.soa.org/", className = "org.soa.ws.tp.GetMinValue")
    @ResponseWrapper(localName = "getMinValueResponse", targetNamespace = "http://tp.ws.soa.org/", className = "org.soa.ws.tp.GetMinValueResponse")
    @Action(input = "http://tp.ws.soa.org/Maker/getMinValueRequest", output = "http://tp.ws.soa.org/Maker/getMinValueResponse")
    public double getMinValue(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

}