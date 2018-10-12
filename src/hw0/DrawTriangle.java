package hw0;

import java.util.*;

public class DrawTriangle {

		// test for code
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			drawTriangle(10);

		}
		
		
		public String test = "*";
		public List<String> list = new ArrayList<String>();
		
		public static void drawTriangle(int n ) {
			String test = "*";
			List<String> list = new ArrayList<String>();
			
			while (list.size() < n) {
				System.out.println(test);
				list.add(test);
				test = test + "*";
			}
			
			System.out.println();
		}
	}

