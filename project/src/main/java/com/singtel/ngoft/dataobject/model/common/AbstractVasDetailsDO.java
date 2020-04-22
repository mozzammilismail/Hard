
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMVasInfoDO;


/**
 * <p>Java class for AbstractVasDetailsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractVasDetailsDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vasName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AbstractVasDetailsDO
    implements Serializable
{

    protected String vasName;

    /**
     * Gets the value of the vasName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVasName() {
        return vasName;
    }

    /**
     * Sets the value of the vasName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVasName(String value) {
        this.vasName = value;
    }

}
