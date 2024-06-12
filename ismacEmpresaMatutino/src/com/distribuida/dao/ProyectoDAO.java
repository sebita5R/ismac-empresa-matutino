package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Proyecto;

public interface ProyectoDAO {
	
	public List<Proyecto> findALL();
	
	public Proyecto findOne(int id);
	
	public void add (Proyecto proyecto);
	
	public void up (Proyecto proyecto);
	
	public void dell (Proyecto proyecto);
	
	
	//CRUD avansados

}
