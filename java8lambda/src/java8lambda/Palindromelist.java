package java8lambda;

import java.util.ArrayList;
import java.util.List;

public class Palindromelist {

	public static void main(String[] args) {
		List<String> alist=new ArrayList<String>();  
		     alist.add("madam");  
		     alist.add("mam");  
		     alist.add("Teacher");  
		     alist.add("sos"); 
		     alist.add("pop");
		     alist.add("top");
		     alist.add("level");
		     alist.add("hanah");
		     alist.add("radar");
		     alist.add("rotor");
		     alist.add("ape");
		     alist.add("append");
		     alist.add("approve");
		     System.out.println("A method that returns a list of all the palindrome strings:");
		     
		     List<String> palindrome_list = Palindromelist.print_strings_which_are_palindrome(alist); 
		    
		     for(String str:palindrome_list)  
		    	    System.out.println(str);  
		    		    
	}
 public static List<String> print_strings_which_are_palindrome(List<String> alist)
{
	List<String> palindromelist = new ArrayList<String>(); 
	  
	  for(String str: alist)
	  {
		  String reverse="";
		 int length=str.length();
		  for ( int i = length - 1; i >= 0; i-- )  
		  {    reverse = reverse + str.charAt(i);  
		     }
		  if(str.equals(reverse))
		  { 
			  palindromelist.add(str);
		  }
		  else
			  continue;
	  }
	
	return palindromelist;
	  
}

}
