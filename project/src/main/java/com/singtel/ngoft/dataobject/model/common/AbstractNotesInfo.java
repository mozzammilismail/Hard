
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractNotesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractNotesInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="opNotesList" type="{http://www.singtel.com/oft/dataobject/xsd/common}NotesInfoOPDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tallymanNotesList" type="{http://www.singtel.com/oft/dataobject/xsd/common}NotesInfoTallymanDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="arborNotesList" type="{http://www.singtel.com/oft/dataobject/xsd/common}NotesInfoArborDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AbstractNotesInfo
    implements Serializable
{

    protected List<NotesInfoOPDO> opNotesList;
    protected List<NotesInfoTallymanDO> tallymanNotesList;
    protected List<NotesInfoArborDO> arborNotesList;

    /**
     * Gets the value of the opNotesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opNotesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpNotesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotesInfoOPDO }
     * 
     * 
     */
    public List<NotesInfoOPDO> getOpNotesList() {
        if (opNotesList == null) {
            opNotesList = new ArrayList<NotesInfoOPDO>();
        }
        return this.opNotesList;
    }

    /**
     * Gets the value of the tallymanNotesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tallymanNotesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTallymanNotesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotesInfoTallymanDO }
     * 
     * 
     */
    public List<NotesInfoTallymanDO> getTallymanNotesList() {
        if (tallymanNotesList == null) {
            tallymanNotesList = new ArrayList<NotesInfoTallymanDO>();
        }
        return this.tallymanNotesList;
    }

    /**
     * Gets the value of the arborNotesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arborNotesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArborNotesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotesInfoArborDO }
     * 
     * 
     */
    public List<NotesInfoArborDO> getArborNotesList() {
        if (arborNotesList == null) {
            arborNotesList = new ArrayList<NotesInfoArborDO>();
        }
        return this.arborNotesList;
    }

}
