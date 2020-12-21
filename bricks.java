/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PingPong;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author Tunkis
 */
public class bricks {

    public int brickwidth;
    public int brickheight;
    public int map[][];

    public bricks(int row, int col) {
        map = new int[row][col];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = 1;
            }
        }
        brickwidth=850/col;
        brickheight=190/row;
    }
    public void draw(Graphics2D g){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if(map[i][j]>0){
               g.setColor(Color.white);
               g.fillRect(i*brickwidth+30, j*brickheight+20, brickwidth, brickheight);
                }
               g.setColor(Color.black);
               g.setStroke(new BasicStroke(1));
               g.drawRect(i*brickwidth+30, j*brickheight+20, brickwidth, brickheight);
            }
        }
    }
    public void setbricks(int value,int row,int col){
        map[row][col]=value;
    }
}
