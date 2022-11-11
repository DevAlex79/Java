
class ConditionTwo {
    // Xavier


    public static void main(String[] args) {

        String nom = "toto";
        int age = 19;

        if ( age >= 18 )
            System.out.println( "majeur" );
        else
            System.out.println( "mineur" );

        System.out.println( "---------------------------------------");

        if ( age >= 18 )
            System.out.println( "majeur" );
        else if ( age < 16 )
            System.out.println( "à l'école" );
        else
            System.out.println( "mineur" );

        System.out.println ("------------------------------------");

        nom = "toto";

        if (!(nom != "toto"))
            System.out.println("Hello toto");
        else
            System.out.println("Hello !");
    }
}

/*
 *          !       -> not (inverse l'état du booléen)
 *          ==      -> égal
 *          !=      -> not égal
 *          >       -> strictement supérieur à
 *          <       -> strictement inférieur à
 *          >=      -> supérieur ou égal à 
 *          <=      -> inférieur ou égal à
 *          
 *          &&      -> and
 *          ||      -> or
 *          ^^      -> xor (ou exclusif)
 * 
 */



