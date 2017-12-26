/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcoiris;

import javax.swing.JFrame;

/**
 *
 * @author Kernel-2018
 */
public class Principal extends JFrame{
    public static void main(String[] args) {
        
        ArcoIris dibujo = new ArcoIris();
        
        JFrame panel = new  JFrame();
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(dibujo);
        panel.setSize(400,250);
        panel.setVisible(true);
        
        
        
    }
    
    
}
