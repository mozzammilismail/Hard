
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractSINotesDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractSINotesDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes_Ty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes_Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Perm_wk_ord_notes_ind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AbstractSINotesDO
    implements Serializable
{

    protected String notes;
    protected String notesTy;
    protected String notesText;
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
     * Gets the value of the notesTy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotesTy() {
        return notesTy;
    }

    /**
     * Sets the value of the notesTy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotesTy(String value) {
        this.notesTy = value;
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
