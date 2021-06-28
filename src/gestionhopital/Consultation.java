/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestionhopital;


/**
 *
 * @author Lenovo
 */
public class Consultation {
    private String no;
private String date;
private Medecin md;
private Patient pt;

public Consultation (String no , String date ,Medecin md,Patient pt){
    this.date= date ;
    this.no=no;
    this.md=md;
    this.pt=pt;
    
    
}

    @Override
    public String toString() {
        return "Consultation " + " no=" + no + ", date=" + date + ", medecin = " + md.getnom() + ", patient = " + pt.getnom() ;
    }


public Medecin getmedecin(){
    return this.md;
}
public String getdate(){
    return this.date;
}
public Patient getpatient(){
    return this.pt ;
}

   
    
}
