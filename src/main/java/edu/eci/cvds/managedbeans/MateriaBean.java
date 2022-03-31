package edu.eci.cvds.managedbeans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import edu.eci.cvds.entities.Decanatura;
import edu.eci.cvds.entities.Materia;
import edu.eci.cvds.entities.Programa;
import edu.eci.cvds.services.DecanaturaServices;
import edu.eci.cvds.services.ServicesException;

import java.util.List;

@SuppressWarnings("deprecation")
@ManagedBean(name = "materiaBean")
@RequestScoped

public class MateriaBean extends BasePageBean{

    @Inject
    private DecanaturaServices decanaturaServices;

    @ManagedProperty(value = "#{param.programa}")
    private Integer programaId;

    private Programa programa;

    private void loadPrograma(){
        try{
            if(programaId!=null){
                programa = decanaturaServices.buscarPrograma(programaId);
            }
        }
        catch (ServicesException e){
            e.printStackTrace();
        }
    }

    public List<Materia> getMaterias() throws Exception {
        try {
            if (programaId==null){
                return decanaturaServices.listarMaterias();
            }
            else {
                return decanaturaServices.buscarMateriasPorPrograma(programaId);
            }
        }
        catch (ServicesException ex) {
            throw ex;
        }
    }

    public Integer getProgramaId(){
        return  programaId;
    }

    public void setProgramaId(Integer programaId){
        this.programaId = programaId;
    }

    public Programa getPrograma() throws Exception{
        if (programa==null && programaId!=null){
            programa = decanaturaServices.buscarPrograma(programaId);
        }

        return programa;
    }

    public void setPrograma(Programa programa){
        this.programa = programa;
    }
}
