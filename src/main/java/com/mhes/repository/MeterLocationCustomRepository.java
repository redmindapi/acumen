package com.mhes.repository;
import com.mhes.request.MeterSearchRequest;
import java.util.List;

public interface MeterLocationCustomRepository {

	//public static StringBuilder criteriaQuery = new StringBuilder("select ml.companyAutoid from mrmeterlocation ml");
	public static StringBuilder criteriaQuery = new StringBuilder("select *  from mrmeterlocation ml  ");
	
	public static StringBuilder criteriaQueryMrDetails = new StringBuilder("select * from mrmeterdetails mr");
	
	public static StringBuilder criteriaQueryDptimetableDetails = new StringBuilder("select * from dptimetable dp");
	
	public static StringBuilder CriteriaQueryMetermanufacturer= new StringBuilder("select * from \r\n" + 
			"mrmeterlocation ml ,mrmeterdetails mr, mrmetermfdetails mf ,dptimetable dp\r\n" + 
			"where \r\n" + 
			"ml.meterDetailsAutoid=mr.autoid and \r\n" + 
			"mf.companyAutoid=mr.companyAutoid and \r\n" + 
			"dp.meterAutoid=mr.autoid\r\n"
			);
	
	public static StringBuilder CriteriaQueryConnectionsts= new StringBuilder("select * from mrmeterlocation ml ,mrmeterdetails mr,dptimetable dp\r\n" + 
			" where \r\n" + 
			" ml.meterDetailsAutoid=mr.autoid and \r\n" + 
			" dp.meterAutoid=mr.autoid\r\n" + 
			" group by mr.meterSerialNumber");
	
	public static StringBuilder CriteriaQueryMeterGrp= new StringBuilder(" select * from mrmeterlocation ml, mrmeterdetails mr,vmcompanyprofile vm, mrmetergroup mg ,dptimetable dp where \r\n" + 
			" ml.meterDetailsAutoid=mr.autoid and \r\n" + 
			" mr.companyAutoid=vm.autoid and\r\n" + 
			" dp.meterAutoid=mr.autoid and \r\n" + 
			" vm.autoid=mg.companyAutoid group by mr.meterSerialNumber");
	
	public static StringBuilder CriteriaQueryMeterserail= new StringBuilder(" select  * from mrmeterlocation ml ,mrmeterdetails mr ,dptimetable dp  where \r\n" + 
			"dp.meterAutoid=mr.autoid and  \r\n" + 
			"ml.meterDetailsAutoid=mr.autoid  group by mr.meterSerialNumber");
	
	List<Object> getMeterLocationDetailsByCriteria(String query);
	
	List<Object> getDpDetailsByCriteria( String query);
	
	List<Object> getQueryMetermanufacturerByCriteria( String query);
	
	List<Object> getQueryConnectionstsByCriteria( String query);
	
	List<Object> getQueryQueryMeterGrpByCriteria( String query);
	
	List<Object> getQueryQueryMeterserailpByCriteria( String query);
	
	
}