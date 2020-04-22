
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.server.BPMSvcPdtDO;


/**
 * <p>Java class for AbstractSvcPdtDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractSvcPdtDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractPdtDO">
 *       &lt;sequence>
 *         &lt;element name="speedInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="networkType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suppSvcNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public abstract class AbstractSvcPdtDO
    extends AbstractPdtDO
    implements Serializable
{

    protected String speedInfo;
    protected String networkType;
    protected String suppSvcNo;

    /**
     * Gets the value of the speedInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeedInfo() {
        return speedInfo;
    }

    /**
     * Sets the value of the speedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeedInfo(String value) {
        this.speedInfo = value;
    }

    /**
     * Gets the value of the networkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * Sets the value of the networkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkType(String value) {
        this.networkType = value;
    }

    /**
     * Gets the value of the suppSvcNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppSvcNo() {
        return suppSvcNo;
    }

    /**
     * Sets the value of the suppSvcNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppSvcNo(String value) {
        this.suppSvcNo = value;
    }

}
