public class LesTableaux {
    // Alexandra

    static String poissons[] = { "sardine", "dauphin", "morue", "bar", "daurade", "requin"};

    public static void showArray( String tab[])
    {
        Integer sizeTableau = poissons.length;

        System.out.println( "la size du tableau est : " + sizeTableau);

        // loop indice
        for( int i = 0 ; i < sizeTableau ; i++ )
        {
            String element = poissons[i];
            System.out.println(String.format("n° %d : %s", i, element));
            // n°1 : dauphin
        }

        // loop foreach
        for (String element : poissons)
        {
            System.out.println( element );
        }
    }
    public static void main(String[] args) {

        showArray( poissons);

        // local in main
        String oiseauxs[] = {"pivert", "pie", "merle", "colibri", "rouge-gorge", "corbeau", "kiwi"};

        showArray(oiseauxs);

    }
    
}
