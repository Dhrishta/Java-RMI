package Classe;
import java.util.ArrayList;

public class Piece {
	   // variables
		private String idPiece;
		private int numero;
		private ArrayList <Porte> listsortie = new ArrayList <Porte>() ;
		public Piece(String idPiece, int numero) {
			super();
			this.numero = numero;
			this.idPiece = idPiece ;
		}

		
public String getIdPiece() {
			return idPiece;
		}


		public void setIdPiece(String idPiece) {
			this.idPiece = idPiece;
		}


		public int getNumero() {
			return numero;
		}


		public void setNumero(int numero) {
			this.numero = numero;
		}


		public ArrayList<Porte> getListsortie() {
			return listsortie;
		}


		public void setListsortie(ArrayList<Porte> listsortie) {
			this.listsortie = listsortie;
		}


public void addPorte(Porte sortie){
	
	listsortie.add(sortie);

	
}
}
		
