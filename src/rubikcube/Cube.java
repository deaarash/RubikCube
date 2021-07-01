/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubikcube;
import java.util.Scanner;
/**
 *
 * @author Desktop
 */
public class Cube {

	private Surface[] sc = new Surface[6];

	public Cube() {

		for (int i=0 ; i<6 ; i++) {
			this.sc[i] = new Surface();
		}
	}
        
	public void CubeInput() {

		this.CubeDraw();
		for (int i=0 ; i<6 ; i++) {
			
			this.sc[i].SurInput();
			this.CubeDraw();
		}
	}

	public void CubeDraw() {
		
		String prefix = "\t      ";

		// First Surface

		System.out.println(prefix+"-------------");
        
        for (int i=0 ; i<3 ; i++) {

	        System.out.print(prefix+"|");      
	        for (int j=0 ; j<3 ; j++) {

	        	if (this.sc[0].Colors[i][j] != 0) {

	        		System.out.print(" "+this.sc[0].Colors[i][j]+" |");
	        	}	 
	        	else {

	        		System.out.print(" ? |");
	        	}
	        }
	        System.out.println("\n"+prefix+"-------------");
        }

        // Second Raw

        System.out.println("------------- ------------- ------------- -------------");

        	
        for (int i=0 ; i<3 ; i++) {

        	for (int k=0 ; k<4 ; k++) {
        		
			    System.out.print("|");      

		    	for (int j=0 ; j<3 ; j++) {
		

		        	if (this.sc[k+1].Colors[i][j] != 0) {

		        		System.out.print(" "+this.sc[k+1].Colors[i][j]+" |");
		        	}
		        	else {

		        		System.out.print(" ? |");
		        	}
		        }
		        System.out.print(" ");
	        }
		    System.out.println("\n------------- ------------- ------------- -------------");
        }

        // Last Surface

        System.out.println(prefix+"-------------");
        
        for (int i=0 ; i<3 ; i++) {

	        System.out.print(prefix+"|");      
	        for (int j=0 ; j<3 ; j++) {

	        	if (this.sc[5].Colors[i][j] != 0) {

	        		System.out.print(" "+this.sc[5].Colors[i][j]+" |");
	        	}
	        	else {

	        		System.out.print(" ? |");
	        	}
	        }
	        System.out.println("\n"+prefix+"-------------");
        }
	}
}
