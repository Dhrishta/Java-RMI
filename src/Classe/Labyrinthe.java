package Classe;

import java.util.ArrayList;

public class Labyrinthe {
	private ArrayList <Piece> Salle = new ArrayList <Piece>() ;  		
	private ArrayList<Porte> P = new ArrayList<Porte>();
	private Piece salleDepart ;
public Piece getSalleDepart() {
		return salleDepart;
	}

	public void setSalleDepart(Piece salleDepart) {
		this.salleDepart = salleDepart;
	}

public Labyrinthe() {
		super();
		
	}

public ArrayList<Piece> getSalle() {
	return Salle;
}

public void setSalle(ArrayList<Piece> salle) {
	Salle = salle;
}

public ArrayList<Porte> getP() {
	return P;
}

public void setP(ArrayList<Porte> p) {
	P = p;
}

public void createLabyrinthe(){
 		
 		
 		
 		//Lab.add(e)
 		
 	    //Creation de pieces
		// A corriger	
 		Position p1 = new Position (1,1) ;
 		Piece S1 = new Piece ("La Chambre qui pue la mort",p1) ;
 		this.setSalleDepart(S1);
 		Position p2 = new Position (1,2) ;
		Piece S2 = new Piece ("Le Dongeon du Dragon",p2) ;
		
		//Creation de porte de la piece1_2
		Porte P1_2 = new Porte(S1,S2,p1,p2);
		Position p3 = new Position (1,4) ;
 		Piece S3 = new Piece ("Les Egouts",p3) ;
 		
 		//Creation de porte de la piece1_3
 		Porte P1_3 = new Porte(S1,S3,p1,p3) ;
		
 		//Creation de porte de la piece2_3
 		Porte P2_3 = new Porte(S2,S3,p2,p3);
 		
 		//Creation de la piece 4 et 5
 		Position p4 = new Position (1,5) ;
 		Piece S4 = new Piece ("Les toilettes débordantes",p4) ;
		Position p5 = new Position (2,1) ;
 		Piece S5 = new Piece ("La chambre de Donald Duck",p5) ;
 		
 		//Creation de la porte de la piece 2_4,3_4,3_5
 		Porte P2_4 = new Porte(S2,S4,p2,p4);
 		Porte P3_4 = new Porte(S3,S4,p3,p4);
 		Porte P3_5 = new Porte(S3,S5,p3,p5);

		//Sauvegarde dans l'array Lab
		this.add(S1,P1_2) ;
        this.add(S1, P1_3);
        this.add(S2,P2_3) ;
        this.add(S2, P2_4);
        this.add(S3, P3_4);
        this.add(S3,P3_5);			
 			
 		}

private void add(Piece s1, Porte p1_2) {
	// TODO Auto-generated method stub
	
}
 
 		

	
}
