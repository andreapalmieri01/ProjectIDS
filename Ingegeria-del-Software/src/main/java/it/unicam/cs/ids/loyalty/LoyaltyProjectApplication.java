package it.unicam.cs.ids.loyalty;

import it.unicam.cs.ids.loyalty.Controller.ControllerProgrammaFedelta;
import it.unicam.cs.ids.loyalty.Model.GestorePiattaforma;
import it.unicam.cs.ids.loyalty.Model.ProgrammaFedelta;
import it.unicam.cs.ids.loyalty.Model.ProgrammaLivelli;
import it.unicam.cs.ids.loyalty.Model.ProgrammaPunti;

import java.sql.SQLException;
import java.util.Scanner;


public class LoyaltyProjectApplication {

	private static final Scanner sc = new Scanner(System.in);
	private static final ControllerProgrammaFedelta controllerGestore= new ControllerProgrammaFedelta();

	public static void main(String[] args) throws SQLException {
		DB_Controller.init();
		/**System.out.println("Welcome to Loyalty Platform!!/n");
		System.out.println("Seleziona il numero per scegliere l'azione da eseguire: /n");
		System.out.println("1-Effettua il login");
		System.out.println("2-Effettua la registrazione");
	switch (provaScannerInt()){
		case 1->login();
		case 2->registazione();
	}
	}

	private static void registazione() {
	}

	private static void login() {
		System.out.println("Seleziona il numero per scegliere il ruolo: /n");
		System.out.println("1-Cliente");
		System.out.println("2-Titolare Punto Vendita");
		System.out.println("3-Commesso Punto Vendita");
		System.out.println("4-gestore Piattaforma");
		System.out.println("5-per uscire dalla piattaforma");
		switch (provaScannerInt()){
			case 1->homeClienti();
			case 2->homeTitolare();
			case 3->homeCommesso();
			case 4->homeGestore();
			case 5->System.out.println("Loyalty platform ti ringrazia e ti augura un buon proseguimento:)");
		}
	}

	private static void homeGestore() {

	}

	private static void homeCommesso() {

	}

	private static void homeTitolare() {

	}

	private static void homeClienti() {

	}**/

		System.out.println("Seleziona il numero per scegliere l'azione da eseguire: ");
		System.out.println("1- Aggiungere un programma fedelta");
		System.out.println("2- Elimina programma fedelta");
		switch (provaScannerInt()){
			case 1->aggiungi();
			case 2->elimina();
		}

	}

	private static void elimina() throws SQLException {
		System.out.println("Inserire il nome");
		String nome = sc.nextLine();
		System.out.println("Inserire id del programma");
		int id = sc.nextInt();
		ProgrammaFedelta programmaFedelta= new ProgrammaFedelta(nome, id);
		controllerGestore.visualizzaProgrammiFedelta();
		controllerGestore.deleteById(programmaFedelta.getId());
		System.out.println("IL programma"+nome+" é stato eliminato");
	}

	private static void aggiungi() throws SQLException {
		System.out.println("Inserire il nome");
		String nome = sc.nextLine();
		System.out.println("Inserire la descrizione");
		String descrizione = sc.nextLine();
		ProgrammaPunti programFel= new ProgrammaPunti(nome, descrizione);
		controllerGestore.addProgrammaFedelta(programFel);
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
