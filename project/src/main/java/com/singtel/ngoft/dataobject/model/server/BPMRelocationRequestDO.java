
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractRelocationRequestDO;


/**
 * <p>Java class for BPMRelocationRequestDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMRelocationRequestDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractRelocationRequestDO">
 *       &lt;sequence>
 *         &lt;element name="contactInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMContactDO" maxOccurs="unbounded"/>
 *         &lt;element name="appt" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMApptDO" minOccurs="0"/>
 *         &lt;element name="bpmRelocationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bpmRelocationRequestDtlsDO" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMRelocationRequestDtlsDO" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMRelocationRequestDO
    extends AbstractRelocationRequestDO
    implements Serializable
{

    protected List<BPMContactDO> contactInfo;
    protected BPMApptDO appt;
    protected String bpmRelocationID;
    protected List<BPMRelocationRequestDtlsDO> bpmRelocationRequestDtlsDO;

    /**
     * Gets the value of the contactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMContactDO }
     * 
     * 
     */
    public List<BPMContactDO> getContactInfo() {
        if (contactInfo == null) {
            contactInfo = new ArrayList<BPMContactDO>();
        }
        return this.contactInfo;
    }

    /**
     * Gets the value of the appt property.
     * 
     * @return
     *     possible object is
     *     {@link BPMApptDO }
     *     
     */
    public BPMApptDO getAppt() {
        return appt;
    }

    /**
     * Sets the value of the appt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMApptDO }
     *     
     */
    public void setAppt(BPMApptDO value) {
        this.appt = value;
    }

    /**
     * Gets the value of the bpmRelocationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpmRelocationID() {
        return bpmRelocationID;
    }

    /**
     * Sets the value of the bpmRelocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpmRelocationID(String value) {
        this.bpmRelocationID = value;
    }

    /**
     * Gets the value of the bpmRelocationRequestDtlsDO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bpmRelocationRequestDtlsDO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBpmRelocationRequestDtlsDO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMRelocationRequestDtlsDO }
     * 
     * 
     */
    public List<BPMRelocationRequestDtlsDO> getBpmRelocationRequestDtlsDO() {
        if (bpmRelocationRequestDtlsDO == null) {
            bpmRelocationRequestDtlsDO = new ArrayList<BPMRelocationRequestDtlsDO>();
        }
        return this.bpmRelocationRequestDtlsDO;
    }

}
