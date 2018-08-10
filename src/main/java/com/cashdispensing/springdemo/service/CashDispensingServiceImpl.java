package com.cashdispensing.springdemo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cashdispensing.springdemo.dao.CashDispensingDAO;
import com.cashdispensing.springdemo.entity.CashDispensing;

import org.springframework.stereotype.Service;

@Service
public class CashDispensingServiceImpl implements CashDispensingService{

	@Autowired
	private CashDispensingDAO cashDispensingDAO;
	
	@Override
	@Transactional
	public List<CashDispensing> getCashDispensings() {
		return null;
	}
			
	@Override
	@Transactional	
	public void saveCashDispensingProcess(CashDispensing theCashDispensing) {
		cashDispensingDAO.saveCashDispensing(theCashDispensing);
	}
	
	
	
	
	
	
}
