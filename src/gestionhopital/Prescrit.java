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
public class Prescrit {
     private ArrayList<Medicament> medicas=new ArrayList<>();
     private ArrayList<Prescrit> pres = new ArrayList<>();
     private int prise;
     private Consultation cons;
     private Medecin medecin;
     public Prescrit( Medecin med,Consultation cons, int prise){
         //String libelle = medica.getnom();
        // medicas.add(libelle);
        this.medecin= med;
        this.cons=cons;
         this.prise=prise;
         pres.add(this);
        
     }
      
     
   
     
     public void Addmedoc(ArrayList<Medicament> medc ){
         
         for (int i =0;i<medc.size();i++){
             this.medicas.add(medc.get(i));
         }
         
     }
     public void Affiche(){
        
         for (int i = 0;i<medicas.size();i++){
             
             System.out.println(medicas.get(i).getnom());
            // System.out.println(medicas.get(i).getCode());
         }
     }
     
     public void AffichePres(){
         
                 System.out.println("le medecin  "+pres.get(0).medecin.getnom()+ " a prescit au patient "+pres.get(0).cons.getpatient().getnom());
               
             
           System.out.println("les medicaments suivants  ");
            Affiche();
           
         }
         //System.out.println("les medicaments prescrits sont ");
         //Affiche();
         
     
     
     
     
}
