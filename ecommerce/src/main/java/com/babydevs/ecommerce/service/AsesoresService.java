package com.babydevs.ecommerce.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babydevs.ecommerce.model.Asesores;

@Service
public class AsesoresService {
	public final ArrayList<Asesores> lista = new ArrayList<Asesores>();
	
  @Autowired
	public AsesoresService() {
	  
	lista.add(new Asesores("Jessica L. Olivera", "Habilidad Principal Java / Habilidades secundarias Trello y MySQL",
			"lucero.jpg", 150.00));
	lista.add(new Asesores("Abril Fernández", "Habilidad Principal: HTML5 / Habilidades secundarias: Java y GitHub",
			"abril.jpg", 150.00));
	lista.add(new Asesores("Lizeth Bravo Acevedo", "Habilidad Principal: HTML5 / Habilidades secundarias: Git y CSS3",
			"lizy.jpg", 150.00));
	lista.add(new Asesores("Ana Cristina Hernández", "Habilidad Principal: JavaScript / Habilidades secundarias: Bootstrap",
			"ana.jpg", 150.00));
	lista.add(new Asesores("Alma G. Martínez", "Habilidad Principal: CSS3 / Habilidades secundarias: Metodología SCRUM",
			"alma.jpg", 150.00));
	lista.add(new Asesores("Amalia Elizalde", "Habilidad Principal: Java / Habilidades secundarias: Trello y Bootstrap",
			"lia.jpg", 150.00));
	lista.add(new Asesores("Almendra Zamudio", "Habilidad Principal: HTML5 / Habilidades secundarias: CSS3",
			"almendra.jpg", 150.00));
	lista.add(new Asesores("Rosa Pérez", "Habilidad Principal: HTML5 / Habilidades secundarias:CSS3",
			"rosa.jpg", 150.00));
	lista.add(new Asesores("Jazmín Corona", "Habilidad Principal: HTML5 / Habilidades secundarias: CSS3",
			"jaz.jpg", 150.00));
	lista.add(new Asesores("Areli Moreno", "Habilidad Principal: JavaScript / Habilidades secundarias: Figma y CSS3",
			"are.jpg", 150.00));
	}

public ArrayList<Asesores> getAllAsesores() {
	// TODO Auto-generated method stub
	return lista;
}
	
}// Class Asesores Service
