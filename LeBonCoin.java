import java.util.Scanner;

import lbc.Annonce;
import lbc.Immo;
import lbc.Vehicule;
import lbc.Job;


class  LeBonCoin {
 // Xavier

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner( System.in );
 
        System.out.print( "type annonce : " );
        String typeAnnonce = sc.nextLine();
        
        Annonce a = new Annonce(); 

        if ( typeAnnonce.equals( "imo" ) )
            a = new Immo();
        else if ( typeAnnonce.equals( "voit" ) )
            a = new Vehicule();
        else if ( typeAnnonce.equals( "job" ) )
            a = new Job();

        a.saisie( sc );
        System.out.println( a );
        
        sc.close();
    }
}