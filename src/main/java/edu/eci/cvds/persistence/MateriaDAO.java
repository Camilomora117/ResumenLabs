package edu.eci.cvds.persistence;

import edu.eci.cvds.entities.Materia;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MateriaDAO {
    public List<Materia> buscarMateriasPorPrograma( int programaId) throws PersistenceException;

    public List<Materia> buscarMateriasPorSimilares(String palabraClave) throws PersistenceException;
}
