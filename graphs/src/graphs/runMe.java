/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

/**
 *
 * @author mauri
 */
public class runMe {
    
    public static void main(String[] args) {
        
        GUI gui = new GUI(800, 500);
        gui.setTitle("Lab3");
        gui.setLocationRelativeTo(null);
        gui.setSize(800, 600);
        gui.setVisible(true);
        gui.thread.start();
        
    }
    
}
