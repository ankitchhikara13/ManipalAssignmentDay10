package com.manipal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.TempCalculatorBean;
import com.manipal.proxy.TempConversionProxy;

@RestController
public class TempCalculatorController {

	@Autowired
	private TempConversionProxy proxy;
	/*@GetMapping("metric-calculator/from/{from}/to/{to}/unit/{unit}")
	public MetricCalculatorBean calculateUnit(@PathVariable String from, @PathVariable String to, @PathVariable int unit) {
		return new MetricCalculatorBean(1L, from, to, 0, unit, 0 );
	}*/
	
	@GetMapping("temp-calculator/from/{from}/to/{to}/unit/{unit}")
	public TempCalculatorBean calculateUnit(@PathVariable String from, @PathVariable String to, @PathVariable int unit) {
		TempCalculatorBean bean = proxy.retrieveCalculatedValue(from, to);
		System.out.println("-------------------->"+bean.getTotalUnits());
		double totalUnits=0.0;
		if( bean.getConversionMultiple()==1.8) {
		 totalUnits = (bean.getConversionMultiple()* unit) + 32;	
		 System.out.println("horha h");
		} 
		else  totalUnits= (unit-32)*bean.getConversionMultiple();
		return new TempCalculatorBean(1L, from, to, bean.getConversionMultiple(), unit, totalUnits );
	}
	
	
	//http://localhost:9000/temp-calculator/from/METER/to/KM/unit/55
}

