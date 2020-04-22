
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferFeeDtlsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferFeeDtlsDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="svcNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transferFeePackageID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transferFeeComponentID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ComponentDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transferFeeAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="waiverInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class TransferFeeDtlsDO
    implements Serializable
{

    protected String svcNo;
    protected String svcType;
    protected String transferFeePackageID;
    protected String transferFeeComponentID;
    protected String componentDesc;
    protected String transferFeeAmount;
    protected String waiverInd;

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

    /**
     * Gets the value of the svcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcType() {
        return svcType;
    }

    /**
     * Sets the value of the svcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcType(String value) {
        this.svcType = value;
    }

    /**
     * Gets the value of the transferFeePackageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferFeePackageID() {
        return transferFeePackageID;
    }

    /**
     * Sets the value of the transferFeePackageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferFeePackageID(String value) {
        this.transferFeePackageID = value;
    }

    /**
     * Gets the value of the transferFeeComponentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferFeeComponentID() {
        return transferFeeComponentID;
    }

    /**
     * Sets the value of the transferFeeComponentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferFeeComponentID(String value) {
        this.transferFeeComponentID = value;
    }

    /**
     * Gets the value of the componentDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentDesc() {
        return componentDesc;
    }

    /**
     * Sets the value of the componentDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentDesc(String value) {
        this.componentDesc = value;
    }

    /**
     * Gets the value of the transferFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferFeeAmount() {
        return transferFeeAmount;
    }

    /**
     * Sets the value of the transferFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferFeeAmount(String value) {
        this.transferFeeAmount = value;
    }

    /**
     * Gets the value of the waiverInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiverInd() {
        return waiverInd;
    }

    /**
     * Sets the value of the waiverInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaiverInd(String value) {
        this.waiverInd = value;
    }

}
