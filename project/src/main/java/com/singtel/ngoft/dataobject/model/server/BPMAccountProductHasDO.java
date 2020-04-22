
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BPMAccountProductHasDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMAccountProductHasDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/server}BPMAccountProductDO">
 *       &lt;sequence>
 *         &lt;element name="acctPdtInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMAcctPdtHasDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="historicAcctPdtInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMAcctPdtHasDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="txnAcctPdtInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMAcctPdtHasDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMAccountProductHasDO
    extends BPMAccountProductDO
    implements Serializable
{

    protected List<BPMAcctPdtHasDO> acctPdtInfo;
    protected List<BPMAcctPdtHasDO> historicAcctPdtInfo;
    protected List<BPMAcctPdtHasDO> txnAcctPdtInfo;

    /**
     * Gets the value of the acctPdtInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctPdtInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctPdtInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMAcctPdtHasDO }
     * 
     * 
     */
    public List<BPMAcctPdtHasDO> getAcctPdtInfo() {
        if (acctPdtInfo == null) {
            acctPdtInfo = new ArrayList<BPMAcctPdtHasDO>();
        }
        return this.acctPdtInfo;
    }

    /**
     * Gets the value of the historicAcctPdtInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historicAcctPdtInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoricAcctPdtInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMAcctPdtHasDO }
     * 
     * 
     */
    public List<BPMAcctPdtHasDO> getHistoricAcctPdtInfo() {
        if (historicAcctPdtInfo == null) {
            historicAcctPdtInfo = new ArrayList<BPMAcctPdtHasDO>();
        }
        return this.historicAcctPdtInfo;
    }

    /**
     * Gets the value of the txnAcctPdtInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txnAcctPdtInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxnAcctPdtInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMAcctPdtHasDO }
     * 
     * 
     */
    public List<BPMAcctPdtHasDO> getTxnAcctPdtInfo() {
        if (txnAcctPdtInfo == null) {
            txnAcctPdtInfo = new ArrayList<BPMAcctPdtHasDO>();
        }
        return this.txnAcctPdtInfo;
    }

}
