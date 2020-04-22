
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractLineTieMainInfoDO;


/**
 * <p>Java class for BPMLineTieMainInfoDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMLineTieMainInfoDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractLineTieMainInfoDO">
 *       &lt;sequence>
 *         &lt;element name="requestCompId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mainSvcInstId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMLineTieMainInfoDO
    extends AbstractLineTieMainInfoDO
    implements Serializable
{

    protected String requestCompId;
    protected String mainSvcInstId;

    /**
     * Gets the value of the requestCompId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCompId() {
        return requestCompId;
    }

    /**
     * Sets the value of the requestCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCompId(String value) {
        this.requestCompId = value;
    }

    /**
     * Gets the value of the mainSvcInstId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainSvcInstId() {
        return mainSvcInstId;
    }

    /**
     * Sets the value of the mainSvcInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainSvcInstId(String value) {
        this.mainSvcInstId = value;
    }

}
