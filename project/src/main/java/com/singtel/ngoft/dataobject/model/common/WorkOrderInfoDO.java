
package com.singtel.ngoft.dataobject.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkOrderInfoDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkOrderInfoDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workOrderStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workOrderCreateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workOrderCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workOrderCloseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workOrderCancelledDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class WorkOrderInfoDO
    implements Serializable
{

    protected String workOrderNumber;
    protected String workOrderStatus;
    protected String workOrderCreateDate;
    protected String workOrderCompletionDate;
    protected String workOrderCloseDate;
    protected String workOrderCancelledDate;

    /**
     * Gets the value of the workOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrderNumber() {
        return workOrderNumber;
    }

    /**
     * Sets the value of the workOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrderNumber(String value) {
        this.workOrderNumber = value;
    }

    /**
     * Gets the value of the workOrderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrderStatus() {
        return workOrderStatus;
    }

    /**
     * Sets the value of the workOrderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrderStatus(String value) {
        this.workOrderStatus = value;
    }

    /**
     * Gets the value of the workOrderCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrderCreateDate() {
        return workOrderCreateDate;
    }

    /**
     * Sets the value of the workOrderCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrderCreateDate(String value) {
        this.workOrderCreateDate = value;
    }

    /**
     * Gets the value of the workOrderCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrderCompletionDate() {
        return workOrderCompletionDate;
    }

    /**
     * Sets the value of the workOrderCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrderCompletionDate(String value) {
        this.workOrderCompletionDate = value;
    }

    /**
     * Gets the value of the workOrderCloseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrderCloseDate() {
        return workOrderCloseDate;
    }

    /**
     * Sets the value of the workOrderCloseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrderCloseDate(String value) {
        this.workOrderCloseDate = value;
    }

    /**
     * Gets the value of the workOrderCancelledDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrderCancelledDate() {
        return workOrderCancelledDate;
    }

    /**
     * Sets the value of the workOrderCancelledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrderCancelledDate(String value) {
        this.workOrderCancelledDate = value;
    }

}
