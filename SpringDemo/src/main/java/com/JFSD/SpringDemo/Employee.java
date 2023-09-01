package com.JFSD.SpringDemo;

public class Employee {

	int eId;
	String eName;
	double eSal;
	
	public Employee(int eId, String eName,double eSal) {
		this.eId = eId;
		this.eName = eName;
		this.eSal = eSal;
	}
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
//	public String geteName() {
//		return eName;
//	}
//	public void seteName(String eName) {
//		this.eName = eName;
//	}
//	public double geteSal() {
//		return eSal;
//	}
//	public void seteSal(double eSal) {
//		this.eSal = eSal;
//	}
	
	
}
