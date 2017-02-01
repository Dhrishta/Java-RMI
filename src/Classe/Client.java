package Classe;

import java.net.MalformedURLException;
import java.rmi.*;

public class Client {
	private static MudInterface Objetdirection;

	//public interface Client extends Remote {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		try {
			//Récupération d'un proxy sur l'objet
			Objetdirection = (MudInterface)Naming.lookup("//localhost/serveur/1111");
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

