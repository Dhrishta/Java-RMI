package Classe;

import java.util.Vector;

public class Piece {
	// variables
		private String titrePiece;
		private String descPiece;
		private Vector vecSortie;

		
		public Piece()
		{
			// description
			titrePiece = new String ();
			descPiece = new String();
			vecSortie = new Vector();
		}

		
		public Piece ( String title )
		{

			titrePiece = title;
			descPiece = new String();
			vecSortie = new Vector();
		}

		public Piece( String title, String description )
		{
			titrePiece = title;
			descPiece = description;
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

		// Returns location description
		public String getDescription()
		{
			return descPiece;
		}

		// Assigns location description
		public void setDescription( String roomDescription )
		{
			descPiece = roomDescription;
		}
	
	}

	
	