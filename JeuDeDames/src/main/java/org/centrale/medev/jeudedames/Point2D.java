/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev.jeudedames;

/**
 * classe de position de pion, ou de dame
 * @author kaou,mou
 */
public class Point2D {
    //Attrubuts de la classe 
    /**
     * x: position selon l'axe horizental 
     * y: position suivant l'axe vertical 
     */
    int x;
    int y;
    
    //constructeur
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    //getter et setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * méthode
     */
    public void deplacer(int x,int y){
        this.x=x;
        this.y=y;
    }
}
