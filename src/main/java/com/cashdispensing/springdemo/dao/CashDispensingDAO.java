package com.cashdispensing.springdemo.dao;

import java.util.List;

import com.cashdispensing.springdemo.entity.CashDispensing;

public interface CashDispensingDAO {
	
	public List<CashDispensing> getCashDispensings();
	
	public void saveCashDispensing(CashDispensing theCashDispensing);
	
}
