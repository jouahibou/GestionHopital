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
public class GestionHopital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Medecin md = new Medecin("M1234","jouahibou");
        Medecin md1 = new Medecin("M12","khaly");
        Medecin md2 = new Medecin("M1","thioro");
        
        Medicament mt = new Medicament("123#","Paracétamol");
        Medicament mt1 = new Medicament("#321","Aspergique ");
        Medicament mt2 = new Medicament("#456","limon");
        
        Patient pa = new Patient("coumba","1001");
       Patient pa1 = new Patient("fatou","11020");
       Patient pa2 = new Patient("Anta","19920");
        
        Consultation cons = new Consultation("1234","10/12/2010",md,pa);
        Consultation cons1 = new Consultation("1767","02/02/2018",md1,pa1);
        Consultation cons2 = new Consultation("9009","08/9/2021",md2,pa2);
        
        
       Prescrit pr = new Prescrit(md,cons,3);
       Prescrit pr3 = new Prescrit(md,cons2,2); 
       Prescrit pr1=new Prescrit(md1,cons1,2);
       Prescrit pr2 = new Prescrit(md2,cons2,1);
       
       ArrayList<Consultation> cons12= new ArrayList<>();
       
       cons12.add(cons);
       cons12.add(cons1);
       
       md.AddCons(cons12);
      // md.afficheCons();
       
       ArrayList<Medicament> cmer= new ArrayList<>();
       
       cmer.add(mt);
       cmer.add(mt1);
       
       pr.Addmedoc(cmer);
      // pr.Addmedoc(mt1);
       
       //pr.Affiche();
       
      pr.AffichePres();
     // pr.Affiche() ;
       
       
       
      // System.out.print(pr.getstatistique(mt));
       // System.out.print(pr3.getstatistique(mt));
        
        
        
        
        
        
        
    }
    
}
