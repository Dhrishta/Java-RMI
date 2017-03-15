package Classe;

public class Piece {
	   // variables
		private String titrePiece;
		private Position post ;
		private Porte N,S,E,W ;
		public Porte getN() {
			return N;
		}
		public void setN(Porte n) {
			N = n;
		}
		public Porte getS() {
			return S;
		}
		public void setS(Porte s) {
			S = s;
		}
		public Porte getE() {
			return E;
		}
		public void setE(Porte e) {
			E = e;
		}
		public Porte getW() {
			return W;
		}
		public void setW(Porte w) {
			W = w;
		}
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