package Classe;

import java.net.MalformedURLException;
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
		
  
 public static void main(String arg [])  {
	 //Démarrer le rmi registry
	 try {
		LocateRegistry.createRegistry(1099);
		//Gestionnaire de sécurité
		 //System.setSecurityManager(new RMISecurityManager());
		 Serveur obj = new Serveur();
		 Naming.rebind("ServeurMUD", obj) ;
		 System.out.println("Serveur est connecté!");
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
 }


/*public boolean authentificationreussi(String nomP,String password) throws RemoteException
{
	// TODO Auto-generated method stub
	
		
		if (joueurexistdeja(nomP,password)){
			Joueur j = new Joueur(nomP, 10, this.Labyrinthe1.getSalleDepart()) ;
			lesjoueurs.put(nomP, j);
			return true ;

		}
	
	
	return false;
}*/




	public void creationJoueur(String nomJ) throws RemoteException{
	  this.lesjoueurs.put(nomJ, new Joueur(nomJ, 10,1));
	  System.out.println("Creation Joueur Réussi!");
   }

	public int deplacementjoueur(String nomJ, String direction) throws RemoteException {
		
		// TODO Auto-generated method stub
		Joueur j = lesjoueurs.get(nomJ);
		int p = j.getposition(); 
		ArrayList<Porte> listePortes = Labyrinthe1.getSalle().get(p).getListsortie();
		
		for ( Porte sortie: listePortes ){
			System.out.println(p+sortie.getOrientation()+direction);
			
			if( sortie.getOrientation().equals(direction) )// si il y a possibilité de sortir 
			{
				System.out.println("addr salle 2" + sortie.getSalle2());
				
				if (sortie.getSalle2()== null){
					System.out.println("True");
				}
				else
					System.out.println("salle null");
					sortie.getSalle2().getNumero();
				System.out.println(j.getNom());
				
					j.setposition(sortie.getSalle2().getNumero()); 
					System.out.print("bien jouer tu es sorti de la salle");
					return 0;
			}
		
		}
		System.out.print("non sa ne marche pas");
		return -1;
	
	}


	@Override
	public String getPiece(String nomJ) throws RemoteException {
		// TODO Auto-generated method stub
		Joueur j = lesjoueurs.get(nomJ);
		int p = j.getposition(); 
		
		return Labyrinthe1.getSalle().get(p).getIdPiece();
	}


}
