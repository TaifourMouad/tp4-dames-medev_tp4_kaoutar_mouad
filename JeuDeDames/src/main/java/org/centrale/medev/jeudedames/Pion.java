/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev.jeudedames;

import static java.lang.Math.sqrt;

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
    public void deplacer(int x, int y, Plateau p){
        if(x<p.getPlateau()[0].length && y<p.getPlateau()[0].length ){
            p.getPlateau()[this.pos.getX()][this.pos.getY()]=".";
            p.getPlateau()[x][y]=type;

            this.pos.setX(x);
            this.pos.setY(y);
        }
        else{
            System.out.println("Déplacement non autorisé !");
        }  
    }

    public Point2D getPos() {
        return pos;
    }

    public void setPos(Point2D pos) {
        this.pos = pos;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    /**
     * méthode de déplacement du pion
     * @param p : pion
     * @param pl : plateau dans lequel on joue
     */
    public void prise(Pion p, Plateau pl){
        if(this.pos.distance(p.pos)>sqrt(2) && this.type.charAt(0)==p.type.charAt(0)){
            System.out.println("Prise impossible pour ce pion");
        }
        else{
            Point2D new_pos = new Point2D(2*(p.pos.getX()-this.pos.getX()),2*(p.pos.getX()-this.pos.getX())); 
            if(!pl.getPlateau()[new_pos.getX()][new_pos.getY()].equals(".")){
                System.out.println("Prise impossible pour ce pion");
            }
            else{
                p.pos.setX(new_pos.getX());
                p.pos.setY(new_pos.getY());
            }
        }
    }
    
    
    
}
