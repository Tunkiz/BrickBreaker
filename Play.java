/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PingPong;

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
public class Play extends JPanel implements ActionListener, KeyListener {

    public bricks map;
    private boolean play = false;
    private int Padel = 220;
    private Timer time;
    private int delay = 8;
    private int ballx = 220, balldirX = 1;
    private int bally = 300, balldirY = -2;
    private int totalbrick = 66;
    public int Score=0;

    public Play() {
        map = new bricks(8, 16);
        time = new Timer(delay, this);
        time.start();
        addKeyListener(this);
        setFocusTraversalKeysEnabled(false);
        setFocusable(true);
    }

    public void paint(Graphics g) {
        //borders
        g.setColor(Color.black);
        g.fillRect(3, 1, 480, 460);

        //pardel
        g.setColor(Color.red);
        g.fillRect(Padel, 440, 70, 6);
        
         //Keeping scores
        g.drawString("Score: "+Score,10, 460);
        //ball
        g.setColor(Color.blue);
        g.fillOval(ballx, bally, 10, 10);

        map.draw((Graphics2D) g);
        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ballx = ballx + balldirX;
        bally = bally + balldirY;
        if (play) {
            if (new Rectangle(ballx, bally, 10, 10).intersects(new Rectangle(Padel, 440, 70, 6))) {
                balldirY = -balldirY;
            }

             for (int i = 0; i < map.map.length; i++) {
                for (int j = 0; j < map.map.length; j++) {
                    if (map.map[i][j] > 0) {
                        Rectangle bricks = new Rectangle(i * map.brickwidth + 30, j * map.brickheight + 20, map.brickwidth, map.brickheight);
                        Rectangle ball = new Rectangle(ballx, bally, 10, 10);
                        if(bricks.intersects(ball)){
                        map.setbricks(0, i, j);
                        totalbrick--;
                            
                            Score++;
                            switch (Score) {
                                case 10:
                                    delay++;
                                    break;
                                case 20:
                                    delay++;
                                    break;
                                case 30:
                                    delay++;
                                    break;
                                default:
                                    break;
                            }
                        
                        if (ballx + 30 <= bricks.x || i * map.brickwidth + 20 >= bricks.x + bricks.width) {
                                balldirX = -balldirX;
                            } else {
                                 balldirY = - balldirY;
                            }
                       
                    }
                    }
                }
                
            }
            if (ballx < 3) {
                balldirX = -balldirX;
            }
            if (ballx > 470) {
                balldirX = -balldirX;
            }
            if (bally < 1) {
                balldirY = -balldirY;

            }
            Padel = Padel;
            time.start();
            repaint();
            if (Padel <= 4) {
                Padel = 4;
            }
            if (Padel >= 410) {
                Padel = 410;
            }

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int keycode = e.getKeyCode();
        switch (keycode) {
            case KeyEvent.VK_RIGHT:
                play = true;
                Padel = Padel + 10;
                break;
            case KeyEvent.VK_LEFT:
                play = true;
                Padel = Padel - 10;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //To change body of generated methods, choose Tools | Templates.
    }

}
