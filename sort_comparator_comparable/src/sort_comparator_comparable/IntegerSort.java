package sort_comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;

import sort_comparator_comparable.utility.MyUtility;

public class IntegerSort {
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(07);
		numbers.add(28);
		numbers.add(18);
		numbers.add(04);
		 
		MyUtility.iterateList(numbers);
		
		System.out.println("After sorting..");
		
		Collections.sort(numbers);
		
		MyUtility.iterateList(numbers);
	}
}	
	
	
	
	


