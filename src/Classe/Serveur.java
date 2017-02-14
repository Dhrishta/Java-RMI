package Classe;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject ;
import java.util.ArrayList;
import java.util.Scanner;

public class Serveur extends UnicastRemoteObject implements MudInterface {
 
 

	
	protected Serveur() throws RemoteException {
		
		// TODO Auto-generated constructor stub
	}

	
	
private static final long serialVersionUID = 1L ;
		
  
 public static void main(String arg []) throws Exception {
	 //Démarrer le rmi registry
	 LocateRegistry.createRegistry(1099);
	 //Gestionnaire de sécurité
	 //System.setSecurityManager(new RMISecurityManager());
	 Serveur obj = new Serveur();
	 Naming.rebind("ServeurMUD", obj) ;
	 System.out.println("Serveur est connecté!");
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
public void affichage() throws RemoteException {
	// TODO Auto-generated method stub
	
}


@Override
public void deplacementjoueur(String nomP, char position) throws RemoteException {
	// TODO Auto-generated method stub
	
}

@Override
public boolean creationreussi(String nomP, String password) throws RemoteException {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean joueurexistdeja(String nomP, String password) throws RemoteException {
	// TODO Auto-generated method stub
	return false;
}	 
}
