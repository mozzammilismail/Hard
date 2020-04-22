
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMRelationshipDO;


/**
 * <p>Java class for AbstractRelationshipDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractRelationshipDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relatedToType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relationShip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relationShipTy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class AbstractRelationshipDO
    implements Serializable
{

    protected String relatedToType;
    protected String relateTo;
    protected String relationShip;
    protected String relationShipTy;

    /**
     * Gets the value of the relatedToType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedToType() {
        return relatedToType;
    }

    /**
     * Sets the value of the relatedToType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedToType(String value) {
        this.relatedToType = value;
    }

    /**
     * Gets the value of the relateTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelateTo() {
        return relateTo;
    }

    /**
     * Sets the value of the relateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelateTo(String value) {
        this.relateTo = value;
    }

    /**
     * Gets the value of the relationShip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationShip() {
        return relationShip;
    }

    /**
     * Sets the value of the relationShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationShip(String value) {
        this.relationShip = value;
    }

    /**
     * Gets the value of the relationShipTy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationShipTy() {
        return relationShipTy;
    }

    /**
     * Sets the value of the relationShipTy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationShipTy(String value) {
        this.relationShipTy = value;
    }

}
