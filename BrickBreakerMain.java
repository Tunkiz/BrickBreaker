/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PingPong;

import javax.swing.JFrame;

/**
 *
 * @author Tunkis
 */
public class BrickBreaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame fr=new JFrame();
       Play play=new Play();
       fr.setBounds(2, 2, 500, 500);
       fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       fr.setUndecorated(true);
       fr.setTitle("Brick Breaker");
       fr.add(play);
       fr.setVisible(true);
    }
    
}
