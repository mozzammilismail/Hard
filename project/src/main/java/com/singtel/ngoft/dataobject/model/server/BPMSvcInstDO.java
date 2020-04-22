
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractSvcInstDO;
import com.singtel.ngoft.dataobject.model.common.MUXCheckInfoDO;
import com.singtel.ngoft.dataobject.model.common.MUXReservationDO;


/**
 * <p>Java class for BPMSvcInstDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMSvcInstDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractSvcInstDO">
 *       &lt;sequence>
 *         &lt;element name="pegasusSvcOrderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pegasusWorkOrdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pegasusCustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="internalSvcType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bpmTxnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="internalOrderTxnType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bpmSvcInstID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newServiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="svcActionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originalStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="simCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sviDtls" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMSviDtlsDO" minOccurs="0"/>
 *         &lt;element name="childLineInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMLineTieSuppInfoDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parentLineInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMLineTieMainInfoDO" minOccurs="0"/>
 *         &lt;element name="siTieInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMSITieInfoDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="portInInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMPortInInfoDO" minOccurs="0"/>
 *         &lt;element name="projectResult" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMProjectResultDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="muxReservation" type="{http://www.singtel.com/oft/dataobject/xsd/common}MUXReservationDO" minOccurs="0"/>
 *         &lt;element name="muxCheckInfo" type="{http://www.singtel.com/oft/dataobject/xsd/common}MUXCheckInfoDO" minOccurs="0"/>
 *         &lt;element name="billCompInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMBillCompInfoDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nwPdtInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMNetworkPdtInfoDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="elementInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMElementInfoDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="corridorInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMCorridorInfoDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notesInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMNotesDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nftIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delPortInInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="internalGroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */



