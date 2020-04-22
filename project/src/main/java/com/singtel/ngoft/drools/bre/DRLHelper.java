package com.singtel.ngoft.drools.bre;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.singtel.ngoft.dataobject.model.server.BPMAccountDO;
import com.singtel.ngoft.dataobject.model.server.BPMAccountHasDO;
import com.singtel.ngoft.dataobject.model.server.BPMAccountWantsDO;
import com.singtel.ngoft.dataobject.model.server.BPMMessageDtlsDO;
import com.singtel.ngoft.dataobject.model.server.BPMOFTRequest;
import com.singtel.ngoft.dataobject.model.server.BPMSvcInstWantsDO;
import com.singtel.ngoft.dataobject.model.server.BPMSvcPdtDO;

/**
 * 
 * Drool Helper class
 * 
 * - Only static java methods can be called in DRL files
 *
 *
 */
public class DRLHelper{

	public static BPMAccountHasDO getAccountHasDummyDRL() {
		System.out.println("getAccountHasDummyDRL");
		return new FunctionHelper().getAccountHasDummy();

	}

	public static BPMAccountWantsDO getAccountWantsDummyDRL() {
		System.out.println("getAccountWantsDummyDRL");
		return new FunctionHelper().getAccountWantsDummy();

	}

	public static ErrorCode getMessageDetail(String errorCode , List<Object> bpmObject) {
		System.out.println("getMessageDetail");
		return new FunctionHelper().getMessageDetail(errorCode ,bpmObject);

	}
	
	//[Avanthika] ---- START 
		//populateMsgDtlsDoSvcNoAndSvcTypeFromProduct
		public static BPMMessageDtlsDO populateMsgDtlsDoSvcNoAndSvcTypeFromProduct(BPMMessageDtlsDO msgDtls,BPMSvcPdtDO prdDo, BPMOFTRequest oftRequest) {
			System.out.println("populateMsgDtlsDoSvcNoAndSvcTypeFromProduct");
			return new FunctionHelper().populateMsgDtlsDoSvcNoAndSvcTypeFromProduct(msgDtls ,prdDo,oftRequest);

		}
		//[Avanthika] ---- END 
	

		//Added 24 FEB 2020
		public static boolean isMaxCeasedReached(BPMOFTRequest bpmOFTReq, BPMSvcInstWantsDO wantsSI, BPMSvcPdtDO wantsToCease) {			
			System.out.println("isMaxCeasedReached");
			return new FunctionHelper().isMaxCeasedReached(bpmOFTReq ,wantsSI,wantsToCease);
		}
		
		public static <T> T clone(T x) {
			System.out.println("clone");
			return new FunctionHelper().clone(x);
		}
}
