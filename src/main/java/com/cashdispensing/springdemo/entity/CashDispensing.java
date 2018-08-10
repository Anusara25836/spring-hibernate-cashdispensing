package com.cashdispensing.springdemo.entity;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="cashdispensing")
public class CashDispensing {
 		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;	
	
	@Column(name="number_of_thousand_card")
	private int number_of_thousand_card;
	
	@Column(name="number_of_thousand_card_dispensing")
	private int number_of_thousand_card_dispensing;	


	@Column(name="number_of_fivehundred_card")
	private int number_of_fivehundred_card;
	
	@Column(name="number_of_fivehundred_card_dispensing")
	private int number_of_fivehundred_card_dispensing;		
	
	@Column(name="number_of_hundred_card")
	private int number_of_hundred_card;
	
	@Column(name="number_of_hundred_card_dispensing")
	private int number_of_hundred_card_dispensing;		
	
	
	@Column(name="number_of_fifty_card")
	private int number_of_fifty_card;
	
	@Column(name="number_of_fifty_card_dispensing")
	private int number_of_fifty_card_dispensing;	
	
	
	@Column(name="number_of_twenty_card")
	private int number_of_twenty_card;
	
	@Column(name="number_of_twenty_card_dispensing")
	private int number_of_twenty_card_dispensing;
	
	@Column(name="user_amount_enter")
	private int user_amount_enter;	
	
	@Column(name="date_time",columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP")
	private Date date_time;
	
	public CashDispensing() {
		
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getNumber_of_thousand_card() {
		return number_of_thousand_card;
	}


	public void setNumber_of_thousand_card(int number_of_thousand_card) {
		this.number_of_thousand_card = number_of_thousand_card;
	}


	public int getNumber_of_thousand_card_dispensing() {
		return number_of_thousand_card_dispensing;
	}


	public void setNumber_of_thousand_card_dispensing(int number_of_thousand_card_dispensing) {
		this.number_of_thousand_card_dispensing = number_of_thousand_card_dispensing;
	}


	public int getNumber_of_fivehundred_card() {
		return number_of_fivehundred_card;
	}


	public void setNumber_of_fivehundred_card(int number_of_fivehundred_card) {
		this.number_of_fivehundred_card = number_of_fivehundred_card;
	}


	public int getNumber_of_fivehundred_card_dispensing() {
		return number_of_fivehundred_card_dispensing;
	}


	public void setNumber_of_fivehundred_card_dispensing(int number_of_fivehundred_card_dispensing) {
		this.number_of_fivehundred_card_dispensing = number_of_fivehundred_card_dispensing;
	}


	public int getNumber_of_hundred_card() {
		return number_of_hundred_card;
	}


	public void setNumber_of_hundred_card(int number_of_hundred_card) {
		this.number_of_hundred_card = number_of_hundred_card;
	}


	public int getNumber_of_hundred_card_dispensing() {
		return number_of_hundred_card_dispensing;
	}


	public void setNumber_of_hundred_card_dispensing(int number_of_hundred_card_dispensing) {
		this.number_of_hundred_card_dispensing = number_of_hundred_card_dispensing;
	}


	public int getNumber_of_fifty_card() {
		return number_of_fifty_card;
	}


	public void setNumber_of_fifty_card(int number_of_fifty_card) {
		this.number_of_fifty_card = number_of_fifty_card;
	}


	public int getNumber_of_fifty_card_dispensing() {
		return number_of_fifty_card_dispensing;
	}


	public void setNumber_of_fifty_card_dispensing(int number_of_fifty_card_dispensing) {
		this.number_of_fifty_card_dispensing = number_of_fifty_card_dispensing;
	}


	public int getNumber_of_twenty_card() {
		return number_of_twenty_card;
	}


	public void setNumber_of_twenty_card(int number_of_twenty_card) {
		this.number_of_twenty_card = number_of_twenty_card;
	}


	public int getNumber_of_twenty_card_dispensing() {
		return number_of_twenty_card_dispensing;
	}


	public void setNumber_of_twenty_card_dispensing(int number_of_twenty_card_dispensing) {
		this.number_of_twenty_card_dispensing = number_of_twenty_card_dispensing;
	}


	public int getUser_amount_enter() {
		return user_amount_enter;
	}


	public void setUser_amount_enter(int user_amount_enter) {
		this.user_amount_enter = user_amount_enter;
	}


	public Date getDate_time() {
		return date_time;
	}


	public void setDate_time(Date date_time) {
		this.date_time = date_time;
	}


	@Override
	public String toString() {
		return "";
		//return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}	
	
	
	
	
}
