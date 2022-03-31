package edu.eci.cvds.persistence.mybatisimpl;

import edu.eci.cvds.entities.Materia;
import edu.eci.cvds.persistence.MateriaDAO;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.mybatisimpl.mappers.MateriaMapper;

import javax.inject.Inject;
import java.util.List;

public class MyBatisMateriaDAO implements MateriaDAO {
    @Inject
    private MateriaMapper materiaMapper;

    @Override
    public List<Materia> buscarMateriasPorPrograma(int programaId) throws PersistenceException {
        try {
            return materiaMapper.buscarMateriasPorPrograma(programaId);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            throw new PersistenceException("Load all persistance error");
        }
    }

    @Override
    public List<Materia> buscarMateriasPorSimilares(String palabraClave) throws PersistenceException {
        try {
            return materiaMapper.buscarMateriasPorSimilares(palabraClave);
        }
        catch (Exception e) {
            throw new PersistenceException("Load all persistance error");
        }
    }
}
