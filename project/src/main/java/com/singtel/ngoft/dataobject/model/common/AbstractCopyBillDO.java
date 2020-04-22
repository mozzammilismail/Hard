
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMCopyBillDO;


/**
 * <p>Java class for AbstractCopyBillDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractCopyBillDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attnTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="careOf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="noOfCopyBill" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="primaryBillAddr" type="{http://www.singtel.com/oft/dataobject/xsd/common}AddressDO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class AbstractCopyBillDO
    implements Serializable
{

    protected String attnTo;
    protected String careOf;
    protected Integer noOfCopyBill;
    protected AddressDO primaryBillAddr;

    /**
     * Gets the value of the attnTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttnTo() {
        return attnTo;
    }

    /**
     * Sets the value of the attnTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttnTo(String value) {
        this.attnTo = value;
    }

    /**
     * Gets the value of the careOf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareOf() {
        return careOf;
    }

    /**
     * Sets the value of the careOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareOf(String value) {
        this.careOf = value;
    }

    /**
     * Gets the value of the noOfCopyBill property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoOfCopyBill() {
        return noOfCopyBill;
    }

    /**
     * Sets the value of the noOfCopyBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoOfCopyBill(Integer value) {
        this.noOfCopyBill = value;
    }

    /**
     * Gets the value of the primaryBillAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDO }
     *     
     */
    public AddressDO getPrimaryBillAddr() {
        return primaryBillAddr;
    }

    /**
     * Sets the value of the primaryBillAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDO }
     *     
     */
    public void setPrimaryBillAddr(AddressDO value) {
        this.primaryBillAddr = value;
    }

}
