package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Proyecto;

@Repository
public class ProyectoDAOImpl implements ProyectoDAO {

	@Autowired
	private SessionFactory ssessionFactory;


	@Override
	@Transactional
	public List<Proyecto> findALL() {
		// TODO Auto-generated method stub
		Session session = ssessionFactory.getCurrentSession();
		return session.createQuery("from Proyecto", Proyecto.class).getResultList();
	}


	@Override
	public Proyecto findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Proyecto proyecto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(Proyecto proyecto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dell(Proyecto proyecto) {
		// TODO Auto-generated method stub

	}

}