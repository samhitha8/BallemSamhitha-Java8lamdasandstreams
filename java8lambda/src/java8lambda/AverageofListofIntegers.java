package java8lambda;

import java.util.ArrayList;
public class AverageofListofIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AverageofListofIntegers object= new AverageofListofIntegers();
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
	      numbers.add(1);
	      numbers.add(7);
	      numbers.add(5);
	      numbers.add(6);
	      int total=0;
             for(int values: numbers)
             { 
            	 total+=values;
            	 
             }
             int n= numbers.size();
             double average=object.Calculate_average(total,n);
             System.out.println("Average of the list of numbers:"+average);
             
	}
	double Calculate_average(int total,int n)
	{
		double average=(double)total/(double)n;
		return average;
	}

}