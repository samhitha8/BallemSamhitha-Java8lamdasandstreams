package java8lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReturningStringsStartingwitha {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturningStringsStartingwitha object= new ReturningStringsStartingwitha();
	
		
		ArrayList<String> alist=new ArrayList<String>();  
	     alist.add("Gregor");  
	     alist.add("Khal");  
	     alist.add("Cer");  
	     alist.add("and"); 
	     alist.add("air");
	     alist.add("are");
	     alist.add("Ang");
	     alist.add("ape");
	     alist.add("apend");
	     alist.add("approve");
	     
List<String> resultlist = object.print_strings_with_a(alist); 
System.out.println("A method that returns a list of all strings that start with the letter 'a' (lower case) and have exactly 3 letters:");  
for(String str:resultlist)  
    System.out.println(str);  
	     }
	
	
	  public List<String> print_strings_with_a(ArrayList<String> alist)
	  {
		  Collections.sort(alist);
		  List<String> list = new ArrayList<String>(); ;
		  for(String str: alist)
		  {
			  if(str.startsWith("a") && str.length()==3)
			  {
				 list.add(str);
			  }
		  }
		
		return list;
		  
	  }


	

}
