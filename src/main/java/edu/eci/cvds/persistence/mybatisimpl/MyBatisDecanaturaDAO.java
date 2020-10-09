package edu.eci.cvds.persistence.mybatisimpl;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Decanatura;
import edu.eci.cvds.persistence.DecanaturaDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.DecanaturaMapper;

/**
 * Implementación de {@link DecanaturaDAO}
 */
public class MyBatisDecanaturaDAO implements DecanaturaDAO {

	@Inject
	private DecanaturaMapper decanaturaMapper;

	@Override
	public void crear(Decanatura decanatura) throws edu.eci.cvds.persistence.PersistenceException {
		try {
			decanaturaMapper.insertarDecanatura(decanatura);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistenceException("Error insertando decanatura");
		}
	}

	@Override
	public List<Decanatura> listarTodas() throws PersistenceException {
		try {
			return decanaturaMapper.buscarDecanaturas();
		} catch (Exception e) {
			throw new PersistenceException("Load all persistence error");
		}
	}

	@Override
	public Decanatura buscarDecanatura(int decanaturaId) throws PersistenceException {
		try {
			return decanaturaMapper.buscarDecanaturas(decanaturaId);
		} catch (Exception e) {
			throw new PersistenceException("Load all persistence error");
		}
	}

}
