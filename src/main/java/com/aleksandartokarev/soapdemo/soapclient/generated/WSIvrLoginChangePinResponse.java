//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.02.01 at 04:02:08 PM CET 
//


package com.aleksandartokarev.soapdemo.soapclient.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSIvrLoginChangePinResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSIvrLoginChangePinResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="errorDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="changeConfirmed" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSIvrLoginChangePinResponse", propOrder = {
    "errorCode",
    "errorDesc",
    "changeConfirmed"
})
public class WSIvrLoginChangePinResponse {

    @XmlElement(required = true, nillable = true)
    protected String errorCode;
    @XmlElement(required = true, nillable = true)
    protected String errorDesc;
    @XmlElement(required = true, nillable = true)
    protected String changeConfirmed;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDesc() {
        return errorDesc;
    }

    /**
     * Sets the value of the errorDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDesc(String value) {
        this.errorDesc = value;
    }

    /**
     * Gets the value of the changeConfirmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeConfirmed() {
        return changeConfirmed;
    }

    /**
     * Sets the value of the changeConfirmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeConfirmed(String value) {
        this.changeConfirmed = value;
    }

}
