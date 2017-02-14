package Classe;

import java.util.Scanner;

public class Joueur {

	private String nom ;
	private int points ;
	private Piece Salle1 ;
	public Joueur (){
		super();
	}
	public Joueur(String nom, int points, Piece Salle1) {
		super();
		this.nom = nom;
		this.points = points;
		this.Salle1 = Salle1;
	}
	public Piece getSalle1() {
		return Salle1;
	}
	public void setSalle1(Piece salle1) {
		Salle1 = salle1;
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
	
	public String creationJoueur(){
	System.out.println("Entrez le nom du Joueur !");
        Scanner scan = new Scanner (System.in) ;
        String n = scan.next();       
        System.out.println("Bienvenue "+n+"!");
        return n;
		 		}
	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
}
 


