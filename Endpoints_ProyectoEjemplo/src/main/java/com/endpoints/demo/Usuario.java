package com.endpoints.demo;

public class Usuario {
	
	private int id;
	private String apodo;
	private String nombre;
	
	public Usuario() {}
	
	public Usuario(int id, String apodo, String nombre) {
		this.id = id;
		this.apodo = apodo;
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getApodo() {
		return apodo;
	}
	
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
