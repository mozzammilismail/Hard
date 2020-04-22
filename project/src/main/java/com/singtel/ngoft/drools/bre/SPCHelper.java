package com.singtel.ngoft.drools.bre;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import com.google.protobuf.ServiceException;
import com.singtel.ngoft.dataobject.model.server.BPMSvcInstWantsDO;
import com.singtel.ngoft.dataobject.model.server.BPMSvcPdtHasDO;
import com.singtel.ngoft.dataobject.model.server.BPMSvcPdtWantsDO;

public class SPCHelper {
	
	private static final Map<String, ArrayList<String>> codeMasterCacheMap=new HashMap<String, ArrayList<String>>();
	private static Boolean isCMCached = false;
	private static final String SQL_COL_SERVICE_TYPE = "SERVICE_TYPE";
	private static final String SQL_COL_CONTRACT_MONTHS = "CONTRACT_MONTHS";
	private static final String SQL_COL_ARBOR_SERVICE_TYPE = "ARBOR_SERVICE_TYPE";
	private static final String SQL_COL_NETWORK_TYPE = "NETWORK_TYPE";
	public static String getCodeMasterDecode(String keyType, String cd) throws SQLException {
		/*
		 * String decode = null; if (keyType != null && !keyType.trim().isEmpty()) {
		 * HashMap paraMap = new HashMap(); paraMap.put(SQL_COL_KEY_TY, keyType);
		 * paraMap.put(SQL_COL_CD, cd); List<Map> queryList = (List<Map>)
		 * sqlQueryForList(SQL_GET_CODE_MASTER_BY_KEY_TY, paraMap);
		 * 
		 * for (Map recMap : queryList) { decode = MapUtils.getString(recMap,
		 * SQL_COL_DECODE); } }
		 */
		String decode = "";
		System.out.println("getCodeMasterDecode :: keyType :: " + keyType);
		System.out.println("getCodeMasterDecode :: cd :: " + cd);
		List<ErrorCode> errList = new ArrayList<ErrorCode>();

		ResourceLoader resourceLoader = new DefaultResourceLoader();
		Resource resource = resourceLoader.getResource("classpath:templates/OFT_CODE_MASTER_BLACKLIST_REASON.xlsx");
		try {
			InputStream input = resource.getInputStream();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		File file = null;
		try {
			file = resource.getFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Finds the workbook instance for XLSX file
		XSSFWorkbook myWorkBook = null;
		try {
			myWorkBook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Return first sheet from the XLSX workbook
		XSSFSheet mySheet = myWorkBook.getSheetAt(0);

		// Get iterator to all the rows in current sheet
		Iterator<Row> rowIterator = mySheet.iterator();

		// Traversing over each row of XLSX file
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			// System.out.println("");
			String key1 ="",cd1 = "";
			switch(row.getCell(0).getCellType()) {
			case Cell.CELL_TYPE_STRING:
				key1 = row.getCell(0).getStringCellValue().trim();
			break;
			case Cell.CELL_TYPE_NUMERIC:
				key1 = ""+row.getCell(0).getNumericCellValue();
			break;
			}
			
			switch(row.getCell(1).getCellType()) {
			case Cell.CELL_TYPE_STRING:
				cd1 = row.getCell(1).getStringCellValue().trim();
			break;
			case Cell.CELL_TYPE_NUMERIC:
				cd1 = ""+row.getCell(1).getNumericCellValue();
			break;
			}
			
		
			
			if (key1.equals(keyType) && cd1.equals(cd)) {
				
				System.out.println("getCodeMasterDecode :: key1 :: " + key1);
				System.out.println("getCodeMasterDecode :: cd1 :: " + cd1);
				
				switch(row.getCell(2).getCellType()) {
				case Cell.CELL_TYPE_STRING:
					decode = row.getCell(2).getStringCellValue().trim();
				break;
				case Cell.CELL_TYPE_NUMERIC:
					decode = ""+row.getCell(2).getNumericCellValue();
				break;
				}
				
				System.out.println("decode :: " + decode);
				
			}
			// System.out.println(err.toString());

			/*
			 * switch (cell.getCellType()) { case Cell.CELL_TYPE_STRING:
			 * System.out.print(cell.getStringCellValue() + "\t"); break; case
			 * Cell.CELL_TYPE_NUMERIC: System.out.print(cell.getNumericCellValue() + "\t");
			 * break; case Cell.CELL_TYPE_BOOLEAN:
			 * System.out.print(cell.getBooleanCellValue() + "\t"); break; default :
			 */
		}

		return decode;
	}
	
	// created by ISMAIL 
	
	public static List <String> getCodeMaster(String keyType) throws SQLException {
		System.out.println("getCodeMaster :: "+keyType);
		//SIR120829 ChaoChih Liu Start
//		logger.info("getCodeMaster >> key_type:"+keyType);
		//SIR120829 ChaoChih Liu End
		//[SIR122470] Denny 21 May 2012 -Start
		if(codeMasterCacheMap!=null && codeMasterCacheMap.get(keyType)!=null){
			//logger.debug(keyType + " >>>>>>>>> Cached in CodeMasterCacheMap >>>>>>>> ");
			return codeMasterCacheMap.get(keyType);
		}
		//[SIR122470] Denny 21 May 2012 -End
		
		//OFT R1 PT 20090825 Kartik START
		ArrayList<String> CDList = null;
		/*if (keyType != null && !keyType.trim().isEmpty()) {
			//OFT R1 PT 20090825 Kartik END
		HashMap paraMap = new HashMap();
		paraMap.put(SQL_COL_KEY_TY, keyType);

		List<Map> queryList = (List<Map>) sqlQueryForList(SQL_GET_CODE_MASTER, paraMap);

			//ArrayList<String> CDList = new ArrayList<String>();
			CDList = new ArrayList<String>();
		for (Map recMap:queryList) {
			String CD = MapUtils.getString(recMap,SQL_COL_CD);
			if (CD != null && !"".equalsIgnoreCase(CD)) {
				CDList.add(CD);
			}
		}
			//OFT R1 PT 20090825 Kartik START
		} */
		
		// by ISMAIL hard coding the values
		CDList = new ArrayList<String>();
		if(keyType.equals("DUPLICATE_ALLOWED") || keyType.equals("Perpetual_ExclDisc") ||  keyType.equals("Cnstn_Additional_Benefit") || keyType.equals("PERFECT_ROAM")  ) {
		
		CDList.add("ADDL_HD_DVR_SET_TOP_BOX_RENTAL");
		CDList.add("ADDL_HD_SET_TOP_BOX_RENTAL");
		CDList.add("BRDR_100_MAIN_GERMANY_DAY");
		CDList.add("BRDR_100_MAIN_ITALY_DAY");
		CDList.add("BRIDGE_DATAROAM_DISC_30_12");
		CDList.add("DEL_BILL_REBATE");
		CDList.add("HD_SET_TOP_BOX_RENTAL_DISC");
		CDList.add("HD_SET_TOP_BOX_SUBN");
		CDList.add("HOME_LIVECAM");
		CDList.add("HOME_LIVECAM_BUNDLE_PLAN");
		CDList.add("IPTV_SETTOP_BOX_WITHOUT_HD");
		CDList.add("IPTV_WIRELESS_HOME_BRIDGE");
		}
		
		//BY ISMAIL ends
		
		
		
		
		//OFT R1 PT 20090825 Kartik END

		//SIR120829 ChaoChih Liu Start
//		logger.info("getCodeMaster >> key_type:"+keyType);
		//SIR120829 ChaoChih Liu End
		//[SIR122470] Denny 21 May 2012 -Start
		if(!CDList.isEmpty()){
			codeMasterCacheMap.put(keyType, CDList);
			//logger.debug(keyType + " >>>>>>>>> Cached in CodeMasterCacheMap >>>>>>>> ");
		}
		//[SIR122470] Denny 21 May 2012 -End
		return CDList;
	}
	

	// helper methos used in rule  Mobile_Validation_Product_MT068
	// created by ISMAIL
	public static int getContractMonth(String prodId, String packageId)throws SQLException{
		
		// please provide the DB code and then write the logic 
		
		// mounika CR309205 Start
		/*
		 * long millisStart = Calendar.getInstance().getTimeInMillis();
		 * //logger.info("\n***OFT Optimazation**getContractMonth()** Start: " +
		 * millisStart + "msec \n"); // mounika CR309205 End //[SIR122470] Denny 21 May
		 * 2012 -Start String key=null; if(StringUtils.isNotBlank(prodId) &&
		 * StringUtils.isNotBlank(packageId)){ key=prodId+"-"+packageId; }
		 * 
		 * if(key!=null && contractMonthCacheMap.containsKey(key)){ return
		 * contractMonthCacheMap.get(key); } //[SIR122470] Denny 21 May 2012 -End
		 * 
		 * List<Map> queryList = new ArrayList<Map>();
		 */
		int contractMonth =2;
		/*
		 * //OFT R1 PT 20090825 Kartik START if (prodId != null &&
		 * !prodId.trim().isEmpty() && packageId != null && !packageId.trim().isEmpty())
		 * { //OFT R1 PT 20090825 Kartik END HashMap paraMap = new HashMap();
		 * paraMap.put(SQL_COL_PRODUCT_ID,prodId);
		 * paraMap.put(SQL_COL_PRODUCT_PACKAGE_ID,packageId);
		 * 
		 * queryList = (List<Map>) sqlQueryForList(SQL_GET_CONTRACT_MONTH, paraMap); for
		 * (Map recMap:queryList) { contractMonth =
		 * MapUtils.getIntValue(recMap,SQL_COL_CONTRACT_MONTHS,-1); } //OFT R1 PT
		 * 20090825 Kartik START } //OFT R1 PT 20090825 Kartik END //[SIR122470] Denny
		 * 21 May 2012 -Start logger.debug(key +
		 * " >>>> Cached in >>>> contractMonthCacheMap"); contractMonthCacheMap.put(key,
		 * contractMonth); //[SIR122470] Denny 21 May 2012 -End // mounika CR309205
		 * Start long millisEnd = Calendar.getInstance().getTimeInMillis();
		 * logger.info("\n***OFT Optimazation**getContractMonth()** End: " + millisEnd
		 * +"msec \n");
		 * logger.info("\n***OFT Optimazation**getContractMonth()**Execution time is "
		 * +(millisEnd - millisStart)+"msec \n"); //mounika CR309205 End
		 */		return contractMonth;
	}
	
	// method  used in Mobile_Validation_Product_MT186
	// created by ISMAIL
	private static final String PARA_DISC_PRODUCT_ID = "DISC_PRODUCT_ID";
	public static List<String> getRelateRCProduct(String productId) throws SQLException {
		ArrayList<String> relateRCProductList = new ArrayList<String>();
		try {
			/*
			 * //logger.info("Entering getRelateRCProduct >> productId:" + productId);
			 * HashMap paraMap = new HashMap(); paraMap.put(PARA_DISC_PRODUCT_ID,
			 * productId); List<HashMap> resultMap =
			 * (List<HashMap>)sqlMapClient.queryForList(SQL_GET_ISOLATED_PRDT, paraMap);
			 * logger.info("Exiting getRelateRCProduct >> productId:" + productId);
			 * if(resultMap!=null){ for(HashMap map : resultMap){
			 * relateRCProductList.add((String)map.get("PRODUCT_ID")); } }
			 */
			relateRCProductList.add("Please");
			relateRCProductList.add("Remove");
			relateRCProductList.add("Once");
			
			}catch (Exception e) {
		}
		return relateRCProductList;
	}
	
   	public static boolean isCategoryMasterOf(String productId, String CM) throws SQLException {

		synchronized(isCMCached){
		//SIR121289 ChaoChih Liu End
   		if(!isCMCached){
   			HashMap paraMap = new HashMap();
   			//List<Map> queryList = (List<Map>) sqlQueryForList("getCategoryMasterForInit", paraMap);

				/*
				 * if(queryList.size() >= 1){ for (Iterator iterator = queryList.iterator();
				 * iterator.hasNext();) { Map map = (Map) iterator.next();
				 * if(categoryMaster.containsKey(MapUtils.getString(map,"PRODUCT_ID"))){
				 * categoryMaster.get(MapUtils.getString(map,"PRODUCT_ID")).add(MapUtils.
				 * getString(map,"CAT_NM")); }else{ ArrayList<String> al = new
				 * ArrayList<String>(); al.add(MapUtils.getString(map,"CAT_NM"));
				 * categoryMaster.put(MapUtils.getString(map,"PRODUCT_ID"),al); }
				 * 
				 * } }
				 */

	   		isCMCached=true;
   		}
   		//SIR121289 ChaoChih Liu Start
		}
		//SIR121289 ChaoChih Liu End
        //SIR141197 Muthu start
		/*
		 * if(categoryMaster.containsKey(productId) &&
		 * !(getCodeMaster("IPTV_SHARE_PACKS").contains(productId))){ return
		 * categoryMaster.get(productId).contains(CM); }
		 */
   		//SIR141197 Muthu End
//SIR7749 End
   		return true;
   	}
   	public static String getServiceDurationByProductId(String productId)throws SQLException{
		//[SIR122470] Denny 21 May 2012 -Start
		//logger.debug("Entering getServiceDuration >> productID: "+productId);
   		String duration="20";
		/*
		 * if(StringUtils.isNotBlank(productId)&&
		 * serviceDurationCacheMap.containsKey(productId)){ return
		 * serviceDurationCacheMap.get(productId); } //[SIR122470] Denny 21 May 2012
		 * -End List<Map> queryList = null; List<Map> queryList = null; String
		 * duration=""; if(StringUtils.isNotBlank(productId)) { HashMap paraMap = new
		 * HashMap(); paraMap.put(SQL_COL_PRODUCT_ID,productId); queryList = (List<Map>)
		 * sqlQueryForList(SQL_GET_PRODUCT_BY_PRODUCT_ID, paraMap); if(queryList!=null){
		 * for (Object rec: queryList) { Map recMap = (Map) rec; String
		 * svcDuration=MapUtils.getString(recMap, SQL_COL_SERVICE_DURATION);
		 * if(StringUtils.isNotBlank(svcDuration)){ duration=svcDuration; break; } }
		 * 
		 * } } //[SIR122470] Denny 21 May 2012 -Start
		 * serviceDurationCacheMap.put(productId, duration); logger.debug(productId +
		 * " >>>> Cached in >>>> serviceDurationCacheMap"); //[SIR122470] Denny 21 May
		 * 2012 -end logger.debug("Exiting getServiceDuration >> Duration:"+duration);
		 */
		return duration;
	}

   	
   	public static BPMSvcPdtWantsDO provideProductByProductFamily(BPMSvcInstWantsDO wantsSI, String productFamily, String businessProductType)throws SQLException{
   		return provideProductByProductFamilyAndBusProductTypeAndArborSvcType(wantsSI, productFamily, businessProductType, null);
   		}
   		
	
	
	//Added 24 FEB
	
	/**
	* Return the one time fee
	* @param String productId
	* @return String, null if not found
	* @throws SQLException
	*/
	public static String getOneTimeChargeByProductID(String productId) throws SQLException {
		//SIR120829 ChaoChih Liu Start	
//		logger.info("getOneTimeChargeByProductID >> productId:"+productId);
		//SIR120829 ChaoChih Liu End
		//OFT R1 PT 20090825 Kartik START
		String charge = "Dummy";
		//TODO
		/*
		 * if (productId != null && !productId.trim().isEmpty()) { //OFT R1 PT 20090825
		 * Kartik END HashMap paraMap = new HashMap(); paraMap.put(SQL_COL_PRODUCT_ID,
		 * productId); List<Map> queryList = (List<Map>)
		 * sqlQueryForList(SQL_GET_ONETIME_CHARGE_BY_PRDT_ID, paraMap);
		 * 
		 * //String charge = null; for (Map recMap:queryList) { charge =
		 * MapUtils.getString(recMap, SQL_COL_ONE_TIME_CHARGE); } //OFT R1 PT 20090825
		 * Kartik START }
		 */
		//OFT R1 PT 20090825 Kartik END
		
		//SIR120829 ChaoChih Liu Start	
//		logger.info("getOneTimeChargeByProductID >> charge:"+charge);
		//SIR120829 ChaoChih Liu End
		return charge;
	}
	
	
	public static String getEnableInd(String internalId, String schemeId)throws SQLException{

		//OFT R1 PT 20090825 Kartik START
		String enableInd = "Dummy";
		/*
		 * if (internalId != null && !internalId.trim().isEmpty() && schemeId != null &&
		 * !schemeId.trim().isEmpty()) { //OFT R1 PT 20090825 Kartik END List<Map>
		 * queryList = new ArrayList<Map>(); HashMap paraMap = new HashMap();
		 * //[SIR148424] Anu 31 Aug 2017 -Start
		 * //paraMap.put(SQL_COL_ENABLE_IND,internalId);
		 * paraMap.put(SQL_COL_INT_PROD_KEY,internalId); paraMap.put(SQL_COL_SCHEME_ID,
		 * schemeId); //[SIR148424] Anu 31 Aug 2017 -End queryList = (List<Map>)
		 * sqlQueryForList(SQL_GET_ENABLE_IND, paraMap);
		 * 
		 * //String enableInd = null; for (Map recMap:queryList) { enableInd =
		 * MapUtils.getString(recMap, SQL_COL_ENABLE_IND); } //OFT R1 PT 20090825 Kartik
		 * START } //OFT R1 PT 20090825 Kartik END
		 */	return enableInd;
}
	
	
	public static List<BPMSvcPdtWantsDO> getSchemeDetailBySchemeFamily(BPMSvcInstWantsDO wantsSI,String schemeFamily, String nwTypeIn, boolean isVoice)throws SQLException{
		//To get svcType, arborSvcType, nwType
		String svcType=wantsSI.getServiceType().getSvcTypeCode();
		String arborSvcType=wantsSI.getServiceType().getArborSvcType();
		/*TODO
		 * String nwType= null;
		 * 
		 * List<Map> queryList = new ArrayList<Map>(); HashMap paraMap = new HashMap();
		 * paraMap.put(SQL_COL_SERVICE_TYPE,svcType);
		 * paraMap.put(SQL_COL_ARBOR_SERVICE_TYPE,arborSvcType);
		 * paraMap.put(SQL_COL_SCHEME_FAMILY,schemeFamily); //R2 - 1 Oct 2009 - COM_TYPE
		 * should only be populated for Mobile services - Start if
		 * (svcType.equalsIgnoreCase("MT")){ if (isVoice)
		 * paraMap.put(SQL_COL_COM_TYPE,"V"); if (!isVoice)
		 * paraMap.put(SQL_COL_COM_TYPE,"D"); } //R2 - 1 Oct 2009 - COM_TYPE should only
		 * be populated for Mobile services - End
		 * 
		 * if (schemeFamily.equals("TOS_LOSS")) { //SIR120829 ChaoChih Liu Start //
		 * logger.info("getProductBySchemeFamilyTosLoss"); //SIR120829 ChaoChih Liu End
		 * queryList = (List<Map>)
		 * sqlQueryForList(SQL_GET_PRODUCT_BY_SCHEME_FAMILY_TOS_LOSS, paraMap); }
		 * 
		 * else //not tos_loss, needs nwType info { //SIR120829 ChaoChih Liu Start //
		 * logger.info("getProductBySchemeFamily"); //SIR120829 ChaoChih Liu End if
		 * (wantsSI.getSvcPdtInfo()!=null){ List<BPMSvcPdtWantsDO>
		 * wantsList=(List<BPMSvcPdtWantsDO>)wantsSI.getSvcPdtInfo(); for
		 * (BPMSvcPdtWantsDO element: wantsList) { //[Ferdz Lamsen 17 July 2009 SIR:6575
		 * : START] //if (element.getBusPrdtType().equals("PPLAN"))
		 * 
		 * if ("PPLAN".equals(element.getBusPrdtType())&&"PROVIDE".equals(element.
		 * getActionCode())) //18 Jul 2009, Tien updated checking actionCode { //[Ferdz
		 * Lamsen 17 July 2009 SIR:6575 : START] nwType=element.getNetworkType();
		 * break;} } } if (nwType==null){nwType=nwTypeIn;}
		 * 
		 * paraMap.put(SQL_COL_NETWORK_TYPE,nwType); queryList = (List<Map>)
		 * sqlQueryForList(SQL_GET_PRODUCT_BY_SCHEME_FAMILY, paraMap); }
		 */
		//return formattedMapSvcPdts(queryList);
		
		return null;
		
		}
	

	
	//Added 25 Feb
 	// SIR8229 10 Oct 2009 ChenLing - Added: Retrieve WAIVER_IND value from OFT_RC_NRC_DISC_MAP - START
   	public static boolean check100PercentDiscount(String productId, String rcNRCInd, String discProductId) throws SQLException {
   		//SIR120829 ChaoChih Liu Start	
//   	logger.info("check100PercentDiscount >> productId:" + productId + ", rcNRCInd:" + rcNRCInd + ", discProductId:" + discProductId);
   		//SIR120829 ChaoChih Liu End

		/*
		 * String waiverInd = null; Map<String, String> paraMap = new HashMap<String,
		 * String>();
		 * 
		 * // Pass fields as SQL parameter. paraMap.put(SQL_COL_PRODUCT_ID, productId);
		 * paraMap.put(SQL_COL_RC_NRC_IND, rcNRCInd);
		 * paraMap.put(SQL_COL_DISC_PRODUCT_ID, discProductId);
		 * 
		 * // Return result set after sql execution. List<Map> resultSet =
		 * sqlQueryForList(SQL_CHECK_100PERCENT_DISCOUNT, paraMap); for (Map waiverKey :
		 * resultSet) { waiverInd = MapUtils.getString(waiverKey, SQL_COL_WAIVER_IND); }
		 * 
		 * //SIR120829 ChaoChih Liu Start //
		 * logger.info("check100PercentDiscount >> waiverInd:" + waiverInd); //SIR120829
		 * ChaoChih Liu End
		 * 
		 * if(waiverInd != null && waiverInd.equals("Y")) return true;
		 */

   		return true;
   	}
	

	
	public static BPMSvcPdtWantsDO provideProductByProductFamilyAndBusProductTypeAndArborSvcType(BPMSvcInstWantsDO wantsSI, 
			String productFamily, String businessProductType, String arborSvcType)throws SQLException{

/**String svcType=wantsSI.getServiceType().getSvcTypeCode();

    if( arborSvcType == null ){
    	arborSvcType = wantsSI.getServiceType().getArborSvcType();
    }
    //[SIR119583 William 05/12/2011] - Start:
String nwType= null;

if (wantsSI.getSvcPdtInfo()!=null){
	List<BPMSvcPdtWantsDO> wantsList=(List<BPMSvcPdtWantsDO>)wantsSI.getSvcPdtInfo();

	for (BPMSvcPdtWantsDO element: wantsList) {
		
			if ("PPLAN".equals(element.getBusPrdtType())&&("PROVIDE".equals(element.getActionCode()) || "MODIFY".equals(element.getActionCode())))
			
				{
			nwType=element.getNetworkType();
			break;
		}
	}
		if (nwType == null || nwType.equals("")) {
			for (BPMSvcPdtWantsDO element: wantsList) {
				nwType=element.getNetworkType();

				if (nwType != null && !nwType.equals("NA") && !nwType.equals("")) {
					break;
				}
			}
		}
	}
		BPMSvcPdtWantsDO svcPdt = new BPMSvcPdtWantsDO();
		List<Map> queryList = new ArrayList<Map>();
		HashMap paraMap = new HashMap();
		paraMap.put(SQL_COL_SERVICE_TYPE,svcType);
		paraMap.put(SQL_COL_ARBOR_SERVICE_TYPE,arborSvcType);
		if(nwType!=null&&!nwType.equals("")&&!nwType.isEmpty()){

		paraMap.put(SQL_COL_NETWORK_TYPE,nwType);
		}
		paraMap.put(SQL_COL_PRODUCT_FAMILY,productFamily);


		if (businessProductType.equals("AVAS")){
		queryList = (List<Map>) sqlQueryForList(SQL_PROVIDE_AVAS_PRODUCT_BY_PRODUCT_FAMILY, paraMap);
		}


		if (businessProductType.equals("OTC") || businessProductType.equals("ONETIME")){
		queryList = (List<Map>) sqlQueryForList(SQL_PROVIDE_OTC_PRODUCT_BY_PRODUCT_FAMILY, paraMap);
		}

		if (businessProductType.equals("PENALTY")) {
			queryList = (List<Map>) sqlQueryForList(
					SQL_PROVIDE_PENALTY_PRODUCT_BY_PRODUCT_FAMILY, paraMap);
		}
		logger.debug("businessProductType: {}", businessProductType);
		if (businessProductType.equals("VAS") || businessProductType.equals("NVAS") || businessProductType.equals("DISCOUNT") || businessProductType.equals("DUMMY")){
			if (nwType != null && !nwType.isEmpty()){

			queryList = (List<Map>) sqlQueryForList(SQL_PROVIDE_DUAL_SIM, paraMap);
			}else{

				queryList = (List<Map>) sqlQueryForList(SQL_PROVIDE_VAS_WITHOUT_NW_TYPE, paraMap);
			}
			}


		List<BPMSvcPdtWantsDO> prodList=formattedMapSvcPdts(queryList);
		if(prodList==null||prodList.size()==0){
		//logger.debug("To provideProductByProductFamily, there is no product for the given input");
		return null;
		}
		return (BPMSvcPdtWantsDO)prodList.get(0);**/
		
		return null;
		
		}


	
	public static BPMSvcPdtWantsDO provideNwProduct(String prodId)throws SQLException{
		// mounika CR309205 Start
   		List<BPMSvcPdtWantsDO> svcPdtList = null;
		svcPdtList = new ArrayList<BPMSvcPdtWantsDO>();
   		BPMSvcPdtWantsDO svcPdt = new BPMSvcPdtWantsDO();
   		
   		svcPdt.setBusPrdtType("dummy");
		svcPdt.setOriginalBusPdtType("dummy");// added on 04 Jun 2009

		// svcPdt.setLevelInd(MapUtils.getString(recMap,
		// SQL_COL_LEVEL_IND));
		svcPdt.setLevelInd("dummy");

		svcPdt.setNetworkType("dummy");
		svcPdtList.add(svcPdt);
		
		return (BPMSvcPdtWantsDO)svcPdtList.get(0);
		
			}

	
	/**
	* Return the list of products in the scheme
	* @param String schemeId
	* @return List <Map>, empty list if none found
	* @throws SQLException
	* Decouple the original code fore caching purposes (performance tuning).
	*/
	public static List<Map> getSchemeDetailInList(String schemeId) throws SQLException
	{
		List<Map> queryList = null;
		//if (schemeId != null && !schemeId.trim().isEmpty())
		//{
		//	HashMap paraMap = new HashMap();
		//	paraMap.put(SQL_COL_SCHEME_ID, schemeId);
		//	queryList = (List<Map>) sqlQueryForList(SQL_GET_SVC_PDT_BY_SCHEME_ID, paraMap);
		//}
		return queryList;
	}

	/**
	* Return the list of products in the scheme
	* @param String schemeId
	* @return List <BPMSvcPdtDO>, empty list if none found
	* @throws SQLException
	*/


	public static List<BPMSvcPdtWantsDO> getSchemeDetail(String schemeId, boolean isSvcPdtHas) throws SQLException {
		//[Srini SIR7582 15-Mar-2010 PT]: start
		//logger.info("getSchemeDetail >> Input scheme id:"+schemeId + ", isSvcPdtHas:"+isSvcPdtHas);

		List<Map> queryList = getSchemeDetailInList(schemeId);
		
		List<BPMSvcPdtWantsDO> svcPdtList = null;
		svcPdtList = new ArrayList<BPMSvcPdtWantsDO>();

		//List<Map> queryList = getSchemeDetailInList(schemeId);
		//return formattedMapSvcPdts(queryList);
		//Tien: 08 Jul 2009: Modify to follow SIR 6330 END
			return null;
	}
	public static List<BPMSvcPdtWantsDO> getSchemeDetailByTxnType(
			String schemeId, boolean isSvcPdtHas, String txnType)
			//Louie Lugtu 19 Nov 2009 R2 SIR6368 Merge R1.1 st2.2.82 : Start
			//throws SQLException {
			throws SQLException, Exception {
   		
		/*
		 * //Louie Lugtu 19 Nov 2009 R2 SIR6368 Merge R1.1 st2.2.82 : End //[Srini
		 * SIR7582 15-Mar-2010 PT]: start
		 * //logger.info("getSchemeDetail >> Input scheme id:" + schemeId // +
		 * ", isSvcPdtHas:" + isSvcPdtHas); //[Srini SIR7582 15-Mar-2010 PT]: end
		 * HashMap paraMap = new HashMap(); paraMap.put(SQL_COL_SCHEME_ID, schemeId);
		 * List<Map> queryList = (List<Map>) sqlQueryForList(
		 * SQL_GET_SVC_PDT_BY_SCHEME_ID, paraMap);
		 */

   		List<BPMSvcPdtWantsDO> svcPdtList = null;
   		svcPdtList = new ArrayList<BPMSvcPdtWantsDO>();

   		BPMSvcPdtWantsDO svcPdt = new BPMSvcPdtWantsDO();
   		
   		svcPdt.setBusPrdtType("dummy");
		svcPdt.setOriginalBusPdtType("dummy");// added on 04 Jun 2009

		// svcPdt.setLevelInd(MapUtils.getString(recMap,
		// SQL_COL_LEVEL_IND));
		svcPdt.setLevelInd("dummy");

		svcPdt.setNetworkType("dummy");
		svcPdtList.add(svcPdt);
		
		return svcPdtList;
		//return formattedMapSvcPdts(queryList);
		//Tien: 08 Jul 2009: Modify to follow SIR 6330 END

	}
	public static BPMSvcPdtWantsDO provideProductByProductFamilyAndNetworkType(BPMSvcInstWantsDO wantsSI, String productFamily, String businessProductType, String networkType)throws SQLException{
		//To get svcType, arborSvcType, nwType
		String svcType=wantsSI.getServiceType().getSvcTypeCode();

		String arborSvcType=wantsSI.getServiceType().getArborSvcType();

		boolean isCeasedDEL = false;
		boolean isCeasedMOIP = false;
		boolean isProvidedDEL = false;
		boolean isProvidedMOIP = false;
			
		for(BPMSvcPdtWantsDO wants :wantsSI.getSvcPdtInfo()){
			if ( wants.getBusPrdtType().equals( "PPLAN" ) ){
			
				if ( wants.getProductFamily() != null && wants.getProductFamily().endsWith("_DEL") ){
					if ( wants.getActionCode().equals( "CEASE" ) ){
						isCeasedDEL = true;
					}else if ( wants.getActionCode().equals( "PROVIDE" ) ){
						isProvidedDEL = true;
					}
				}else if ( wants.getProductFamily() != null && wants.getProductFamily().endsWith("_MOIP") ){
					if ( wants.getActionCode().equals( "CEASE" ) ){
						isCeasedMOIP = true;
					}else if ( wants.getActionCode().equals( "PROVIDE" ) ){
						isProvidedMOIP = true;
					}
				}
			}
		}

		if ( isCeasedDEL && isProvidedDEL ){
			arborSvcType = "401";
		}else if ( isCeasedDEL && isProvidedMOIP ){
			arborSvcType = "413";
		}else if ( isCeasedMOIP && isProvidedDEL ){
			arborSvcType = "401";
		}else if ( isCeasedMOIP && isProvidedMOIP ){
			arborSvcType = "413";
		}
		
		wantsSI.getServiceType().setArborSvcType(arborSvcType);
	
		BPMSvcPdtWantsDO svcPdt = new BPMSvcPdtWantsDO();
		List<Map> queryList = new ArrayList<Map>();

/*		HashMap paraMap = new HashMap();
		paraMap.put(SQL_COL_SERVICE_TYPE,svcType);
		paraMap.put(SQL_COL_ARBOR_SERVICE_TYPE,arborSvcType);

		if(networkType!=null&&!networkType.equals("")&&!networkType.isEmpty()){

			paraMap.put(SQL_COL_NETWORK_TYPE,networkType);
		}

		paraMap.put(SQL_COL_PRODUCT_FAMILY,productFamily);


		if (businessProductType.equals("AVAS")){
		
			queryList = (List<Map>) sqlQueryForList(SQL_PROVIDE_AVAS_PRODUCT_BY_PRODUCT_FAMILY, paraMap);
		}


		if (businessProductType.equals("OTC") || businessProductType.equals("ONETIME")){
			
			queryList = (List<Map>) sqlQueryForList(SQL_PROVIDE_OTC_PRODUCT_BY_PRODUCT_FAMILY, paraMap);
		}

		if (businessProductType.equals("PENALTY")) {
			
			queryList = (List<Map>) sqlQueryForList(
					SQL_PROVIDE_PENALTY_PRODUCT_BY_PRODUCT_FAMILY, paraMap);
		}
		

		if (businessProductType.equals("VAS") || businessProductType.equals("NVAS") || businessProductType.equals("DISCOUNT")){

			if (networkType != null && !networkType.isEmpty()){
			
				queryList = (List<Map>) sqlQueryForList(SQL_PROVIDE_DUAL_SIM, paraMap);
			}else{
			
				queryList = (List<Map>) sqlQueryForList(SQL_PROVIDE_VAS_WITHOUT_NW_TYPE, paraMap);
			}
		}

		List<BPMSvcPdtWantsDO> prodList=formattedMapSvcPdts(queryList); 
		if(prodList==null||prodList.size()==0){
			
			return null;
		} */
		
		return wantsSI.getSvcPdtInfo().get(0);
		//return (BPMSvcPdtWantsDO)prodList.get(0);
	}
// changes by Avantika
	
	public static List<BPMSvcPdtWantsDO> provideProductByUniqueProductFamily(String productFamily) throws SQLException {
		HashMap paraMap = new HashMap();
		//		paraMap.put(SQL_COL_PRODUCT_FAMILY, productFamily);
		//	List<Map> listResult = sqlQueryForList(SQL_PROVIDE_PRODUCT_BY_PRODUCT_FAMILY, paraMap);
			//return formattedMapSvcPdts(listResult);
		return null;
	}
// by rAJU

public static boolean isHasUnderNationalPromo(BPMSvcPdtHasDO svcPdtHas) throws ServiceException, IOException {
        /*
         * //SIR120829 ChaoChih Liu Start // logger.info("isHasUnderNationalPromo >> ");
         * //SIR120829 ChaoChih Liu End
         *
         * //KeyType keyType =
         * CodeMaster.getInstance().getKeyType("MOBILE_NATL_CONTRACT_TY",true);
         * List<String> l = new ArrayList<String>(Arrays.asList(keyType.getCodes()));
         *
         * for (BPMContractDO contract: svcPdtHas.getContractInfo()) { //SIR120829
         * ChaoChih Liu Start //
         * logger.info("isHasUnderNationalPromo >> Contract Type: "+(contract==null?
         * "null":contract.getArborContractType())); //SIR120829 ChaoChih Liu End
         * if(contract.getEndDt() == null || (contract.getEndDt() != null &&
         * contract.getEndDt().equalsIgnoreCase("")) || (contract.getEndDt() != null &&
         * DateHelper.isAfterToday(DateHelper.parseToDate(contract.getEndDt())))){ if
         * (contract!=null && contract.getArborContractType()!=null && l != null &&
         * l.contains(contract.getArborContractType())) { //SIR120829 ChaoChih Liu Start
         * // logger.info("isHasUnderNationalPromo >> return "+true);
         * //logger.info("isHasUnderNationalPromo >> return "+true + ", SvcNo is " +
         * svcPdtHas.getSvcNo()); //SIR120829 ChaoChih Liu End return true; } } }
         * //SIR120829 ChaoChih Liu Start //
         * logger.info("isHasUnderNationalPromo >> return "+false); //SIR120829 ChaoChih
         * Liu End
         */   
	return true;
}

public static boolean isWantsUnderNationalPromo(String schemeId) throws SQLException {
/*    //SIR120829 ChaoChih Liu Start
//    logger.info("isWantsUnderNationalPromo >> Input scheme id:"+schemeId);
    //SIR120829 ChaoChih Liu End
   
    //OFT R1 PT 20090825 Kartik START
    List queryList = null;
    if (schemeId != null && !schemeId.trim().isEmpty()) {
    //OFT R1 PT 20090825 Kartik END
    HashMap paraMap = new HashMap();
    paraMap.put(SQL_COL_SCHEME_ID, schemeId);
    paraMap.put(SQL_COL_SCHEME_FAMILY , KeyProperties.getKey("oft.constants.product.schemeFamily.nationalPromo"));
    paraMap.put(SQL_COL_BUSINESS_PRODUCT_TYPE, KeyProperties.getKey("oft.constants.product.busPrdtTy.pplan"));
        //List queryList = sqlQueryForList(SQL_IS_WANTS_UNDER_NATIONAL_PROMO, paraMap);
        queryList = sqlQueryForList(SQL_IS_WANTS_UNDER_NATIONAL_PROMO, paraMap);
        //OFT R1 PT 20090825 Kartik START
    }
    //OFT R1 PT 20090825 Kartik END
    // under national promo if pplan under NATIONAL_PROMO product family exists for the given scheme
    if (queryList != null && queryList.size()>0) {
        //SIR120829 ChaoChih Liu Start
        logger.info("isWantsUnderNationalPromo >> return "+true + ", ShcmeId is " + schemeId);
        //SIR120829 ChaoChih Liu End
        return true;
    }
    //SIR120829 ChaoChih Liu Start
//    logger.info("isWantsUnderNationalPromo >> return "+false);
    //SIR120829 ChaoChih Liu End*/
   
    return true;
}

public static BPMSvcPdtWantsDO provideProductFromCodeMaster(String KEY_TY)throws SQLException{
	BPMSvcPdtWantsDO svcpdt = new BPMSvcPdtWantsDO();
	svcpdt.setBusPrdtType("DWNGRADEPENALTY");
    svcpdt.setActionCode("CANCEL");
    svcpdt.setNetworkType("3G");
    svcpdt.setSchemeFamily("2ND_DEL_DISCOUNT");
    svcpdt.setProductFamily("MOBILE_SHARE");
    svcpdt.setRuleEngineInd("CR");
    svcpdt.setSuppCompId("suppCompId");
    svcpdt.setProductId("1");
    svcpdt.setStartDt("25/02/2020 10:22:22");
    svcpdt.setSchemeId("OCBC_SCHEME_LIST");
    svcpdt.setWaivePenaltyInd("Y");
/*
	List<Map> queryList = null;
	if (KEY_TY != null && !KEY_TY.trim().isEmpty()) {
		
	HashMap paraMap = new HashMap();
	paraMap.put(SQL_COL_KEY_TY,KEY_TY);

	queryList = (List<Map>) sqlQueryForList(SQL_PROVIDE_PRODUCT_FROM_CODE_MASTER, paraMap);
		
	}


	List<BPMSvcPdtWantsDO> prodList=formattedMapSvcPdts(queryList);
	if(prodList==null||prodList.size()==0)
	{logger.debug("To provideProductFromCodeMaster, there is no product for the key_ty: "+KEY_TY);
	return null;
	}
	*/
	List<BPMSvcPdtWantsDO> prodList = new ArrayList();
	prodList.add(svcpdt);
	
	return (BPMSvcPdtWantsDO)prodList.get(0);
}

public static boolean retrieveParentLineInfo(BPMSvcInstWantsDO wantsDo, String svcInstId){
    //logger.debug("SPCHelper.retrieveParentLineInfo - Start");
    //logger.debug("SPCHelper.retrieveParentLineInfo >>> Service instance ID: "+svcInstId);
    /*if(StringUtils.isNotBlank(svcInstId)){
        try {
            Long instaceId=Long.parseLong(svcInstId);
            SchemeInstTieDO[] outSchemeInstTieDOList= sviActivity.retrieveLineTieDtlsInfo(new Long[] {instaceId});
            if (outSchemeInstTieDOList != null && outSchemeInstTieDOList.length > 0) {
                if (wantsDo != null && StringUtils.isNotBlank(wantsDo.getServiceNumber())) {
                    for (int i = 0; i < outSchemeInstTieDOList.length; i++) {
                        if(ACTIVE.equals(outSchemeInstTieDOList[i].getLineTieStatus())&&
                                (StringUtils.isNotBlank(outSchemeInstTieDOList[i].getSuppSvcNo())
                                        && StringUtils.equals(wantsDo.getServiceNumber(), outSchemeInstTieDOList[i].getSuppSvcNo()))){
                           
                            logger.info("SPCHelper.retrieveParentLineInfo found line tie info MainSvcInstId: {}, MainSvcNo: {}",
                                    Long.toString(outSchemeInstTieDOList[i].getMainSvcInstId()), outSchemeInstTieDOList[i].getMainSvcNo());
                            //Only populate parentline for mobile here
                            BPMLineTieMainInfoDO parentLineTieInfo = new BPMLineTieMainInfoDO();
                            parentLineTieInfo.setBundleDesc(outSchemeInstTieDOList[i].getBundleDesc());
                            parentLineTieInfo.setBundleId(outSchemeInstTieDOList[i].getBundleId());
                            parentLineTieInfo.setByPassECInd(outSchemeInstTieDOList[i].getByPassECInd());
                            parentLineTieInfo.setCrossSvcBundleType(outSchemeInstTieDOList[i].getCrossSvcBundleTy());
                            parentLineTieInfo.setMainSvcInstId((outSchemeInstTieDOList[i].getMainSvcInstId() == null) ? null : Long.toString(outSchemeInstTieDOList[i].getMainSvcInstId()));
                            parentLineTieInfo.setMainSvcNo(outSchemeInstTieDOList[i].getMainSvcNo());
                            parentLineTieInfo.setRequestCompId((outSchemeInstTieDOList[i].getPrereqComponentId() == null) ? null : Long.toString(outSchemeInstTieDOList[i].getMainSvcInstId()));
                            parentLineTieInfo.setSchemeId(outSchemeInstTieDOList[i].getSchemeId());
                            parentLineTieInfo.setSchemeTieId(outSchemeInstTieDOList[i].getSchemeTieId());
                            parentLineTieInfo.setStartDt(DateHelper.dateToString(outSchemeInstTieDOList[i].getLineTieStartDate()));
                            wantsDo.setParentLineInfo(parentLineTieInfo);
                            break;
                        }
                    }
                }
                //logger.info("SPCHelper.retrieveParentLineInfo: Found parentLine for serviceNuber>>>"+wantsDo.getServiceNumber()+"svcInstId>>>"+svcInstId);
                return true;
            }else{
                //logger.info("SPCHelper.retrieveParentLineInfo: can not retrieve the parentLineTieInfo, svcInstanceId: "+ svcInstId);
                return false;
            }
           
        } catch (NumberFormatException e) {
            logger.error("SPCHelper retrieveParentLineInfo: NumberFormatException: can not convert svcInstaceId >>>"+svcInstId);
            e.printStackTrace();
        } catch (ApplicationException e) {
            logger.error("SPCHelper retrieveParentLineInfo: ApplicationException: \n\r"+e.getMessage());
        } catch (SystemException e) {
            logger.error("SPCHelper retrieveParentLineInfo: SystemException: \n\r"+e.getMessage());
        } catch (ServiceException e) {
            logger.error("SPCHelper retrieveParentLineInfo: ServiceException: \n\r"+e.getMessage());
        } catch(Exception e){
            logger.error("SPCHelper retrieveParentLineInfo: Exception: \n\r"+e.getMessage());
        }
    }
    logger.debug("SPCHelper.retrieveParentLineInfo - End");*/
    return false;
}

}


