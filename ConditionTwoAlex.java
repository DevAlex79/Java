public class ConditionTwoAlex {
    // Alexandra

    public static void main(String[] args) {

        String nom = "Toto";
        int age = 19;

        if (nom =="Toto") {
            if (age >= 18) {
                System.out.println(nom + " est majeur");
            } else {
                System.out.println(nom + " raconte des carabistouilles");
            }
        } else {
            if (age >= 18)
            System.out.println(nom + " est majeur");
            else if (age < 16)
            System.out.println(nom + " est sur les bancs de l'école");
            else 
            System.out.println(nom + "est mineur");
        }
    }  
}
