
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractOrderRequestDO;


/**
 * <p>Java class for BPMOrderRequestDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMOrderRequestDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractOrderRequestDO">
 *       &lt;sequence>
 *         &lt;element name="bpmInternalOrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nftIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apptInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMApptDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMContactDO" minOccurs="0"/>
 *         &lt;element name="wkoContact" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMContactDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deposit" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMDepositDO" minOccurs="0"/>
 *         &lt;element name="siTieId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notesInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMNotesDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */



public abstract class BPMOrderRequestDO
    extends AbstractOrderRequestDO
    implements Serializable
{

    protected String bpmInternalOrderID;
    protected String nftIndicator;
    protected List<BPMApptDO> apptInfo;
    protected BPMContactDO contact;
    protected List<BPMContactDO> wkoContact;
    protected BPMDepositDO deposit;
    protected String siTieId;
    protected List<BPMNotesDO> notesInfo;

    /**
     * Gets the value of the bpmInternalOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpmInternalOrderID() {
        return bpmInternalOrderID;
    }

    /**
     * Sets the value of the bpmInternalOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpmInternalOrderID(String value) {
        this.bpmInternalOrderID = value;
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
     * Gets the value of the apptInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apptInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApptInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMApptDO }
     * 
     * 
     */
    public List<BPMApptDO> getApptInfo() {
        if (apptInfo == null) {
            apptInfo = new ArrayList<BPMApptDO>();
        }
        return this.apptInfo;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link BPMContactDO }
     *     
     */
    public BPMContactDO getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMContactDO }
     *     
     */
    public void setContact(BPMContactDO value) {
        this.contact = value;
    }

    /**
     * Gets the value of the wkoContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wkoContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWkoContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMContactDO }
     * 
     * 
     */
    public List<BPMContactDO> getWkoContact() {
        if (wkoContact == null) {
            wkoContact = new ArrayList<BPMContactDO>();
        }
        return this.wkoContact;
    }

    /**
     * Gets the value of the deposit property.
     * 
     * @return
     *     possible object is
     *     {@link BPMDepositDO }
     *     
     */
    public BPMDepositDO getDeposit() {
        return deposit;
    }

    /**
     * Sets the value of the deposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMDepositDO }
     *     
     */
    public void setDeposit(BPMDepositDO value) {
        this.deposit = value;
    }

    /**
     * Gets the value of the siTieId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiTieId() {
        return siTieId;
    }

    /**
     * Sets the value of the siTieId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiTieId(String value) {
        this.siTieId = value;
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

}
