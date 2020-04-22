
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractApptDO;


/**
 * <p>Java class for BPMApptDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMApptDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractApptDO">
 *       &lt;sequence>
 *         &lt;element name="notesInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMNotesDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="apptOrderDetails" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMApptOrderDetailsDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="existApptPrefDtTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMApptDO
    extends AbstractApptDO
    implements Serializable
{

    protected List<BPMNotesDO> notesInfo;
    protected List<BPMApptOrderDetailsDO> apptOrderDetails;
    protected String existApptPrefDtTime;

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
     * Gets the value of the apptOrderDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apptOrderDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApptOrderDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMApptOrderDetailsDO }
     * 
     * 
     */
    public List<BPMApptOrderDetailsDO> getApptOrderDetails() {
        if (apptOrderDetails == null) {
            apptOrderDetails = new ArrayList<BPMApptOrderDetailsDO>();
        }
        return this.apptOrderDetails;
    }

    /**
     * Gets the value of the existApptPrefDtTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistApptPrefDtTime() {
        return existApptPrefDtTime;
    }

    /**
     * Sets the value of the existApptPrefDtTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistApptPrefDtTime(String value) {
        this.existApptPrefDtTime = value;
    }

}
