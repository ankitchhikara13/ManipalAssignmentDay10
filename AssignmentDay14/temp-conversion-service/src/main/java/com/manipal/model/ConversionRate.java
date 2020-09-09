package com.manipal.model;

public class ConversionRate {
	private long id;
	private String from;
	private String to;
	private double conversionMultiple;
	
	public ConversionRate() {}
	
	public ConversionRate(long id, String from, String to) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = getConversionMultiple();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public double getConversionMultiple() {
		if(from.equals("C") && to.equals("FAH"))
			conversionMultiple = 1.8;
		if(from.equals("FAH") && to.equals("C"))
			conversionMultiple = 0.555;
			
		return conversionMultiple;
	}
	public void setConversionMultiple(double conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	
	
	
}
