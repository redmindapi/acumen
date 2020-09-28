package com.acumen.iunit.util;

import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
/**
*
* @author Redmind
*/
@Component
public class Utility {
	   private static MessageSource messageSource;
	   
	   @Autowired
	    public void setMessageSource(MessageSource aMessageSource) {
	        Utility.messageSource = aMessageSource;
	    }
	 
	   
	
	public static void addObjectError(BindingResult result, String attributeName, String messageKey, Object[] messageParameters) {
        ObjectError error = new ObjectError(attributeName, fetchMessage(messageKey, messageParameters));
        result.addError(error);
    }
	public static String fetchMessage(String messageKey, Object[] messageParameters) {
        return messageSource.getMessage(messageKey, messageParameters, Constants.LOCALE);
    }

    public static String fetchMessage(String messageKey) {
        return messageSource.getMessage(messageKey, null, Constants.LOCALE);
    }

}
