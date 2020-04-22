
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMCRDDtlsDO;


/**
 * <p>Java class for AbstractCRDDtlsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractCRDDtlsDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="svcNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="txnType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="muxCheckInfo" type="{http://www.singtel.com/oft/dataobject/xsd/common}MUXCheckInfoDO"/>
 *         &lt;element name="siTransferInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="portInInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reserveMUXInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="netCoWiring" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arborSvcType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installAddress" type="{http://www.singtel.com/oft/dataobject/xsd/common}AddressDO" minOccurs="0"/>
 *         &lt;element name="newSpeed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldSpeed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installationMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="routingReservedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="underCoverage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newMRC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oldMRC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AbstractCRDDtlsDO
    implements Serializable
{

    protected String svcNo;
    protected String svcType;
    protected String txnType;
    protected MUXCheckInfoDO muxCheckInfo;
    protected String siTransferInd;
    protected String portInInd;
    protected String reserveMUXInd;
    protected String netCoWiring;
    protected String arborSvcType;
    protected AddressDO installAddress;
    protected String newSpeed;
    protected String oldSpeed;
    protected String installationMode;
    protected String contractEndDate;
    protected String routingReservedInd;
    protected String productGroup;
    protected String underCoverage;
    protected String newMRC;
    protected String oldMRC;

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
     * Gets the value of the txnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnType() {
        return txnType;
    }

    /**
     * Sets the value of the txnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnType(String value) {
        this.txnType = value;
    }

    /**
     * Gets the value of the muxCheckInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MUXCheckInfoDO }
     *     
     */
    public MUXCheckInfoDO getMuxCheckInfo() {
        return muxCheckInfo;
    }

    /**
     * Sets the value of the muxCheckInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MUXCheckInfoDO }
     *     
     */
    public void setMuxCheckInfo(MUXCheckInfoDO value) {
        this.muxCheckInfo = value;
    }

    /**
     * Gets the value of the siTransferInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiTransferInd() {
        return siTransferInd;
    }

    /**
     * Sets the value of the siTransferInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiTransferInd(String value) {
        this.siTransferInd = value;
    }

    /**
     * Gets the value of the portInInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortInInd() {
        return portInInd;
    }

    /**
     * Sets the value of the portInInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortInInd(String value) {
        this.portInInd = value;
    }

    /**
     * Gets the value of the reserveMUXInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveMUXInd() {
        return reserveMUXInd;
    }

    /**
     * Sets the value of the reserveMUXInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveMUXInd(String value) {
        this.reserveMUXInd = value;
    }

    /**
     * Gets the value of the netCoWiring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetCoWiring() {
        return netCoWiring;
    }

    /**
     * Sets the value of the netCoWiring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetCoWiring(String value) {
        this.netCoWiring = value;
    }

    /**
     * Gets the value of the arborSvcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArborSvcType() {
        return arborSvcType;
    }

    /**
     * Sets the value of the arborSvcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArborSvcType(String value) {
        this.arborSvcType = value;
    }

    /**
     * Gets the value of the installAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDO }
     *     
     */
    public AddressDO getInstallAddress() {
        return installAddress;
    }

    /**
     * Sets the value of the installAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDO }
     *     
     */
    public void setInstallAddress(AddressDO value) {
        this.installAddress = value;
    }

    /**
     * Gets the value of the newSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSpeed() {
        return newSpeed;
    }

    /**
     * Sets the value of the newSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSpeed(String value) {
        this.newSpeed = value;
    }

    /**
     * Gets the value of the oldSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldSpeed() {
        return oldSpeed;
    }

    /**
     * Sets the value of the oldSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldSpeed(String value) {
        this.oldSpeed = value;
    }

    /**
     * Gets the value of the installationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallationMode() {
        return installationMode;
    }

    /**
     * Sets the value of the installationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallationMode(String value) {
        this.installationMode = value;
    }

    /**
     * Gets the value of the contractEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractEndDate() {
        return contractEndDate;
    }

    /**
     * Sets the value of the contractEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractEndDate(String value) {
        this.contractEndDate = value;
    }

    /**
     * Gets the value of the routingReservedInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingReservedInd() {
        return routingReservedInd;
    }

    /**
     * Sets the value of the routingReservedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingReservedInd(String value) {
        this.routingReservedInd = value;
    }

    /**
     * Gets the value of the productGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductGroup() {
        return productGroup;
    }

    /**
     * Sets the value of the productGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductGroup(String value) {
        this.productGroup = value;
    }

    /**
     * Gets the value of the underCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnderCoverage() {
        return underCoverage;
    }

    /**
     * Sets the value of the underCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnderCoverage(String value) {
        this.underCoverage = value;
    }

    /**
     * Gets the value of the newMRC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMRC() {
        return newMRC;
    }

    /**
     * Sets the value of the newMRC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMRC(String value) {
        this.newMRC = value;
    }

    /**
     * Gets the value of the oldMRC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldMRC() {
        return oldMRC;
    }

    /**
     * Sets the value of the oldMRC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldMRC(String value) {
        this.oldMRC = value;
    }

}
