package Classe;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject ;
import java.util.ArrayList;
import java.util.Scanner;

public class Serveur extends UnicastRemoteObject implements MudInterface {
 
private ArrayList <Joueur> listejoueur ;

	private static Remote obj;
	protected Serveur() throws RemoteException {
		super();
		listejoueur=new ArrayList<>() ;
		// TODO Auto-generated constructor stub
	}

	
	
	
		
  
 public static void main(String arg []) throws Exception {
	 //Démarrer le rmi registry
	 LocateRegistry.createRegistry(1099);
	 //Gestionnaire de sécurité
	 //System.setSecurityManager(new RMISecurityManager());
	 Naming.rebind("Serveur", obj) ;
	 System.out.println("Welcome to the Dungeons of Hogwarts!");
 }



@Override
public boolean authentificationreussi(String nomP,String password) throws RemoteException
{
	// TODO Auto-generated method stub
	
	
		if (joueurexistdeja(nomP,password))
		return true ;
	
	
	return false;
}


@Override
public boolean creationreussi(String nomP,String password) throws RemoteException
{
	// TODO Auto-generated method stub
	System.out.println("Entrez le nom du joueur !");
	
		if (!joueurexistdeja( nomP,password)) 
		{
			Joueur r = new Joueur(nomP,1,"10",password) ;
			
			System.out.println("Bienvenue"+r);
		}

	return false;
}



@Override
public boolean joueurexistdeja(String nomP,String password) throws RemoteException

{
	for ( Joueur j : listejoueur)
	{
		if  (j.getNom().equals(nomP) && (j.getPassword().equals(password)));
		return true ;
	}
	
	// TODO Auto-generated method stub
	return false;
}



@Override
public void deplacementjoueur(String nom, char position) throws RemoteException {
	// TODO Auto-generated method stub
	
}



public ArrayList getListejoueur() {
	return listejoueur;
}



public void setListejoueur(ArrayList listejoueur) {
	this.listejoueur = listejoueur;
}	 
}
