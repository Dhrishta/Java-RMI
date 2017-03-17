package Classe;

import java.net.MalformedURLException;
import java.rmi.*;
import java.util.Scanner;

public class Client {

	private Scanner n;
	private String nomr; 
	private String password ;
	
	//CONNEXION AVEC NOM JOUEUR 
	public void connexion (MudInterface MUD)
	
	{	
		Menu M1 = new Menu(MUD) ;
		M1.affichageMenu1();
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
	
			//R√©cup√©ration d'un proxy sur l'objet
		
			try {
				MudInterface MUD = (MudInterface)Naming.lookup("//localhost/ServeurMUD");
				System.out.println("Vous êtes connecté au serveur, Bienvenue :) ");
				Client client1 = new Client() ;
				client1.connexion(MUD);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotBoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	

	public String getNomr() {
		return nomr;
	}


	public void setNomr(String nomr) {
		this.nomr = nomr;
	}
 
	public String getpassword(){
		return password ;
		
	}
	
	public void setpassword(String password) {
		this.password = password;
	}

	
	}


