package edu.eci.cvds.services;

import java.util.List;

import edu.eci.cvds.entities.Decanatura;
import edu.eci.cvds.entities.Materia;
import edu.eci.cvds.entities.Programa;

public interface DecanaturaServices {

	/**
	 * Crear una decanatura
	 * 
	 * @param decanatura
	 * 
	 * @throws ServicesException
	 */
	public void crearDecanatura(Decanatura decanatura) throws ServicesException;

	/**
	 * Consultar todas las decanaturas
	 * 
	 * @return la lista de decanaturas
	 * @throws ServicesException
	 */
	public List<Decanatura> listarDecanaturas() throws ServicesException;

	/**
	 * Consultar una decanatura por id
	 * 
	 * @param decanaturaId el id de la decanatura
	 * @return la decanatura encontrada
	 * @throws ServicesException
	 */
	public Decanatura buscarDecanatura(int decanaturaId) throws ServicesException;

	/**
	 * Consultar todos los programas
	 * 
	 * @return la lista de programas
	 * @throws ServicesException
	 */
	public List<Programa> listarProgramas() throws ServicesException;

	/**
	 * Consultar todos los programas a partir de un id de decanatura
	 * 
	 * @param decanaturaId el id de la decanatura
	 * @return la lista de programas
	 * @throws ServicesException
	 */
	public List<Programa> buscarPorDecanatura(int decanaturaId) throws ServicesException;

	/**
	 * Consultar todas las materias a partir de un id de programa
	 * 
	 * @param programaId el id del programa
	 * @return la lista de materias
	 * @throws ServicesException
	 */
	public List<Materia> buscarMateriasPorPrograma(int programaId) throws ServicesException;

	/**
	 * Consultar todas las materias por una "búsqueda de similares" basado en el
	 * nombre de la materia.
	 *
	 * @param palabraClave la palabra clave a coincidir con el nombre de la
	 *            materia
	 * @return la lista de materias que coinciden
	 * @throws ServicesException
	 */
	public List<Materia> buscarMateriasPorSimilares(String palabraClave) throws ServicesException;

	/**
	 * Consultar todas las materias
	 *
	 * @return la lista de materiasg
	 * @throws ServicesException
	 */
	public List<Materia> listarMaterias() throws ServicesException;

	/**
	 * Crear una materia
	 * 
	 * @param materia
	 * 
	 * @throws ServicesException
	 */
	public void crearMateria(Materia materia) throws ServicesException;

	/**
	 * Eliminar una materia por su mnemónico
	 * 
	 * @param mnemonico el mnemónico de la materia a eliminar
	 * @throws ServicesException
	 */
	public void eliminarMateria(String mnemonico) throws ServicesException;

	/**
	 * Consultar un programa por el id
	 * 
	 * @param programaId el id del programa
	 * @return el programa
	 * @throws ServicesException
	 */
	public Programa buscarPrograma(int programaId) throws ServicesException;

}
