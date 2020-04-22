
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMPricePlanInfoDO;


/**
 * <p>Java class for AbstractPricePlanDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractPricePlanDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pricePlan" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="migrationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pricePlanMRC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CIStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AbstractPricePlanDO
    implements Serializable
{

    protected String pricePlan;
    protected String migrationDate;
    protected String pricePlanMRC;
    protected String ciStartDate;

    /**
     * Gets the value of the pricePlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricePlan() {
        return pricePlan;
    }

    /**
     * Sets the value of the pricePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricePlan(String value) {
        this.pricePlan = value;
    }

    /**
     * Gets the value of the migrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMigrationDate() {
        return migrationDate;
    }

    /**
     * Sets the value of the migrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMigrationDate(String value) {
        this.migrationDate = value;
    }

    /**
     * Gets the value of the pricePlanMRC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricePlanMRC() {
        return pricePlanMRC;
    }

    /**
     * Sets the value of the pricePlanMRC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricePlanMRC(String value) {
        this.pricePlanMRC = value;
    }

    /**
     * Gets the value of the ciStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIStartDate() {
        return ciStartDate;
    }

    /**
     * Sets the value of the ciStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIStartDate(String value) {
        this.ciStartDate = value;
    }

}
