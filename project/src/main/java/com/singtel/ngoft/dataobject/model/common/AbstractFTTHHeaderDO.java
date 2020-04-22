
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractFTTHHeaderDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractFTTHHeaderDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ftthNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ontModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AbstractFTTHHeaderDO
    implements Serializable
{

    protected String ftthNo;
    protected String ontModel;

    /**
     * Gets the value of the ftthNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtthNo() {
        return ftthNo;
    }

    /**
     * Sets the value of the ftthNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtthNo(String value) {
        this.ftthNo = value;
    }

    /**
     * Gets the value of the ontModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOntModel() {
        return ontModel;
    }

    /**
     * Sets the value of the ontModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOntModel(String value) {
        this.ontModel = value;
    }

}
