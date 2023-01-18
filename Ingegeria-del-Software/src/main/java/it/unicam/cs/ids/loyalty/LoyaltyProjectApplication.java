package it.unicam.cs.ids.loyalty;

import it.unicam.cs.ids.loyalty.Model.GestorePiattaforma;
import it.unicam.cs.ids.loyalty.Model.ProgrammaFedelta;
import it.unicam.cs.ids.loyalty.Model.ProgrammaPunti;

import java.sql.SQLException;
import java.util.Scanner;


public class LoyaltyProjectApplication {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		DB_Controller.init();

System.out.println("Seleziona l'operazione");
System.out.print("1- Aggiungi programma fedelta");
System.out.print("2- Elimina programma fedelta");
switch (provaScannerInt()){
	case 1-> aggiungiProgramma();
	case 2-> eliminaProgramma();
}


	}

	private static void eliminaProgramma() {
		GestorePiattaforma g1= new GestorePiattaforma("djddm","ddjdh", "ddjhf", 22222, "edeif", "ddeifnef");
		System.out.println("Inserire il nome del programma da eliminare");
		String nome = sc.nextLine();
	}

	private static void aggiungiProgramma() throws SQLException {
		GestorePiattaforma g1= new GestorePiattaforma("djddm","ddjdh", "ddjhf", 22222, "edeif", "ddeifnef");
		System.out.println("Inserire il nome");
		String nome = sc.nextLine();
		System.out.println("Inserire la descrizione");
		String descrizione = sc.nextLine();
		ProgrammaPunti programFel= new ProgrammaPunti(nome, descrizione);
		g1.aggiungiProgrammaFedelta(programFel);
		System.out.println("Il programma é stato inserito");
	}


		private static int provaScannerInt(){
			while(true){
				try{
					int intero = sc.nextInt();
					sc.nextLine();
					return intero;
				} catch (Exception e) {
					sc.nextLine();
					System.out.println("Cio' che hai inserito non e' un valore numerico, ritenta ");
				}
			}
		}



}
