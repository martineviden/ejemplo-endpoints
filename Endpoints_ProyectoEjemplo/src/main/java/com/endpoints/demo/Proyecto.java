package com.endpoints.demo;

public class Proyecto {
	
	private int id;
	private String descripcion;
	private String idioma;
	private boolean abierto;
	
	public Proyecto() {}
	
	public Proyecto(int id, String descripcion, String idioma, boolean abierto) {
		this.id = id;
		this.descripcion = descripcion;
		this.idioma = idioma;
		this.abierto = abierto;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getIdioma() {
		return idioma;
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public boolean getAbierto() {
		return abierto;
	}
	
	public void setAbierto(boolean abierto) {
		this.abierto = abierto;
	}
}
