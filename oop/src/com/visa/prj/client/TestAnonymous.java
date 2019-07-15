package com.visa.prj.client;
interface Computation{
	int compute (int x, int y);
}

public class TestAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computation c1 = new Computation() {
			public int compute(int x, int y) {
				return x+y;
			}
		};
		System.out.println(c1.compute(5, 4));

		Computation c2 = (int x, int y) -> {
			return x-y;
		};
		System.out.println(c2.compute(5, 4));
		
		Computation c3 = (x,y) -> x*y;
		System.out.println(c3.compute(5, 4));
		
		
		
	}

}
