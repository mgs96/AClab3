/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.io.*;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author mauri
 */
public class runMe {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        /*GUI gui = new GUI(800, 500);
        gui.setTitle("Lab3");
        gui.setLocationRelativeTo(null);
        gui.setSize(800, 600);
        gui.setVisible(true);
        gui.thread.start();*/
        
        Graph g = new Graph();
        
        JFileChooser fc = new JFileChooser("src");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Graph file", "graph");
        fc.setFileFilter(filter);
        int returnVal = fc.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();
            BufferedReader in = new BufferedReader(new FileReader(file));
            String linea;
            while((linea = in.readLine()) != null){
                String[] nodos = linea.split(";");
                for (String string : nodos) {
                    String[] coord = string.split(",");
                    g.createNode(Integer.valueOf(coord[0]), Integer.valueOf(coord[1]));
                }
            }
        }
        for(int i = 0; i < g.getnNodes()-1; i++){
            Nodes node1 = g.getNodes(i);
            Nodes node2 = g.getNodes(i+1);
            g.createEdge(node1.getX(), node2.getX(), node1.getY(), node2.getY(), i, i+1, distancia(node1.getX(), node2.getX(), node1.getY(), node2.getY()));
        }
        
        System.out.println(g.getnNodes() + " : " + g.getnEdges());
        
        int sum = 0;
        for(int i = 0; i < g.getnEdges(); i++){
            sum += g.getEdges(i).getWeight();
        }
        
        System.out.println(sum);
    }
    
    
    public static double distancia(int x0, int x1, int y0, int y1){
            return Math.sqrt(((x0+x1)*(x0+x1))-((y0+y1)*(y0+y1)));
        }
    
}
