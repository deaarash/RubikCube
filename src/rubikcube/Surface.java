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
public class Surface {

	public int[][] Colors = new int[3][3];

	public Surface() {

		for (int i=0; i<3 ; i++) {
			for (int j=0 ; j<3 ; j++) {
				this.Colors[i][j] = 0;
			}
		}
	}

	public void SurInput() {
		
		Scanner reader = new Scanner(System.in);
		int temp;

		for (int i=0; i<3 ; i++) {

			for (int j=0 ; j<3 ; j++) {

				this.SurDraw();
				
				do {
				
					System.out.println("Please enter the color number: (Between 1 and 6)");
					temp = reader.nextInt();

				} while (temp < 1 || temp > 6);
				
				this.Colors[i][j] = temp;
			}
		}
	}

	public void SurDraw() {

		boolean EntryPlaceHolder = true;
		System.out.println("-------------");
        
        for(int i =0; i<3; i++) {

	        System.out.print("|");      
	        for (int j = 0; j<3 ; j++) {

	        	if (this.Colors[i][j] != 0) {

	        		System.out.print(" "+this.Colors[i][j]+" |");
	        	}
	        	else if (EntryPlaceHolder) {
	        	
	        		System.out.print(" * |");
	        		EntryPlaceHolder = false;        		 
	        	} 
	        	else {

	        		System.out.print(" ? |");
	        	}
	        }
	        System.out.println("\n-------------");
        }
	}    
}
