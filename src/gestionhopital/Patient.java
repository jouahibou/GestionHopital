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
public class Patient {
    private String no ;
    private final String nom;
   
    private ArrayList<Consultation> consta= new ArrayList<>();
    
    
    public Patient(String nom ,String no){
        
        this.nom=nom;
        this.no=no;
       
       
    }
    public ArrayList<Consultation> getconsultation( Consultation cons ){
        
          consta.add(cons);
        return this.consta;
    }
   
    public String getnom(){
        return this.nom;
    }
    
}
