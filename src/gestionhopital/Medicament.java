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
public class Medicament {
   
    private String code ;
    private String libelle;
    
    public Medicament(String code,String libelle){
        this.code=code;
        this.libelle= libelle;
    }
    public String getnom(){
        return this.libelle;
    }

    public String getCode() {
        return code;
    }
    
    
        
        
     
    
    
}
