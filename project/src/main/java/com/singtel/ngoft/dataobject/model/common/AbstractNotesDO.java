
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMNotesDO;


/**
 * <p>Java class for AbstractNotesDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractNotesDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notesText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notesType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oftNotesType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permWkOrdNotesInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AbstractNotesDO
    implements Serializable
{

    protected String notes;
    protected String notesText;
    protected String notesType;
    protected String oftNotesType;
    protected String permWkOrdNotesInd;

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the notesText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotesText() {
        return notesText;
    }

    /**
     * Sets the value of the notesText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotesText(String value) {
        this.notesText = value;
    }

    /**
     * Gets the value of the notesType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotesType() {
        return notesType;
    }

    /**
     * Sets the value of the notesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotesType(String value) {
        this.notesType = value;
    }

    /**
     * Gets the value of the oftNotesType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOftNotesType() {
        return oftNotesType;
    }

    /**
     * Sets the value of the oftNotesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOftNotesType(String value) {
        this.oftNotesType = value;
    }

    /**
     * Gets the value of the permWkOrdNotesInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermWkOrdNotesInd() {
        return permWkOrdNotesInd;
    }

    /**
     * Sets the value of the permWkOrdNotesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermWkOrdNotesInd(String value) {
        this.permWkOrdNotesInd = value;
    }

}
