
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;




public class AbstractRoutingInfoDO
    implements Serializable
{

  
    protected String servExCod;
    
    protected String cirTy;
    
    protected String cirId;
   
    protected String mainNum;
    
    protected String address;
    
    protected String routStatus;
    
    protected String status1;
    
    protected String status2;
    
    protected String drt1Khz;
    
    protected String drt40Khz;
    
    protected String drt120Khz;
    
    protected String loopResist;
    
    protected List<DrtRoutDetailsDO> routingDetails;
    
    protected String mdfLsName;
    
    protected String isChan;
    
    protected String mdfEsName;
    
    protected String esChan;
    
    protected String eet1;
    
    protected String eet2;
    
    protected String eet3;
    
    protected String eet4;
    
    protected String adslCode;
    protected boolean adslStatus;
    
    protected DrtAdslDO adslResult;
    
    protected String cardType;
    
    protected String interlinkLineID;
    
    protected String routerIPAddr;
    
    protected String deviceName;
    
    protected String upStream;
    
    protected String downStream;
    
    protected String servNo;
    
    protected String tid;
    
    protected String eid;

    /**
     * Gets the value of the servExCod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServExCod() {
        return servExCod;
    }

    /**
     * Sets the value of the servExCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServExCod(String value) {
        this.servExCod = value;
    }

    /**
     * Gets the value of the cirTy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCirTy() {
        return cirTy;
    }

    /**
     * Sets the value of the cirTy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCirTy(String value) {
        this.cirTy = value;
    }

    /**
     * Gets the value of the cirId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCirId() {
        return cirId;
    }

    /**
     * Sets the value of the cirId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCirId(String value) {
        this.cirId = value;
    }

    /**
     * Gets the value of the mainNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainNum() {
        return mainNum;
    }

    /**
     * Sets the value of the mainNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainNum(String value) {
        this.mainNum = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the routStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutStatus() {
        return routStatus;
    }

    /**
     * Sets the value of the routStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutStatus(String value) {
        this.routStatus = value;
    }

    /**
     * Gets the value of the status1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus1() {
        return status1;
    }

    /**
     * Sets the value of the status1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus1(String value) {
        this.status1 = value;
    }

    /**
     * Gets the value of the status2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus2() {
        return status2;
    }

    /**
     * Sets the value of the status2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus2(String value) {
        this.status2 = value;
    }

    /**
     * Gets the value of the drt1Khz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrt1Khz() {
        return drt1Khz;
    }

    /**
     * Sets the value of the drt1Khz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrt1Khz(String value) {
        this.drt1Khz = value;
    }

    /**
     * Gets the value of the drt40Khz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrt40Khz() {
        return drt40Khz;
    }

    /**
     * Sets the value of the drt40Khz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrt40Khz(String value) {
        this.drt40Khz = value;
    }

    /**
     * Gets the value of the drt120Khz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrt120Khz() {
        return drt120Khz;
    }

    /**
     * Sets the value of the drt120Khz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrt120Khz(String value) {
        this.drt120Khz = value;
    }

    /**
     * Gets the value of the loopResist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoopResist() {
        return loopResist;
    }

    /**
     * Sets the value of the loopResist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoopResist(String value) {
        this.loopResist = value;
    }

    /**
     * Gets the value of the routingDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DrtRoutDetailsDO }
     * 
     * 
     */
    public List<DrtRoutDetailsDO> getRoutingDetails() {
        if (routingDetails == null) {
            routingDetails = new ArrayList<DrtRoutDetailsDO>();
        }
        return this.routingDetails;
    }

    /**
     * Gets the value of the mdfLsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdfLsName() {
        return mdfLsName;
    }

    /**
     * Sets the value of the mdfLsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdfLsName(String value) {
        this.mdfLsName = value;
    }

    /**
     * Gets the value of the isChan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsChan() {
        return isChan;
    }

    /**
     * Sets the value of the isChan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsChan(String value) {
        this.isChan = value;
    }

    /**
     * Gets the value of the mdfEsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdfEsName() {
        return mdfEsName;
    }

    /**
     * Sets the value of the mdfEsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdfEsName(String value) {
        this.mdfEsName = value;
    }

    /**
     * Gets the value of the esChan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsChan() {
        return esChan;
    }

    /**
     * Sets the value of the esChan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsChan(String value) {
        this.esChan = value;
    }

    /**
     * Gets the value of the eet1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEet1() {
        return eet1;
    }

    /**
     * Sets the value of the eet1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEet1(String value) {
        this.eet1 = value;
    }

    /**
     * Gets the value of the eet2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEet2() {
        return eet2;
    }

    /**
     * Sets the value of the eet2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEet2(String value) {
        this.eet2 = value;
    }

    /**
     * Gets the value of the eet3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEet3() {
        return eet3;
    }

    /**
     * Sets the value of the eet3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEet3(String value) {
        this.eet3 = value;
    }

    /**
     * Gets the value of the eet4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEet4() {
        return eet4;
    }

    /**
     * Sets the value of the eet4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEet4(String value) {
        this.eet4 = value;
    }

    /**
     * Gets the value of the adslCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdslCode() {
        return adslCode;
    }

    /**
     * Sets the value of the adslCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdslCode(String value) {
        this.adslCode = value;
    }

    /**
     * Gets the value of the adslStatus property.
     * 
     */
    public boolean isAdslStatus() {
        return adslStatus;
    }

    /**
     * Sets the value of the adslStatus property.
     * 
     */
    public void setAdslStatus(boolean value) {
        this.adslStatus = value;
    }

    /**
     * Gets the value of the adslResult property.
     * 
     * @return
     *     possible object is
     *     {@link DrtAdslDO }
     *     
     */
    public DrtAdslDO getAdslResult() {
        return adslResult;
    }

    /**
     * Sets the value of the adslResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrtAdslDO }
     *     
     */
    public void setAdslResult(DrtAdslDO value) {
        this.adslResult = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
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
     * Gets the value of the upStream property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpStream() {
        return upStream;
    }

    /**
     * Sets the value of the upStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpStream(String value) {
        this.upStream = value;
    }

    /**
     * Gets the value of the downStream property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownStream() {
        return downStream;
    }

    /**
     * Sets the value of the downStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownStream(String value) {
        this.downStream = value;
    }

    /**
     * Gets the value of the servNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServNo() {
        return servNo;
    }

    /**
     * Sets the value of the servNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServNo(String value) {
        this.servNo = value;
    }

    /**
     * Gets the value of the tid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTid() {
        return tid;
    }

    /**
     * Sets the value of the tid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTid(String value) {
        this.tid = value;
    }

    /**
     * Gets the value of the eid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEid() {
        return eid;
    }

    /**
     * Sets the value of the eid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEid(String value) {
        this.eid = value;
    }

}
