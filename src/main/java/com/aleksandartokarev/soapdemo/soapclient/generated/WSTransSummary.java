//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.02.01 at 04:14:11 PM CET 
//


package com.aleksandartokarev.soapdemo.soapclient.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSTransSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTransSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tranCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tranTotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransSummary", propOrder = {
    "tranCount",
    "tranTotal"
})
public class WSTransSummary {

    protected int tranCount;
    protected double tranTotal;

    /**
     * Gets the value of the tranCount property.
     * 
     */
    public int getTranCount() {
        return tranCount;
    }

    /**
     * Sets the value of the tranCount property.
     * 
     */
    public void setTranCount(int value) {
        this.tranCount = value;
    }

    /**
     * Gets the value of the tranTotal property.
     * 
     */
    public double getTranTotal() {
        return tranTotal;
    }

    /**
     * Sets the value of the tranTotal property.
     * 
     */
    public void setTranTotal(double value) {
        this.tranTotal = value;
    }

}
