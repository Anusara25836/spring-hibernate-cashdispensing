package com.cashdispensing.springdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cashdispensing.springdemo.entity.CashDispensing;

public interface CashDispensingService {
		
	public List<CashDispensing> getCashDispensings();
	
	public void saveCashDispensingProcess(CashDispensing theCashDispensing);

}
