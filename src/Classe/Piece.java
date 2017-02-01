package Classe;

import java.util.Vector;

public class Piece {
	   // variables
		private String titrePiece;
		private Position post ;
	    private Porte Exit ; 
	    
		public Piece(String titrePiece, Position post, Porte Exit) {
			super();
			this.titrePiece = titrePiece;
			this.post = post;
			this.Exit = Exit ;
			//this.vecSortie = vecSortie;
		}
		
		public Piece()
		{
		  // description
			titrePiece = new String () ;
			
	//		vecSortie = new Vector();
		}
		
		public String getTitrePiece() {
			return titrePiece;
		}

		public void setTitrePiece(String titrePiece) {
			this.titrePiece = titrePiece;
		}

		public Position getPost() {
			return post;
		}

		public void setPost(Position post) {
			this.post = post;
		}

		public Vector getVecSortie() {
			return vecSortie;
		}


		public void setVecSortie(Vector vecSortie) {
			this.vecSortie = vecSortie;
		}

	
		//	private String descPiece;
		private Vector vecSortie;

		
		public Piece ( String title )
		{

			titrePiece = title;
		//descPiece = new String();
			vecSortie = new Vector();
		}

		public Piece( String title, String description )
		{
			titrePiece = title;
		//	descPiece = description;
			vecSortie = new Vector();
		}

		public String toString()
		{
			return titrePiece;
		}

		// Ajout d'une sortie à la Piece
		public void addExit ( Porte exit )
		{
			vecSortie.addElement (exit);
		}

		// Enleve une sortie de la piece
		public void removeExit ( Porte exit )
		{
			if (vecSortie.contains (exit))
			{
				vecSortie.removeElement (exit);
			}
		}

		// Retourne le vecteur exit
		public Vector getExits ()
		{

			return (Vector) vecSortie.clone();
		}
		
		// Retourne le titre de la piece
		public String getTitle()
		{
			return titrePiece;
		}

		// Set titre de la piece
		public void setTitle( String roomTitle )
		{
			titrePiece = roomTitle;
		}

		
	
	}

	
	