
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMUENNRICDO;


/**
 * <p>Java class for AbstractUENNRICDtlsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractUENNRICDtlsDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UENName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UENBlackList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public abstract class AbstractUENNRICDtlsDO
    implements Serializable
{

    protected String uen;
    protected String uenName;
    protected Boolean uenBlackList;

    /**
     * Gets the value of the uen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUEN() {
        return uen;
    }

    /**
     * Sets the value of the uen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUEN(String value) {
        this.uen = value;
    }

    /**
     * Gets the value of the uenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUENName() {
        return uenName;
    }

    /**
     * Sets the value of the uenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUENName(String value) {
        this.uenName = value;
    }

    /**
     * Gets the value of the uenBlackList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUENBlackList() {
        return uenBlackList;
    }

    /**
     * Sets the value of the uenBlackList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUENBlackList(Boolean value) {
        this.uenBlackList = value;
    }

}
