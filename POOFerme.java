import java.util.*;
import java.util.ArrayList.*;

import Animal.Bovin;


class LaFerme {

    ArrayList<Animal> animaux = new ArrayList<>();

    public void ajouteAnimal(Animal a) {
        animaux.add(a);
    }

    public void aTable() {
        for (Animal a : animaux) {
            a.manger();
        }
    }
}

class Animal {
    String nom;

    public Animal(String nom) {
        this.nom = nom;
    }

    public Animal() {
        this.nom = "inconnu";
    }

    public void manger() {
        System.out.println(String.format("Je usis indefini, je ne mange pas." , this.nom));
    }

class Bovin extends Animal {

    public Bovin(String nom) {
        super(nom);
    }

    public void manger() {
        System.out.println(String.format("Je m'appelle %s, je suis un bovin et je mange de l'herbe" , this.nom));
    }
}

class Ovipare extends Animal {

    public Ovipare(String nom) {
        super(nom);
    }

    public void manger() {
        System.out.println(String.format("Je m'appelle %s, je suis un ovipare et je mange des graines" , this.nom));
    }
}

class Lapin extends Animal {

    public Lapin(String nom) {
        super(nom);
    }

    public void manger() {
        System.out.println(String.format("Je m'appelle %s, je suis un lapin et je mange des carottes" , this.nom));
    }
}

}


public class POOFerme {
    // Alexandra

    public static void main(String[] args) {

        Bovin v1 = new Bovin("marguerite");
        Bovin v2 = new Bovin("Noiraude");
        Bovin v3 = new Bovin("Charal");

        Ovipare p1 = new Ovipare("Gasby");
        Ovipare p2 = new Ovipare("KFC");
        Ovipare p3 = new Ovipare("Doux");

        Lapin l1 = new Lapin("Jeannot");
        Lapin l2 = new Lapin("Bugs");
        Lapin l3 = new Lapin("Panpan");



        /* l1.manger(); */
        LaFerme f1 = new LaFerme();

        f1.ajouteAnimal(v1);
        f1.ajouteAnimal(v2);
        f1.ajouteAnimal(v3);

        f1.ajouteAnimal(p1);
        f1.ajouteAnimal(p2);
        f1.ajouteAnimal(p3);

        f1.ajouteAnimal(l1);
        f1.ajouteAnimal(l2);
        f1.ajouteAnimal(l3);
    
        f1.aTable();
    }
}

    
