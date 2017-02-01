package Classe;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject ;

public class Serveur extends UnicastRemoteObject implements MudInterface {

	private static Remote obj;
	protected Serveur() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String MudInterface() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	
	//public void piecesvoisine () throws RemoteException{
		
   //	}
 public static void main(String arg []) throws Exception {
	 //Démarrer le rmi registry
	 LocateRegistry.createRegistry(1099);
	 //Gestionnaire de sécurité
	 //System.setSecurityManager(new RMISecurityManager());
	 Naming.rebind("Serveur", obj) ;
	 System.out.println("Welcome to the Dungeons of Hogwarts!");
 }	 
}
