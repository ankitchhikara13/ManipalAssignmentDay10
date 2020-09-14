package com.manipal.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="flight")
public class Flight {
	
	private int id;
	private String departureLocation;
	private String arrivalLocation;
	private fleet Fleet;
	private status FlightStatus;
	private LocalDate departureTime;
	private LocalDate arrivalTime;
	
	public Flight() {}
	
	public Flight(int id, String departureLocation, String arrivalLocation, fleet fleet, status flightStatus,
			LocalDate departureTime, LocalDate arrivalTime) {
		super();
		this.id = id;
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
		Fleet = fleet;
		FlightStatus = flightStatus;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartureLocation() {
		return departureLocation;
	}

	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}

	public String getArrivalLocation() {
		return arrivalLocation;
	}

	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}

	public fleet getFleet() {
		return Fleet;
	}

	public void setFleet(fleet fleet) {
		Fleet = fleet;
	}

	public status getFlightStatus() {
		return FlightStatus;
	}

	public void setFlightStatus(status flightStatus) {
		FlightStatus = flightStatus;
	}

	public LocalDate getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalDate departureTime) {
		this.departureTime = departureTime;
	}

	public LocalDate getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalDate arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", departureLocation=" + departureLocation + ", arrivalLocation=" + arrivalLocation
				+ ", Fleet=" + Fleet + ", FlightStatus=" + FlightStatus + ", departureTime=" + departureTime
				+ ", arrivalTime=" + arrivalTime + "]";
	}
	
	
	
	
	

}
