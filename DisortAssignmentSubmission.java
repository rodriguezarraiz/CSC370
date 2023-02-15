/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package disortassignmentsubmission;
import java.util.*;
public class DisortAssignmentSubmission {
public String[] sort(String[] uno1) {
        Arrays.sort(uno1, new Comparator<String>() {
            @Override
            public int compare(String uno, String dos) {
                
                int Variable1 = getDepth(uno);
                int Variable2 = getDepth(dos);
                if (Variable1 != Variable2) {
                    
                    return Integer.compare(Variable1, Variable2);
                } else {
                    
                    return uno.compareTo(dos);
                }
            }
            private int getDepth(String SelectionProcess) {
               
                int selection = 0;
                for (int i = 0; i < SelectionProcess.length(); i++) 
                {
                    if (SelectionProcess.charAt(i) == '/') {
                        selection++;
                    }
                }
                return selection;
            }
        });
        return uno1;
    }
    public static void main(String[] args) {
       String[] uno1 = {"/","/usr/","/usr/local/","/usr/local/bin/","/games/","/games/snake/","/homework/","/temp/downloads/"};
    String[] sortedDirs = new DisortAssignmentSubmission().sort(uno1);
    System.out.println(Arrays.toString(sortedDirs));
        String[] uno2 = {"/usr/","/usr/local/","/bin/","/usr/local/bin/","/usr/bin/","/bin/local/","/bin/local/"};
    String[] sortedDir = new DisortAssignmentSubmission().sort(uno2);
    System.out.println(Arrays.toString(sortedDir));
    String[] uno3 = {"/","/a/","/b/","/c/","/d/","/e/","/f/","/g/"};
    String[] sortedDi = new DisortAssignmentSubmission().sort(uno3);
    System.out.println(Arrays.toString(sortedDi));
    String[] uno4 = {"/","/a/","/b/","/c/","/d/","/e/","/f/","/g/","/a/a/","/b/g/c/","/g/f/"};
    String[] sortedD = new DisortAssignmentSubmission().sort(uno4);
    System.out.println(Arrays.toString(sortedD));
    String[] uno5 = {"/a/b/c/d/e/f/g/h/i/j/k/l/m/n/","/o/p/q/r/s/t/u/v/w/x/y/z/"};
    String[] sorted = new DisortAssignmentSubmission().sort(uno5);
    System.out.println(Arrays.toString(sortedDirs));
      String[] uno6 = {"/a/b/","/ab/cd/","/c/d/","/a/b/c/","/ab/c/d/","/a/bc/d/",
"/a/b/cd/"};
    String[] sorte = new DisortAssignmentSubmission().sort(uno6);
    System.out.println(Arrays.toString(sorte));
    }

}
