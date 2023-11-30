package com.babydevs.ecommerce.model;

public class Asesores {
	private Long id;
	private String nombre;
	private String descripcion;
	private String imagen;
	private Double precio;
	
	private static long total = 0;

	public Asesores(String nombre, String descripcion, String imagen, Double precio) {
		
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		Asesores.total++;
		this.precio = precio;
		this.id = total;
	}//Constructor 
	
	public Asesores() {
		this.precio = precio;
		this.id = total;
	}// Constructor

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Long getId() {
		return id;
	} // Encapsular

	@Override
	public String toString() {
		return "Asesores [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen
				+ ",, precio=" + precio + "]";
	}//toString
	
	

	
	
	


}// Class Asesores


