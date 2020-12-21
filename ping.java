/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Tunkis
 */
public class ping extends JPanel implements KeyListener ,ActionListener {
    int y=420,x=230,xh=240,yh=415,bx=20,by=415;
    private int bricks=21;
    private graph map;
    int bxd=1;
    public Timer tim=new Timer(5,this);
   public ping(){
       map=new graph(4,8);
       tim.start();
       addKeyListener(this);
       setFocusable(true);
       setFocusTraversalKeysEnabled(false);
   }
   public void paint(Graphics g){
       g.setColor(Color.red);
       g.fillRect(10,30 , 460, 430);
       
       g.setColor(Color.black);
       g.fillRect(x, y, 30, 20);
       
       g.setColor(Color.black);
       g.fillRect(xh, yh, 10, 5);
       
       map.draw((Graphics2D)g);
       
   }
    public void keyTyped(KeyEvent e) {
     
    }

    
    public void keyPressed(KeyEvent e) {
         
    }

   
    public void keyReleased(KeyEvent e) {
        
    }

    
    public void actionPerformed(ActionEvent e) {
        by=by-11;
        bx=bx;
       y=y;
       x=x;
       xh=xh;
       yh=yh;
        for(int i=0;i<map.map.length;i++){
       for(int j=0;j<map.map[0].length;j++){
         if(map.map[i][j]>0){
         int brickx=j*map.brickwidth+50;
         int bricky=i*map.brickhight+50;
         int brickwidth=map.brickhight;
         int brickhight=map.brickhight;
       
         }  
       }
           }
       
    }
    
}
