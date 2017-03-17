package Classe;

import java.rmi.RemoteException;
import java.util.Scanner;



public class Menu {
	 private String nom;
	 private MudInterface mud;
	 
//Menu pour démarrer le jeu	

public Menu(MudInterface mud) {
		// TODO Auto-generated constructor stub
	this.mud = mud;
	}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public MudInterface getMud() {
	return mud;
}


public void setMud(MudInterface mud) {
	this.mud = mud;
}


/**
 * 
 */
	public void affichageMenu1(){
	
		System.out.println("*****************************************************");
		System.out.println("*****************************************************");
		System.out.println("*****************************************************");
		System.out.println("*****************************************************");	
		System.out.println("*****************************************************");	
		System.out.println("************************ **  ************************");	
		System.out.println("***********************  **   ***********************");	
		System.out.println("**********************   **    **********************");	
		System.out.println("*********************    **     *********************");	
		System.out.println("********************     **      ********************");	
		System.out.println("*******************      **       *******************");	
		System.out.println("******************       **        ******************");
		System.out.println("*****************        **         *****************");
		System.out.println("****************      DUNGEONS       ****************");
		System.out.println("***************          of           ***************");
		System.out.println("**************         MORDOR          **************");
		System.out.println("*************            **             *************");
		System.out.println("************             **              ************");
		System.out.println("***********              **               ***********");
		System.out.println("**********               **                **********");
		System.out.println("*********                **                 *********");
		System.out.println("********                 **                  ********");
		System.out.println("*******                  **                   *******");
		System.out.println("******                   **                    ******");
		System.out.println("*****************************************************");
		System.out.println("*****************************************************");
	
		Scanner input = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you ready to enter this perillious mission?");	
		System.out.println("YOUR DESTINY LIES WITHIN THESE OPTIONS...CHOOSE WISELY");	
		System.out.println("1° START ADVENTURE\n"
				         + "2° QUIT              ");	
	
		int selection = input.nextInt();
		
		
		switch(selection){
			case 1:
				
			try {

				
				
				System.out.println("WHAT IS YOUR NAME BRAVE WIZARD?");
				nom = sc.nextLine();
				mud.creationJoueur(nom);
				System.out.println("Welcome to the Dungeons of Mordor "+nom);
			       System.out.println("You are now entering the Dungeon by the first room") ;
			       System.out.println("You have 10 wands");
			       System.out.println("May the will of Witchcrafts and Wizardry be with you !\n");
			       affichageMenu2();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			       
			       	break;
		case 2 : 
				System.out.println("Farewell");
				System.exit(0);
				break; 
		}
	
	}
	
	
	public void affichageMenu2(){
		String selection=null;
		Scanner input = new Scanner(System.in);
		
	
		
		do {
			
try {			
			System.out.println("You are now in "+mud.getPiece(nom));	
			System.out.println("Select a direction move in the Dungeon");	
			System.out.println("N : To move north\n"
					         + "S : To move south\n"             
							 + "E : To move east\n"
					         + "W: To move west \n");	
			// SAISIE
			selection = input.nextLine();
			
			while ( mud.deplacementjoueur(nom, selection) < 0 ){
					System.out.println("Cannot move in this direction ! Retry");
					selection = input.nextLine();
			}
				
			
				
} catch (RemoteException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		}while( true );
		
		/*switch(selection){
		case "N": 
			
			break;
		case "S":
			
			break;
		case "E":
			
			break;
		case "W":
			
			break;

		
		
		
	}*/

}
	
}	
	
	
	
	
	
	
	
	
	