public abstract class BPMSvcInstDO
    extends AbstractSvcInstDO
    implements Serializable
{

    protected String pegasusSvcOrderNo;
    protected String pegasusWorkOrdNo;
    protected String pegasusCustomerID;
    protected String requestType;
    protected String internalSvcType;
    protected String bpmTxnType;
    protected List<String> internalOrderTxnType;
    protected String bpmSvcInstID;
    protected String actionCode;
    protected String newServiceNumber;
    protected String svcActionType;
    protected String originalStartDate;
    protected String simCardType;
    protected String serviceStartDate;
    protected String serviceEndDate;
    protected BPMSviDtlsDO sviDtls;
    protected List<BPMLineTieSuppInfoDO> childLineInfo;
    protected BPMLineTieMainInfoDO parentLineInfo;
    protected List<BPMSITieInfoDO> siTieInfo;
    protected BPMPortInInfoDO portInInfo;
    protected List<BPMProjectResultDO> projectResult;
    protected MUXReservationDO muxReservation;
    protected MUXCheckInfoDO muxCheckInfo;
    protected List<BPMBillCompInfoDO> billCompInfo;
    protected List<BPMNetworkPdtInfoDO> nwPdtInfo;
    protected List<BPMElementInfoDO> elementInfo;
    protected List<BPMCorridorInfoDO> corridorInfo;
    protected List<BPMNotesDO> notesInfo;
    protected String nftIndicator;
    protected String delPortInInd;
    protected String internalGroupID;

    /**
     * Gets the value of the pegasusSvcOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPegasusSvcOrderNo() {
        return pegasusSvcOrderNo;
    }

    /**
     * Sets the value of the pegasusSvcOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPegasusSvcOrderNo(String value) {
        this.pegasusSvcOrderNo = value;
    }

    /**
     * Gets the value of the pegasusWorkOrdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPegasusWorkOrdNo() {
        return pegasusWorkOrdNo;
    }

    /**
     * Sets the value of the pegasusWorkOrdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPegasusWorkOrdNo(String value) {
        this.pegasusWorkOrdNo = value;
    }

    /**
     * Gets the value of the pegasusCustomerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPegasusCustomerID() {
        return pegasusCustomerID;
    }

    /**
     * Sets the value of the pegasusCustomerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPegasusCustomerID(String value) {
        this.pegasusCustomerID = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestType(String value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the internalSvcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalSvcType() {
        return internalSvcType;
    }

    /**
     * Sets the value of the internalSvcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalSvcType(String value) {
        this.internalSvcType = value;
    }

    /**
     * Gets the value of the bpmTxnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpmTxnType() {
        return bpmTxnType;
    }

    /**
     * Sets the value of the bpmTxnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpmTxnType(String value) {
        this.bpmTxnType = value;
    }

    /**
     * Gets the value of the internalOrderTxnType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalOrderTxnType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalOrderTxnType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInternalOrderTxnType() {
        if (internalOrderTxnType == null) {
            internalOrderTxnType = new ArrayList<String>();
        }
        return this.internalOrderTxnType;
    }

    /**
     * Gets the value of the bpmSvcInstID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpmSvcInstID() {
        return bpmSvcInstID;
    }

    /**
     * Sets the value of the bpmSvcInstID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpmSvcInstID(String value) {
        this.bpmSvcInstID = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the newServiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewServiceNumber() {
        return newServiceNumber;
    }

    /**
     * Sets the value of the newServiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewServiceNumber(String value) {
        this.newServiceNumber = value;
    }

    /**
     * Gets the value of the svcActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcActionType() {
        return svcActionType;
    }

    /**
     * Sets the value of the svcActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcActionType(String value) {
        this.svcActionType = value;
    }

    /**
     * Gets the value of the originalStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalStartDate() {
        return originalStartDate;
    }

    /**
     * Sets the value of the originalStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalStartDate(String value) {
        this.originalStartDate = value;
    }

    /**
     * Gets the value of the simCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimCardType() {
        return simCardType;
    }

    /**
     * Sets the value of the simCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimCardType(String value) {
        this.simCardType = value;
    }

    /**
     * Gets the value of the serviceStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceStartDate() {
        return serviceStartDate;
    }

    /**
     * Sets the value of the serviceStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceStartDate(String value) {
        this.serviceStartDate = value;
    }

    /**
     * Gets the value of the serviceEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceEndDate() {
        return serviceEndDate;
    }

    /**
     * Sets the value of the serviceEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceEndDate(String value) {
        this.serviceEndDate = value;
    }

    /**
     * Gets the value of the sviDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BPMSviDtlsDO }
     *     
     */
    public BPMSviDtlsDO getSviDtls() {
        return sviDtls;
    }

    /**
     * Sets the value of the sviDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMSviDtlsDO }
     *     
     */
    public void setSviDtls(BPMSviDtlsDO value) {
        this.sviDtls = value;
    }

    /**
     * Gets the value of the childLineInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childLineInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildLineInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMLineTieSuppInfoDO }
     * 
     * 
     */
    public List<BPMLineTieSuppInfoDO> getChildLineInfo() {
        if (childLineInfo == null) {
            childLineInfo = new ArrayList<BPMLineTieSuppInfoDO>();
        }
        return this.childLineInfo;
    }

    /**
     * Gets the value of the parentLineInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BPMLineTieMainInfoDO }
     *     
     */
    public BPMLineTieMainInfoDO getParentLineInfo() {
        return parentLineInfo;
    }

    /**
     * Sets the value of the parentLineInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMLineTieMainInfoDO }
     *     
     */
    public void setParentLineInfo(BPMLineTieMainInfoDO value) {
        this.parentLineInfo = value;
    }

    /**
     * Gets the value of the siTieInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siTieInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiTieInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMSITieInfoDO }
     * 
     * 
     */
    public List<BPMSITieInfoDO> getSiTieInfo() {
        if (siTieInfo == null) {
            siTieInfo = new ArrayList<BPMSITieInfoDO>();
        }
        return this.siTieInfo;
    }

    /**
     * Gets the value of the portInInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BPMPortInInfoDO }
     *     
     */
    public BPMPortInInfoDO getPortInInfo() {
        return portInInfo;
    }

    /**
     * Sets the value of the portInInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMPortInInfoDO }
     *     
     */
    public void setPortInInfo(BPMPortInInfoDO value) {
        this.portInInfo = value;
    }

    /**
     * Gets the value of the projectResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMProjectResultDO }
     * 
     * 
     */
    public List<BPMProjectResultDO> getProjectResult() {
        if (projectResult == null) {
            projectResult = new ArrayList<BPMProjectResultDO>();
        }
        return this.projectResult;
    }

    /**
     * Gets the value of the muxReservation property.
     * 
     * @return
     *     possible object is
     *     {@link MUXReservationDO }
     *     
     */
    public MUXReservationDO getMuxReservation() {
        return muxReservation;
    }

    /**
     * Sets the value of the muxReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MUXReservationDO }
     *     
     */
    public void setMuxReservation(MUXReservationDO value) {
        this.muxReservation = value;
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
     * Gets the value of the billCompInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billCompInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillCompInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMBillCompInfoDO }
     * 
     * 
     */
    public List<BPMBillCompInfoDO> getBillCompInfo() {
        if (billCompInfo == null) {
            billCompInfo = new ArrayList<BPMBillCompInfoDO>();
        }
        return this.billCompInfo;
    }

    /**
     * Gets the value of the nwPdtInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nwPdtInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNwPdtInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMNetworkPdtInfoDO }
     * 
     * 
     */
    public List<BPMNetworkPdtInfoDO> getNwPdtInfo() {
        if (nwPdtInfo == null) {
            nwPdtInfo = new ArrayList<BPMNetworkPdtInfoDO>();
        }
        return this.nwPdtInfo;
    }

    /**
     * Gets the value of the elementInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMElementInfoDO }
     * 
     * 
     */
    public List<BPMElementInfoDO> getElementInfo() {
        if (elementInfo == null) {
            elementInfo = new ArrayList<BPMElementInfoDO>();
        }
        return this.elementInfo;
    }

    /**
     * Gets the value of the corridorInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corridorInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorridorInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMCorridorInfoDO }
     * 
     * 
     */
    public List<BPMCorridorInfoDO> getCorridorInfo() {
        if (corridorInfo == null) {
            corridorInfo = new ArrayList<BPMCorridorInfoDO>();
        }
        return this.corridorInfo;
    }

    /**
     * Gets the value of the notesInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notesInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotesInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMNotesDO }
     * 
     * 
     */
    public List<BPMNotesDO> getNotesInfo() {
        if (notesInfo == null) {
            notesInfo = new ArrayList<BPMNotesDO>();
        }
        return this.notesInfo;
    }

    /**
     * Gets the value of the nftIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNftIndicator() {
        return nftIndicator;
    }

    /**
     * Sets the value of the nftIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNftIndicator(String value) {
        this.nftIndicator = value;
    }

    /**
     * Gets the value of the delPortInInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelPortInInd() {
        return delPortInInd;
    }

    /**
     * Sets the value of the delPortInInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelPortInInd(String value) {
        this.delPortInInd = value;
    }

    /**
     * Gets the value of the internalGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalGroupID() {
        return internalGroupID;
    }

    /**
     * Sets the value of the internalGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalGroupID(String value) {
        this.internalGroupID = value;
    }

}
