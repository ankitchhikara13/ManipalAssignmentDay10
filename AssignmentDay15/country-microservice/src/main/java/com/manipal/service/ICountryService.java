package com.manipal.service;
import com.manipal.model.Country;

public interface ICountryService {
	
	Country getCountryByName(String countryName);
	
	void addCountry(Country country);


}