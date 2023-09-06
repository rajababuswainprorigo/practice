package Assignment4;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;
public class StartWith1 {




	public static void main(String[] args) {

		/* Solution1: without steams */
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 105);
		for (Integer n : list) {
			int base = (int) Math.log10(n);
			int val = n / (int) Math.floor((Math.pow(10, base)));
			// if(n==1|| (base>0 && val==1))
			if (n == 1 || ((int) Math.log10(n) > 0 && n / (int) Math.floor(Math.pow(10, base)) == 1))
				System.out.println(n);
		}
		/* Solution2: with streams */
		List<Integer> numList = Arrays.asList(10, 15, 8, 49, 1, 25, 98, 32, 105).stream()
				.filter(n -> (n == 1
						|| ((int) Math.log10(n) > 0 && n / (int) Math.floor(Math.pow(10, (int) Math.log10(n))) == 1)))
				.collect(Collectors.toList());
		System.out.println(numList);
	}
}
