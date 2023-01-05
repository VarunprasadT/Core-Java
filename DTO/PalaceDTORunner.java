package com.xworkz.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class PalaceDTORunner {
public static void main(String[] args) {
	

	Collection<PalaceDTO> palace= new ArrayList<PalaceDTO>();
	PalaceDTO palace1 = new PalaceDTO("Mysore","Mysuru","Varun",false,1.0f);
	PalaceDTO palace2 = new PalaceDTO("Bengaluru","Bengalore","Kiran",false,2.0f);
	PalaceDTO palace3 = new PalaceDTO("Tumkur","Tumakuru","Tharun",true,4.0f);
	PalaceDTO palace4 = new PalaceDTO("Mangaluru","Mangalore","Darshan",true,7.0f);
	palace.add(palace1);
	palace.add(palace2);
	palace.add(palace3);
	palace.add(palace4);
	
	palace.stream()
	.filter(ele->!ele.isDistroyed()) 
	.map(ele->ele.getName())
	.collect(Collectors.toList())
	.forEach((e)->System.out.println(e));
	
	
	
}
}