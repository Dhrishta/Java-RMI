package Classe;

public class Piece {
	   // variables
		private String titrePiece;
		private Position post ;
		public Piece(String titrePiece, Position post) {
			super();
			this.titrePiece = titrePiece;
			this.post = post;
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
		
}