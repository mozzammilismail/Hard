
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BPMSvcInstHasDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMSvcInstHasDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/server}BPMSvcInstDO">
 *       &lt;sequence>
 *         &lt;element name="svcPdtInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMSvcPdtHasDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="historicSvcPdtInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMSvcPdtHasDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="txnSvcPdtInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMSvcPdtHasDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="secretAcctInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class BPMSvcInstHasDO
    extends BPMSvcInstDO
    implements Serializable
{

    protected List<BPMSvcPdtHasDO> svcPdtInfo;
    protected List<BPMSvcPdtHasDO> historicSvcPdtInfo;
    protected List<BPMSvcPdtHasDO> txnSvcPdtInfo;
    protected String secretAcctInd;

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
     * {@link BPMSvcPdtHasDO }
     * 
     * 
     */
    public List<BPMSvcPdtHasDO> getSvcPdtInfo() {
        if (svcPdtInfo == null) {
            svcPdtInfo = new ArrayList<BPMSvcPdtHasDO>();
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
     * {@link BPMSvcPdtHasDO }
     * 
     * 
     */
    public List<BPMSvcPdtHasDO> getHistoricSvcPdtInfo() {
        if (historicSvcPdtInfo == null) {
            historicSvcPdtInfo = new ArrayList<BPMSvcPdtHasDO>();
        }
        return this.historicSvcPdtInfo;
    }

    /**
     * Gets the value of the txnSvcPdtInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txnSvcPdtInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxnSvcPdtInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMSvcPdtHasDO }
     * 
     * 
     */
    public List<BPMSvcPdtHasDO> getTxnSvcPdtInfo() {
        if (txnSvcPdtInfo == null) {
            txnSvcPdtInfo = new ArrayList<BPMSvcPdtHasDO>();
        }
        return this.txnSvcPdtInfo;
    }

    /**
     * Gets the value of the secretAcctInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecretAcctInd() {
        return secretAcctInd;
    }

    /**
     * Sets the value of the secretAcctInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecretAcctInd(String value) {
        this.secretAcctInd = value;
    }

}
