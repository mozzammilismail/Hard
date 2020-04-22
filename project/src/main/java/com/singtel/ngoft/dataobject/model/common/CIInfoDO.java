
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CIInfoDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIInfoDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lastCIDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ci1Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ci2Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ci06Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ci12Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ci18Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ci21Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nextLossCIDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ciScenario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CI1TopupAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CI06TopupAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CI12TopupAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CI18TopupAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sapphire_standaloneCI0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pricePlanComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currPricePlanComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currPricePlanDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nextSwopCIDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="swopValueAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class CIInfoDO
    implements Serializable
{

    protected String lastCIDate;
    protected String ci1Date;
    protected String ci2Date;
    protected String ci06Date;
    protected String ci12Date;
    protected String ci18Date;
    protected String ci21Date;
    protected String nextLossCIDate;
    protected String ciScenario;
    protected String ci1TopupAmount;
    protected String ci06TopupAmount;
    protected String ci12TopupAmount;
    protected String ci18TopupAmount;
    protected String sapphireStandaloneCI0;
    protected String pricePlanComponent;
    protected String currPricePlanComponent;
    protected String currPricePlanDescription;
    protected String accountNo;
    protected String contractEndDt;
    protected String nextSwopCIDt;
    protected String swopValueAmount;

    /**
     * Gets the value of the lastCIDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastCIDate() {
        return lastCIDate;
    }

    /**
     * Sets the value of the lastCIDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastCIDate(String value) {
        this.lastCIDate = value;
    }

    /**
     * Gets the value of the ci1Date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCi1Date() {
        return ci1Date;
    }

    /**
     * Sets the value of the ci1Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCi1Date(String value) {
        this.ci1Date = value;
    }

    /**
     * Gets the value of the ci2Date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCi2Date() {
        return ci2Date;
    }

    /**
     * Sets the value of the ci2Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCi2Date(String value) {
        this.ci2Date = value;
    }

    /**
     * Gets the value of the ci06Date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCi06Date() {
        return ci06Date;
    }

    /**
     * Sets the value of the ci06Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCi06Date(String value) {
        this.ci06Date = value;
    }

    /**
     * Gets the value of the ci12Date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCi12Date() {
        return ci12Date;
    }

    /**
     * Sets the value of the ci12Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCi12Date(String value) {
        this.ci12Date = value;
    }

    /**
     * Gets the value of the ci18Date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCi18Date() {
        return ci18Date;
    }

    /**
     * Sets the value of the ci18Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCi18Date(String value) {
        this.ci18Date = value;
    }

    /**
     * Gets the value of the ci21Date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCi21Date() {
        return ci21Date;
    }

    /**
     * Sets the value of the ci21Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCi21Date(String value) {
        this.ci21Date = value;
    }

    /**
     * Gets the value of the nextLossCIDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextLossCIDate() {
        return nextLossCIDate;
    }

    /**
     * Sets the value of the nextLossCIDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextLossCIDate(String value) {
        this.nextLossCIDate = value;
    }

    /**
     * Gets the value of the ciScenario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiScenario() {
        return ciScenario;
    }

    /**
     * Sets the value of the ciScenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiScenario(String value) {
        this.ciScenario = value;
    }

    /**
     * Gets the value of the ci1TopupAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCI1TopupAmount() {
        return ci1TopupAmount;
    }

    /**
     * Sets the value of the ci1TopupAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCI1TopupAmount(String value) {
        this.ci1TopupAmount = value;
    }

    /**
     * Gets the value of the ci06TopupAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCI06TopupAmount() {
        return ci06TopupAmount;
    }

    /**
     * Sets the value of the ci06TopupAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCI06TopupAmount(String value) {
        this.ci06TopupAmount = value;
    }

    /**
     * Gets the value of the ci12TopupAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCI12TopupAmount() {
        return ci12TopupAmount;
    }

    /**
     * Sets the value of the ci12TopupAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCI12TopupAmount(String value) {
        this.ci12TopupAmount = value;
    }

    /**
     * Gets the value of the ci18TopupAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCI18TopupAmount() {
        return ci18TopupAmount;
    }

    /**
     * Sets the value of the ci18TopupAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCI18TopupAmount(String value) {
        this.ci18TopupAmount = value;
    }

    /**
     * Gets the value of the sapphireStandaloneCI0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSapphireStandaloneCI0() {
        return sapphireStandaloneCI0;
    }

    /**
     * Sets the value of the sapphireStandaloneCI0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSapphireStandaloneCI0(String value) {
        this.sapphireStandaloneCI0 = value;
    }

    /**
     * Gets the value of the pricePlanComponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricePlanComponent() {
        return pricePlanComponent;
    }

    /**
     * Sets the value of the pricePlanComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricePlanComponent(String value) {
        this.pricePlanComponent = value;
    }

    /**
     * Gets the value of the currPricePlanComponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrPricePlanComponent() {
        return currPricePlanComponent;
    }

    /**
     * Sets the value of the currPricePlanComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrPricePlanComponent(String value) {
        this.currPricePlanComponent = value;
    }

    /**
     * Gets the value of the currPricePlanDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrPricePlanDescription() {
        return currPricePlanDescription;
    }

    /**
     * Sets the value of the currPricePlanDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrPricePlanDescription(String value) {
        this.currPricePlanDescription = value;
    }

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
     * Gets the value of the contractEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractEndDt() {
        return contractEndDt;
    }

    /**
     * Sets the value of the contractEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractEndDt(String value) {
        this.contractEndDt = value;
    }

    /**
     * Gets the value of the nextSwopCIDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextSwopCIDt() {
        return nextSwopCIDt;
    }

    /**
     * Sets the value of the nextSwopCIDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextSwopCIDt(String value) {
        this.nextSwopCIDt = value;
    }

    /**
     * Gets the value of the swopValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwopValueAmount() {
        return swopValueAmount;
    }

    /**
     * Sets the value of the swopValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwopValueAmount(String value) {
        this.swopValueAmount = value;
    }

}
