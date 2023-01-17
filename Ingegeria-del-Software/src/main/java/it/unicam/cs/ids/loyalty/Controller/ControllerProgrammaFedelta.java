package it.unicam.cs.ids.loyalty.Controller;

import it.unicam.cs.ids.loyalty.DB_Controller;
import it.unicam.cs.ids.loyalty.Model.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ControllerProgrammaFedelta {

    private List<ProgrammaFedelta> listaProgrammi;

    public ControllerProgrammaFedelta() {
        listaProgrammi= new ArrayList<>();
    }

    public void addProgrammaFedelta(ProgrammaFedelta programFel) throws SQLException {
        listaProgrammi.add(programFel);
        String query="";
        if(programFel instanceof ProgrammaPunti){
            query = "INSERT INTO Programma_Fedelta ()";
        }
        if (programFel instanceof ProgrammaLivelli){
             query = "INSERT INTO Programma_Fedelta ()";
        }
        DB_Controller.insertQuery(query);
    }

    public List<ProgrammaFedelta> visualizzaProgrammiFedelta(){
        return this.listaProgrammi;
    }

    public ProgrammaFedelta findById(UUID id){
       ProgrammaFedelta programFel=null;
       for (ProgrammaFedelta p: this.listaProgrammi){
           if(p.getId()==id)
                programFel=p;
       }
       if(programFel==null){
           throw new NullPointerException();
       }
       return programFel;
      /**this.listaProgrammi.stream().filter(p->p.getId().equals(id))
              .reduce();*/
    }

    public boolean deleteById(UUID id){
        for (ProgrammaFedelta p: this.listaProgrammi){
            if (id.equals(p.getId()))
                this.listaProgrammi.remove(p);
                return true;
        }
        return false;
    }

 public void confermaScelta(){
        
 }





}
