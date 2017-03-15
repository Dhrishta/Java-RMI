package Classe;

import java.rmi.*;

public interface MudInterface extends java.rmi.Remote {


	
public boolean authentificationreussi (String nomP , String password ) throws RemoteException ;
public boolean creationreussi (String nomP ,String password ) throws RemoteException ;
public boolean joueurexistdeja  (String nomP , String password) throws RemoteException ;
public void affichage() throws RemoteException ;
void deplacementjoueur(Joueur joueur, Position postion) throws RemoteException;
}
