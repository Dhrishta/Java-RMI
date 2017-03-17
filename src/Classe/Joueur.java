package Classe;

import java.util.Scanner;

public class Joueur {

	private String nom ;
	private int points ;
	private int position ;
	
	public Joueur(String nom, int points, int position) {
		super();
		this.nom = nom;
		this.points = points;
		this.position = position;
	}
	public int getposition() {
		return position;
	}
	public void setposition(int position) {
		position = position;
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
	

	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
}
 


