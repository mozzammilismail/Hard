
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMProdParameterDO;


/**
 * <p>Java class for AbstractProdParameterDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractProdParameterDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nwCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paraNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paraVal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paraOldVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AbstractProdParameterDO
    implements Serializable
{

    protected String nwCode;
    protected String paraNm;
    protected String paraVal;
    protected String paraOldVal;

    /**
     * Gets the value of the nwCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNwCode() {
        return nwCode;
    }

    /**
     * Sets the value of the nwCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNwCode(String value) {
        this.nwCode = value;
    }

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

    /**
     * Gets the value of the paraOldVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParaOldVal() {
        return paraOldVal;
    }

    /**
     * Sets the value of the paraOldVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParaOldVal(String value) {
        this.paraOldVal = value;
    }

}
