import java.util.*;
import java.util.ArrayList.*;

class Musicotheque
{
    // variable 
    private ArrayList<Cd> rayon = new ArrayList<>();

    // constructor
    public Musicotheque()
    {
    }

    public void ajouter( Cd l )
    {
        this.rayon.add( l );
    }

    public void ecouter()
    {
       /* for( int i=0 ; i < this.rayon.size() ; i++ )
        {
            Cd cd = this.rayon.get( i );
            System.out.println( cd );
        }
        */ 

        for (Cd cd : this.rayon) {
            System.out.println( cd );
        }
    }
}



class Cd {
    // Variables d'instance
    private String album = "";
    private String groupe = "";
    private Double duree = 0.0;

    // Variables de classe
    static int nbrCd = 0;

    // Contructeur(s)
    public Cd(String album, String groupe, Double duree) {
        this.album = album;
        this.groupe = groupe;
        this.duree = duree;
        nbrCd++;
    }

    // Méthodes
    public String toString() {
        return String.format("%s de %s - Durée : %f", album.toUpperCase(), groupe, duree);
    }

    // Getters et Setters
    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public static int getNbrCd() {
        return nbrCd;
    }

    public static void setNbrCd(int nbrCd) {
        Cd.nbrCd = nbrCd;
    }

}

class Genre 
{
    private ArrayList<Cd> genre = new ArrayList<>();
   String nom;

   public Genre (String nom)
    {
        this.nom = nom;
    }
}

/* class Grunge extends Genre
{
    public Grunge( String nom )
    {
        super( nom );
    }
    public void sonner()
    {
        System.out.println( String.format("Le genre %s, joue fort et gras." , this.nom )  );
    } 
}
*/

public class POOMusic {
    // Alexandra

    public static void main(String[] args) {

        Cd cd1 = new Cd("no need to argue", "The Cranberries", 1.05);
        Cd cd2 = new Cd("jamais la paix", "Mademoiselle K", 1.12);

        

        System.out.println(cd1);

        // Change le nom du groupe du cd1
        cd1.setGroupe("NIRVANA");

        System.out.println(cd1);
        // NO NEED TO ARGUE de The Cranberries


        Musicotheque maMusic = new Musicotheque(); 

        maMusic.ajouter( cd1 );
        maMusic.ajouter( cd2 );
        maMusic.ajouter( new Cd("doll parts", "Hole", 0.95) );

        maMusic.ecouter();

    }
    
}
