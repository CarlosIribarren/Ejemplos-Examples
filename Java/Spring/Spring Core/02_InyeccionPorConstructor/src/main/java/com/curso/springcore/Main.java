package com.curso.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.curso.springcore.beans.Persona;

public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml/beans.xml");
		
		Persona persona = (Persona) applicationContext.getBean("persona");
		
		System.out.println(persona.getId() + " - " + persona.getNombre() + " - " + persona.getApodo() );
		
		((ConfigurableApplicationContext)applicationContext).close();
	}

}
