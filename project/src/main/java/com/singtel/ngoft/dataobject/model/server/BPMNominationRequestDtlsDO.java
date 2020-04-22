
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractNominationRequestDtlsDO;


/**
 * <p>Java class for BPMNominationRequestDtlsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMNominationRequestDtlsDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractNominationRequestDtlsDO">
 *       &lt;sequence>
 *         &lt;element name="notes" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMNotesDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bpmNominationDtlsID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customer" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMCustomerHasDO"/>
 *         &lt;element name="svcInst" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMSvcInstHasDO"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class BPMNominationRequestDtlsDO
    extends AbstractNominationRequestDtlsDO
    implements Serializable
{

    protected List<BPMNotesDO> notes;
    protected String bpmNominationDtlsID;
    protected BPMCustomerHasDO customer;
    protected BPMSvcInstHasDO svcInst;

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMNotesDO }
     * 
     * 
     */
    public List<BPMNotesDO> getNotes() {
        if (notes == null) {
            notes = new ArrayList<BPMNotesDO>();
        }
        return this.notes;
    }

    /**
     * Gets the value of the bpmNominationDtlsID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpmNominationDtlsID() {
        return bpmNominationDtlsID;
    }

    /**
     * Sets the value of the bpmNominationDtlsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpmNominationDtlsID(String value) {
        this.bpmNominationDtlsID = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link BPMCustomerHasDO }
     *     
     */
    public BPMCustomerHasDO getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMCustomerHasDO }
     *     
     */
    public void setCustomer(BPMCustomerHasDO value) {
        this.customer = value;
    }

    /**
     * Gets the value of the svcInst property.
     * 
     * @return
     *     possible object is
     *     {@link BPMSvcInstHasDO }
     *     
     */
    public BPMSvcInstHasDO getSvcInst() {
        return svcInst;
    }

    /**
     * Sets the value of the svcInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMSvcInstHasDO }
     *     
     */
    public void setSvcInst(BPMSvcInstHasDO value) {
        this.svcInst = value;
    }

}
