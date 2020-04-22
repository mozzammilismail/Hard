
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractAcctPdtDO;


/**
 * <p>Java class for BPMAcctPdtDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMAcctPdtDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractAcctPdtDO">
 *       &lt;sequence>
 *         &lt;element name="contractInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMContractDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rcInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMRCInfoDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public abstract class BPMAcctPdtDO
    extends AbstractAcctPdtDO
    implements Serializable
{

    protected List<BPMContractDO> contractInfo;
    protected List<BPMRCInfoDO> rcInfo;

    /**
     * Gets the value of the contractInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMContractDO }
     * 
     * 
     */
    public List<BPMContractDO> getContractInfo() {
        if (contractInfo == null) {
            contractInfo = new ArrayList<BPMContractDO>();
        }
        return this.contractInfo;
    }

    /**
     * Gets the value of the rcInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMRCInfoDO }
     * 
     * 
     */
    public List<BPMRCInfoDO> getRcInfo() {
        if (rcInfo == null) {
            rcInfo = new ArrayList<BPMRCInfoDO>();
        }
        return this.rcInfo;
    }

}
