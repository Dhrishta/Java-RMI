package Classe;

import java.rmi.*;

public interface MudInterface extends java.rmi.Remote {


	
/*public boolean authentificationreussi (String nomP , String password ) throws RemoteException ;
public boolean creationreussi (String nomP ,String password ) throws RemoteException ;
public boolean joueurexistdeja  (String nomP , String password) throws RemoteException ;
public void affichage() throws RemoteException ;*/
int deplacementjoueur(String nomJ, String Direction) throws RemoteException ;

	String getPiece(String nomJ )throws RemoteException;
	
	void creationJoueur(String nomJ )throws RemoteException;
}
