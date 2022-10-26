package com.number.sorting;

import java.util.Arrays;

public class Ascending {

	public static void main(String[] args) {
		int temp;
	
		
		int num [] = new int[8];
		num[0] = 56;
		num[1] = 76;
		num[2] = 45;
		num[3] = 34;
		num[4] = 23;
		num[5] = 21;
		num[6] = 12;
		num[7] = 10;
		
	   for (int i =0; i<num.length; i++) {
		   for(int j= i+1;j<num.length; j++) {
			   if(num[i]> num[j]) {
				   temp = num[i];
				   num[i] =num[j];
				   num[j] = temp;
				   
			   }
		   }
	}
	   System.out.println(Arrays.toString(num));
}
}

	
