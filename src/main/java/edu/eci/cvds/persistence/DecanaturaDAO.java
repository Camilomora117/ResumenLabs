package edu.eci.cvds.persistence;

import java.util.List;

import edu.eci.cvds.entities.Decanatura;

public interface DecanaturaDAO {

	public void crear(Decanatura decanatura) throws PersistenceException;

	public List<Decanatura> listarTodas() throws PersistenceException;

	public Decanatura buscarDecanatura(int decanaturaId) throws PersistenceException;
	
}
