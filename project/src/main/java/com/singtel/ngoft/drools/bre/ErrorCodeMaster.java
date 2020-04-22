package com.singtel.ngoft.drools.bre;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class ErrorCodeMaster {

	private static ErrorCodeMaster errorCodeMessage = new ErrorCodeMaster();
	private Map<String, ErrorCode> errorCodeMap;
	private static final String REPLACE_START = "${";
	private static final String REPLACE_END = "}";

	private ErrorCodeMaster() {
		init();
	}

	private void init() {
		this.errorCodeMap = new HashMap<String, ErrorCode>();
	}

	public static ErrorCodeMaster getInstance() {
		return errorCodeMessage;
	}

	/**
	 * Retrieves the ErrorCode object, containing the error message that has it's
	 * variables replaced.
	 * 
	 * @param errorId The error ID.
	 * @param params  The parameters (key-value pairs) used to replace the error
	 *                message's variables.
	 * @return The ErrorCode object.
	 * @throws ServiceException
	 */
	public ErrorCode getErrorCode(String errorId, Map<String, String> params) throws Exception {
		System.out.println("getErrorCode");
		ErrorCode errorCode = this.errorCodeMap.get(errorId);
		ErrorCode modifiedErrorCode = new ErrorCode();
		if (errorCode == null) {
			boolean isLoaded = load(errorId, true);
			
			if (isLoaded) {
				errorCode = this.errorCodeMap.get(errorId);
				System.out.println("getErrorCode :: "+errorCode.getErrId());
			}
		}
		if (errorCode != null && params != null) {
			String errMsg = errorCode.getErrMsg();
			errMsg = replaceParameters(errMsg, params);
			// errorCode.setErrMsg(errMsg);
			modifiedErrorCode.setErrActionCd(errorCode.getErrActionCd());
			modifiedErrorCode.setErrIActionCd(errorCode.getErrIActionCd());
			modifiedErrorCode.setErrId(errorCode.getErrId());
			modifiedErrorCode.setErrTy(errorCode.getErrTy());
			modifiedErrorCode.setErrMsg(errMsg);
			return modifiedErrorCode;
		}
		System.out.println("getErrorCode :: "+errorCode.getErrMsg());
		return errorCode;
		// return modifiedErrorCode;
	}

	private boolean load(String errorId, boolean force) throws Exception {
		boolean isLoaded = false;
		System.out.println("load :: "+errorId);
		if (!this.errorCodeMap.containsKey(errorId) || force) {
			try {
				ErrorCode errorCode = getInternalErrorCode(errorId);
				System.out.println("load :: "+errorCode.getErrId());
				if (errorCode != null) {
					this.errorCodeMap.put(errorId, errorCode);
					isLoaded = true;
				}
			} catch (SQLException e) {
			}
		}
		return isLoaded;
	}

	// Replace with DB data later on
	private ErrorCode getInternalErrorCode(String errorId) throws SQLException {

		/*//Original Logic
		 * DatabaseAccessClient sqlMapClient =
		 * FrameworkServicesManager.getInstance().getDatabaseAccessClient(); Map<String,
		 * Object> map = new HashMap<String, Object>(); map.put(SQL_ERR_ID, errorId);
		 * return (ErrorCode) sqlMapClient.queryForObject(SQL_RETRIEVE_BY_ERR_ID, map);
		 */
		System.out.println("getInternalErrorCode :: "+errorId);
		List<ErrorCode> errList = new ArrayList<ErrorCode>();

		ResourceLoader resourceLoader = new DefaultResourceLoader();
		Resource resource = resourceLoader.getResource("classpath:templates/FT_ERROR_CD.xlsx");
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
			//System.out.println("");
			ErrorCode err = new ErrorCode();
			err.setErrId(row.getCell(0).getStringCellValue().trim());
			err.setErrMsg(row.getCell(1).getStringCellValue().trim());
			err.setErrTy(row.getCell(2).getStringCellValue().trim());
			err.setErrActionCd(row.getCell(3).getStringCellValue().trim());
			err.setErrIActionCd(row.getCell(4).getStringCellValue().trim());
			//System.out.println(err.toString());
			errList.add(err);
			if (err.getErrId().equals(errorId))
				System.out.println("getInternalErrorCode LOOP :: "+err.getErrId());

		}

		if(errList.size()>0)
		for (ErrorCode err : errList) {
			if (err.getErrId().equals(errorId)) {
				System.out.println("getInternalErrorCode :: "+err.getErrId().toString());
				return err;
			}
			
		}
		return null;
		
	}

	public static String replaceParameters(String errMsg, Map<String, String> params) {
		for (String key : params.keySet()) {
			String value = params.get(key);
			errMsg = StringUtils.replace(errMsg, REPLACE_START + key + REPLACE_END, value);
		}
		return errMsg;
	}
}
