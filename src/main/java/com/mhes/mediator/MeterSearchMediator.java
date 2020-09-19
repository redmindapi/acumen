package com.mhes.mediator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;

import com.mhes.request.MeterSearchRequest;
import com.mhes.response.MeterSearchReponse;
import com.mhes.validation.MeterSearchValidator;
/**
 * 
 * @author RedMind
 *
 */

public class MeterSearchMediator {
	
	@Autowired
	private MeterSearchValidator meterSearchValidator;

	public  List<MeterSearchReponse> meterSearchResults( MeterSearchRequest meterSearchRequest,BindingResult result){
		
		//String circle
		//meterSearchRequest.getCircleName()
		
		meterSearchValidator.dateValidation(meterSearchRequest,result);
		
		return null;
	}
}
