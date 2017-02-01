package Classe;

import java.rmi.*;

public class Client {
	//public interface Client extends Remote {
	//private static seDeplacer Objetdirection;

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		try {
			//Récupération d'un proxy sur l'objet
			Objetdirection = (seDeplacer)Naming.lookup("//localhost/serveur/1111");
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
	}
}
