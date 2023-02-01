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
 * <p>Java class for WSPolicyLimit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPolicyLimit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hours" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="limitId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="minHours" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="autoRollMap" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="autoRollMax" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPolicyLimit", propOrder = {
    "hours",
    "limit",
    "limitId",
    "minHours",
    "autoRollMap",
    "autoRollMax"
})
public class WSPolicyLimit {

    protected int hours;
    protected int limit;
    @XmlElement(required = true, nillable = true)
    protected String limitId;
    protected int minHours;
    protected int autoRollMap;
    protected int autoRollMax;

    /**
     * Gets the value of the hours property.
     * 
     */
    public int getHours() {
        return hours;
    }

    /**
     * Sets the value of the hours property.
     * 
     */
    public void setHours(int value) {
        this.hours = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     */
    public void setLimit(int value) {
        this.limit = value;
    }

    /**
     * Gets the value of the limitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitId() {
        return limitId;
    }

    /**
     * Sets the value of the limitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitId(String value) {
        this.limitId = value;
    }

    /**
     * Gets the value of the minHours property.
     * 
     */
    public int getMinHours() {
        return minHours;
    }

    /**
     * Sets the value of the minHours property.
     * 
     */
    public void setMinHours(int value) {
        this.minHours = value;
    }

    /**
     * Gets the value of the autoRollMap property.
     * 
     */
    public int getAutoRollMap() {
        return autoRollMap;
    }

    /**
     * Sets the value of the autoRollMap property.
     * 
     */
    public void setAutoRollMap(int value) {
        this.autoRollMap = value;
    }

    /**
     * Gets the value of the autoRollMax property.
     * 
     */
    public int getAutoRollMax() {
        return autoRollMax;
    }

    /**
     * Sets the value of the autoRollMax property.
     * 
     */
    public void setAutoRollMax(int value) {
        this.autoRollMax = value;
    }

}
