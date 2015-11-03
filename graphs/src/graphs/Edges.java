/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author mauri
 */
public class Edges {
    
    private int x1;
    private int x0;
    private int y1;
    private int y0;
    private int v0;
    private int v1;
    private int weight;
    private Color color;

    public void draw(Graphics g){
        g.setColor(this.color);
        g.drawLine(this.x0, this.y0, this.x1, this.y1);
        drawWeight(g);
    }
    
    public void drawWeight(Graphics g){
        g.setColor(Color.RED);
        int width = g.getFontMetrics().stringWidth("[" + this.weight + "]");
        int x = (int)(((this.x0) + (this.x1))/2);
        int y = (int)(((this.y0) + (this.y1))/2);
        g.setColor(Color.BLUE);
        g.drawString("[" + this.weight + "]", x - width, y);
    }
    
    public Edges(int x0, int x1, int y0, int y1, int v0, int v1, int weight, Color color) {
        this.x1 = x1;
        this.x0 = x0;
        this.y1 = y1;
        this.y0 = y0;
        this.v0 = v0;
        this.v1 = v1;
        this.weight = weight;
        this.color = color;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX0() {
        return x0;
    }

    public void setX0(int x0) {
        this.x0 = x0;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY0() {
        return y0;
    }

    public void setY0(int y0) {
        this.y0 = y0;
    }

    public int getV0() {
        return v0;
    }

    public void setV0(int v0) {
        this.v0 = v0;
    }

    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
    
}
