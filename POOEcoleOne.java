import java.util.*;
import java.util.ArrayList.*;

class Ecole {
    ArrayList<Individus> individus = new ArrayList<>();

    public void ajouterPersonne(Individus a) {
        individus.add(a);
    }

    // getAnimalByName( )
    public Individus chercher(String nomATrouver) {
        for (Individus personne : individus) {
            if (personne.nom.equals(nomATrouver))
                return personne;
        }
        return null;
    }

    public ArrayList<Eleve> listerEleve() {
        ArrayList<Eleve> listRetour = new ArrayList<>();

        for (Individus personne : individus) {
            if (personne.getClass().getSimpleName().equals("Eleve")) {
                listRetour.add((Eleve) personne);
            }
        }
        return listRetour;
    }

    public void sonnerOuverture()
    {
        
    }

    public void sonnerFermeture()
    {
        
    }


}

class Individus {
    String nom;

    public Individus(String nom) {
        this.nom = nom;
    }

}

class Staff extends Individus {
    int salaire;

    public Staff(String nom) {
        super(nom);
        this.salaire = 0;
    }

    public Staff(String nom, int salaire) {
        super(nom);
        this.salaire = salaire;
    }
}

class Eleve extends Individus {
    int note = 0;

    public Eleve(String nom) {
        super(nom);
    }

    public String toString() {
        return String.format("Eleve(%s, %d)", this.nom, this.note);
    }

}

class Prof extends Staff {
    public Prof(String nom, int salaire) {
        super(nom, salaire);
    }
}

class Cuisinier extends Staff {
    public Cuisinier(String nom, int salaire) {
        super(nom, salaire);
    }

    public ouverture()
    {
        System.out.println( "regarder menu" );
        System.out.println( "sortir les ingrédients" );
        System.out.println( "allumer les fourneaux" );
    }

}

class Pion extends Staff {
    public Pion(String nom, int salaire) {
        super(nom, salaire);
    }

    public ouverture()
    {
        System.out.println( "prends cahier appel" );
        System.out.println( "surveiller la cour" );

    }
}

class POOEcoleOne {
    // Xavier

    public static void main(String[] args) {

        Ecole jaures = new Ecole();

        jaures.ajouterPersonne(new Eleve("toto"));
        jaures.ajouterPersonne(new Eleve("tata"));
        jaures.ajouterPersonne(new Prof("Marie", 1700));
        jaures.ajouterPersonne(new Cuisinier("René", 2000));

        /*
         * ..........
         * 
         */

        Individus inconnu = jaures.chercher("totox");

        // System.out.println( inconnu.getClass().getSimpleName() );

        if ( inconnu != null && inconnu.getClass().getSimpleName().equals("Eleve")) {
            Eleve monEleve = (Eleve) inconnu;
            monEleve.note += 10;
        }

        ArrayList<Eleve> lesEleves = jaures.listerEleve();

        for (Eleve eleve : lesEleves) {
            System.out.println(eleve);
        }

        jaures.sonnerOuverture();

    }
}