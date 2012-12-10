package org.bht.politz;

public class Share implements Comparable<Share>{
	private String index;
	private String name;
	private double value;
	private double tendency;
	
	public Share (String index, String name, double value, double tendency) {
		this.index = index;
		this.name = name;
		this.value = value;
		this.tendency = tendency;
	}
	
	public String toString() {
		return "Name: " + this.name + "(" + this.index + ") Value:" + this.value + " Tendency: " + this.tendency;
	} 
	
	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public double getTendency() {
		return tendency;
	}
	public void setTendency(double tendency) {
		this.tendency = tendency;
	}

	public int compareTo(Share s) {
		return Double.compare(s.getTendency(), this.tendency);
	}
}
