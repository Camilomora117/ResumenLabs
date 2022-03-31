package edu.eci.cvds.persistence.mybatisimpl.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Materia;

public interface MateriaMapper {

    List<Materia>buscarMateriasPorPrograma(@Param("programa") int programaId);

    List<Materia>buscarMateriasPorSimilares(@Param("materia") String palabraClave);
}
