package lbc;
import lbc.Annonce;

import java.util.Scanner;

public class Job extends Annonce
{
    private String salaire;
    private String contrat;
    
    public Job()
    {}

    public String toString()
    {
        String res = "";
        res += "Annonce JOB\n";
        res += super.toString(); 
        res += String.format( "salaire : %s\ncontrat %s", this.salaire, this.contrat) ;
        return res;
    } 

    
    public void saisie( Scanner sc )
    {
        super.saisie( sc );
        System.out.print( "salaire    : ");
        this.salaire = sc.nextLine();
        System.out.print( "contrat : ");
        this.contrat= sc.nextLine();
    }
}