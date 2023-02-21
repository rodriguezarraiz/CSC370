/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package drawingtrees;

/**
 *
 * @author jorge
 */

import java.util.*;
public class DrawingTrees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] OGS = {-1, 0, 1, 1, 0, 0, 5, 5};
    String[] names = {"Root", "SubB", "LEAF1", "LEAF2", "LEAF3", "SubA", "LEAF4", "LEAF5"};
    String[] Treecomposition = Treemodel(OGS, names);
    for (String composition : Treecomposition) {        System.out.println(composition);
    }
   for (String composition : Treecomposition) {
        System.out.println(composition);
    }      
    }
    public static String[] Treemodel(int[] OG, String[] title) {
    int a = OG.length;
    List<List<Integer>> Remix = new ArrayList<>();
    for (int i = 0; i < a; i++) {
        Remix.add(new ArrayList<>());
    }
    for (int i = 0; i < a; i++) {
        int OG2 = OG[i];
        if (OG2 != -1) {
            Remix.get(OG2).add(i);
        }
    }
    List<String> solution = new ArrayList<>();
    Final(0, "", Remix, title, solution);
    return solution.toArray(new String[0]);
}
private static void Final(int node, String indent, List<List<Integer>> Remix2, String[] title2, List<String> solution2) {
    solution2.add(indent + "+-" + title2[node]);
    List<Integer> Remix2Node = Remix2.get(node);
    Collections.sort(Remix2Node);
    int size = Remix2Node.size();
    for (int i = 0; i < size; i++) {
        int childNode = Remix2Node.get(i);
        String Tab = indent + (i == size - 1 ? "  " : "| ");
        Final(childNode, Tab, Remix2, title2, solution2);
    }
}
}
