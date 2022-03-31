/*
 * Copyright (C) 2016 hcadavid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.cvds.persistence.mybatisimpl;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Programa;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.ProgramaDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.MateriaMapper;
import edu.eci.cvds.persistence.mybatisimpl.mappers.ProgramaMapper;

/**
 * Implementación de {@link ProgramaDAO}
 */
public class MyBatisProgramaDAO implements ProgramaDAO {

	@Inject
	private ProgramaMapper programaMapper;


	@Override
	public List<Programa> buscarTodos() throws PersistenceException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void guardar(Programa p) throws PersistenceException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void actualizar(Programa p) throws PersistenceException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Programa buscar(int programaId) throws PersistenceException {
		try {
			return programaMapper.buscarPrograma(programaId);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new org.apache.ibatis.exceptions.PersistenceException("Load all persistence error");
		}
	}

	@Override
	public List<Programa> buscarPorDecanatura(int decanaturaId) throws PersistenceException {
		return programaMapper.buscarPorDecanatura(decanaturaId);
	}
}
