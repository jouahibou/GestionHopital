/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionhopital;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Medecin {
    private String matricule ;
    private String nom;
    private ArrayList<Consultation> cons = new ArrayList<>();
    
    
    public Medecin(String matricule ,String nom){
        this.matricule=matricule;
        this.nom= nom;
    }

    @Override
    public String toString() {
        return "Medecin" + "matricule=" + matricule + ", nom=" + nom ;
    }
    public String getnom(){
        return this.nom;
    }
    
    public void AddCons(ArrayList<Consultation> conss ){
        for (int i =0;i<conss.size();i++){
            this.cons.add(conss.get(i));
        }
        
    }
    
    public void afficheCons(){
        
        for (int i =0;i<cons.size();i++){
            
            System.out.println(cons.get(i).toString());
        }
    }
    
}
