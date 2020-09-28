package com.acumen.iunit.validation;

import com.acumen.iunit.util.Constants;

/**
*
* @author Redmind
*/

public class CommonValidation {

	public static Boolean checkNotNull(String inputString) {
		return (null != inputString && inputString.trim().length() > 0) ? Constants.TRUE : Constants.FALSE;
	}

}