package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ProyectoDAO;
import com.distribuida.entities.Proyecto;

public class PrincipalProyecto {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		//Patron IoC inverción de control
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ProyectoDAO ProyectoDAO = context.getBean("proyectoDAOImpl", ProyectoDAO.class);
		
		
		List<Proyecto> proyecto= ProyectoDAO.findALL();
		
		proyecto.forEach(item ->{
			System.out.println(item.toString());	
		});
			
		
		
		
		context.close();


	}

}