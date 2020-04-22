
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMMNPTicketQueueQuotaDtlsDO;


/**
 * <p>Java class for AbstractMNPTicketQueueQuotaDtlsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractMNPTicketQueueQuotaDtlsDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quotaDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="donor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="q1Quota_0900_1200" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="q2Quota_1200_1500" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="q3Quota_1500_1800" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quotaTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quotaRemainingActivation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public abstract class AbstractMNPTicketQueueQuotaDtlsDO
    implements Serializable
{

    protected String quotaDate;
    protected String donor;
    protected String q1Quota09001200;
    protected String q2Quota12001500;
    protected String q3Quota15001800;
    protected String quotaTotal;
    protected String quotaRemainingActivation;

    /**
     * Gets the value of the quotaDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotaDate() {
        return quotaDate;
    }

    /**
     * Sets the value of the quotaDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotaDate(String value) {
        this.quotaDate = value;
    }

    /**
     * Gets the value of the donor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDonor() {
        return donor;
    }

    /**
     * Sets the value of the donor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDonor(String value) {
        this.donor = value;
    }

    /**
     * Gets the value of the q1Quota09001200 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQ1Quota09001200() {
        return q1Quota09001200;
    }

    /**
     * Sets the value of the q1Quota09001200 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQ1Quota09001200(String value) {
        this.q1Quota09001200 = value;
    }

    /**
     * Gets the value of the q2Quota12001500 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQ2Quota12001500() {
        return q2Quota12001500;
    }

    /**
     * Sets the value of the q2Quota12001500 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQ2Quota12001500(String value) {
        this.q2Quota12001500 = value;
    }

    /**
     * Gets the value of the q3Quota15001800 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQ3Quota15001800() {
        return q3Quota15001800;
    }

    /**
     * Sets the value of the q3Quota15001800 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQ3Quota15001800(String value) {
        this.q3Quota15001800 = value;
    }

    /**
     * Gets the value of the quotaTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotaTotal() {
        return quotaTotal;
    }

    /**
     * Sets the value of the quotaTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotaTotal(String value) {
        this.quotaTotal = value;
    }

    /**
     * Gets the value of the quotaRemainingActivation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotaRemainingActivation() {
        return quotaRemainingActivation;
    }

    /**
     * Sets the value of the quotaRemainingActivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotaRemainingActivation(String value) {
        this.quotaRemainingActivation = value;
    }

}
