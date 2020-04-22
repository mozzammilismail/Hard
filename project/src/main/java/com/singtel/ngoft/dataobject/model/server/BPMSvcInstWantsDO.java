
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BPMSvcInstWantsDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMSvcInstWantsDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/server}BPMSvcInstDO">
 *       &lt;sequence>
 *         &lt;element name="svcPdtInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMSvcPdtWantsDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="historicSvcPdtInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMSvcPdtWantsDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="appointmentInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMSvcInstWantsDO
    extends BPMSvcInstDO
    implements Serializable
{

    protected List<BPMSvcPdtWantsDO> svcPdtInfo;
    protected List<BPMSvcPdtWantsDO> historicSvcPdtInfo;
    protected String appointmentInd;

    /**
     * Gets the value of the svcPdtInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svcPdtInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcPdtInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMSvcPdtWantsDO }
     * 
     * 
     */
    public List<BPMSvcPdtWantsDO> getSvcPdtInfo() {
        if (svcPdtInfo == null) {
            svcPdtInfo = new ArrayList<BPMSvcPdtWantsDO>();
        }
        return this.svcPdtInfo;
    }

    /**
     * Gets the value of the historicSvcPdtInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historicSvcPdtInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoricSvcPdtInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMSvcPdtWantsDO }
     * 
     * 
     */
    public List<BPMSvcPdtWantsDO> getHistoricSvcPdtInfo() {
        if (historicSvcPdtInfo == null) {
            historicSvcPdtInfo = new ArrayList<BPMSvcPdtWantsDO>();
        }
        return this.historicSvcPdtInfo;
    }

    /**
     * Gets the value of the appointmentInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentInd() {
        return appointmentInd;
    }

    /**
     * Sets the value of the appointmentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentInd(String value) {
        this.appointmentInd = value;
    }

}
