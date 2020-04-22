
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.singtel.ngoft.dataobject.model.common.AbstractRCInfoDO;


/**
 * <p>Java class for BPMRCInfoDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMRCInfoDO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.singtel.com/oft/dataobject/xsd/common}AbstractRCInfoDO">
 *       &lt;sequence>
 *         &lt;element name="rating" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMRatingDO" minOccurs="0"/>
 *         &lt;element name="penaltyInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMPenaltyInfoDO" minOccurs="0"/>
 *         &lt;element name="billPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rcRate" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMRCRateDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class BPMRCInfoDO
    extends AbstractRCInfoDO
    implements Serializable
{

    protected BPMRatingDO rating;
    protected BPMPenaltyInfoDO penaltyInfo;
    protected String billPeriod;
    protected List<BPMRCRateDO> rcRate;

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link BPMRatingDO }
     *     
     */
    public BPMRatingDO getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMRatingDO }
     *     
     */
    public void setRating(BPMRatingDO value) {
        this.rating = value;
    }

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
     * Gets the value of the billPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillPeriod() {
        return billPeriod;
    }

    /**
     * Sets the value of the billPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillPeriod(String value) {
        this.billPeriod = value;
    }

    /**
     * Gets the value of the rcRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMRCRateDO }
     * 
     * 
     */
    public List<BPMRCRateDO> getRcRate() {
        if (rcRate == null) {
            rcRate = new ArrayList<BPMRCRateDO>();
        }
        return this.rcRate;
    }

}
