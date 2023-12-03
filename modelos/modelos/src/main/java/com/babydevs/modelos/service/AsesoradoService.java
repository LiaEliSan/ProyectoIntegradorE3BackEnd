package com.babydevs.modelos.service;

import java.util.List;
import java.util.Optional;

import com.babydevs.modelos.model.Asesorado;
import com.babydevs.modelos.repository.AsesoradoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsesoradoService {

	private final AsesoradoRepository asesoradoRepository;	
	
	@Autowired
	public AsesoradoService(AsesoradoRepository asesoradoRepository) {
		this.asesoradoRepository = asesoradoRepository;
	}//constructor
	
	public List<Asesorado> getAllAsesorados() {
		return asesoradoRepository.findAll();
	}//getAllAsesorados
	
	public Asesorado getAsesorado(long id) {
		return asesoradoRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("El Asesorado con el id ["
						+ id + "] no existe")
				);
	}//getAsesorado
	
	public Asesorado deleteAsesorado(long id) {
		Asesorado ases=null;
		if(asesoradoRepository.existsById(id)) {
			ases = asesoradoRepository.findById(id).get();
			asesoradoRepository.deleteById(id);
		}//if existId
		return ases;
	}//deleteAsesorado
	
	public Asesorado addAsesorado(Asesorado asesorado) {
		Optional<Asesorado> tmpAses = asesoradoRepository.findByNombre(asesorado.getNombre());
		if(tmpAses.isEmpty()) {//no se encuentra el producto con ese nombre
			return asesoradoRepository.save(asesorado);
		}else {
			System.out.println("Ya existe el asesorado con el nombre ["
					+ asesorado.getNombre() +"]");
			return null;
		}//else
	}//addAsesorado
	
	public Asesorado updateAsesorado(long id, String nombre, String edad, String nivel_de_estudios,
			String ocupacion, String locacion) {
		Asesorado ases=null;
		if(asesoradoRepository.existsById(id)) {
			ases = asesoradoRepository.findById(id).get();
				if(nombre!= null) ases.setNombre(nombre);
				if(edad!=null) ases.setEdad(edad);
				if (nivel_de_estudios!=null) ases.setNivel_de_estudios(nivel_de_estudios);
				if(ocupacion!=null) ases.setOcupacion(ocupacion);
				if(locacion!=null)ases.setLocacion(locacion);
				asesoradoRepository.save(ases);
		}//existById
		return ases;
	}//updateAsesorado
}//class AsesoradoService
