package com.study.rest.assessment;


import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	   
		@RequestMapping(value = "/api/firstfactorial", method = RequestMethod.POST)
	    public int FirstFactorial(@RequestBody int num) {
			int i,fact = 1;  
			for(i=1;i<=num;i++){    
			      fact = fact * i;    
			  }
			return fact;     
	    }
		@RequestMapping(value = "/api/firstreverse", method = RequestMethod.POST)
	    public StringBuilder FirstReverse(@RequestBody String str) {
	        StringBuilder input = new StringBuilder(); 
	  
	        input.append(str); 
	        input = input.reverse(); 
	        return (input);
	    }
		@RequestMapping(value = "/api/alphabetsoup", method = RequestMethod.POST)
	    public String AlphabetSoup(@RequestBody String str) {

	    	char[] chars = str.toCharArray();
	    	 
	    	Arrays.sort(chars);
	    	String sorted = new String(chars);

	    	return (sorted);
	    	}
	
}