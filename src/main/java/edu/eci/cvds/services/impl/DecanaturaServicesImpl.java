package edu.eci.cvds.services.impl;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Decanatura;
import edu.eci.cvds.entities.Materia;
import edu.eci.cvds.entities.Programa;
import edu.eci.cvds.persistence.DecanaturaDAO;
import edu.eci.cvds.persistence.MateriaDAO;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.ProgramaDAO;
import edu.eci.cvds.services.DecanaturaServices;
import edu.eci.cvds.services.ServicesException;

/**
 * Implementación de {@link DecanaturaServices}
 */
public class DecanaturaServicesImpl implements DecanaturaServices {

	@Inject
	private DecanaturaDAO decanaturaDAO;

	@Inject
	private ProgramaDAO programaDAO;

	@Inject
	private MateriaDAO materiaDAO;

	@Override
	public void crearDecanatura(Decanatura decanatura) throws ServicesException {
		try {
			decanaturaDAO.crear(decanatura);
		} catch (PersistenceException ex) {
			throw new ServicesException("Error creando decanatura:" + ex.getLocalizedMessage(), ex);
		}
	}

	@Override
	public List<Decanatura> listarDecanaturas() throws ServicesException {
		try {
			return decanaturaDAO.listarTodas();
		} catch (PersistenceException ex) {
			throw new ServicesException("Error listando decanaturas:" + ex.getLocalizedMessage(), ex);
		}
	}

	@Override
	public Decanatura buscarDecanatura(int decanaturaId) throws ServicesException {
		try {
			return decanaturaDAO.buscarDecanatura(decanaturaId);
		} catch (PersistenceException ex) {
			throw new ServicesException("Error buscando decanatura:" + ex.getLocalizedMessage(), ex);
		}
	}

	@Override
	public List<Programa> listarProgramas() throws ServicesException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public List<Programa> buscarPorDecanatura(int decanaturaId) throws ServicesException {
		try {
			return programaDAO.buscarPorDecanatura(decanaturaId);
		} catch (PersistenceException ex) {
			throw new ServicesException("Error en la consulta:" + ex.getLocalizedMessage(), ex);
		}
	}

	@Override
	public List<Materia> buscarMateriasPorPrograma(int programaId) throws ServicesException {
		try {
			return materiaDAO.buscarMateriasPorPrograma(programaId);
		}
		catch (PersistenceException ex) {
			throw new ServicesException("Error en la consulta:" + ex.getLocalizedMessage(), ex);
		}
	}

	@Override
	public List<Materia> buscarMateriasPorSimilares(String palabraClave) throws ServicesException {
		try {
			return materiaDAO.buscarMateriasPorSimilares(palabraClave);
		}
		catch (PersistenceException ex) {
			throw new ServicesException("Error en la consulta:" + ex.getLocalizedMessage());
		}
	}

	@Override
	public List<Materia> listarMaterias() throws ServicesException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void crearMateria(Materia materia) throws ServicesException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void eliminarMateria(String mnemonico) throws ServicesException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Programa buscarPrograma(int programaId) throws ServicesException {
		try {
			return programaDAO.buscar(programaId);
		} catch (PersistenceException ex) {
			throw new ServicesException("Error en la consulta:" + ex.getLocalizedMessage(), ex);
		}
	}
}
