
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractContractDO;


/**
 * <p>Java class for BPMContractDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMContractDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractContractDO">
 *       &lt;sequence>
 *         &lt;element name="penaltyInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMPenaltyInfoDO" minOccurs="0"/>
 *         &lt;element name="nrcRate" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMNRCRateDO" minOccurs="0"/>
 *         &lt;element name="discountOverride" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMDiscountOverrideDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


public class BPMContractDO
    extends AbstractContractDO
    implements Serializable
{

    protected BPMPenaltyInfoDO penaltyInfo;
    protected BPMNRCRateDO nrcRate;
    protected List<BPMDiscountOverrideDO> discountOverride;

    /**
     * Gets the value of the penaltyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BPMPenaltyInfoDO }
     *     
     */
    public BPMPenaltyInfoDO getPenaltyInfo() {
        return penaltyInfo;
    }

    /**
     * Sets the value of the penaltyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMPenaltyInfoDO }
     *     
     */
    public void setPenaltyInfo(BPMPenaltyInfoDO value) {
        this.penaltyInfo = value;
    }

    /**
     * Gets the value of the nrcRate property.
     * 
     * @return
     *     possible object is
     *     {@link BPMNRCRateDO }
     *     
     */
    public BPMNRCRateDO getNrcRate() {
        return nrcRate;
    }

    /**
     * Sets the value of the nrcRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMNRCRateDO }
     *     
     */
    public void setNrcRate(BPMNRCRateDO value) {
        this.nrcRate = value;
    }

    /**
     * Gets the value of the discountOverride property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountOverride property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountOverride().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMDiscountOverrideDO }
     * 
     * 
     */
    public List<BPMDiscountOverrideDO> getDiscountOverride() {
        if (discountOverride == null) {
            discountOverride = new ArrayList<BPMDiscountOverrideDO>();
        }
        return this.discountOverride;
    }

}
