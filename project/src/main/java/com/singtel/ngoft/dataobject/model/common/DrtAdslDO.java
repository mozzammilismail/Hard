
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DrtAdslDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DrtAdslDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="l1ExchCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="l1NodeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="l1SubNode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="l1TermNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="e1SubNode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="e1TermNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pairStatus1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pairStatus2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lineId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="equipTy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="muxFrame" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modemSerial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deviceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="interlinkLineID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="routerIPAddr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="logEndPt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class DrtAdslDO
    implements Serializable
{

    protected String l1ExchCode;
    protected String l1NodeId;
    protected String l1SubNode;
    protected String l1TermNo;
    protected String e1SubNode;
    protected String e1TermNo;
    protected String pairStatus1;
    protected String pairStatus2;
    protected String lineId;
    protected String equipTy;
    protected String muxFrame;
    protected String ipAddress;
    protected String modemSerial;
    protected String deviceName;
    protected String interlinkLineID;
    protected String routerIPAddr;
    protected String logEndPt;

    /**
     * Gets the value of the l1ExchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getL1ExchCode() {
        return l1ExchCode;
    }

    /**
     * Sets the value of the l1ExchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setL1ExchCode(String value) {
        this.l1ExchCode = value;
    }

    /**
     * Gets the value of the l1NodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getL1NodeId() {
        return l1NodeId;
    }

    /**
     * Sets the value of the l1NodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setL1NodeId(String value) {
        this.l1NodeId = value;
    }

    /**
     * Gets the value of the l1SubNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getL1SubNode() {
        return l1SubNode;
    }

    /**
     * Sets the value of the l1SubNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setL1SubNode(String value) {
        this.l1SubNode = value;
    }

    /**
     * Gets the value of the l1TermNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getL1TermNo() {
        return l1TermNo;
    }

    /**
     * Sets the value of the l1TermNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setL1TermNo(String value) {
        this.l1TermNo = value;
    }

    /**
     * Gets the value of the e1SubNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE1SubNode() {
        return e1SubNode;
    }

    /**
     * Sets the value of the e1SubNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE1SubNode(String value) {
        this.e1SubNode = value;
    }

    /**
     * Gets the value of the e1TermNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE1TermNo() {
        return e1TermNo;
    }

    /**
     * Sets the value of the e1TermNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE1TermNo(String value) {
        this.e1TermNo = value;
    }

    /**
     * Gets the value of the pairStatus1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPairStatus1() {
        return pairStatus1;
    }

    /**
     * Sets the value of the pairStatus1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPairStatus1(String value) {
        this.pairStatus1 = value;
    }

    /**
     * Gets the value of the pairStatus2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPairStatus2() {
        return pairStatus2;
    }

    /**
     * Sets the value of the pairStatus2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPairStatus2(String value) {
        this.pairStatus2 = value;
    }

    /**
     * Gets the value of the lineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineId() {
        return lineId;
    }

    /**
     * Sets the value of the lineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineId(String value) {
        this.lineId = value;
    }

    /**
     * Gets the value of the equipTy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipTy() {
        return equipTy;
    }

    /**
     * Sets the value of the equipTy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipTy(String value) {
        this.equipTy = value;
    }

    /**
     * Gets the value of the muxFrame property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuxFrame() {
        return muxFrame;
    }

    /**
     * Sets the value of the muxFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuxFrame(String value) {
        this.muxFrame = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the modemSerial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModemSerial() {
        return modemSerial;
    }

    /**
     * Sets the value of the modemSerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModemSerial(String value) {
        this.modemSerial = value;
    }

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the interlinkLineID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterlinkLineID() {
        return interlinkLineID;
    }

    /**
     * Sets the value of the interlinkLineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterlinkLineID(String value) {
        this.interlinkLineID = value;
    }

    /**
     * Gets the value of the routerIPAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouterIPAddr() {
        return routerIPAddr;
    }

    /**
     * Sets the value of the routerIPAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouterIPAddr(String value) {
        this.routerIPAddr = value;
    }

    /**
     * Gets the value of the logEndPt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogEndPt() {
        return logEndPt;
    }

    /**
     * Sets the value of the logEndPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogEndPt(String value) {
        this.logEndPt = value;
    }

}
