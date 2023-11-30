package com.babydevs.modelos.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babydevs.modelos.model.Asesor;
@Service
public class AsesorService {
	public final ArrayList<Asesor> lista = new ArrayList<Asesor>();
	@Autowired
	public AsesorService() {
		lista.add(new Asesor(null,"Abril Castañeda", "Experta en Java", "CSS", "HTML / JavaScript", 150.00, "18 de Octubre"));
		lista.add(new Asesor(null,"Lucero Olivera", "Experta en Java", "CSS", "HTML / JavaScript", 250.00, "18 de Octubre"));
		lista.add(new Asesor(null,"Ana Hernández", "Experta en Java", "CSS", "HTML / JavaScript", 250.00, "18 de Octubre"));
		lista.add(new Asesor(null,"Areli Moreno", "Experta en Java", "CSS", "HTML / JavaScript", 250.00, "18 de Octubre"));
	}
	public ArrayList<Asesor> getAllAsesores() {
		return lista;
	}//getAllAsesores
	
	public Asesor getAsesor(long id) {
		Asesor ases=null;
		for (Asesor asesor : lista) {
			if(id == asesor.getId()) {
				ases=asesor;
				break;
			}//if
		}//foreach
		return ases;
	}//getAsesor
	
	public Asesor deleteAsesor(long id) {
		Asesor ases=null;
		for (Asesor asesor : lista) {
			if(id == asesor.getId()) {
				ases=asesor;
				lista.remove(asesor);
				break;
			}//if
		}//foreach
		return ases;
	}//deleteAsesor
	
	public Asesor addAsesor(Asesor asesor) {
		lista.add(asesor);
		return asesor;
	}//addAsesor
	
	public Asesor updateAsesor(long id, String nombre, String descripcion, String habilidad_principal,
			String habilidades_secundarias, Double tarifa_por_asesoria, String fecha_de_inicio) {
		Asesor ases=null;
		for (Asesor asesor : lista) {
			if(id == asesor.getId()) {
				if(nombre!= null) asesor.setNombre(nombre);
				if(descripcion!=null) asesor.setDescripcion(descripcion);
				if (habilidad_principal!=null) asesor.setHabilidad_principal(habilidad_principal);
				if(habilidades_secundarias!=null) asesor.setHabilidades_secundarias(habilidades_secundarias);
				if(tarifa_por_asesoria!=null) asesor.setTarifa_por_asesoria(tarifa_por_asesoria);
				if(fecha_de_inicio!=null)asesor.setFecha_de_inicio(fecha_de_inicio);
				ases=asesor;
				break;
			}//if
		}//foreach
		return ases;
	}

}//class AsesorService
