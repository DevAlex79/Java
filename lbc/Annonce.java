package lbc;

import java.util.Scanner;

public class Annonce 
{
    protected String auteur;
    protected String titre;

    public Annonce()
    {}

    public Annonce( String aut, String titre )
    {
        this.auteur = aut;
        this.titre = titre;
    }

    public String toString()
    {
        return String.format( "%s\nAnnonce\nde : %s\n", this.titre, this.auteur) ;
    } 

    public void saisie( Scanner sc )
    {
        System.out.print( "auteur : ");
        this.auteur = sc.nextLine();
        System.out.print( "titre  : ");
        this.titre = sc.nextLine();
    }
}