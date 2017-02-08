package Classe;

import java.net.MalformedURLException;
import java.rmi.*;
import java.util.Scanner;

public class Client {
	private static MudInterface Objetdirection;
	private Scanner n;
	private String nomr; 
	private String password ;

	//CONNEXION AVEC NOM JOUEUR 
	public void connexion (String nomP, String password)
	
	{	
		System.out.println("Entrez votre nom :) ");
		n = new Scanner (System.in);
		setNomr(n.nextLine());
		
		System.out.println("Entrez votre password :) ");
		Scanner p = new Scanner (System.in);
		setpassword(p.nextLine());
		
		try {
			
			Objetdirection.authentificationreussi(nomP , password) ;
			
			if (Objetdirection.authentificationreussi(nomP ,password))
			{
			System.out.println("Bonjour connexion reussi:D ");
			}
			else
			{
			System.out.println("connexion echouÈe rentrez vos id ");
			}
				
			} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
	}
	
	//
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		try {
			//R√©cup√©ration d'un proxy sur l'objet
			setObjetdirection((MudInterface)Naming.lookup("//localhost/serveur/1111"));
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

	public static MudInterface getObjetdirection() {
		return Objetdirection;
	}


	public static void setObjetdirection(MudInterface objetdirection) {
		Objetdirection = objetdirection;
	}
	
	
	}


