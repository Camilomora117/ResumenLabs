package edu.eci.cvds.test;

import static org.quicktheories.QuickTheory.qt;

import java.sql.SQLException;

import edu.eci.cvds.test.TestBase;
import org.junit.Test;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Decanatura;
import edu.eci.cvds.entities.Programa;
import edu.eci.cvds.services.DecanaturaServices;
import edu.eci.cvds.services.ServicesException;
import static edu.eci.cvds.tests.Generators.materias;
import static org.quicktheories.generators.SourceDSL.integers;

/**
 * Clase de prueba para {@link DecanaturaServices}
 */
public class DecanaturaServiceTest extends TestBase {

    @Inject
    private DecanaturaServices decanaturaServices;

    @Test
    public void pruebaCeroTest() throws SQLException, ServicesException {
        //qt().forAll(edu.eci.cvds.tests.Generators.decanaturas()).check((decanatura) -> {
         //   try {
        //       decanaturaServices.crearDecanatura(decanatura);
            //
        //      for (Decanatura dec : decanaturaServices.listarDecanaturas()) {
        //           if (decanatura.getNombre().equals(dec.getNombre())) {
        //               //               return true;
        //           }
    //      }

        //       return false;
        //  } catch (ServicesException ex) {
        //        ex.printStackTrace();
        //       return false;
        //   }

        //  });
    }

    @Test
    public void buscarMateriasPorProgramaTest(){
        //qt().forAll(materias()).check((materia) -> {
            // try {
                //   decanaturaServices.crearMateria(materia);
                //    return true;
                //  } catch (ServicesException ex) {
                //         System.out.println(ex.getMessage());
                //    return false;
                //   }

            //});
        // qt().forAll(integers().between(1,7)).check((proid) -> {
        //   try {
        //       decanaturaServices.buscarMateriasPorPrograma(proid);
        //       return true;
        //} catch (ServicesException ex) {
        //      System.out.println(ex.getMessage());
        //       return false;
        //    }

        //});
    }
}