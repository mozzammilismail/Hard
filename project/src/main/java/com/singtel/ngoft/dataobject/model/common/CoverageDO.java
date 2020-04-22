
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoverageDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoverageDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DPnumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Exchangename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExchangeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Localcablecode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LocalDBloss" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Maincablecode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MainDBloss" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Muxindicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Postalcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class CoverageDO
    implements Serializable
{

    protected String dPnumber;
    protected String exchangename;
    protected String exchangeCode;
    protected String localcablecode;
    protected String localDBloss;
    protected String maincablecode;
    protected String mainDBloss;
    protected String muxindicator;
    protected String postalcode;

    /**
     * Gets the value of the dPnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPnumber() {
        return dPnumber;
    }

    /**
     * Sets the value of the dPnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPnumber(String value) {
        this.dPnumber = value;
    }

    /**
     * Gets the value of the exchangename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangename() {
        return exchangename;
    }

    /**
     * Sets the value of the exchangename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangename(String value) {
        this.exchangename = value;
    }

    /**
     * Gets the value of the exchangeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeCode() {
        return exchangeCode;
    }

    /**
     * Sets the value of the exchangeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeCode(String value) {
        this.exchangeCode = value;
    }

    /**
     * Gets the value of the localcablecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalcablecode() {
        return localcablecode;
    }

    /**
     * Sets the value of the localcablecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalcablecode(String value) {
        this.localcablecode = value;
    }

    /**
     * Gets the value of the localDBloss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalDBloss() {
        return localDBloss;
    }

    /**
     * Sets the value of the localDBloss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalDBloss(String value) {
        this.localDBloss = value;
    }

    /**
     * Gets the value of the maincablecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaincablecode() {
        return maincablecode;
    }

    /**
     * Sets the value of the maincablecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaincablecode(String value) {
        this.maincablecode = value;
    }

    /**
     * Gets the value of the mainDBloss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainDBloss() {
        return mainDBloss;
    }

    /**
     * Sets the value of the mainDBloss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainDBloss(String value) {
        this.mainDBloss = value;
    }

    /**
     * Gets the value of the muxindicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuxindicator() {
        return muxindicator;
    }

    /**
     * Sets the value of the muxindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuxindicator(String value) {
        this.muxindicator = value;
    }

    /**
     * Gets the value of the postalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalcode() {
        return postalcode;
    }

    /**
     * Sets the value of the postalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalcode(String value) {
        this.postalcode = value;
    }

}
