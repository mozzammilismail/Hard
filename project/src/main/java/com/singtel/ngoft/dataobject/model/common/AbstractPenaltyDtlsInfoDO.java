
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractPenaltyDtlsInfoDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractPenaltyDtlsInfoDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="penaltyDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="penaltyStDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="penaltyEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="penaltyAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="penaltyRemainDurMonths" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="penaltyRemainDurDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isMobileEquipmentPenalty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AbstractPenaltyDtlsInfoDO
    implements Serializable
{

    protected String penaltyDesc;
    protected String penaltyStDt;
    protected String penaltyEndDt;
    protected String penaltyAmt;
    protected String penaltyRemainDurMonths;
    protected String penaltyRemainDurDays;
    protected String isMobileEquipmentPenalty;

    /**
     * Gets the value of the penaltyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyDesc() {
        return penaltyDesc;
    }

    /**
     * Sets the value of the penaltyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyDesc(String value) {
        this.penaltyDesc = value;
    }

    /**
     * Gets the value of the penaltyStDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyStDt() {
        return penaltyStDt;
    }

    /**
     * Sets the value of the penaltyStDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyStDt(String value) {
        this.penaltyStDt = value;
    }

    /**
     * Gets the value of the penaltyEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyEndDt() {
        return penaltyEndDt;
    }

    /**
     * Sets the value of the penaltyEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyEndDt(String value) {
        this.penaltyEndDt = value;
    }

    /**
     * Gets the value of the penaltyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyAmt() {
        return penaltyAmt;
    }

    /**
     * Sets the value of the penaltyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyAmt(String value) {
        this.penaltyAmt = value;
    }

    /**
     * Gets the value of the penaltyRemainDurMonths property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyRemainDurMonths() {
        return penaltyRemainDurMonths;
    }

    /**
     * Sets the value of the penaltyRemainDurMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyRemainDurMonths(String value) {
        this.penaltyRemainDurMonths = value;
    }

    /**
     * Gets the value of the penaltyRemainDurDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyRemainDurDays() {
        return penaltyRemainDurDays;
    }

    /**
     * Sets the value of the penaltyRemainDurDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyRemainDurDays(String value) {
        this.penaltyRemainDurDays = value;
    }

    /**
     * Gets the value of the isMobileEquipmentPenalty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMobileEquipmentPenalty() {
        return isMobileEquipmentPenalty;
    }

    /**
     * Sets the value of the isMobileEquipmentPenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMobileEquipmentPenalty(String value) {
        this.isMobileEquipmentPenalty = value;
    }

}
