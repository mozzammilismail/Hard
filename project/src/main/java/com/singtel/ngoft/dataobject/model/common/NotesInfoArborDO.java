
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotesInfoArborDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotesInfoArborDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chgDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acctNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notesCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="equipExtId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permanentFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chgWho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noteText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class NotesInfoArborDO
    implements Serializable
{

    protected String chgDt;
    protected String acctNo;
    protected String notesCode;
    protected String equipExtId;
    protected String permanentFlag;
    protected String chgWho;
    protected String noteText;
    protected String comments;

    /**
     * Gets the value of the chgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChgDt() {
        return chgDt;
    }

    /**
     * Sets the value of the chgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChgDt(String value) {
        this.chgDt = value;
    }

    /**
     * Gets the value of the acctNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNo() {
        return acctNo;
    }

    /**
     * Sets the value of the acctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNo(String value) {
        this.acctNo = value;
    }

    /**
     * Gets the value of the notesCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotesCode() {
        return notesCode;
    }

    /**
     * Sets the value of the notesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotesCode(String value) {
        this.notesCode = value;
    }

    /**
     * Gets the value of the equipExtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipExtId() {
        return equipExtId;
    }

    /**
     * Sets the value of the equipExtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipExtId(String value) {
        this.equipExtId = value;
    }

    /**
     * Gets the value of the permanentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermanentFlag() {
        return permanentFlag;
    }

    /**
     * Sets the value of the permanentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermanentFlag(String value) {
        this.permanentFlag = value;
    }

    /**
     * Gets the value of the chgWho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChgWho() {
        return chgWho;
    }

    /**
     * Sets the value of the chgWho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChgWho(String value) {
        this.chgWho = value;
    }

    /**
     * Gets the value of the noteText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteText() {
        return noteText;
    }

    /**
     * Sets the value of the noteText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteText(String value) {
        this.noteText = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
