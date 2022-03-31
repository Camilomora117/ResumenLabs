package edu.eci.cvds.tests;

import static org.quicktheories.generators.SourceDSL.strings;

import org.quicktheories.core.Gen;

import edu.eci.cvds.entities.Decanatura;
import edu.eci.cvds.entities.Materia;
import edu.eci.cvds.entities.NivelPrograma;
import edu.eci.cvds.entities.Programa;
import org.quicktheories.generators.Generate;
import static org.quicktheories.generators.SourceDSL.integers;

public class Generators {
    static private int nextUserID = 4;
    static private int nextProgram=0;

    static public Gen<Decanatura> decanaturas() {
        return strings().basicLatinAlphabet().ofLengthBetween(10, 50)
                .zip(strings().basicLatinAlphabet().ofLengthBetween(10, 50),
                        strings().basicLatinAlphabet().ofLengthBetween(10, 50),
                        (nombre, decano, paginaWeb) -> {
                            nextUserID++;
                            return new Decanatura(nextUserID, nombre, decano, paginaWeb);
                        });
    }

    static public Gen<Materia> materias(){
        return integers().between(1,7).zip(strings().basicLatinAlphabet().ofLengthBetween(10, 50),
                integers().between(1,10),mnemo(),integers().between(2,4),
                (p,s,nos,nmo,cred)->{

                    return new Materia(nmo, nos, s, p, s, cred);});
        //Materia a=new Materia(mnemonico, nextUserID, nombre, nextUserID, nucleo, nextUserID);

    }

    static public Gen<String> mnemo(){
        return strings().basicLatinAlphabet().ofLengthBetween(4,4)
                .map((nm)-> {
                    return new String(nm);});
    }

    static public Gen<Programa> programsExist(){
        return decanaturas().zip(nivel(),strings().basicLatinAlphabet().ofLengthBetween(10, 50),
                (d,n,s)->{
                    nextProgram++;
                    return new Programa(nextProgram, n, s, s, s, d.getId());});

    }

    static public Gen<NivelPrograma> nivel(){
        return Generate.enumValues(NivelPrograma.class);
    }
}