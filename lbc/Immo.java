package lbc;
import lbc.Annonce;

import java.util.Scanner;

public class Immo extends Annonce
{
    private String surface;
    private String nbrPiece;
    
    public Immo()
    {}

    public String toString()
    {
        String res = "";
        res += "Annonce IMMO\n";
        res += super.toString(); 
        res += String.format( "superficie %s m2 \nnbr pieces %s", this.surface, this.nbrPiece) ;
        return res;
    } 

    
    public void saisie( Scanner sc )
    {
        super.saisie( sc );
        System.out.print( "surface   : ");
        this.surface = sc.nextLine();
        System.out.print( "nbr piece : ");
        this.nbrPiece = sc.nextLine();
    }
}