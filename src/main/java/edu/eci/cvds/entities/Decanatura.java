package edu.eci.cvds.entities;

import java.util.List;

/**
 * Clase que representaa una decanatura
 */
public class Decanatura {

	private int id;
	private String nombre;
	private String decano;
	private String paginaWeb;

	public Decanatura() {
		super();
	}

	public Decanatura(int id, String nombre, String decano, String paginaWeb) {
		this.id = id;
		this.nombre = nombre;
		this.decano = decano;
		this.paginaWeb = paginaWeb;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDecano() {
		return decano;
	}

	public String getPaginaWeb() {
		return paginaWeb;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDecano(String decano) {
		this.decano = decano;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Decanatura [id=" + id + ", nombre=" + nombre + ", decano=" + decano + ", paginaWeb=" + paginaWeb + "]";
	}
}
