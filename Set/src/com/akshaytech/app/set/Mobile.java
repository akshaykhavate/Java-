package com.akshaytech.app.set;

public class Mobile {
	long no;
	String model;
	@Override
	public int hashCode() {
		return 123;
	}
	@Override
	public boolean equals(Object obj) {
		boolean isSame=false;
		if(obj instanceof Mobile){
			Mobile m=(Mobile)obj;
			if(this.model.equals(m.model)){
			isSame=true;	
			}
		}
		return isSame;
	}
}
