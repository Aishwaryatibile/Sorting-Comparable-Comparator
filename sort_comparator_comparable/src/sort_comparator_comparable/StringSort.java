package sort_comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;

import sort_comparator_comparable.utility.MyUtility;

public class StringSort {

	public static void main(String[] args) {
		ArrayList<String> songs = new ArrayList<>();
		songs.add("ek do teen");
		songs.add("Sau aasman");
		songs.add("Ae Watan");
		songs.add("Jai ho");

		MyUtility.iterateList(songs);

		System.out.println("After sorting..");

		Collections.sort(songs);

		MyUtility.iterateList(songs);
	}

}
