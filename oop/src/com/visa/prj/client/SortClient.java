package com.visa.prj.client;
import com.visa.prj.entity.Mobile;
import com.visa.prj.entity.Product;
import com.visa.prj.entity.TV;
import com.visa.prj.util.Array;

public class SortClient {

	public static void main(String[] args) {
		String[] names = {"Calvin", "George", "Lee", "Angelina", "Brad"};
		
		Array.sort(names);
		for (String name : names) {
			System.out.println(name);
		}
		
		Product[] products = new Product[4]; //Array of 4 pointers
		products[0] = new TV(133,"Sony Bravia", 135000.00, "LED");
		products[1] = new Mobile(453, "MOTOG", 1299.00, "4G");
		products[2] = new TV(634, "Onida", 3500.00, "CRT");
		products[3] = new Mobile(621, "iPhone", 99999.00, "4G");
		
		Array.sort(products);
		
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
