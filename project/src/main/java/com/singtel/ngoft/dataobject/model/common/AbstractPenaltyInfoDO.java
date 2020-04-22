
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMPenaltyInfoDO;


/**
 * <p>Java class for AbstractPenaltyInfoDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractPenaltyInfoDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="penaltyDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="waivePenaltyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="penaltyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="penaltyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateDecimals" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="percentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="percentageDecimals" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mtPrdDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mtPrdDurationUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ctrPrdDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ctrPrdDurationUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="evalPrdDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="evalPrdDurationUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="configOrOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AbstractPenaltyInfoDO
    implements Serializable
{

    protected int penaltyDuration;
    protected String waivePenaltyInd;
    protected String penaltyType;
    protected String penaltyId;
    protected String elementId;
    protected String startDt;
    protected String endDt;
    protected String discountId;
    protected String rate;
    protected String rateDecimals;
    protected String percentage;
    protected String percentageDecimals;
    protected String currencyCode;
    protected String status;
    protected String mtPrdDuration;
    protected String mtPrdDurationUnits;
    protected String ctrPrdDuration;
    protected String ctrPrdDurationUnits;
    protected String evalPrdDuration;
    protected String evalPrdDurationUnits;
    protected String configOrOverride;

    /**
     * Gets the value of the penaltyDuration property.
     * 
     */
    public int getPenaltyDuration() {
        return penaltyDuration;
    }

    /**
     * Sets the value of the penaltyDuration property.
     * 
     */
    public void setPenaltyDuration(int value) {
        this.penaltyDuration = value;
    }

    /**
     * Gets the value of the waivePenaltyInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaivePenaltyInd() {
        return waivePenaltyInd;
    }

    /**
     * Sets the value of the waivePenaltyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaivePenaltyInd(String value) {
        this.waivePenaltyInd = value;
    }

    /**
     * Gets the value of the penaltyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyType() {
        return penaltyType;
    }

    /**
     * Sets the value of the penaltyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyType(String value) {
        this.penaltyType = value;
    }

    /**
     * Gets the value of the penaltyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyId() {
        return penaltyId;
    }

    /**
     * Sets the value of the penaltyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyId(String value) {
        this.penaltyId = value;
    }

    /**
     * Gets the value of the elementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementId() {
        return elementId;
    }

    /**
     * Sets the value of the elementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementId(String value) {
        this.elementId = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDt(String value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDt(String value) {
        this.endDt = value;
    }

    /**
     * Gets the value of the discountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountId() {
        return discountId;
    }

    /**
     * Sets the value of the discountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountId(String value) {
        this.discountId = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRate(String value) {
        this.rate = value;
    }

    /**
     * Gets the value of the rateDecimals property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateDecimals() {
        return rateDecimals;
    }

    /**
     * Sets the value of the rateDecimals property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateDecimals(String value) {
        this.rateDecimals = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentage(String value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the percentageDecimals property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentageDecimals() {
        return percentageDecimals;
    }

    /**
     * Sets the value of the percentageDecimals property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentageDecimals(String value) {
        this.percentageDecimals = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
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
     * Gets the value of the mtPrdDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtPrdDuration() {
        return mtPrdDuration;
    }

    /**
     * Sets the value of the mtPrdDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtPrdDuration(String value) {
        this.mtPrdDuration = value;
    }

    /**
     * Gets the value of the mtPrdDurationUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtPrdDurationUnits() {
        return mtPrdDurationUnits;
    }

    /**
     * Sets the value of the mtPrdDurationUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtPrdDurationUnits(String value) {
        this.mtPrdDurationUnits = value;
    }

    /**
     * Gets the value of the ctrPrdDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrPrdDuration() {
        return ctrPrdDuration;
    }

    /**
     * Sets the value of the ctrPrdDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrPrdDuration(String value) {
        this.ctrPrdDuration = value;
    }

    /**
     * Gets the value of the ctrPrdDurationUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrPrdDurationUnits() {
        return ctrPrdDurationUnits;
    }

    /**
     * Sets the value of the ctrPrdDurationUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrPrdDurationUnits(String value) {
        this.ctrPrdDurationUnits = value;
    }

    /**
     * Gets the value of the evalPrdDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvalPrdDuration() {
        return evalPrdDuration;
    }

    /**
     * Sets the value of the evalPrdDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvalPrdDuration(String value) {
        this.evalPrdDuration = value;
    }

    /**
     * Gets the value of the evalPrdDurationUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvalPrdDurationUnits() {
        return evalPrdDurationUnits;
    }

    /**
     * Sets the value of the evalPrdDurationUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvalPrdDurationUnits(String value) {
        this.evalPrdDurationUnits = value;
    }

    /**
     * Gets the value of the configOrOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigOrOverride() {
        return configOrOverride;
    }

    /**
     * Sets the value of the configOrOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigOrOverride(String value) {
        this.configOrOverride = value;
    }

}
