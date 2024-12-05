/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev.jeudedames;

/**
 * Class Pion
 * @author kaou,mou
 */
public class Pion {
    //Attributs de la classe
    /**
     * pos : position du pion dans le plateau
     * type : type du pion (blanc, noir, dame blanc, dame noir)
     */
    private Point2D pos;
    private String type;

    public Pion(Point2D pos, String type) {
        this.pos = pos;
        this.type = type;
    }
    
    public Pion(){
        
    }
    
    /**
     * méthode de déplacement du pion
     */
    public void deplacer(int x,int y){
        this.pos.x=x;
        this.pos.y=y;
    }
    
    /**
     * méthode de déplacement du pion
     */
    //public void 
    
}
