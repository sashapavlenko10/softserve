package HW9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program1 {
	
	 public static void main(String[] args) {
		 File file = new File ("E:/a/homework/src/HW9/notes.txt");
	        FileInputStream fileStream = null;
			try {
				fileStream = new FileInputStream(file);
			} catch (FileNotFoundException e) {			
				e.printStackTrace();
			} 
	                InputStreamReader input = new InputStreamReader(fileStream); 
	                BufferedReader reader = new BufferedReader(input); 
	                  
	                String line; 
	                  
	        
	                int characterCount = 0; 	               
	                int count = 0;
	                String word = "", small = "", large=""; 
	                String[] words = new String[100];    
	                int length = 0;    
				    
	                try {
						while((line = reader.readLine()) != null) 
						{ 
						    if(line.equals("")) 
						    { 
						         
						    } 
						    if(!(line.equals(""))) 
						    { 
						          
						        characterCount += line.length(); 
						          						      
						        String[] wordList = line.split("\\s+"); 						          						      				          
						      
						        String[] sentenceList = line.split("[!?.:]+"); 

						        String[] digit = line.split("[^0-9]\"");
						        count++;
						    } 
						
						      for(int i = 0; i < line.length(); i++){    
						          
						          if(line.charAt(i) != ' '){    
						              word = word + line.charAt(i);    
						          }    
						          else{    					               
						              words[length] = word;    						                
						              length++;    						             
						              word = "";    
						          }    
						      }            						    
						      small = large = words[0];    					          
						     
						      for(int k = 0; k < length; k++){    
						              						         
						          if(small.length() > words[k].length())    
						              small = words[k];    
   
						          if(large.length() < words[k].length())    
						              large = words[k];   
						      }						     
						}
						 
					} catch (IOException e) {				
						e.printStackTrace();
					} 	                 
 
	                System.out.println("Total number of characters = " + characterCount); 
	                System.out.println("Total digit = " + count);
	                System.out.println("Smallest word: " + small);    
	      	        System.out.println("Largest word: " + large); 
	      	        
	 } 	        
}


