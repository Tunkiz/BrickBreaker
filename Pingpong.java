/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;

import javax.swing.JFrame;

/**
 *
 * @author Tunkis
 */
public class Pingpong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame frame=new JFrame();
       ping ping=new ping();
       frame.setSize(500, 500);
       frame.setTitle("Ping Ping");
       frame.add(ping);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setResizable(false);
    }
    
}
