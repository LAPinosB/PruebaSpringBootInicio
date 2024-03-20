package com.ecumayferrr.controller;

import com.ecumayferrr.primary.CustomerService;
import com.ecumayferrr.service.EmpleadoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class EmpleadoController {
	
	//Nosotros tendriamos que instaciar la clase pero con spring lo llamamos directamente con la etiqueta
	//Con esto le indicamos a spring que queremos que inyecte algo.
	@Autowired
	private EmpleadoServicio empleadoServicio;
	
	@Autowired
	private CustomerService customerService;
	
	public String hello() {
		return this.empleadoServicio.hello();
	}
	
	public String helloCustomer() {
		return this.customerService.hello();
	}

}
