/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author Tunkis
 */
public class graph {
    public int map[][];
    public int brickhight;
    public int brickwidth;
    public graph(int row,int col){
    map=new int[row][col];
    for(int i=0;i<map.length;i++){
    for(int j=0;j<map[0].length;j++){
        map[i][j]=1;
    }}
    brickwidth=400/col;
    brickhight=150/row;
    }
    public void draw(Graphics2D g){
     for(int i=0;i<map.length;i++){
    for(int j=0;j<map[0].length;j++){
        if(map[i][j]>0){
        g.setColor(Color.white);
       g.fillRect(j*brickwidth+40,i*brickhight+70,brickwidth, brickhight);
        }
        g.setStroke(new BasicStroke(4));
        g.setColor(Color.black);
          g.drawRect(j*brickwidth+40,i*brickhight+70,brickwidth, brickhight);
    }}}

public void setvalue(int value,int row,int col){
    map[row][col]=value;
}
}