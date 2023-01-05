package com.xworkz.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.dto.DaughterDTO;

public class CompanyCEODTORunner {
public static void main(String[] args) {

	 
	Collection<CompanyCEODTO> companyCEODTO = new ArrayList<CompanyCEODTO>();
	CompanyCEODTO companyCEODTO1=new CompanyCEODTO("Arun","TCS",32,"India","BE", true);
	companyCEODTO.add(companyCEODTO1);
	CompanyCEODTO companyCEODTO2=new CompanyCEODTO("ArunKumar","Infosis",25,"india","BE", true);
	companyCEODTO.add(companyCEODTO2);
	CompanyCEODTO companyCEODTO3=new CompanyCEODTO("Omkar","Fortune",34,"india","BE", true);
	companyCEODTO.add(companyCEODTO3);
	CompanyCEODTO companyCEODTO4=new CompanyCEODTO("Vinod","X-workz",38,"india","BE", true);
	companyCEODTO.add(companyCEODTO4);
	CompanyCEODTO companyCEODTO5=new CompanyCEODTO("Akshara","Magneto",35,"india","BSC", true);
	companyCEODTO.add(companyCEODTO5);
	
	Collection<DaughterDTO> daughterDTO = new ArrayList<DaughterDTO>();
	DaughterDTO daughterDTO1 = new DaughterDTO("Sharanya",9322467400l,29,false,true,"Arun");
	DaughterDTO daughterDTO2 = new DaughterDTO("Haranya",9882467400l,28,true,false,"ArunKumar");
	DaughterDTO daughterDTO3 = new DaughterDTO("Sri ",9882467400l,27,true,true,"Omkar");
	DaughterDTO daughterDTO4 = new DaughterDTO("Krishna",9888467400l,25,false,false,"Vinod");
	DaughterDTO daughterDTO5 = new DaughterDTO("Radhi",9322468880l,34,false,true,"Akshara");
	
	daughterDTO.add(daughterDTO1);
	daughterDTO.add(daughterDTO2);
	daughterDTO.add(daughterDTO3);
	daughterDTO.add(daughterDTO4);
	daughterDTO.add(daughterDTO5);
	
	
	daughterDTO.stream().collect(Collectors.toList()).forEach(e->System.out.println(e));
	System.out.println();
	System.out.println("Another run");
	daughterDTO.stream().map(e->e.getName()).collect(Collectors.toList()).forEach(e->System.out.println(e));
	System.out.println();
	System.out.println("Another run");
	companyCEODTO.stream().filter(e->e.getAge()>30).map(e->e.getName()).collect(Collectors.toList()).forEach(e->System.out.println(e));
}
}
