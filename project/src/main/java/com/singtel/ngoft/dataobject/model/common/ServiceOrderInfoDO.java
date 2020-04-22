
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceOrderInfoDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceOrderInfoDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceOrderStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceOrderCreateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceOrderSubmitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workOrderInfo" type="{http://www.singtel.com/oft/dataobject/xsd/common}WorkOrderInfoDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class ServiceOrderInfoDO
    implements Serializable
{

    protected String serviceOrderNumber;
    protected String serviceOrderStatus;
    protected String serviceOrderCreateDate;
    protected String serviceOrderSubmitDate;
    protected List<WorkOrderInfoDO> workOrderInfo;

    /**
     * Gets the value of the serviceOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceOrderNumber() {
        return serviceOrderNumber;
    }

    /**
     * Sets the value of the serviceOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceOrderNumber(String value) {
        this.serviceOrderNumber = value;
    }

    /**
     * Gets the value of the serviceOrderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceOrderStatus() {
        return serviceOrderStatus;
    }

    /**
     * Sets the value of the serviceOrderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceOrderStatus(String value) {
        this.serviceOrderStatus = value;
    }

    /**
     * Gets the value of the serviceOrderCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceOrderCreateDate() {
        return serviceOrderCreateDate;
    }

    /**
     * Sets the value of the serviceOrderCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceOrderCreateDate(String value) {
        this.serviceOrderCreateDate = value;
    }

    /**
     * Gets the value of the serviceOrderSubmitDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceOrderSubmitDate() {
        return serviceOrderSubmitDate;
    }

    /**
     * Sets the value of the serviceOrderSubmitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceOrderSubmitDate(String value) {
        this.serviceOrderSubmitDate = value;
    }

    /**
     * Gets the value of the workOrderInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workOrderInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkOrderInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkOrderInfoDO }
     * 
     * 
     */
    public List<WorkOrderInfoDO> getWorkOrderInfo() {
        if (workOrderInfo == null) {
            workOrderInfo = new ArrayList<WorkOrderInfoDO>();
        }
        return this.workOrderInfo;
    }

}
