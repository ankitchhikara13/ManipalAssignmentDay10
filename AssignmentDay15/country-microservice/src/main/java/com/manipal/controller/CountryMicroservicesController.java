package com.manipal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.manipal.model.Country;
import com.manipal.proxy.Proxy;
import com.manipal.service.ICountryService;

@RestController
public class CountryMicroservicesController {

	@Autowired
	Proxy proxy;

	@Autowired
	ICountryService countryService;

	@GetMapping("country-service/countrycode/{countryCode}")
	public Country findCapital(@PathVariable int countryCode) {
		Country obj = proxy.retrieveCapital(countryCode);
		return new Country(obj.getCountryName(), obj.getZipcode(), obj.getName(), obj.getLanguage(), obj.getPopulation(),
				obj.getCountryCode(), obj.getPort());

	}
	@PostMapping("/addCountry")
	public String addCapitalDetails(@RequestBody Country country) {
		countryService.addCountry(country);
		return "Country Added Successfully";
	}


	@GetMapping("country-service/country/{countryName}")
	public Country findCapitalByCountryCode(@PathVariable String countryName) {
		Country country = countryService.getCountryByName(countryName);
		return country;
	}
}