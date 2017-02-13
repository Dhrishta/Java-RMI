package Classe;

import java.util.Scanner;



public class Menu {
 private Scanner n;
 private String nom;
 
//Menu pour démarrer le jeu	

/**
 * 
 */
public void affichage(){

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
	System.out.println("**************        HOGWARTS         **************");
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
	System.out.println("Are you ready to enter this perillious mission?");	
	System.out.println("YOUR DESTINY LIES WITHIN THESE OPTIONS...CHOOSE WISELY");	
	System.out.println("1° START ADVENTURE\n"
			         + "2° QUIT              ");	

	int selection = input.nextInt();
	input.nextLine();
	
	switch(selection){
	case 1:System.out.println("WHAT IS YOUR NAME BRAVE WIZARD?");
	       n = new Scanner(System.in);
	       nom =(n.nextLine());
	       System.out.println("Welcome to the Dungeons of Hogwarts "+ nom);
	       System.out.println("May the will of Witchcrafts and Wizardry be with you !\n");
	
	case 2 : System.out.println("Farewell "+nom);
	                 }
	
	
             }
}
	
	
	
	
	
	
	
	
	
	
	

