package com.bbat.wisc.common;

import org.springframework.context.ApplicationContext;

public class ApplicaitonContextUtil{
 
	    private static ApplicationContext applicationContext;  
	   
	     public static void setApplicationContext(ApplicationContext applicationContext1){
	    	 applicationContext = applicationContext1;
	    }
	     public static Object getBean(String name){
	         return applicationContext.getBean(name);
	     }
	 }
