package com.cashdispensing.springdemo.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cashdispensing.springdemo.entity.CashDispensing;
import com.cashdispensing.springdemo.service.CashDispensingService;

import org.springframework.ui.Model;


@Controller
@RequestMapping("/cashdispensing")
public class CashDispensingController {

	@Autowired
	private CashDispensingService cashDispensingService;
	
	private int amount_of_1000_default = 100;
	private int amount_of_500_default = 100;
	private int amount_of_100_default = 100;
	private int amount_of_50_default = 100;
	private int amount_of_20_default= 100;
		
	@PostConstruct
	public void init() {
		System.out.println("step 1 : your card in atm including : \n"
				+"\n number of 1000 card :"+ amount_of_1000_default
				+"\n nnumber of 500 card :"+amount_of_500_default
				+"\n number of 100 card :"+amount_of_100_default
				+"\n number of 50 card :"+amount_of_50_default
				+"\n number of 20 card :"+amount_of_20_default);
		System.out.println(
		"Money in atm : "+amount_of_1000_default*1000+ amount_of_500_default*500
		+amount_of_100_default*100 +amount_of_50_default*50
		+amount_of_20_default*20);
	
	}
	
	@GetMapping("/index")
	public String userCashDispensingIndex(Model theModel) {
		return "cashdispensing-enter-form";
	}

	@GetMapping("/list")
	public String cashDispensingList(Model theModel) {
		return "cashdispensing-enter-form";
	}
	
	@PostMapping("/cashDispensing")
	public String cashDispensing(@RequestParam("user_amount_enter") int user_amount_enter,Model theModel, Object count_of_1000) {
		String msg =null;
		if(user_amount_enter >= amount_of_1000_default*1000+ amount_of_500_default*500
								+amount_of_100_default*100 +amount_of_50_default*50
								+amount_of_20_default*20) {
			msg=" your money is not enough \n please enter amount of money again";
			theModel.addAttribute("msg", msg);	
			return "cashdispensing-enter-form";
		}
		
		if(user_amount_enter==0) {
			msg=" number can not cash dispensing \n please enter amount of money again";
		}else{
			
			int amount_of_1000 = 0;//1 2000
			int amount_of_500 = 0;
			int amount_of_100 = 0;
			int amount_of_50 = 0;
			int amount_of_20 = 0;
			int money =user_amount_enter;
			
			if(money >= 1000 && amount_of_1000_default > 0) {
				amount_of_1000=  money/1000;//2
				if(amount_of_1000_default - amount_of_1000 <= 0 ) {
					int n1 = amount_of_1000 - amount_of_1000_default;
					money -= amount_of_1000_default*1000;
					amount_of_1000 = amount_of_1000_default;
					amount_of_1000_default = 0;
					
				System.out.println("in");
				}else {
					System.out.println("out");	
					amount_of_1000_default -= amount_of_1000;
					money %= 1000;
				}
			}

			if(money >= 500 && amount_of_500_default > 0) {
				amount_of_500=  money/500;//2
				if(amount_of_500_default - amount_of_500 <= 0 ) {
					int n1 = amount_of_500 - amount_of_500_default;
					money -= amount_of_500_default*500;
					amount_of_500 = amount_of_500_default;
					amount_of_500_default = 0;
				}else {
					amount_of_500_default -= amount_of_500;
					money %= 500;
				}
			}

			if(money >= 100 && amount_of_100_default > 0) {
				amount_of_100=  money/100;//2
				if(amount_of_100_default - amount_of_100  <= 0 ) {
					int n1 = amount_of_100 - amount_of_100_default;
					money -= amount_of_100_default*100;
					amount_of_100 = amount_of_100_default;
					amount_of_100_default = 0;
				}else {
					amount_of_100_default -= amount_of_100;
					money %= 100;
				}
			}

			if(money >= 50 && amount_of_50_default > 0) {

				int x = money%50; //0 10
				int y = x%20;//10/
				if(y == 0 || x==0) {
					amount_of_50=  money/50;//1
					if(amount_of_50_default - amount_of_50  <= 0 ) {
						int n1 = amount_of_50 - amount_of_50_default;
						money -= amount_of_50_default*50;
						amount_of_50 = amount_of_50_default;
						amount_of_50_default = 0;
					}else {
						amount_of_50_default -= amount_of_50;
						money %= 50;
					}					
				}else {
					amount_of_20=  money/20;	//3
					if(amount_of_50_default > 0) {
						if(amount_of_20_default - amount_of_20  <= 0 ) {
							int n1 = amount_of_20 - amount_of_20_default;
							money -= amount_of_20_default*20;
							amount_of_20 = amount_of_20_default;
							amount_of_20_default = 0;
						}else {
							amount_of_20_default -= amount_of_20;
							money %= 20;
						}
					}
					
				}
				
			}


			if(money >= 20 && amount_of_20_default > 0) {
				amount_of_20=  money/20;//2
				if(amount_of_20_default - amount_of_20 <0 ) {
					int n1 = amount_of_20 - amount_of_20_default;
					money -= amount_of_20_default*20;
					amount_of_20 = amount_of_20_default;
					amount_of_20_default = 0;
				}else {
					amount_of_20_default -= amount_of_20;
					money %= 20;
				}
			}

			System.out.println("money"+money);
			if(money == 0) {
					System.out.println("your card in atm : \n" 
					+"amount_of_1000 card : "+ amount_of_1000_default+"\n"
					+"amount_of_500 card : "+ amount_of_500_default+"\n"
					+"amount_of_100 card : "+ amount_of_100_default+"\n"
					+"amount_of_50 card : "+ amount_of_50_default+"\n"
					+"amount_of_20 card : "+ amount_of_20_default);
						
					CashDispensing cashDispensing= new CashDispensing();
					cashDispensing.setNumber_of_thousand_card(amount_of_1000_default);
					cashDispensing.setNumber_of_thousand_card_dispensing(amount_of_1000);
					
					cashDispensing.setNumber_of_fivehundred_card(amount_of_500_default);
					cashDispensing.setNumber_of_fivehundred_card_dispensing(amount_of_500);	
					
					cashDispensing.setNumber_of_hundred_card(amount_of_100_default);
					cashDispensing.setNumber_of_hundred_card_dispensing(amount_of_100);					
					
					
					cashDispensing.setNumber_of_fifty_card(amount_of_50_default);
					cashDispensing.setNumber_of_fifty_card_dispensing(amount_of_50);					
			
					cashDispensing.setNumber_of_fifty_card(amount_of_50_default);
					cashDispensing.setNumber_of_fifty_card_dispensing(amount_of_50);
					
					cashDispensing.setNumber_of_twenty_card(amount_of_20_default);
					cashDispensing.setNumber_of_twenty_card_dispensing(amount_of_20);
					
					cashDispensing.setUser_amount_enter(user_amount_enter);
					
					cashDispensingService.saveCashDispensingProcess(cashDispensing);
					
					msg="Thank you so much \n please check your money";
				    theModel.addAttribute("cashDispensing", cashDispensing);					
				}else {
					msg=" number can not cash dispensing \n please enter amount of money again";
				}				
		}		
		
		System.out.println(msg);		
		theModel.addAttribute("msg",  msg );		
		return "cashdispensing-enter-form";
	}
	

}
