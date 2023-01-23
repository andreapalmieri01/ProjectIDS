package it.unicam.cs.ids.loyalty.Controller;

import it.unicam.cs.ids.loyalty.DB_Controller;
import it.unicam.cs.ids.loyalty.Model.*;

import java.sql.ResultSet;
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
            query = "INSERT INTO programpunti (id_program, nome_program, descrizione) VALUES('" + progPunti.getId()+ "','" + progPunti.getNome()+ "','" + progPunti.getDescrizione() +"')";
        }
        if (programFel instanceof ProgrammaLivelli progLivelli){
             query = "INSERT INTO programmalivelli (id, nome, descrizione) VALUES('" + progLivelli.getId()+ "','" + progLivelli.getNome()+ "','" + progLivelli.getDescrizione() +"')";
        }
       DB_Controller.insertQuery(query);
    }

    public List<ProgrammaFedelta> visualizzaProgrammiFedelta() throws SQLException {
       ResultSet resultset= DB_Controller.selectAllFromTable("programpunti");
       while (resultset.next()){
           ProgrammaFedelta progfel= new ProgrammaPunti(resultset.getString("nome_program"),
                   resultset.getInt("id_program"));
           if(progfel instanceof ProgrammaFedelta ){
               this.listaProgrammi.add(progfel);
           }
       }
        return this.listaProgrammi;
    }

    public ProgrammaFedelta findById(int id){
       ProgrammaFedelta programFel=null;
       for (ProgrammaFedelta p: this.listaProgrammi){
           if(p.getId()==id)
                programFel=p;
       }
       if(programFel==null){
           throw new NullPointerException();
       }
       return programFel;
    }

    public boolean deleteById(int id) throws SQLException {
        if(findById(id)==null){
            throw new NullPointerException("programma fedelta non esistente");
        }
        for (ProgrammaFedelta p: this.listaProgrammi){
            if (id== p.getId())
                this.listaProgrammi.remove(p);
            String quary="";
                if(p instanceof ProgrammaPunti pp) {
                     quary = "DELETE FROM programpunti WHERE nome_program='" + pp.getNome() + "'";
                }
                else if(p instanceof ProgrammaLivelli pl) {
                    quary = "DELETE FROM public.programmalivelli WHERE nome='" + pl.getNome() + "';";
                }
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
