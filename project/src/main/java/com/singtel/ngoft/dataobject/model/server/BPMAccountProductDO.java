
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractAccountProductDO;


/**
 * <p>Java class for BPMAccountProductDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMAccountProductDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractAccountProductDO">
 *       &lt;sequence>
 *         &lt;element name="pegasusServiceOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pegasusWorkOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pegasusCustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="internalOrderTxnType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bpmAccountProductID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billCompInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMBillCompInfoDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="elementInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMElementInfoDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="corridorInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMCorridorInfoDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notesInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMNotesDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nftIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public abstract class BPMAccountProductDO
    extends AbstractAccountProductDO
    implements Serializable
{

    protected String pegasusServiceOrderNumber;
    protected String pegasusWorkOrderNumber;
    protected String pegasusCustomerID;
    protected List<String> internalOrderTxnType;
    protected String bpmAccountProductID;
    protected String actionCode;
    protected String requestType;
    protected List<BPMBillCompInfoDO> billCompInfo;
    protected List<BPMElementInfoDO> elementInfo;
    protected List<BPMCorridorInfoDO> corridorInfo;
    protected List<BPMNotesDO> notesInfo;
    protected String nftIndicator;

    /**
     * Gets the value of the pegasusServiceOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPegasusServiceOrderNumber() {
        return pegasusServiceOrderNumber;
    }

    /**
     * Sets the value of the pegasusServiceOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPegasusServiceOrderNumber(String value) {
        this.pegasusServiceOrderNumber = value;
    }

    /**
     * Gets the value of the pegasusWorkOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPegasusWorkOrderNumber() {
        return pegasusWorkOrderNumber;
    }

    /**
     * Sets the value of the pegasusWorkOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPegasusWorkOrderNumber(String value) {
        this.pegasusWorkOrderNumber = value;
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
     * Gets the value of the bpmAccountProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpmAccountProductID() {
        return bpmAccountProductID;
    }

    /**
     * Sets the value of the bpmAccountProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpmAccountProductID(String value) {
        this.bpmAccountProductID = value;
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

}
