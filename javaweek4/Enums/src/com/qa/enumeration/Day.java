package com.qa.enumeration;

public enum Day {
	MONDAY("football"),
	TUESDAY("new monday"),
	WEDNESDAY("halfway there!"),
	THURSDAY("went pretty quickly"),
	FRIDAY("socials"),
	SATURDAY("12h sleep"),
	SUNDAY("funday");
	
	
private String feeling;
 Day(String feeling) {
	this.feeling=feeling;
	
}
public String getFeeling() {
	return feeling;
}
public void setFeeling(String feeling) {
	this.feeling = feeling;
}
	

}

