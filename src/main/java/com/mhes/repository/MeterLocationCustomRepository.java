package com.mhes.repository;
import com.mhes.request.MeterSearchRequest;
import java.util.List;

public interface MeterLocationCustomRepository {

	//public static StringBuilder criteriaQuery = new StringBuilder("select ml.companyAutoid from mrmeterlocation ml");
	public static StringBuilder criteriaQuery = new StringBuilder("select *  from mrmeterlocation ml  ");
	
	public static StringBuilder criteriaQueryMrDetails = new StringBuilder("select * from mrmeterdetails mr");
	
	public static StringBuilder criteriaQueryDptimetableDetails = new StringBuilder("select * from dptimetable dp");
	
	List<Object> getMeterLocationDetailsByCriteria( String query);
	
	List<Object> getDpDetailsByCriteria( String query);
	
	
}