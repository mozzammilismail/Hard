
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMPremiumServiceDO;


/**
 * <p>Java class for AbstractPremiumServiceDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractPremiumServiceDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="svcNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svcType" type="{http://www.singtel.com/oft/dataobject/xsd/common}SvcTypeDO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class AbstractPremiumServiceDO
    implements Serializable
{

    protected String svcNo;
    protected SvcTypeDO svcType;

    /**
     * Gets the value of the svcNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcNo() {
        return svcNo;
    }

    /**
     * Sets the value of the svcNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcNo(String value) {
        this.svcNo = value;
    }

    /**
     * Gets the value of the svcType property.
     * 
     * @return
     *     possible object is
     *     {@link SvcTypeDO }
     *     
     */
    public SvcTypeDO getSvcType() {
        return svcType;
    }

    /**
     * Sets the value of the svcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcTypeDO }
     *     
     */
    public void setSvcType(SvcTypeDO value) {
        this.svcType = value;
    }

}
