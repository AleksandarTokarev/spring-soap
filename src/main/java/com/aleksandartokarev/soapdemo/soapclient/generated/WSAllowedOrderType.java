//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.02.01 at 04:14:11 PM CET 
//


package com.aleksandartokarev.soapdemo.soapclient.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSAllowedOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSAllowedOrderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="orderDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="defCardStyle" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="defCardStyleDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="defPolicy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSAllowedOrderType", propOrder = {
    "orderType",
    "orderDesc",
    "defCardStyle",
    "defCardStyleDesc",
    "defPolicy"
})
public class WSAllowedOrderType {

    protected int orderType;
    @XmlElement(required = true)
    protected String orderDesc;
    protected int defCardStyle;
    @XmlElement(required = true)
    protected String defCardStyleDesc;
    protected int defPolicy;

    /**
     * Gets the value of the orderType property.
     * 
     */
    public int getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     */
    public void setOrderType(int value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the orderDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDesc() {
        return orderDesc;
    }

    /**
     * Sets the value of the orderDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDesc(String value) {
        this.orderDesc = value;
    }

    /**
     * Gets the value of the defCardStyle property.
     * 
     */
    public int getDefCardStyle() {
        return defCardStyle;
    }

    /**
     * Sets the value of the defCardStyle property.
     * 
     */
    public void setDefCardStyle(int value) {
        this.defCardStyle = value;
    }

    /**
     * Gets the value of the defCardStyleDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefCardStyleDesc() {
        return defCardStyleDesc;
    }

    /**
     * Sets the value of the defCardStyleDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefCardStyleDesc(String value) {
        this.defCardStyleDesc = value;
    }

    /**
     * Gets the value of the defPolicy property.
     * 
     */
    public int getDefPolicy() {
        return defPolicy;
    }

    /**
     * Sets the value of the defPolicy property.
     * 
     */
    public void setDefPolicy(int value) {
        this.defPolicy = value;
    }

}
