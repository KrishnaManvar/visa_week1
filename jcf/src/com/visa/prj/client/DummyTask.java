package com.visa.prj.client;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.visa.prj.entity.Product;

public class DummyTask {

	public static void main(String[] args) {
		//String str = "we are the world we are the children";
		
		//String que = str.toArray();
		
		
		
		
		
		//Set<String> unique = new HashSet<String>(Arrays.asList(str));
		//for (String un : unique) {
		//	System.out.println(un);
		//}
		
		//Arrays.asList(str).removeAll(unique);
		
		//for (String un : unique) {
		//	System.out.println(un);
		//}
		Product p = new Product(645,"Hp Laptop",135000.00,"computer",100);
		
		Map<String,Object> info = storeInfo(p);
		
	}
		
		
		
		static Map<String, Object> storeInfo(Object o) {
			Map<String,Object> map = new HashMap<String, Object>();
			Class clazz = o.getClass();
			Method[] methods = clazz.getMethods();
			for (Method m : methods) {
				if(m.getName().startsWith("get")){
					
					try {
						Object ret = m.invoke(o);
						map.put(m.getName().substring(3), ret);
						
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				
				}
				
			}
			return map;
			
			
		
	}

}
