package edu.eci.cvds.managedbeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import edu.eci.cvds.entities.Decanatura;
import edu.eci.cvds.entities.Programa;
import edu.eci.cvds.services.DecanaturaServices;
import edu.eci.cvds.services.ServicesException;

/**
 * Bean para la interfaz de usuario de los programas
 */
@SuppressWarnings("deprecation")
@ManagedBean(name = "programaBean")
@RequestScoped
public class ProgramaBean extends BasePageBean {

	/**
	 * Default generated serial version id
	 */
	private static final long serialVersionUID = -1071897882966043904L;

	@Inject
	private DecanaturaServices decanaturaServices;

	@ManagedProperty(value = "#{param.decanatura}")
	private Integer decanaturaId;

	private Decanatura decanatura;

	private void loadDecanatura() {
		try {
			System.out.println("Carga inicial");
			System.out.println("Carga con " + decanaturaId + " y " + decanaturaServices);
			System.out.println("Carga después");
			if (decanaturaId != null) {
				decanatura = decanaturaServices.buscarDecanatura(decanaturaId);
				System.out.println("Encontró: " + decanatura);
			}
		} catch (ServicesException e) {
			e.printStackTrace();
		}
	}

	public List<Programa> getProgramas() throws Exception {
		try {
			if (decanaturaId == null) {
				return decanaturaServices.listarProgramas();
			} else {
				return decanaturaServices.buscarPorDecanatura(decanaturaId);
			}
		} catch (ServicesException ex) {

			throw ex;
		}
	}

	public Integer getDecanaturaId() {
		return decanaturaId;
	}

	public void setDecanaturaId(Integer decanaturaId) {
		this.decanaturaId = decanaturaId;
	}

	public Decanatura getDecanatura() throws Exception {
		if (decanatura == null && decanaturaId != null) {
			decanatura = decanaturaServices.buscarDecanatura(decanaturaId);
		}
		return decanatura;
	}

	public void setDecanatura(Decanatura decanatura) {
		this.decanatura = decanatura;
	}

}
