package com.visa.prj.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSecondExample {

	public static void main(String[] args) {
		List<Integer> il = Arrays.asList(1,66,3,77,2);
		List<String> sl = Arrays.asList("one", "two", "three");
		
		print(il);
		print(sl);
		
		List<Integer> copyInt = new ArrayList<>();
		List<Integer> copyStr = new ArrayList<>();
		
		copy(copyInt, il);
		//copy(copyStr, sl);	
		
		
	System.out.println(copyInt);	
		

		
		
		
	}
	//PECS Producer extends Consumer super
	private static <T> void copy(List<? super T> des, List<? extends T> src) {
		// TODO Auto-generated method stub
		for(T o : src) {
			des.add(o);
		}
		
	}

	private static void print(List<?> list) {
		
		for (Object o : list) {
			System.out.println(o);
		}
		
	}

}
