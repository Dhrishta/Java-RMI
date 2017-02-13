package Classe;

import java.util.Scanner;

public class Joueur {

	private String nom ;
	private int points ;
	private Position pos ;
	public Joueur(String nom, int points, Position p1) {
		super();
		this.nom = nom;
		this.points = points;
		this.pos = p1;
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
	public Position getPosition() {
		return pos;
	}
	public void setPosition(Position pos) {
		this.pos = pos;
	} 
	
	public void creationJoeur(String nom){
		System.out.println("Entrez le nom du Joueur !");
        Scanner scan = new Scanner (System.in) ;
        String n = scan.next();
        System.out.println("Bienvenue "+n+"!");
		 	
	}
	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
}
 


