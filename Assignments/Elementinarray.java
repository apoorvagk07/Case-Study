package com.sonata.one;

public class Elementinarray {

	public static void main(String[] args) {
		 int[] Array = {55, 45, 69, 44};
	      int num = 5;

	      for(int i = 0; i<Array.length; i++){
	         if(num == Array[i]){
	            System.out.println("Array contains the given element");
	         }
	         else {
	        	 
	        	 System.out.println("Array does not contains the given element");
	        	 break;
	         }
	      }

	}

}
