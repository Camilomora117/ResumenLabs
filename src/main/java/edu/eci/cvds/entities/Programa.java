package edu.eci.cvds.entities;

/**
 * Clase que representa un programa
 */
public class Programa {
	private int id;
	private NivelPrograma nivel;
	private String nombre;
	private String paginaWeb;
	private String descripcion;
	private int decanaturaId;

	public Programa() {
		super();
	}

	public Programa(int id, NivelPrograma nivel, String nombre, String paginaWeb, String descripcion, int decanaturaId) {
		this.id = id;
		this.nivel = nivel;
		this.nombre = nombre;
		this.paginaWeb = paginaWeb;
		this.descripcion = descripcion;
		this.decanaturaId = decanaturaId;
	}

	public int getId() {
		return id;
	}

	public NivelPrograma getNivel() {
		return nivel;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPaginaWeb() {
		return paginaWeb;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getDecanaturaId() {
		return decanaturaId;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setNivel(NivelPrograma nivel) {
		this.nivel = nivel;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPaginaWeb(String pagina_web) {
		this.paginaWeb = pagina_web;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setDecanaturaId(int decanaturaId) {
		this.decanaturaId = decanaturaId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Programa [id=" + id + ", nivel=" + nivel + ", nombre=" + nombre + ", pagina_web=" + paginaWeb
				+ ", descripcion=" + descripcion + ", decanaturaId=" + decanaturaId + "]";
	}

}
