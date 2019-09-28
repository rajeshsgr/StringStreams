package com.raj.nola.stringStreams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringStreamsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter a string : ");
        Scanner scanner = new Scanner(System. in);
        String s = scanner. nextLine();
        
		
		//Convert the string to lower case, to count all case together
		s=s.toLowerCase();
				
		//Convert the string to character array
		//use the IntStream returned by String.chars() and cast the int values to char without loss of information
		Character chars[]=s.chars().mapToObj(ch -> (char)ch).toArray(Character[]::new);
		
		//Character Array generated from above step
		System.out.println(Arrays.toString(chars));
		
		System.out.println("\n");
		
		
		HashMap<Character, Integer> chrCountMap = new HashMap<Character, Integer>(); 
		
		for (char c : chars) {
			
            if (chrCountMap.containsKey(c)) { 
  
                // If char is present in charCountMap, 
                // incrementing it's count by 1 
            	chrCountMap.put(c, chrCountMap.get(c) + 1); 
            } 
            else { 
  
                // If char is not present in charCountMap, 
                // putting this char to charCountMap with 1 as it's value 
            	chrCountMap.put(c, 1); 
            } 
        } 
		
		
		// Print the charCountMap 
        for (Map.Entry entry : chrCountMap.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
        
        
        
      
        
		
	}

}
