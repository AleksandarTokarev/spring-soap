//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.02.04 at 12:35:19 AM CET 
//


package com.aleksandartokarev.soapdemo.soapclient.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSMonCodesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSMonCodesInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="infoType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="infoValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSMonCodesInfo", propOrder = {
    "infoType",
    "infoValue"
})
public class WSMonCodesInfo {

    @XmlElement(required = true, nillable = true)
    protected String infoType;
    @XmlElement(required = true, nillable = true)
    protected String infoValue;

    /**
     * Gets the value of the infoType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoType() {
        return infoType;
    }

    /**
     * Sets the value of the infoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoType(String value) {
        this.infoType = value;
    }

    /**
     * Gets the value of the infoValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoValue() {
        return infoValue;
    }

    /**
     * Sets the value of the infoValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoValue(String value) {
        this.infoValue = value;
    }

}
