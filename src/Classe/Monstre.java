package Classe;

public class Monstre {

	private String nom ;
	private int points=5; ;
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
	public Monstre(String nom, int points) {
		super();
		this.nom = nom;
		this.points = points;
	}
	
}
