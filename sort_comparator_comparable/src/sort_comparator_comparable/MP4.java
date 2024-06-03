package sort_comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;

import sort_comparator_comparable.api.Song;
import sort_comparator_comparable.utility.MyUtility;

public class MP4 {
	
	
	
	public static void main(String[] args) {
		
		Song song1 = new Song("Pehle Bhi Main", "Vishal Mishra", 2023);
		Song song2 = new Song("Chaleya", "Arijit Singh", 2022);
		Song song3 = new Song("Akhiyaan Gulab", "Mitraz", 2024);
		Song song4 = new Song("Channa Ve", "Vishal Mishra", 2021);
		Song song5 = new Song("Tum se Hi", "Pritam", 2012);
		
		ArrayList<Song> songs = new ArrayList<>();
		songs.add(song1);
		songs.add(song2);
		songs.add(song3);
		songs.add(song4);
		songs.add(song5);
		
		MyUtility.iterateList(songs);
		
		/*
		 * Collections class has 2 sort methods one with comparable interface and other with comparator.
		 * 
		 * String, Integer classes internally implements comparable interface
		 * 
		 * T is for type and T extends Comparable means it accepts the object of class which implements
		 * the comparable interface(if only T that accepts any type)
		 * 
		 * static <T extends Comparable<? super T>> void sort(List<T> list) The sort
		 * method in Collections class sorts the list in natural/ascending order only.
		 * The sort method parameter type should implemented the comparable interface
		 * and override the compareTo method Collections.sort(numbers) - here the we are
		 * adding numbers to list in list and then sorting.ArrayList<Integer> numbers =
		 * new ArrayList<>(); Integer, String classes have implemented the comparable
		 * interface and if we want to sort the customized object type ArrayList<Song>
		 * songs = new ArrayList<>(); - here Song is the customized object then we have
		 * to implement the comparable interface and after overriding the comapreTo
		 * method have to provide the implementation to comapre to method in order to
		 * what things we ant to sort. If we don't provide the implementation to
		 * compareTo method then sort method internally look for the compareTo method
		 * implementation and as it will not found anything in it it will not able to
		 * sort anything
		 * 
		 * comparable interface is in the java.lang package and it has only one method 
		 * which is compareTo which returns int.
		 * 
		 * -ve integer, if the current object is lesser than the specified object.
		 * +ve integer, if the current object is greater than the specified object.
		 * zero, if the current object is equal to the specified object.
		 * 
		 * If we want to custom object sorting logic  then we should use the comparator.
		 * Comparator interface belongs o java.util package and it has the 2 abstract method compare and equals
		 * 
		 * No need to override the equals method in the class which implements comparator. Because 
		 * all classes are implicitly extends the object class and object class do have the equals method.
		 * 
		 */

		
		Collections.sort(songs);
		
		System.out.println("After sorting..");
		MyUtility.iterateList(songs);
		
	}

}
