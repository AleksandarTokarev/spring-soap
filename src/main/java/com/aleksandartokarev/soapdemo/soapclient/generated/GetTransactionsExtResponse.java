//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.02.03 at 11:54:40 PM CET
//


package com.aleksandartokarev.soapdemo.soapclient.generated;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for getTransactionsExtResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getTransactionsExtResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="result" type="{http://com.tch.cards.service/types/arrays/com/tch/cards/model}WSTransactionExtArray"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlRootElement(name = "getTransactionsExtResponse", namespace = "http://com.tch.cards.service")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetTransactionsExtResponse {

    @XmlElement(required = true)
    protected WSTransactionExtArray result;

    /**
     * Gets the value of the result property.
     *
     * @return
     *     possible object is
     *     {@link WSTransactionExtArray }
     *
     */
    public WSTransactionExtArray getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     *
     * @param value
     *     allowed object is
     *     {@link WSTransactionExtArray }
     *
     */
    public void setResult(WSTransactionExtArray value) {
        this.result = value;
    }

}