package com.klm.exercises.spring.fares;

import lombok.Value;

@Value
public class Fare {

   
	double amount;
    Currency currency;
    String origin, destination;
    
    public Fare(double doubleValue, Currency valueOf, String code, String code2) {
		this.amount = doubleValue;
		this.currency = valueOf;
		this.origin = code;
		this.destination = code2;
	}
    

}
