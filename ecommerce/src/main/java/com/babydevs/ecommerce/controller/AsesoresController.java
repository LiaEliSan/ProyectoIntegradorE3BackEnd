package com.babydevs.ecommerce.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.babydevs.ecommerce.model.Asesores;
import com.babydevs.ecommerce.service.AsesoresService;

/// CRUD   -  Create   -  Read   -  Update   -  Delete
/// HTTP   -  POST     -  GET    -  PUT      -  DELETE

@RestController
@RequestMapping (path="/api/asesores/") //Http://localhost:8080/api/asesores/

public class AsesoresController {
	private final AsesoresService asesoresService;
	
    @Autowired
	public AsesoresController(AsesoresService asesoresService) {
		this.asesoresService = asesoresService;
	}//Constructor
	
	public ArrayList<Asesores> getAllAsesores(){
	    return asesoresService.getAllAsesores();
		
	}//getAllAsesores
	

}
