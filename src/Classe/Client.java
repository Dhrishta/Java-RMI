package Classe;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	private static seDeplacer Objetdirection;

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		try {
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
