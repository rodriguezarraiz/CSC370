/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accesslevel;

/**
 *
 * @author jorge
 */
import java.util.Scanner; 
public class AccessLevel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in); 
        System.out.print("Enter a size between 0-50: ");
        
        int a = scan.nextInt(); 
        
        int[]FebEighth = new int [a]; 
        
        System.out.println("Please enter the " + a + " elements for the users: ");
        
        for(int b=0; b<a; b++)
        {
            FebEighth[b] = scan.nextInt(); 
        }
        
        System.out.println("Please the Minimum Value: ");
        
        int minPermission = scan.nextInt(); 
        
        String c=""; 
        
        for(int d=0; d<a; d++)
        {
            if(FebEighth[d]>= minPermission)
            {
                c = c + 'A'; 
            }
            else
            {
                c = c + 'D'; 
            }
        }
        System.out.println("Returns: " + c); 
    }
    
}
