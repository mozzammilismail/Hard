package com.singtel.ngoft.drools.bre;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import com.google.gson.Gson;
import com.singtel.ngoft.dataobject.model.common.AddressDO;
import com.singtel.ngoft.dataobject.model.common.NRICInfoDO;
import com.singtel.ngoft.dataobject.model.server.BPMAccountDO;
import com.singtel.ngoft.dataobject.model.server.BPMAccountDtlsDO;
import com.singtel.ngoft.dataobject.model.server.BPMAccountHasDO;
import com.singtel.ngoft.dataobject.model.server.BPMAccountWantsDO;
import com.singtel.ngoft.dataobject.model.server.BPMContractDO;
import com.singtel.ngoft.dataobject.model.server.BPMCustHasDO;
import com.singtel.ngoft.dataobject.model.server.BPMCustWantsDO;
import com.singtel.ngoft.dataobject.model.server.BPMCustomerDtlsDO;
import com.singtel.ngoft.dataobject.model.server.BPMCustomerHasDO;
import com.singtel.ngoft.dataobject.model.server.BPMCustomerWantsDO;
import com.singtel.ngoft.dataobject.model.server.BPMLineCountDO;
import com.singtel.ngoft.dataobject.model.server.BPMMessageDO;
import com.singtel.ngoft.dataobject.model.server.BPMMessageDtlsDO;
import com.singtel.ngoft.dataobject.model.server.BPMNominationRequestDO;
import com.singtel.ngoft.dataobject.model.server.BPMOFTRequest;
import com.singtel.ngoft.dataobject.model.server.BPMOrderRequestHasDO;
import com.singtel.ngoft.dataobject.model.server.BPMOrderRequestWantsDO;
import com.singtel.ngoft.dataobject.model.server.BPMPrdtRelationDO;
import com.singtel.ngoft.dataobject.model.server.BPMProdParameterHasDO;
import com.singtel.ngoft.dataobject.model.server.BPMProdParameterWantsDO;
import com.singtel.ngoft.dataobject.model.server.BPMRCInfoDO;
import com.singtel.ngoft.dataobject.model.server.BPMRelocationRequestDO;
import com.singtel.ngoft.dataobject.model.server.BPMRequestHeaderDO;
import com.singtel.ngoft.dataobject.model.server.BPMSvcInstHasDO;
import com.singtel.ngoft.dataobject.model.server.BPMSvcInstWantsDO;
import com.singtel.ngoft.dataobject.model.server.BPMSvcPdtDO;
import com.singtel.ngoft.dataobject.model.server.BPMSvcPdtHasDO;
import com.singtel.ngoft.dataobject.model.server.BPMSvcPdtWantsDO;
import com.singtel.ngoft.dataobject.model.server.BPMUENNRICDO;
import com.singtel.ngoft.dataobject.model.server.BPMTransferSIRequestDO;
import com.singtel.ngoft.dataobject.model.server.BPMTransferSIRequestDtlsDO;
import com.singtel.ngoft.dataobject.model.server.BPMUENNRICDO;
import com.singtel.ngoft.dataobject.model.server.NFTHeaderDO;

/**
 * 
 * Legacy Class : FunctionHelper.java from framework
 *
 */
public class FunctionHelper {

	BREProperties breProperties;

	ResourceLoader resourceLoader;

	// BPMOFTRequest dummy;

	private final String TEMPLATE_JSON = "bre.template.xml.info";

	public FunctionHelper getInstance() {
		return new FunctionHelper();
	}

