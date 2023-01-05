package com.xworkz.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ApplicationDTORunner {
public static void main(String[] args) {
	Collection<ApplicationDTO> applicationDTO = new ArrayList<ApplicationDTO>();
	ApplicationDTO applicationDTO1 = new ApplicationDTO("Java",1.8,true,"Oracle",0.0);
	ApplicationDTO applicationDTO2 = new ApplicationDTO("Google",2.8,true,"Google",0.0);
	ApplicationDTO applicationDTO3 = new ApplicationDTO("G-Mail",7.8,true,"Google",0.0);
	ApplicationDTO applicationDTO4 = new ApplicationDTO("AutoCAD",10.8,false,"AutoCAD",15456.0);
	
	applicationDTO.add(applicationDTO1);
	applicationDTO.add(applicationDTO2);
	applicationDTO.add(applicationDTO3);
	applicationDTO.add(applicationDTO4);


	applicationDTO.stream()
	.filter(ele->ele.isFree())
	.filter(ele->ele.getDevelopedBy().equals("Google"))	.map(ele->ele.getName())
	.collect(Collectors.toList())
	.forEach((e)->System.out.println(e));
	
	System.out.println("Another run");
	
	applicationDTO.stream().filter(ele->ele.getVersion()>5)
	.map(ele->ele.getName()).collect(Collectors.toList())
	.forEach((e)->System.out.println(e));
	
	System.out.println("Another run\n");
	
	
	
	applicationDTO.stream().sorted((p1,p2)->p2.getName().compareTo(p1.getName())).forEach(e->System.out.println(e));
	
	Comparator<ApplicationDTO> comparator = (p1,p2)->Double.compare(p2.getPrice(),p1.getPrice());
	applicationDTO.stream().sorted(comparator).forEach(e->System.out.println(e));
	
}
}
