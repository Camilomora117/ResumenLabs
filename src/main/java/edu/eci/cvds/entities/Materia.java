package edu.eci.cvds.entities;

/**
 * Clase que representa una materia
 */
public class Materia {

	private String mnemonico;
	private int semestre;
	private String nombre;
	private int programaId;
	private String nucleo;
	private int creditos;

	public Materia(String mnemonico, int semestre, String nombre, int programaId, String nucleo, int creditos) {
		this.mnemonico = mnemonico;
		this.semestre = semestre;
		this.nombre = nombre;
		this.programaId = programaId;
		this.nucleo = nucleo;
		this.creditos = creditos;
	}

	public String getMnemonico() {
		return mnemonico;
	}

	public String getNombre() {
		return nombre;
	}

	public int getProgramaId() {
		return programaId;
	}

	public String getNucleo() {
		return nucleo;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setMnemonico(String mnemonico) {
		this.mnemonico = mnemonico;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setProgramaId(int programaId) {
		this.programaId = programaId;
	}

	public void setNucleo(String nucleo) {
		this.nucleo = nucleo;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Materia [mnemonico=" + mnemonico + ", semestre=" + semestre + ", nombre=" + nombre + ", programaId="
				+ programaId + ", nucleo=" + nucleo + ", creditos=" + creditos + "]";
	}

}
