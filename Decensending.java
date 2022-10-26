package com.number.sorting;

import java.util.Arrays;

public class Decensending {
public static void main(String[] args) {
	int temp;
	int []num = new int[9];
	num[0] = 1;
	num[1] = 34;
	num[2] = 45;
	num[3] = 56;
	num[4] = 67;
	num[5] = 78;
	num[6] = 76;
	num[7] = 56;
	num[8] = 34;
	for (int i = 0; i < num.length; i++) {
		for (int j = 0; j < num.length; j++) {
			if (num[i]>num[j]) {
				temp = num[i];
				num[i] = num [j];
				num[j] = temp;
			}
			
		}
	}
	System.out.println(Arrays.toString(num));
}
}