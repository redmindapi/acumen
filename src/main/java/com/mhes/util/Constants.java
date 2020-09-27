package com.mhes.util;

import java.util.Locale;

public interface Constants {
	
	/** The Constant LOCALE. */
	public static final Locale LOCALE = Locale.ENGLISH;
	public static final Boolean TRUE = true;
	public static final Boolean FALSE = false;
	public static final String AND_VAL = " and ";
	public static final String WHERE_VAL = " where ";
	public static final String SINGLE_QUOTE = "'";
	public static final String EQUALS = "=";
	public static final String EMPTY = "";
	public static final String SINGLE_SPACE = " ";
	public static final String ONE = "ONE";
	public static final String TWO = "TWO";
	public static final String THREE = "THREE";
	public static final String FOUR = "FOUR";
	public static final String FIVE = "FIVE";
	public StringBuilder CRITERIA_QUERY_MR_DETAILS = new StringBuilder("select * from mrmeterdetails mr");
	public StringBuilder CRITERIA_QUERY_DP_TIME_TABLE_DETAILS = new StringBuilder("select * from dptimetable dp");
	public static final String CIRCLE_AUTOID = "ml.circleAutoid=";
	public static final String DIV_AUTOID = "ml.divisionAutoid=";
	public static final String SUBDIV_AUTOID = "ml.subdivisionAutoid=";
	public static final String SECTION_AUTOID = "ml.sectionAutoid=";
	public static final String TOWN_AUTOID = "ml.townAutoid=";
	public static final String SUB_STATION_AUTOID = "ml.substationAutoid=";
	public static final String FEEDER_AUTOID = "ml.feederAutoid=";
	public static final String DT_AUTOID = "ml.transformerAutoid=";
	public static final String METER_COMMUNICATING = "mr.connectionStatus=";
	public static final String DPTIME_FIRST_COMMUNICATING = "dp.firstCommDatetime=";
	public static final String DPTIME_LAST_COMMUNICATING = "dp.lastCommDatetime=";
	public static final String METER_SERIAL_NUMBER = "mr.meterSerialNumber=";
	public static final String GRPBY_VAL =" group by mr.meterSerialNumber, ml.locationCode, mr.sourceType";
	public static final String VM_MANUFACTURE_NAME ="vm.manufactureName=";
	public static final String VM_MANUFACTURE_METER_TYPE ="mf.meterType=";
	public static final String VM_MANUFACTURE_YEAR ="mf.mfYear=";
	public static final String VM_MANUFACTURE_CATEGORY ="mf.meterCategory=";
	public static final String VM_MANUFACTURE_FIRMWARE_VERSION ="mf.fwVersion=";
	public static final String GROUP_CODE ="mg.groupCode=";
	public static final String METER_SEARCH_RESULTS = "Please provie valid input criteria to search meter results";
	public static final String NO_METER_SEARCH_RESULTS = "No Meters found for the given input criteria. Please provide valid search inputs";
	public static final String METER_SEARCH_RESULTS_EXCEPTION = "Exception occured at server side, please check logs for more details";
}
