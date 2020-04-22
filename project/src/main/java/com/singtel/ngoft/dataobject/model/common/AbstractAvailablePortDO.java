
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractAvailablePortDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractAvailablePortDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ftthSvcNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portAssignmentList" type="{http://www.singtel.com/oft/dataobject/xsd/common}PortAssignmentDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="svcTy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="connectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class AbstractAvailablePortDO
    implements Serializable
{

    protected String status;
    protected String ftthSvcNo;
    protected List<PortAssignmentDO> portAssignmentList;
    protected String svcTy;
    protected String portNo;
    protected String connectType;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the ftthSvcNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtthSvcNo() {
        return ftthSvcNo;
    }

    /**
     * Sets the value of the ftthSvcNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtthSvcNo(String value) {
        this.ftthSvcNo = value;
    }

    /**
     * Gets the value of the portAssignmentList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portAssignmentList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortAssignmentList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortAssignmentDO }
     * 
     * 
     */
    public List<PortAssignmentDO> getPortAssignmentList() {
        if (portAssignmentList == null) {
            portAssignmentList = new ArrayList<PortAssignmentDO>();
        }
        return this.portAssignmentList;
    }

    /**
     * Gets the value of the svcTy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcTy() {
        return svcTy;
    }

    /**
     * Sets the value of the svcTy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcTy(String value) {
        this.svcTy = value;
    }

    /**
     * Gets the value of the portNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortNo() {
        return portNo;
    }

    /**
     * Sets the value of the portNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortNo(String value) {
        this.portNo = value;
    }

    /**
     * Gets the value of the connectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectType() {
        return connectType;
    }

    /**
     * Sets the value of the connectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectType(String value) {
        this.connectType = value;
    }

}
