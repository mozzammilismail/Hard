
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BPMTransferSIResultDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMTransferSIResultDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transferId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newSvcInstId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldSvcInstId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="svcInstTransferStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provideWkoNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ceaseWkoNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMTransferSIResultDO
    implements Serializable
{

    protected String transferId;
    protected String newSvcInstId;
    protected String oldSvcInstId;
    protected String svcInstTransferStatus;
    protected String provideWkoNum;
    protected String ceaseWkoNum;

    /**
     * Gets the value of the transferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferId() {
        return transferId;
    }

    /**
     * Sets the value of the transferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferId(String value) {
        this.transferId = value;
    }

    /**
     * Gets the value of the newSvcInstId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSvcInstId() {
        return newSvcInstId;
    }

    /**
     * Sets the value of the newSvcInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSvcInstId(String value) {
        this.newSvcInstId = value;
    }

    /**
     * Gets the value of the oldSvcInstId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldSvcInstId() {
        return oldSvcInstId;
    }

    /**
     * Sets the value of the oldSvcInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldSvcInstId(String value) {
        this.oldSvcInstId = value;
    }

    /**
     * Gets the value of the svcInstTransferStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcInstTransferStatus() {
        return svcInstTransferStatus;
    }

    /**
     * Sets the value of the svcInstTransferStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcInstTransferStatus(String value) {
        this.svcInstTransferStatus = value;
    }

    /**
     * Gets the value of the provideWkoNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvideWkoNum() {
        return provideWkoNum;
    }

    /**
     * Sets the value of the provideWkoNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvideWkoNum(String value) {
        this.provideWkoNum = value;
    }

    /**
     * Gets the value of the ceaseWkoNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCeaseWkoNum() {
        return ceaseWkoNum;
    }

    /**
     * Sets the value of the ceaseWkoNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCeaseWkoNum(String value) {
        this.ceaseWkoNum = value;
    }

}
