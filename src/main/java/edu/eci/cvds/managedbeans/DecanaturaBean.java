package edu.eci.cvds.managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import edu.eci.cvds.entities.Decanatura;
import edu.eci.cvds.services.DecanaturaServices;
import edu.eci.cvds.services.ServicesException;

/**
 * Bean para la interfaz de usuario de las decanaturas
 */
@SuppressWarnings("deprecation")
@ManagedBean(name = "decanaturaBean")
@RequestScoped
public class DecanaturaBean extends BasePageBean {

	@Inject
	private DecanaturaServices decanaturaServices;

	public List<Decanatura> getDecanaturas() throws Exception {
		try {
			return decanaturaServices.listarDecanaturas();
		} catch (ServicesException ex) {

			throw ex;
		}
	}

}
