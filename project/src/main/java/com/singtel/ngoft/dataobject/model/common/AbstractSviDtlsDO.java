
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMSviDtlsDO;


/**
 * <p>Java class for AbstractSviDtlsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractSviDtlsDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="juvenileRight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineTieInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nricIssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="existingInstAddress" type="{http://www.singtel.com/oft/dataobject/xsd/common}AddressDO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AbstractSviDtlsDO
    implements Serializable
{

    protected String juvenileRight;
    protected String lineTieInd;
    protected String nricIssueDate;
    protected AddressDO existingInstAddress;

    /**
     * Gets the value of the juvenileRight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJuvenileRight() {
        return juvenileRight;
    }

    /**
     * Sets the value of the juvenileRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJuvenileRight(String value) {
        this.juvenileRight = value;
    }

    /**
     * Gets the value of the lineTieInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineTieInd() {
        return lineTieInd;
    }

    /**
     * Sets the value of the lineTieInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineTieInd(String value) {
        this.lineTieInd = value;
    }

    /**
     * Gets the value of the nricIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNricIssueDate() {
        return nricIssueDate;
    }

    /**
     * Sets the value of the nricIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNricIssueDate(String value) {
        this.nricIssueDate = value;
    }

    /**
     * Gets the value of the existingInstAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDO }
     *     
     */
    public AddressDO getExistingInstAddress() {
        return existingInstAddress;
    }

    /**
     * Sets the value of the existingInstAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDO }
     *     
     */
    public void setExistingInstAddress(AddressDO value) {
        this.existingInstAddress = value;
    }

}
