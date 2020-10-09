package edu.eci.cvds.guice;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import com.google.inject.Guice;
import com.google.inject.Injector;

import edu.eci.cvds.persistence.DecanaturaDAO;
import edu.eci.cvds.persistence.ProgramaDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisDecanaturaDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisProgramaDAO;
import edu.eci.cvds.services.DecanaturaServices;
import edu.eci.cvds.services.impl.DecanaturaServicesImpl;

public class GuiceContextListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		ServletContext servletContext = servletContextEvent.getServletContext();
		servletContext.removeAttribute(Injector.class.getName());
	}

	public void contextInitialized(ServletContextEvent servletContextEvent) {
		Injector injector = Guice.createInjector(new XMLMyBatisModule() {
			@Override
			protected void initialize() {

				install(JdbcHelper.MySQL);

				setEnvironmentId("development");

				setClassPathResource("mybatis-config.xml");

				// Decanatura
                bind(DecanaturaServices.class).to(DecanaturaServicesImpl.class);
                bind(DecanaturaDAO.class).to(MyBatisDecanaturaDAO.class);
				// Programa
                bind(ProgramaDAO.class).to(MyBatisProgramaDAO.class);
			}
		}

		);

		ServletContext servletContext = servletContextEvent.getServletContext();
		servletContext.setAttribute(Injector.class.getName(), injector);
	}

}