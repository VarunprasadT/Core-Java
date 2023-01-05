package com.xworkz.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class WeaponDTORunner {
public static void main(String[] args) {
	
	Collection<WeaponDTO> weaponDTO = new ArrayList<WeaponDTO>();
	WeaponDTO weaponDTO1 = new  WeaponDTO("Little Boy","USA", WeaponType.Nuclear_weapon, 20000000.0,2000);
	WeaponDTO weaponDTO2 = new WeaponDTO("Blue Cat","UK", WeaponType.Nuclear_weapon, 4000000.0,1989);
	WeaponDTO weaponDTO3 = new WeaponDTO("Blue Slug","UK", WeaponType.Nuclear_weapon, 500000.0,1899);
	WeaponDTO weaponDTO4 = new WeaponDTO("Violet Club","UK", WeaponType.Nuclear_weapon, 30000000.0,2000);
	WeaponDTO weaponDTO5 = new WeaponDTO("Mk 105 Hotpoint","UK", WeaponType.Nuclear_weapon, 40000.0,1989);
	WeaponDTO weaponDTO6 = new WeaponDTO("Laser weapon"," US & Israeli", WeaponType.Laser_weapon, 20000000.0,1978);
	WeaponDTO weaponDTO7 = new WeaponDTO("Dazzler","USA", WeaponType.Laser_weapon, 3000000.0,1876);
	WeaponDTO weaponDTO8 = new WeaponDTO("ASRAD-R Naval","German", WeaponType.Bolide_missile, 500000.0,1898);
	WeaponDTO weaponDTO9 = new WeaponDTO("Kowsar","UK", WeaponType.anti_ship_cruise_missile, 30000000.0,1989);
	WeaponDTO weaponDTO10 = new WeaponDTO("Nasr-1 ","Iranian", WeaponType.anti_ship_cruise_missile, 4000000.0,1989);
	WeaponDTO weaponDTO11 = new WeaponDTO("Jask-2","Iranian",WeaponType.anti_ship_cruise_missile,500000000.0,1989);
	WeaponDTO weaponDTO12 = new WeaponDTO("Bina laser guided","Iranian", WeaponType.air_to_surface_missile, 20000000.0,1999);
	WeaponDTO weaponDTO13 = new WeaponDTO("Herz-9","Iran", WeaponType.air_to_surface_missile, 800000.0,1998);
	WeaponDTO weaponDTO14 = new WeaponDTO("Violet Club","UK", WeaponType.air_to_surface_missile, 30000000.0,1989);
	WeaponDTO weaponDTO15 = new WeaponDTO("Mk 105 Hotpoint","UK", WeaponType.mobile_air_defense_system, 4089000.0,1999);
	WeaponDTO weaponDTO16 = new WeaponDTO("Raad"," US & Israeli", WeaponType.Bolide_missile, 20000000.0,1998);
	WeaponDTO weaponDTO17 = new WeaponDTO("Akash","USA", WeaponType.Laser_weapon, 3000000.0,1998);
	WeaponDTO weaponDTO18 = new WeaponDTO("MR-SAM","India-Israel", WeaponType.air_to_surface_missile, 500000003.0,2001);
	WeaponDTO weaponDTO19 = new WeaponDTO("Trishul","India", WeaponType.air_to_surface_missile, 30000000.0,2002);
	WeaponDTO weaponDTO20 = new WeaponDTO("BrahMos","India", WeaponType.Supersonic_cruise_missile, 20000000.0,2006);

	weaponDTO.add(weaponDTO1);
	weaponDTO.add(weaponDTO2);
	weaponDTO.add(weaponDTO3);
	weaponDTO.add(weaponDTO4);
	weaponDTO.add(weaponDTO5);
	weaponDTO.add(weaponDTO6);
	weaponDTO.add(weaponDTO7);
	weaponDTO.add(weaponDTO8);
	weaponDTO.add(weaponDTO9);
	weaponDTO.add(weaponDTO10);
	weaponDTO.add(weaponDTO11);
	weaponDTO.add(weaponDTO12);
	weaponDTO.add(weaponDTO13);
	weaponDTO.add(weaponDTO14);
	weaponDTO.add(weaponDTO15);
	weaponDTO.add(weaponDTO16);
	weaponDTO.add(weaponDTO17);
	weaponDTO.add(weaponDTO18);
	weaponDTO.add(weaponDTO19);
	weaponDTO.add(weaponDTO20);
	
	System.out.println();
	System.out.println("Price greater than 2000000.0");
	System.out.println();
	weaponDTO.stream().filter(e->e.getPrice()>2000000.0).map(e->e.getPrice()).
	collect(Collectors.toList()).forEach(e->System.out.println(e));
	
	System.out.println();
	System.out.println("Weapons Made by");
	System.out.println();
	weaponDTO.stream().collect(Collectors.toList()).forEach(e->System.out.println(e.getMadeBy()));
	
	System.out.println();
	System.out.println("Weapons Made on");
	System.out.println();
	weaponDTO.stream().collect(Collectors.toList()).forEach(e->System.out.println(e.getYear()));
	
	System.out.println();
	System.out.println("Price of Weapon");
	System.out.println();
	weaponDTO.stream().collect(Collectors.toList()).forEach(e->System.out.println(e.getPrice()));
	
	System.out.println();
	System.out.println("Price of Weapon in decending");
	System.out.println();
	weaponDTO.stream().sorted((p1,p2)->Double.compare(p2.getPrice(),p1.getPrice()))
	.map(e->e.getPrice())
	.collect(Collectors.toList()).forEach(e->System.out.println(e));
	
	System.out.println();
	System.out.println("Name and Made on Weapon");
	System.out.println();
	weaponDTO.stream().collect(Collectors.toList())
	.forEach(e->System.out.println("Made by : "+e.getPrice()+"  Made On"+e.getYear()));
	
	System.out.println();
	System.out.println("Type and MadeBy Asscending order");
	System.out.println();
	weaponDTO.stream().collect(Collectors.toList())
	.forEach(e->System.out.println("Made by : "+e.getPrice()+" Type "+e.getMadeBy()));
	System.out.println();
	System.out.println("Type,MadeBy and Name in Asscending order");
	System.out.println();
	weaponDTO.stream().sorted((p1,p2)->p2.getName().compareTo(p1.getName())).collect(Collectors.toList())
	.forEach(e->System.out.println("Made by : "+e.getPrice()+"--- Type "+e.getMadeBy()+"--- Name :"+e.getName()));
	System.out.println();
	System.out.println("Name in desc order");
	System.out.println();
	weaponDTO.stream().sorted((p1,p2)->p2.getName().compareTo(p1.getName())).map(e->e.getName()).collect(Collectors.toList())
	.forEach(e->System.out.println(e));
}
}
