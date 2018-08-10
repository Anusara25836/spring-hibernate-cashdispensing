package com.cashdispensing.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cashdispensing.springdemo.entity.CashDispensing;

@Repository
public class CashDispensingDAOImpl implements CashDispensingDAO{
	

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<CashDispensing> getCashDispensings() {
		
		Session currentSession = sessionFactory.getCurrentSession();
				
		Query<CashDispensing> theQuery = currentSession.createQuery("from CashDispensing order ",CashDispensing.class);
		
		List<CashDispensing> cashDispensings = theQuery.getResultList();
				
		return cashDispensings;
	}	
	
	@Override
	public void saveCashDispensing(CashDispensing theCashDispensing) {

		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(theCashDispensing);
		
	}

	
}
