package Classe;

import java.util.ArrayList;

public class Labyrinthe {
	private ArrayList <Piece> listeSalle = new ArrayList <Piece>() ;  		
	private ArrayList<Porte> listePortes = new ArrayList<Porte>();
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
	return listeSalle;
}

public void setSalle(ArrayList<Piece> salle) {
	listeSalle = salle;
}

public ArrayList<Porte> getP() {
	return listePortes;
}

public void setP(ArrayList<Porte> p) {
	listePortes = p;
}

public void createLabyrinthe(){
 		
 
        //Création des Pièces du Labyrinthe
 	
 		Piece S1 = new Piece ("La Chambre qui pue la mort",1) ;
 		listeSalle.add(S1);
 		//Salle de départ = Salle 1
 		this.setSalleDepart(S1);
		Piece S2 = new Piece ("Le Dongeon du Dragon",2) ;
		listeSalle.add(S2);
 		Piece S3 = new Piece ("Les Egouts",3) ;
		listeSalle.add(S3);
 		Piece S4 = new Piece ("Les toilettes débordantes",4) ;
		listeSalle.add(S4);
 		Piece S5 = new Piece ("La chambre de Donald Duck",5) ;
		listeSalle.add(S5);
		Piece S6 = new Piece("Le gymnase",6);
		listeSalle.add(S6);
 		Piece S7 = new Piece("Les catacombes de Mordor", 7); 		
		listeSalle.add(S7);	
 		Piece S8 = new Piece("Les catacombes de Mordor", 8);
		listeSalle.add(S8);	
 		Piece S9 = new Piece("La maison de l'araignée", 9);
		listeSalle.add(S9);	
		
 		//Creation des portes
		//Creation de portes de la piece 1 
 		Porte P1_2 = new Porte(S1,S2,"E"); 		
 		Porte P1_4 = new Porte(S1,S4,"S");
 		listePortes.add(P1_2);
 		listePortes.add(P1_4);
 		S1.addPorte(P1_2);
 		S1.addPorte(P1_4);
 		//Creation de portes de la piece 2
 		Porte P2_1 = new Porte(S2,S1,"W");
 		Porte P2_3 = new Porte(S2,S3,"E");
 		Porte P2_5 = new Porte(S2,S5,"S");
 		listePortes.add(P2_1);
 		listePortes.add(P2_3);
 		listePortes.add(P2_5);
 		S2.addPorte(P2_1);
 		S2.addPorte(P2_3);
 		S2.addPorte(P2_5);
 		//Creation de portes de la piece 3
 		Porte P3_2 = new Porte(S3,S2,"W");
 		Porte P3_6 = new Porte(S3,S6,"S");
 		listePortes.add(P1_2);
 		listePortes.add(P1_4);
		
 		S3.addPorte(P3_2);
 		S3.addPorte(P3_6);
 		//Creation de portes de la piece 4
 		Porte P4_1 = new Porte(S4,S1,"N");
 		Porte P4_5 = new Porte(S4,S5,"E");
 		Porte P4_7 = new Porte(S4,S7,"S");
 		S4.addPorte(P4_1);
 		S4.addPorte(P4_5);
 		S4.addPorte(P4_7);
        //Creation de portes de la piece 5 
 		Porte P5_4 = new Porte(S5,S4,"W");
 		Porte P5_2 = new Porte(S5,S2,"N");
 		Porte P5_6 = new Porte(S5,S6,"E");
 		Porte P5_8 = new Porte(S5,S8,"S");
		S5.addPorte(P5_4);
 		S5.addPorte(P5_2);
 		S5.addPorte(P5_6);
 		S5.addPorte(P5_8);
 		//Creation de portes de la piece 6 
 		Porte P6_3 = new Porte(S6,S3,"N");
 		Porte P6_9 = new Porte(S6,S9,"S");
 		S6.addPorte(P6_3);
 		S6.addPorte(P6_3);
 		//Creation de portes de la piece 7 
 		Porte P7_4 = new Porte(S7,S4,"N");
 		Porte P7_8 = new Porte(S7,S8,"E");
 		S7.addPorte(P7_4);
 		S7.addPorte(P7_8);
 		//Creation de portes de la piece 8 
 		Porte P8_5 = new Porte(S8,S5,"N");
 		Porte P8_7 = new Porte(S8,S7,"W");
 		Porte P8_9 = new Porte(S8,S9,"E");
 		S8.addPorte(P8_5);
 		S8.addPorte(P8_7);
 		S8.addPorte(P8_9);
 		//Creation de portes de la piece 9
 		Porte P9_6 = new Porte(S9,S6,"N");
 		Porte P9_8 = new Porte(S9,S8,"W");
 		S9.addPorte(P9_6);
 		S9.addPorte(P9_8);
 				
 		
		//Sauvegarde dans l'array Lab
//		  this.add(S1,P1_2) ;
//        this.add(S1, P1_4);
//        this.add(S2,P2_3) ;
//        this.add(S2, P2_5);
//        this.add(S3, P3_6);
//        this.add(S4,P4_5);			
//        this.add(S4,P4_7);			
//        this.add(S5,P5_6);			
//        this.add(S5,P5_8);			
//        this.add(S6,P6_9);		
//        this.add(S7,P7_8);				
//        this.add(S8,P8_9);
 		}

private void add(Piece s1, Porte p1_2) {
	// TODO Auto-generated method stub
	
}
 
 		

	
}
