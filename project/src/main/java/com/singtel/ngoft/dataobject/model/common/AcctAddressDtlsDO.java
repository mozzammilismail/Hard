
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctAddressDtlsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctAddressDtlsDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attnTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="careOf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sponsorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sponsorIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sponsorSalutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sponsorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billAddresses" type="{http://www.singtel.com/oft/dataobject/xsd/common}AddressDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="existingSvcs" type="{http://www.singtel.com/oft/dataobject/xsd/common}SvcNoTypeDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AcctAddressDtlsDO
    implements Serializable
{

    protected String accountNo;
    protected String status;
    protected String attnTo;
    protected String careOf;
    protected String sponsorId;
    protected String sponsorIdType;
    protected String sponsorSalutation;
    protected String sponsorName;
    protected List<AddressDO> billAddresses;
    protected List<SvcNoTypeDO> existingSvcs;

    /**
     * Gets the value of the accountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

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
     * Gets the value of the sponsorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorId() {
        return sponsorId;
    }

    /**
     * Sets the value of the sponsorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorId(String value) {
        this.sponsorId = value;
    }

    /**
     * Gets the value of the sponsorIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorIdType() {
        return sponsorIdType;
    }

    /**
     * Sets the value of the sponsorIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorIdType(String value) {
        this.sponsorIdType = value;
    }

    /**
     * Gets the value of the sponsorSalutation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorSalutation() {
        return sponsorSalutation;
    }

    /**
     * Sets the value of the sponsorSalutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorSalutation(String value) {
        this.sponsorSalutation = value;
    }

    /**
     * Gets the value of the sponsorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorName() {
        return sponsorName;
    }

    /**
     * Sets the value of the sponsorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorName(String value) {
        this.sponsorName = value;
    }

    /**
     * Gets the value of the billAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressDO }
     * 
     * 
     */
    public List<AddressDO> getBillAddresses() {
        if (billAddresses == null) {
            billAddresses = new ArrayList<AddressDO>();
        }
        return this.billAddresses;
    }

    /**
     * Gets the value of the existingSvcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the existingSvcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExistingSvcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SvcNoTypeDO }
     * 
     * 
     */
    public List<SvcNoTypeDO> getExistingSvcs() {
        if (existingSvcs == null) {
            existingSvcs = new ArrayList<SvcNoTypeDO>();
        }
        return this.existingSvcs;
    }

}
