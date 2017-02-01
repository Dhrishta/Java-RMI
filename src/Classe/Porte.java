package Classe;

public class Porte {
	private Piece Salle1 ; //La sortie fait référence à 2 pièces
	private Piece Salle2 ;
	private Position Post1 ;//La position de la sortie par rapport à la piece1
	private Position Post2 ;// La position de la sortie par rapport à la pièce2
	public Porte(Piece salle1, Piece salle2, Position post1, Position post2) {
		super();
		Salle1 = salle1;
		Salle2 = salle2;
		Post1 = post1;
		Post2 = post2;
	}
	public Piece getSalle1() {
		return Salle1;
	}
	public void setSalle1(Piece salle1) {
		Salle1 = salle1;
	}
	public Piece getSalle2() {
		return Salle2;
	}
	public void setSalle2(Piece salle2) {
		Salle2 = salle2;
	}
	public Position getPost1() {
		return Post1;
	}
	public void setPost1(Position post1) {
		Post1 = post1;
	}
	public Position getPost2() {
		return Post2;
	}
	public void setPost2(Position post2) {
		Post2 = post2;
	}

}