package edu.eci.cvds.test;

import org.junit.Before;
import org.mybatis.guice.XMLMyBatisModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

import edu.eci.cvds.persistence.ProgramaDAO;
import edu.eci.cvds.persistence.DecanaturaDAO;
import edu.eci.cvds.persistence.MateriaDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisProgramaDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisDecanaturaDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisMateriaDAO;
import edu.eci.cvds.services.DecanaturaServices;
import edu.eci.cvds.services.impl.DecanaturaServicesImpl;

public class TestBase {
    protected Injector injector = Guice.createInjector(new XMLMyBatisModule() {
        @Override
        protected void initialize() {
            setEnvironmentId("test");
            setClassPathResource("mybatis-config-h2.xml");

            bind(DecanaturaServices.class).to(DecanaturaServicesImpl.class);
            bind(DecanaturaDAO.class).to(MyBatisDecanaturaDAO.class);
            bind(ProgramaDAO.class).to(MyBatisProgramaDAO.class);
            bind(MateriaDAO.class).to(MyBatisMateriaDAO.class);
        }
    });

    @Before
    public void setup() {
        injector.injectMembers(this);
    }
}