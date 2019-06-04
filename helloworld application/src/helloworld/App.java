package helloworld;

import java.util.HashMap;

import helloworld.JavaMap;

public class App {
  public static void main(String[] args) {
	  System.out.println("Hello world to the standard out");
	  JavaMap jav1 = new JavaMap();
	  JavaMap jav2 = new JavaMap();
	  JavaMap jav3 = new JavaMap();
	  HashMap<Integer, Object> map1 = new HashMap<Integer, Object>();
	  map1.put(1, jav1);
	  map1.put(2, jav2);
	  map1.put(3, jav3);
	  
	  System.out.println(JavaMap.takeMap(map1, 2));
  }
}
