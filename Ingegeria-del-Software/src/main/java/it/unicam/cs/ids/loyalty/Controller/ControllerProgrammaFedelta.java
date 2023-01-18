package it.unicam.cs.ids.loyalty.Controller;

import it.unicam.cs.ids.loyalty.DB_Controller;
import it.unicam.cs.ids.loyalty.Model.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ControllerProgrammaFedelta {

    private DB_Controller db_controller;

    private List<ProgrammaFedelta> listaProgrammi;

    public ControllerProgrammaFedelta() {
        listaProgrammi= new ArrayList<>();
    }

    public void addProgrammaFedelta(ProgrammaFedelta programFel) throws SQLException {
        listaProgrammi.add(programFel);
        String query="";
        if(programFel instanceof ProgrammaPunti progPunti){
            query = "INSERT INTO programmapunti (id, nome, descrizione)" +
                    "Values("+progPunti.getId()+", "+progPunti.getNome()+", "+progPunti.getDescrizione()+")";
        }
        if (programFel instanceof ProgrammaLivelli progLivelli){
             query = "INSERT INTO ProgrammaLivelli (id, nome, descrizione)" +
                     "Values("+progLivelli.getId()+", "+progLivelli.getNome()+", "+progLivelli.getDescrizione()+")";
        }
        DB_Controller.insertQuery(query);
    }

    public List<ProgrammaFedelta> visualizzaProgrammiFedelta() throws SQLException {
        DB_Controller.selectAllFromTable("programmiFedelta");
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

    public boolean deleteById(UUID id) throws SQLException {
        if(findById(id)==null){
            throw new NullPointerException("programma fedelta non esistente");
        }
        for (ProgrammaFedelta p: this.listaProgrammi){
            if (id.equals(p.getId()))
                this.listaProgrammi.remove(p);
                String quary="DELETE id FROM programmaFedelta WHERE id="+id+"";
                DB_Controller.removeQuery(quary);
                return true;
        }
        return false;
    }



 public void confermaScelta(){
        
 }


    public void addProgrammiTitolari(TitolarePuntoVendita t) throws SQLException, DateMistake {
       String query="SELECT nomePuntoVendita FROM programmiTitolari WHERE nomePuntoVendita="+t.getNome()+"";
       if(DB_Controller.getNumberRows(query)<listaProgrammi.size()){
           String addQuery="INSERT INTO programmiTitolari()";
           DB_Controller.insertQuery(addQuery);
       }else{
           throw new DateMistake("Raggiunto limite massimo dei programmi che puoi aggiungere");
       }
    }


}
