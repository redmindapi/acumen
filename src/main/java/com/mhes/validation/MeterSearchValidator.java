package com.mhes.validation;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mhes.util.Utility;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.mhes.request.MeterSearchRequest;
import com.mhes.response.MeterSearchReponse;

/**
*
* @author Redmind
*/
@Service
public class MeterSearchValidator extends Utility implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
	}
	
	public void dateValidation(MeterSearchRequest meterSearchRequest,BindingResult result ) {
		List<String> errmessage= new ArrayList<>();
		
	      /* // boolean isExpired = false;
	        if (meterSearchRequest.getToDate() != null) {          
	                if (meterSearchRequest.getToDate().after(new Date())) {
	                	errmessage.add("ToDate Cannot be greater than Current Date");
	                	//meterSearchReponse.setErrmessage(errmessage);
	                  // isExpired = true;
	                   addObjectError(result, "To Date", "ToDate Cannot be greater than Current Date", null);
	                }         
	        }
	        
	        if (meterSearchRequest.getFromDate() != null) {          
                if (meterSearchRequest.getFromDate().after(new Date())) {
                	errmessage.add("ToDate Cannot be greater than Current Date");
                   //isExpired = true;
                   addObjectError(result, "From Date", "ToDate Cannot be greater than Current Date", null);
                }    
                if (meterSearchRequest.getFromDate().after(meterSearchRequest.getToDate())) {
                   // isExpired = true;
                    addObjectError(result, "From Date", "From Cannot be greater than To Date", null);
                 }  
        }
	     
	   
		
	}*/
	}
}
