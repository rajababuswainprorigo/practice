package Assignment4;

import java.util.Arrays;
import java.util.List;

public class SortIntValues {

//Given a list of integers, sort all the values present in it.

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(54, 27, 92, 55, 26, 95);

		System.out.println();

		list.sort(null);

		System.out.println(list);
	}

}
