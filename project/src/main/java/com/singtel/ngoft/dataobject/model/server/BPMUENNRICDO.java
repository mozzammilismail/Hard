
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractUENNRICDtlsDO;
import com.singtel.ngoft.dataobject.model.common.NRICInfoDO;


/**
 * <p>Java class for BPMUENNRICDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMUENNRICDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractUENNRICDtlsDO">
 *       &lt;sequence>
 *         &lt;element name="NRICInfo" type="{http://www.singtel.com/oft/dataobject/xsd/common}NRICInfoDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="blackListInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */



public class BPMUENNRICDO
    extends AbstractUENNRICDtlsDO
    implements Serializable
{

    protected List<NRICInfoDO> nricInfo;
    protected Boolean blackListInd;

    /**
     * Gets the value of the nricInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nricInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNRICInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NRICInfoDO }
     * 
     * 
     */
    public List<NRICInfoDO> getNRICInfo() {
        if (nricInfo == null) {
            nricInfo = new ArrayList<NRICInfoDO>();
        }
        return this.nricInfo;
    }

    /**
     * Gets the value of the blackListInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlackListInd() {
        return blackListInd;
    }

    /**
     * Sets the value of the blackListInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlackListInd(Boolean value) {
        this.blackListInd = value;
    }

}
