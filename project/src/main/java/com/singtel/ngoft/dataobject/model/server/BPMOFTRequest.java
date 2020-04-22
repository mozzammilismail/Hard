
package com.singtel.ngoft.dataobject.model.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BPMOFTRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMOFTRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestHeader" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMRequestHeaderDO"/>
 *         &lt;element name="custHasInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMCustHasDO"/>
 *         &lt;element name="custWantsInfo" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMCustWantsDO"/>
 *         &lt;element name="transferSIRequest" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMTransferSIRequestDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relocationRequest" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMRelocationRequestDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nominationRequest" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMNominationRequestDO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bypassErrCd" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nftHeader" type="{http://www.singtel.com/oft/dataobject/xsd/server}NFTHeaderDO" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.singtel.com/oft/dataobject/xsd/server}BPMMessageDO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class BPMOFTRequest
    implements Serializable
{

    protected BPMRequestHeaderDO requestHeader;
    protected BPMCustHasDO custHasInfo;
    protected BPMCustWantsDO custWantsInfo;
    protected List<BPMTransferSIRequestDO> transferSIRequest;
    protected List<BPMRelocationRequestDO> relocationRequest;
    protected List<BPMNominationRequestDO> nominationRequest;
    protected List<String> bypassErrCd;
    protected NFTHeaderDO nftHeader;
    protected List<BPMMessageDO> message;

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link BPMRequestHeaderDO }
     *     
     */
    public BPMRequestHeaderDO getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMRequestHeaderDO }
     *     
     */
    public void setRequestHeader(BPMRequestHeaderDO value) {
        this.requestHeader = value;
    }

    /**
     * Gets the value of the custHasInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BPMCustHasDO }
     *     
     */
    public BPMCustHasDO getCustHasInfo() {
        return custHasInfo;
    }

    /**
     * Sets the value of the custHasInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMCustHasDO }
     *     
     */
    public void setCustHasInfo(BPMCustHasDO value) {
        this.custHasInfo = value;
    }

    /**
     * Gets the value of the custWantsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BPMCustWantsDO }
     *     
     */
    public BPMCustWantsDO getCustWantsInfo() {
        return custWantsInfo;
    }

    /**
     * Sets the value of the custWantsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMCustWantsDO }
     *     
     */
    public void setCustWantsInfo(BPMCustWantsDO value) {
        this.custWantsInfo = value;
    }

    /**
     * Gets the value of the transferSIRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferSIRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferSIRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMTransferSIRequestDO }
     * 
     * 
     */
    public List<BPMTransferSIRequestDO> getTransferSIRequest() {
        if (transferSIRequest == null) {
            transferSIRequest = new ArrayList<BPMTransferSIRequestDO>();
        }
        return this.transferSIRequest;
    }

    /**
     * Gets the value of the relocationRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relocationRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelocationRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMRelocationRequestDO }
     * 
     * 
     */
    public List<BPMRelocationRequestDO> getRelocationRequest() {
        if (relocationRequest == null) {
            relocationRequest = new ArrayList<BPMRelocationRequestDO>();
        }
        return this.relocationRequest;
    }

    /**
     * Gets the value of the nominationRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nominationRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNominationRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMNominationRequestDO }
     * 
     * 
     */
    public List<BPMNominationRequestDO> getNominationRequest() {
        if (nominationRequest == null) {
            nominationRequest = new ArrayList<BPMNominationRequestDO>();
        }
        return this.nominationRequest;
    }

    /**
     * Gets the value of the bypassErrCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bypassErrCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBypassErrCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBypassErrCd() {
        if (bypassErrCd == null) {
            bypassErrCd = new ArrayList<String>();
        }
        return this.bypassErrCd;
    }

    /**
     * Gets the value of the nftHeader property.
     * 
     * @return
     *     possible object is
     *     {@link NFTHeaderDO }
     *     
     */
    public NFTHeaderDO getNftHeader() {
        return nftHeader;
    }

    /**
     * Sets the value of the nftHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link NFTHeaderDO }
     *     
     */
    public void setNftHeader(NFTHeaderDO value) {
        this.nftHeader = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMMessageDO }
     * 
     * 
     */
    public List<BPMMessageDO> getMessage() {
        if (message == null) {
            message = new ArrayList<BPMMessageDO>();
        }
        return this.message;
    }

}
