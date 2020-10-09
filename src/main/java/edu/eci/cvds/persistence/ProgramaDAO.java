package edu.eci.cvds.persistence;

import java.util.List;

import edu.eci.cvds.entities.Programa;

public interface ProgramaDAO {

	public List<Programa> buscarTodos() throws PersistenceException;

	public void guardar(Programa p) throws PersistenceException;

	public void actualizar(Programa p) throws PersistenceException;

	public Programa buscar(int programaId) throws PersistenceException;

	public List<Programa> buscarPorDecanatura(int decanaturaId) throws PersistenceException;
}
