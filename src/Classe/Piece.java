package Classe;

import java.util.Scanner;

public class Piece {
	private String nom ;
	private int numero ;
	
	public Piece(String nom, int numero) {
		super();
		this.nom = nom;
		this.numero = numero;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	
	public void creationJoeur(String nom){
		System.out.println("Entrez le nom du Joueur !");
        Scanner scan = new Scanner (System.in) ;
        String n = scan.next();
        System.out.println("Bienvenue +n+ !");
		 	
	}
}
 