	public BPMOFTRequest getDummyData() {
		BPMOFTRequest root = null;

		try {

			resourceLoader = new DefaultResourceLoader();
			// Resource resource =
			// resourceLoader.getResource("classpath:templates/dummy2.json");
			breProperties = new BREProperties();
			String key = breProperties.getProperties(TEMPLATE_JSON);
			System.out.println("KEY :: " + key);
			Resource resource = resourceLoader.getResource("classpath:" + key);
			// Resource resource = resourceLoader.getResource("classpath:" +
			// breProperties.getProperties(TEMPLATE_JSON));
			InputStream input = resource.getInputStream();
			File file = resource.getFile();
			System.out.println(file.getAbsolutePath().toString());
			String fileName = file.getAbsolutePath().toString();

			Gson g = new Gson();
			String json = readFileAsString(fileName);

			/*
			 * BPMOFTRequest req = getRequest(); System.out.println(g.toJson(req));
			 * System.out.println(g.toJsonTree(req));
			 */

			BPMOFTRequest dummy = g.fromJson(json, BPMOFTRequest.class);
			System.out.println(dummy.getCustHasInfo().getAccount().get(0).getAccountDtls().getAccountNo());
			root = dummy;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return root;
	}

	public BREProperties getBreProperties() {
		return breProperties;
	}

	public void setBreProperties(BREProperties breProperties) {
		this.breProperties = breProperties;
	}

	private static String readFileAsString(String fileName) throws Exception {
		String data = "";
		data = new String(Files.readAllBytes(Paths.get(fileName)));
		return data;
	}

	public BPMSvcInstHasDO getSIHasDummy() {
		return getDummyData().getCustHasInfo().getOrderRequest().get(0).getServiceDtlsInfo().get(0);
		// return new BPMSvcInstHasDO();
	}

	public BPMSvcInstWantsDO getSIWantsDummy() {
		return getDummyData().getCustWantsInfo().getOrderRequest().get(0).getServiceDtlsInfo().get(0);
		// return new BPMSvcInstWantsDO();
	}

	public BPMCustomerHasDO getCustomerHasDummy() {
		return getDummyData().getCustHasInfo().getCustomer();

		// return new BPMCustomerHasDO();
	}

	public BPMCustomerWantsDO getCustomerWantsDummy() {
		return getDummyData().getCustWantsInfo().getCustomer();

		// return new BPMCustomerWantsDO();
	}

	public BPMAccountHasDO getAccountHasDummy() {
		// System.out.println("getAccountHasDummy ::
		// "+getDummyData().getCustHasInfo().getAccount().get(0).getAccountDtls().getAccountNo());
		BPMAccountHasDO dummy = getDummyData().getCustHasInfo().getAccount().get(0);
		return dummy;

//		return new BPMAccountHasDO();
	}

	public BPMAccountWantsDO getAccountWantsDummy() {

		return getDummyData().getCustWantsInfo().getAccount().get(0);
		// return new BPMAccountWantsDO();
	}

	public ErrorCode getMessageDetail(String errorCode, List<Object> bpmObject) {
		
		Map<String, String> hashDetail = new HashMap<String, String>();
		try {
			int counter = 1;

			for (Iterator iterator = bpmObject.iterator(); iterator.hasNext() && bpmObject != null;) {
				Object object = (Object) iterator.next();
				if (object != null) {
					Method[] method = object.getClass().getMethods();

					if (object.getClass() == HashMap.class && !((HashMap) object).isEmpty()) {
						hashDetail = (HashMap) object;
					}

					for (int i = 0; i < method.length; i++) {
						if (method[i].getReturnType() == String.class) {
							hashDetail.put(method[i].getName() + counter, (String) method[i].invoke(object));
						}
					}
				}
				counter++;
			}
			return ErrorCodeMaster.getInstance().getErrorCode(errorCode, hashDetail);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ErrorCode();
	}
	
	public BPMMessageDtlsDO populateMsgDtlsDoSvcNoAndSvcTypeFromProduct(BPMMessageDtlsDO msgDtls,BPMSvcPdtDO prdDo, BPMOFTRequest oftRequest) {
		if(oftRequest != null){
			if(oftRequest.getCustWantsInfo() != null){
				if(oftRequest.getCustWantsInfo().getOrderRequest() != null){
					for (BPMOrderRequestWantsDO orderRequestWantsDO : oftRequest.getCustWantsInfo().getOrderRequest()) {
						if(orderRequestWantsDO.getServiceDtlsInfo() != null && orderRequestWantsDO.getServiceDtlsInfo().size() > 0){
							for (BPMSvcInstWantsDO siWant : orderRequestWantsDO.getServiceDtlsInfo()) {
								for (BPMSvcPdtWantsDO prod : siWant.getSvcPdtInfo()) {
									System.out.println(prdDo.getProductId()+"Check--helper");
									if(prod.getProductId()!=null&&prod.getProdPackageId()!=null&&prdDo.getProductId()!=null&& prdDo.getProdPackageId()!=null)
									if(prod.getProductId().equalsIgnoreCase(prdDo.getProductId()) && prod.getProdPackageId().equalsIgnoreCase(prdDo.getProdPackageId())){
										msgDtls.setSvcNo(siWant.getServiceNumber());
										if(siWant.getServiceType() != null){
											//SIR7030 Start
											//msgDtls.setSvcTy(siWant.getServiceType().getSvcTypeCode());
											msgDtls.setSvcTy(siWant.getServiceType().getArborSvcType());
											//SIR7030 End
										}
										return msgDtls;
									}
								}
							}
						}
					}
				}
			}
			if(oftRequest.getCustHasInfo() != null){
				if(oftRequest.getCustHasInfo().getOrderRequest() != null){
					for (BPMOrderRequestHasDO orderRequestHasDO : oftRequest.getCustHasInfo().getOrderRequest()) {
						if(orderRequestHasDO.getServiceDtlsInfo() != null && orderRequestHasDO.getServiceDtlsInfo().size() > 0){
							for (BPMSvcInstHasDO siHas : orderRequestHasDO.getServiceDtlsInfo()) {
								for (BPMSvcPdtHasDO prod : siHas.getSvcPdtInfo()) {
									System.out.println(prdDo.getProductId()+"Check--helperhas");
									if(prod.getProductId()!=null&&prod.getProdPackageId()!=null&&prdDo.getProductId()!=null&& prdDo.getProdPackageId()!=null)
									if(prod.getProductId().equalsIgnoreCase(prdDo.getProductId()) && prod.getProdPackageId().equalsIgnoreCase(prdDo.getProdPackageId())){
										msgDtls.setSvcNo(siHas.getServiceNumber());
										if(siHas.getServiceType() != null){
											//SIR7030 Start
											//msgDtls.setSvcTy(siHas.getServiceType().getSvcTypeCode());
											msgDtls.setSvcTy(siHas.getServiceType().getArborSvcType());
											//SIR7030 End
										}
										return msgDtls;
									}
								}
							}
						}
					}
				}
			}
		}
		return msgDtls;		
	}
	
	
	//[Avanthika] ---- END 
	
	// by ismail -- start
	public static HashMap<String, String> getMultiSIMMatrix(int hasMultiSIMNPP, int wantsMultiSIMNPP) {

		
		 // adding static values here 
		
		HashMap<String,String> chargeMap = new HashMap<String,String>();
		   // registerSensor(sensorName);
		    chargeMap.put("MultiSIMCharge1","true");
		    chargeMap.put("MultiSIMCharge2","true");
		    chargeMap.put("MultiSIMCharge3","false");
		    chargeMap.put("MultiSIMCharge4","false");
		    return chargeMap;
		
		
		
		/*
		 * HashMap paraMap = new HashMap(); //[14 Feb 2012 Yu Bin SIR119506 : Start]
		 * //paraMap.put("HasMultiSIMNPPCount", String.valueOf(hasMultiSIMNPP));
		 * //paraMap.put("WantsMultiSIMNPPCount", String.valueOf(wantsMultiSIMNPP));
		 * paraMap.put("HasMultiSIMNPPCount", Integer.toString(hasMultiSIMNPP));
		 * paraMap.put("WantsMultiSIMNPPCount", Integer.toString(wantsMultiSIMNPP));
		 * //[14 Feb 2012 Yu Bin SIR119506 : End]
		 * 
		 * lookupMultiSIMMatrix(paraMap);
		 * 
		 * for(Object key : paraMap.keySet()) { paraMap.put(key,
		 * paraMap.get(key).toString().toLowerCase()); }
		 */

		
	}
	
	// --- by ismail end
	
	
	//Avanthika ---- START --- 19FEB2020
	
	/**
	 * insertObjectsIntoKieSession
	 * @param req
	 * @param kie
	 * @return
	 * 
	 * Add the objects to be accessed from DRL here.
	 * 
	 */

	public KieSession insertObjectsIntoKieSession(BPMOFTRequest req, KieSession kie) {
		

		
		//Add null check for all objects.
		
		// BPMOFTRequest
		if(req!=null)
		kie.insert(req);
		// BPMRequestHeaderDO
		if(req.getRequestHeader()!=null)
		kie.insert(req.getRequestHeader());

		// --------------------------------CUSTHASINFO------------------------------------------
		// BPMCustHasDO custHasInfo
		if(req.getCustHasInfo()!=null) {
		kie.insert(req.getCustHasInfo());
		if(req.getCustHasInfo().getCustomer()!=null) {
		kie.insert(req.getCustHasInfo().getCustomer());
		if(req.getCustHasInfo().getCustomer().getCustomerDtls()!=null)
		kie.insert(req.getCustHasInfo().getCustomer().getCustomerDtls());
		if(req.getCustHasInfo().getCustomer().getCustomerDtls().getBearerInfo()!=null)
		kie.insert(req.getCustHasInfo().getCustomer().getCustomerDtls().getBearerInfo());
		if(req.getCustHasInfo().getCustomer().getCustomerDtls().getCompanyAddress()!=null)
		kie.insert(req.getCustHasInfo().getCustomer().getCustomerDtls().getCompanyAddress());
		if(req.getCustHasInfo().getCustomer().getCustomerDtls().getCustContact()!=null)
		kie.insert(req.getCustHasInfo().getCustomer().getCustomerDtls().getCustContact());
		if(req.getCustHasInfo().getCustomer().getCustomerDtls().getInstitution()!=null)
		kie.insert(req.getCustHasInfo().getCustomer().getCustomerDtls().getInstitution());
		if(req.getCustHasInfo().getCustomer().getCustomerDtls().getResidentialAddress()!=null)
		kie.insert(req.getCustHasInfo().getCustomer().getCustomerDtls().getResidentialAddress());
		if(!req.getCustHasInfo().getCustomer().getCustomerDtls().getUENNRIC().isEmpty())
		for (BPMUENNRICDO uen : req.getCustHasInfo().getCustomer().getCustomerDtls().getUENNRIC()) {
			kie.insert(uen);
			if(uen.getNRICInfo().size()>0)
			for (NRICInfoDO nric : uen.getNRICInfo())
				kie.insert(nric);
		}
		
		if(!req.getCustHasInfo().getCustomer().getLineCount().isEmpty())
		for (BPMLineCountDO line : req.getCustHasInfo().getCustomer().getLineCount()) {
			kie.insert(line);
		}
		}
		// List<BPMAccountHasDO> account;
		if(!req.getCustHasInfo().getAccount().isEmpty())
		for (BPMAccountHasDO acc : req.getCustHasInfo().getAccount()) {

			if(acc!=null) {
			kie.insert(acc);
			if(acc.getAccountDtls()!=null) {
			kie.insert(acc.getAccountDtls());
			if(acc.getAccountDtls().getAcctPaymentInfo()!=null)
			kie.insert(acc.getAccountDtls().getAcctPaymentInfo());
			if(acc.getAccountDtls().getBillAddress()!=null)
			kie.insert(acc.getAccountDtls().getBillAddress());
			if(acc.getAccountDtls().getCopyBill()!=null) {
			kie.insert(acc.getAccountDtls().getCopyBill());
			if(acc.getAccountDtls().getCopyBill().getPrimaryBillAddr()!=null)
			kie.insert(acc.getAccountDtls().getCopyBill().getPrimaryBillAddr());}
			if(acc.getAccountDtls().getRelationShip()!=null) {
			kie.insert(acc.getAccountDtls().getRelationShip());
			// custwantsinfo in relationship
			if(acc.getAccountDtls().getRelationShip().getCustomerInfo()!=null) {
			kie.insert(acc.getAccountDtls().getRelationShip().getCustomerInfo());
			if(acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls()!=null)
			kie.insert(acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls());
			if(acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls().getBearerInfo()!=null)
			kie.insert(acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls().getBearerInfo());
			if(acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls().getCompanyAddress()!=null)
			kie.insert(acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls().getCompanyAddress());
			if(acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls().getCustContact()!=null)
			kie.insert(acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls().getCustContact());
			if(acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls().getInstitution()!=null)
			kie.insert(acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls().getInstitution());
			if(acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls().getResidentialAddress()!=null)
			kie.insert(
					acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls().getResidentialAddress());
			
			if(!acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls()
					.getUENNRIC().isEmpty())				
			for (BPMUENNRICDO uen : acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls()
					.getUENNRIC()) {
				kie.insert(uen);
				if(uen.getNRICInfo().size()>0)
				for (NRICInfoDO nric : uen.getNRICInfo())
					kie.insert(nric);
			}
			}
		
			}
			
			if(acc.getAccountDtls().getSvcNoType()!=null);
			kie.insert(acc.getAccountDtls().getSvcNoType());}
			
		}
		}

		// List<BPMOrderRequestHasDO> orderRequest;
		if(!req.getCustHasInfo().getOrderRequest().isEmpty())
		for (BPMOrderRequestHasDO ord : req.getCustHasInfo().getOrderRequest()) {

			kie.insert(ord);
			if(!ord.getServiceDtlsInfo().isEmpty())
			for (BPMSvcInstHasDO svc : ord.getServiceDtlsInfo()) {
				kie.insert(svc);
				if(! svc.getSvcPdtInfo().isEmpty())
				for (BPMSvcPdtHasDO pdt : svc.getSvcPdtInfo()) {
					kie.insert(pdt);
					if(!  pdt.getProdParameter().isEmpty())
					for (BPMProdParameterHasDO prod : pdt.getProdParameter()) {
						kie.insert(prod);
					}
					if(!  pdt.getRcInfo().isEmpty()) {
						for (BPMRCInfoDO prod : pdt.getRcInfo()) {
							kie.insert(prod);
						}}
					if(!  pdt.getContractInfo().isEmpty()) {
						for (BPMContractDO prod : pdt.getContractInfo()) {
							kie.insert(prod);
						}}
					if(!pdt.getPrdtRelation().isEmpty()) {
						for (BPMPrdtRelationDO prod : pdt.getPrdtRelation()) {
							kie.insert(prod);
						}}
					
				}
				//getTxnSvcPdtInfo

				if(svc.getTxnSvcPdtInfo()!=null)
				if(! svc.getTxnSvcPdtInfo().isEmpty())
					for (BPMSvcPdtHasDO pdt : svc.getTxnSvcPdtInfo()) {
						kie.insert(pdt);
						if(!  pdt.getProdParameter().isEmpty())
						for (BPMProdParameterHasDO prod : pdt.getProdParameter()) {
							kie.insert(prod);
						}
						if(!  pdt.getRcInfo().isEmpty()) {
							for (BPMRCInfoDO prod : pdt.getRcInfo()) {
								kie.insert(prod);
								if(prod.getPenaltyInfo()!=null) {
								kie.insert(prod.getPenaltyInfo());
								System.out.println("RCINFO INSERTED");
								}
							}}
						if(!  pdt.getContractInfo().isEmpty()) {
							for (BPMContractDO prod : pdt.getContractInfo()) {
								kie.insert(prod);
							}}
						if(!  pdt.getPrdtRelation().isEmpty()) {
							for (BPMPrdtRelationDO prod : pdt.getPrdtRelation()) {
								kie.insert(prod);
							}}
					}
				
			}
		}
	}

		// --------------------------------CUSTWANTSINFO------------------------------------------
		// BPMCustWantsDO custWantsInfo
		if(req.getCustWantsInfo()!=null) {
		kie.insert(req.getCustWantsInfo());
		if(req.getCustWantsInfo().getCustomer()!=null) {
		kie.insert(req.getCustWantsInfo().getCustomer());
		if(req.getCustWantsInfo().getCustomer().getCustomerDtls()!=null) {
		kie.insert(req.getCustWantsInfo().getCustomer().getCustomerDtls());
		if(req.getCustWantsInfo().getCustomer().getCustomerDtls().getBearerInfo()!=null)
		kie.insert(req.getCustWantsInfo().getCustomer().getCustomerDtls().getBearerInfo());
		if(req.getCustWantsInfo().getCustomer().getCustomerDtls().getCompanyAddress()!=null)
		kie.insert(req.getCustWantsInfo().getCustomer().getCustomerDtls().getCompanyAddress());
		if(req.getCustWantsInfo().getCustomer().getCustomerDtls().getCustContact()!=null)
		kie.insert(req.getCustWantsInfo().getCustomer().getCustomerDtls().getCustContact());
		if(req.getCustWantsInfo().getCustomer().getCustomerDtls().getInstitution()!=null)
		kie.insert(req.getCustWantsInfo().getCustomer().getCustomerDtls().getInstitution());
		if(req.getCustWantsInfo().getCustomer().getCustomerDtls().getResidentialAddress()!=null)
		kie.insert(req.getCustWantsInfo().getCustomer().getCustomerDtls().getResidentialAddress());
		if(!req.getCustWantsInfo().getCustomer().getCustomerDtls().getUENNRIC().isEmpty())
		for (BPMUENNRICDO uen : req.getCustWantsInfo().getCustomer().getCustomerDtls().getUENNRIC()) {
			kie.insert(uen);
			if(!uen.getNRICInfo().isEmpty())
			for (NRICInfoDO nric : uen.getNRICInfo())
				kie.insert(nric);
		}
		}
		
		
		}

		// List<BPMAccountWantsDO> account;
		if(! req.getCustWantsInfo().getAccount().isEmpty())
		for (BPMAccountWantsDO acc : req.getCustWantsInfo().getAccount()) {

			if(acc!=null) {
			kie.insert(acc);
			if(acc.getAccountDtls()!=null) {
			kie.insert(acc.getAccountDtls());
			if(acc.getAccountDtls().getAcctPaymentInfo()!=null)
			kie.insert(acc.getAccountDtls().getAcctPaymentInfo());
			if(acc.getAccountDtls().getBillAddress()!=null)
			kie.insert(acc.getAccountDtls().getBillAddress());
			if(acc.getAccountDtls().getCopyBill()!=null) {
			kie.insert(acc.getAccountDtls().getCopyBill());
			if(acc.getAccountDtls().getCopyBill().getPrimaryBillAddr()!=null)
			kie.insert(acc.getAccountDtls().getCopyBill().getPrimaryBillAddr());}
			if(acc.getAccountDtls().getRelationShip()!=null)
			kie.insert(acc.getAccountDtls().getRelationShip());
			// custwantsinfo in relationship
			if(acc.getAccountDtls().getRelationShip().getCustomerInfo()!=null) {
			kie.insert(acc.getAccountDtls().getRelationShip().getCustomerInfo());
			if(acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls()!=null) {
			kie.insert(acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls());
			if(acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls().getBearerInfo()!=null)
			kie.insert(acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls().getBearerInfo());
			if(acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls().getCompanyAddress()!=null)
			kie.insert(acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls().getCompanyAddress());
			if(acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls().getCustContact()!=null)
			kie.insert(acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls().getCustContact());
			if(acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls().getInstitution()!=null)
			kie.insert(acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls().getInstitution());
			if(acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls().getResidentialAddress()!=null)
			kie.insert(
					acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls().getResidentialAddress());
			
			if(!acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls()
					.getUENNRIC().isEmpty())
			for (BPMUENNRICDO uen : acc.getAccountDtls().getRelationShip().getCustomerInfo().getCustomerDtls()
					.getUENNRIC()) {
				kie.insert(uen);
				if(!uen.getNRICInfo().isEmpty())
				for (NRICInfoDO nric : uen.getNRICInfo())
					kie.insert(nric);
			}
			
			}
			if(!acc.getAccountDtls().getRelationShip().getCustomerInfo().getLineCount().isEmpty())
			for (BPMLineCountDO line : acc.getAccountDtls().getRelationShip().getCustomerInfo().getLineCount()) {
				kie.insert(line);
			}
			}
			if(acc.getAccountDtls().getSvcNoType()!=null)
			kie.insert(acc.getAccountDtls().getSvcNoType());
			
			}
			
		}
		}

		// List<BPMOrderRequestWantsDO> orderRequest;
		if(!req.getCustWantsInfo().getOrderRequest().isEmpty())
		for (BPMOrderRequestWantsDO ord : req.getCustWantsInfo().getOrderRequest()) {

			kie.insert(ord);
			if(!ord.getServiceDtlsInfo().isEmpty())
			for (BPMSvcInstWantsDO svc : ord.getServiceDtlsInfo()) {
				kie.insert(svc);
				if(!svc.getSvcPdtInfo().isEmpty())
				for (BPMSvcPdtWantsDO pdt : svc.getSvcPdtInfo()) {
					kie.insert(pdt);
					if(!pdt.getProdParameter().isEmpty())
					for (BPMProdParameterWantsDO prod : pdt.getProdParameter()) {
						kie.insert(prod);
					}
					//Adding PrdtRelation -- FEB 26
					if(pdt.getPrdtRelation()!=null)
					if(!pdt.getPrdtRelation().isEmpty()) {
						for (BPMPrdtRelationDO prodrel : pdt.getPrdtRelation()) {
							kie.insert(prodrel);
						}
					}
				}
			}
		}
		
	}

		return kie;
	}
	
	//Avanthika ---- END --- 19FEB2020
	
	
	
	
	public boolean isMaxCeasedReached(BPMOFTRequest bpmOFTReq, BPMSvcInstWantsDO wantsSI, BPMSvcPdtDO wantsToCease){
		int hasCounter = 0;
		int wantsCounter = 0;
		//SIR110551: 23/07/2010: William - inserted - START
		boolean isHasSIExist = false;
		//SIR110551: 23/07/2010: William - inserted - END
		List<BPMOrderRequestHasDO> orHas = bpmOFTReq.getCustHasInfo().getOrderRequest();
		for (BPMOrderRequestHasDO orderRequestHasDO : orHas) {
			List<BPMSvcInstHasDO> siHas = orderRequestHasDO.getServiceDtlsInfo();
			for (BPMSvcInstHasDO svcInstHasDO : siHas) {
                //SIR110551: 23/07/2010: William - inserted - START
				isHasSIExist = true;
                //SIR110551: 23/07/2010: William - inserted - END
				if(svcInstHasDO.getServiceNumber() != null && svcInstHasDO.getServiceNumber().equalsIgnoreCase(wantsSI.getServiceNumber())){
					for (BPMSvcPdtHasDO hasPdt : svcInstHasDO.getSvcPdtInfo()){
						if(hasPdt.getProductId() != null && hasPdt.getProductId().equalsIgnoreCase(wantsToCease.getProductId())){
							hasCounter++;
						}
					}
				}
			}
			
		}
		//SIR110551: 23/07/2010: William - inserted - START
		if( !isHasSIExist && bpmOFTReq.getTransferSIRequest() != null){
			List<BPMTransferSIRequestDO> transferRequestDOList = bpmOFTReq.getTransferSIRequest();
			for(BPMTransferSIRequestDO transferRequestDO :transferRequestDOList){
				for( BPMTransferSIRequestDtlsDO transferSIRequestDtlsDO : transferRequestDO.getBpmTransferSIRequestDtls()){
					String svcNo = transferSIRequestDtlsDO.getSrcSvcInst().getServiceNumber();
					if(svcNo != null && svcNo.equalsIgnoreCase(wantsSI.getServiceNumber())){
						List<BPMSvcPdtHasDO> siHas = transferSIRequestDtlsDO.getSrcSvcInst().getTxnSvcPdtInfo();
						for (BPMSvcPdtHasDO has : siHas) {
								//logger.debug("-------->isMaxCeasedReached |  has.getProductId() = "+has.getProductId());
								//logger.debug("-------->isMaxCeasedReached |  wantsToCease.getProductId() = "+wantsToCease.getProductId());
								if(has.getProductId() != null && has.getProductId().equalsIgnoreCase(wantsToCease.getProductId())){
									hasCounter++;
								}
						}
					}
				}
			}
		}
		//SIR110551: 23/07/2010: William - inserted - END
		for (BPMSvcPdtWantsDO wantsPdt : wantsSI.getSvcPdtInfo()){
			if(wantsPdt.getProductId() != null && wantsPdt.getProductId().equalsIgnoreCase(wantsToCease.getProductId()) && "CEASE".equalsIgnoreCase(wantsPdt.getActionCode())){
				wantsCounter++;
			}
			/*if(wantsPdt.getProductId() != null && wantsPdt.getProductId().equalsIgnoreCase(wantsToCease.getProductId()) && "PROVIDE".equalsIgnoreCase(wantsPdt.getActionCode())){
				hasCounter++;
			}*/
		}

		//return (hasCounter <= wantsCounter);
		
		return false;
	}
	
	
	public <T> T clone(T x) {
		try {
			return cloneX(x);
		} catch (IOException e) {
			throw new IllegalArgumentException(e);
		} catch (ClassNotFoundException e) {
			throw new IllegalArgumentException(e);
		}
	}

	private <T> T cloneX(T x) throws IOException, ClassNotFoundException {
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		CloneOutput cout = new CloneOutput(bout);
		cout.writeObject(x);
		byte[] bytes = bout.toByteArray();
		ByteArrayInputStream bin = new ByteArrayInputStream(bytes);
		CloneInput cin = new CloneInput(bin, cout);
		@SuppressWarnings("unchecked")
		T clone = (T) cin.readObject();
		return clone;
	}

	private class CloneOutput extends ObjectOutputStream {
		Queue<Class<?>> classQueue = new LinkedList<Class<?>>();
		CloneOutput(OutputStream out) throws IOException {
			super(out);
		}
		@Override
		protected void annotateClass(Class<?> c) {
			classQueue.add(c);
		}
		@Override
		protected void annotateProxyClass(Class<?> c) {
			classQueue.add(c);
		}
	}

	private class CloneInput extends ObjectInputStream {
		private final CloneOutput output;
		CloneInput(InputStream in, CloneOutput output) throws IOException {
			super(in);
			this.output = output;
		}
		@Override
		protected Class<?> resolveClass(ObjectStreamClass osc)
		throws IOException, ClassNotFoundException {
			Class<?> c = output.classQueue.poll();
			String expected = osc.getName();
			String found = (c == null) ? null : c.getName();
			if (!expected.equals(found)) {
				throw new InvalidClassException("Classes desynchronized: " +
						"found " + found + " when expecting " + expected);
			}
			return c;
		}

		@Override
		protected Class<?> resolveProxyClass(String[] interfaceNames)
		throws IOException, ClassNotFoundException {
			return output.classQueue.poll();
		}
	}
// Db connection class
public static Connection  getDbConnection() {
	System.out.println("DB connect function is called");
	String ConnectionClass = "com.mysql.cj.jdbc.Driver";
	String user ="root";
	String password="root";
	String url ="jdbc:mysql://localhost:3306/sakila";
	java.sql.Connection con=null;
	try {
		Class.forName(ConnectionClass);
		con = DriverManager.getConnection(url, user, password);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
		
}
	
	
}
