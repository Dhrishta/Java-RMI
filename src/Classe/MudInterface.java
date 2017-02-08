package Classe;

import java.rmi.*;

public interface MudInterface extends java.rmi.Remote {


	
public boolean authentificationreussi (String nomP , String password ) throws RemoteException ;
public boolean creationreussi (String nomP ,String password ) throws RemoteException ;
public boolean joueurexistdeja  (String nomP , String password) throws RemoteException ;
public void deplacementjoueur (String nomP , char position) throws RemoteException ;
}
