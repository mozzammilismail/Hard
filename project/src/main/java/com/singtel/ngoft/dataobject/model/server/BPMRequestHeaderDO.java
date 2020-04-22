
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractRequestHeaderDO;


/**
 * Contains header information for the entire request. Header information will be use for OFT Order submission. 
 * 
 * <p>Java class for BPMRequestHeaderDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMRequestHeaderDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractRequestHeaderDO">
 *       &lt;sequence>
 *         &lt;element name="internalCallerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="lastUpdateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="byPassInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMRequestHeaderDO
    extends AbstractRequestHeaderDO
    implements Serializable
{

    protected String internalCallerID;
    protected Object requestID;
    protected String lastUpdateId;
    protected String byPassInd;

    /**
     * Gets the value of the internalCallerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalCallerID() {
        return internalCallerID;
    }

    /**
     * Sets the value of the internalCallerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalCallerID(String value) {
        this.internalCallerID = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRequestID(Object value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the lastUpdateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateId() {
        return lastUpdateId;
    }

    /**
     * Sets the value of the lastUpdateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateId(String value) {
        this.lastUpdateId = value;
    }

    /**
     * Gets the value of the byPassInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getByPassInd() {
        return byPassInd;
    }

    /**
     * Sets the value of the byPassInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setByPassInd(String value) {
        this.byPassInd = value;
    }

}
