package com.babydevs.modelos.model;

public class Asesor {
	private Long id;
	private String nombre; 
	private String descripcion;
	private String habilidad_principal;
	private String habilidades_secundarias;
	private Double tarifa_por_asesoria;
	private String fecha_de_inicio;
	
	private static long total = 0;

	public Asesor(Long id, String nombre, String descripcion, String habilidad_principal,
			String habilidades_secundarias, Double tarifa_por_asesoria, String fecha_de_inicio) {

		this.nombre = nombre;
		this.descripcion = descripcion;
		this.habilidad_principal = habilidad_principal;
		this.habilidades_secundarias = habilidades_secundarias;
		this.tarifa_por_asesoria = tarifa_por_asesoria;
		this.fecha_de_inicio = fecha_de_inicio;
		Asesor.total++;
		this.id = total;
	}//constructor
 
	 public Asesor() {
		 Asesor.total++;
		this.id = total;
	 }//constructor
	
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

	public String getHabilidad_principal() {
		return habilidad_principal;
	}

	public void setHabilidad_principal(String habilidad_principal) {
		this.habilidad_principal = habilidad_principal;
	}

	public String getHabilidades_secundarias() {
		return habilidades_secundarias;
	}

	public void setHabilidades_secundarias(String habilidades_secundarias) {
		this.habilidades_secundarias = habilidades_secundarias;
	}

	public Double getTarifa_por_asesoria() {
		return tarifa_por_asesoria;
	}

	public void setTarifa_por_asesoria(Double tarifa_por_asesoria) {
		this.tarifa_por_asesoria = tarifa_por_asesoria;
	}

	public String getFecha_de_inicio() {
		return fecha_de_inicio;
	}

	public void setFecha_de_inicio(String fecha_de_inicio) {
		this.fecha_de_inicio = fecha_de_inicio;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Asesor [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", habilidad_principal="
				+ habilidad_principal + ", habilidades_secundarias=" + habilidades_secundarias
				+ ", tarifa_por_asesoria=" + tarifa_por_asesoria + ", fecha_de_inicio=" + fecha_de_inicio + "]";
	}//ToString
	
	
	
	
}//classAsesor
