package Classe;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject ;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Serveur extends UnicastRemoteObject implements MudInterface {
 
 private Labyrinthe Labyrinthe1 ;
 private HashMap<String,Joueur> lesjoueurs; 

	
 	
	protected Serveur() throws RemoteException {
		Labyrinthe1 = new Labyrinthe() ;
		Labyrinthe1.createLabyrinthe();
		lesjoueurs = new HashMap<String, Joueur>();
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
	
		
		if (joueurexistdeja(nomP,password)){
			Joueur j = new Joueur(nomP, 10, this.Labyrinthe1.getSalleDepart()) ;
			lesjoueurs.put(nomP, j);
			return true ;

		}
	
	
	return false;
}


@Override
public void affichage() throws RemoteException {
	
	// TODO Auto-generated method stub
	
}


public void deplacementjoueur(String nomJ, String Direction) throws RemoteException {
	
	// TODO Auto-generated method stub
	Joueur j = lesjoueurs.get(nomJ);
	Piece P = j.getSalle1() ; 
	
	switch(Direction) {
	case "N": if(P.getN()!= null){
		if (P == P.getN().getSalle1()) {
			j.setSalle1(P.getN().getSalle2());
			j.
		} 
	
	}
		
		break;
	}

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

@Override
public void deplacementjoueur(Joueur joueur, Position postion) throws RemoteException {
	// TODO Auto-generated method stub
	
}	 
}
