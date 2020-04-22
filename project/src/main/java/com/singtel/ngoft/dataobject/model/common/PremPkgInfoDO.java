
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PremPkgInfoDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PremPkgInfoDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workOrdNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="premiumPkgId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="premiumPkgIdDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prdtTy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="promoTy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stockCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stockDeliveryMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stockDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="qty" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modemCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class PremPkgInfoDO
    implements Serializable
{

    protected String workOrdNo;
    protected String premiumPkgId;
    protected String premiumPkgIdDesc;
    protected String prdtTy;
    protected String promoTy;
    protected String stockCd;
    protected String stockDeliveryMode;
    protected String stockDesc;
    protected String qty;
    protected String modemCd;
    protected String svcNo;

    /**
     * Gets the value of the workOrdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrdNo() {
        return workOrdNo;
    }

    /**
     * Sets the value of the workOrdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrdNo(String value) {
        this.workOrdNo = value;
    }

    /**
     * Gets the value of the premiumPkgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiumPkgId() {
        return premiumPkgId;
    }

    /**
     * Sets the value of the premiumPkgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiumPkgId(String value) {
        this.premiumPkgId = value;
    }

    /**
     * Gets the value of the premiumPkgIdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiumPkgIdDesc() {
        return premiumPkgIdDesc;
    }

    /**
     * Sets the value of the premiumPkgIdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiumPkgIdDesc(String value) {
        this.premiumPkgIdDesc = value;
    }

    /**
     * Gets the value of the prdtTy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdtTy() {
        return prdtTy;
    }

    /**
     * Sets the value of the prdtTy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdtTy(String value) {
        this.prdtTy = value;
    }

    /**
     * Gets the value of the promoTy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoTy() {
        return promoTy;
    }

    /**
     * Sets the value of the promoTy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoTy(String value) {
        this.promoTy = value;
    }

    /**
     * Gets the value of the stockCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockCd() {
        return stockCd;
    }

    /**
     * Sets the value of the stockCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockCd(String value) {
        this.stockCd = value;
    }

    /**
     * Gets the value of the stockDeliveryMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockDeliveryMode() {
        return stockDeliveryMode;
    }

    /**
     * Sets the value of the stockDeliveryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockDeliveryMode(String value) {
        this.stockDeliveryMode = value;
    }

    /**
     * Gets the value of the stockDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockDesc() {
        return stockDesc;
    }

    /**
     * Sets the value of the stockDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockDesc(String value) {
        this.stockDesc = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQty(String value) {
        this.qty = value;
    }

    /**
     * Gets the value of the modemCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModemCd() {
        return modemCd;
    }

    /**
     * Sets the value of the modemCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModemCd(String value) {
        this.modemCd = value;
    }

    /**
     * Gets the value of the svcNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcNo() {
        return svcNo;
    }

    /**
     * Sets the value of the svcNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcNo(String value) {
        this.svcNo = value;
    }

}
