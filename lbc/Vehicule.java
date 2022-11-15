package lbc;
import lbc.Annonce;

import java.util.Scanner;

public class Vehicule extends Annonce
{
    private String marque;
    private String kilometrage;
    
    public Vehicule()
    {}

    public String toString()
    {
        String res = "";
        res += "Annonce VEHICULE\n";
        res += super.toString(); 
        res += String.format( "marque : %s\nkilométrage %s", this.marque, this.kilometrage) ;
        return res;
    } 

    
    public void saisie( Scanner sc )
    {
        super.saisie( sc );
        System.out.print( "marque    : ");
        this.marque = sc.nextLine();
        System.out.print( "kilometre : ");
        this.kilometrage= sc.nextLine();
    }
}