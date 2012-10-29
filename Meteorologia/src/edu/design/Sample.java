package edu.design;

import java.util.Date;

public class Sample {
private Date date;
	private int value;	
	
public Sample(int value) {
		this.date = new Date();
		this.value = value;
	}
public void setDate(Date date) {
	this.date = date;
}
public Date getDate() {
	return date;
}
public void setValue(int value) {
	this.value = value;
}
public int getValue() {
	return value;
}
}
