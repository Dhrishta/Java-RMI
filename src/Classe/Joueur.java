package Classe;

import java.util.Scanner;

public class Joueur {

	private String nom ;
	private int points ;
	private String position ;
	public Joueur(String nom, int points, String position) {
		super();
		this.nom = nom;
		this.points = points;
		this.position = position;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	} 
	
	public void creationJoeur(String nom){
		System.out.println("Entrez le nom du Joueur !");
        Scanner scan = new Scanner (System.in) ;
        String n = scan.next();
        System.out.println("Bienvenue +n+ !");
		 	
	}
}
 


