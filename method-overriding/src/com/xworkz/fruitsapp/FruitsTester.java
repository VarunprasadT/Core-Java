package com.xworkz.fruitsapp;

import com.xworkz.fruitsapp.fruit.Fruits;
import com.xworkz.fruitsapp.fruit.apple.Apple;
import com.xworkz.fruitsapp.fruit.mango.Mango;

public class FruitsTester {
public static void main(String[] args) {
	

	Fruits fruits = new Mango();
	fruits.toProviedNutrients();
	
	Fruits fruit = new Apple();
	fruit.toProviedNutrients();
	
	Fruits f = new Fruits();
	f.toProviedNutrients();
}	
}
