package com.xworkz.springs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentRunner {
public static void main(String[] args) {
	
	ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
	
	Road ref = spring.getBean(Road.class);
	System.out.println(ref+"\n");
	
	Bus ref1 = spring.getBean(Bus.class);
	System.out.println(ref1+"\n");
	
	Cycle ref2 = spring.getBean(Cycle.class);
	System.out.println(ref2+"\n");
	
	System.out.println(spring.getBean(Girl.class));
	
	System.out.println(spring.getBean(Area.class));
	
	System.out.println(spring.getBean(Chocolate.class));
	
	System.out.println(spring.getBean(City.class));
	
	System.out.println(spring.getBean(Fish.class));
	
	System.out.println(spring.getBean(Temple.class));
	
	System.out.println(spring.getBean(God.class));
	
	System.out.println(spring.getBean(Park.class));
	
	System.out.println(spring.getBean(Mall.class));
	
	System.out.println(spring.getBean(Application.class));
}
}
