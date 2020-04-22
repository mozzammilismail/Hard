
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BPMNwPdtParaDtlsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMNwPdtParaDtlsDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paraNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paraVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMNwPdtParaDtlsDO
    implements Serializable
{

    protected String paraNm;
    protected String paraVal;

    /**
     * Gets the value of the paraNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParaNm() {
        return paraNm;
    }

    /**
     * Sets the value of the paraNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParaNm(String value) {
        this.paraNm = value;
    }

    /**
     * Gets the value of the paraVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParaVal() {
        return paraVal;
    }

    /**
     * Sets the value of the paraVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParaVal(String value) {
        this.paraVal = value;
    }

}
