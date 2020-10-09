package edu.eci.cvds.persistence.mybatisimpl.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Decanatura;

public interface DecanaturaMapper {

	public void insertarDecanatura(Decanatura decanatura);

	public List<Decanatura> buscarDecanaturas();

	public Decanatura buscarDecanaturas(@Param("decanaturaId") int decanaturaId);

}
