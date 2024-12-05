/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev.jeudedames;

import java.util.ArrayList;

/**
 *
 * @author kaou,mou
 */
public class Plateau {
    /**Attributs de la classe
     * 
     * plateau : un tableau de dimension 10x10
     */
    
    private String[][] plateau;
    private ArrayList<Pion> blancs;
    private ArrayList<Pion> noirs;
    
    
    public Plateau() {
        plateau = new String[10][10];
        blancs = new ArrayList<>();
        noirs = new ArrayList<>();
    }
    
    /**Initialisation du plateau
     * Dans cette méthode on initialise la plateau
     * Les positions vides sur le plateau sont présentées par "."
     */
    public void init(){
        //plateau initialisé avec des "." signifiant des positions non occupées
        for(int i=0; i<=9; i++){
            for(int j=0; j<=9; j++){
                plateau[i][j]=".";
            }
        }
        
        //on remplisse la plateau avec nos pion
        for(int i=0; i<5; i++){
            for(int j=0; j<=9; j=j+2){
                blancs.add(new Pion(new Point2D(i,j),"blanc"));
                plateau[i][j]="blanc";
                noirs.add(new Pion(new Point2D(9-i,9-j),"noir"));
                plateau[9-i][9-j]="noir";
            }
        }
    }
    
    
    
    
    
}