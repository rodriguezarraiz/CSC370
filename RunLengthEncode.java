/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runlengthencode;

/**
 *
 * @author jorge
 */
import java.util.Scanner; 
import java.util.Map; 
import java.util.Map.Entry; 
public class RunLengthEncode {

    public static String JorgeSubmission(String submission) {
    StringBuilder variable = new StringBuilder();
    int tally = 1;
    for (int a = 1; a < submission.length(); a++) {
      if (submission.charAt(a) == submission.charAt(a - 1)) 
      {
        tally++;
      } 
      else 
      {
        if (tally < 4) {
          variable.append("/");
          if (tally < 10) {
            variable.append("0");
          }
          variable.append(tally);
          variable.append(submission.charAt(a - 1));
        } else {
          for (int b = 0; b < tally; b++) {
            variable.append(submission.charAt(a - 1));
          }
        }
        tally = 1;
      }
    }
    if (tally > 4) 
    {
      variable.append("/");
      if (tally < 10) {
        variable.append("0");
      }
      variable.append(tally);
      variable.append(submission.charAt(submission.length() - 1));
    } else {
      for (int c = 0; c < tally; c++) {
        variable.append(submission.charAt(submission.length() - 1));
      }
    }
    return variable.toString();
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter here:");
        String man=scan.nextLine();
        System.out.println(JorgeSubmission(man)); 
        
       
    }
    
}
