class TicketCaisseOne {
// Alexandra


    public static void main( String[] args )
    {
        String articles[] = { "patate", "tomate", "oignons", "radis", "salade", "rose", "jasmin", "nénuphar", "oeillet", "tulipe", "rhododendron"  }; 
        Double prixs[]    = {   1.5,      4.0,          1.6,      1.5,    1.0,       7.0,       14.0,        78.55,     5.5,        4.0,          19.99      }; 
        Double quantites[] = {  3.0,      1.0,         1.0,       0.0,    1.0,       1.0,       0.0,        0.5,      0.0,      2.5,        2.0};


        System.out.println( articles[ 0 ]   );
        System.out.println( articles[ 2 ]   );
        System.out.println( articles[ articles.length-1 ]   );

        System.out.println( "----------------------------" );

        for( int i=0; i < articles.length ; i++ )
            System.out.println( String.format( "article n° %2d -> %20s     %6.2f     %4.2f ", i+1, articles[ i ], prixs[i], quantites[i])   );

       


    /* 
     *              numero   article                prix 
            article n°  1 -> patate                 1.50
            article n°  2 -> tomate                 4.00
            article n°  3 -> oignons                1.60
            article n°  4 -> radis 
            article n°  5 -> salade 
            article n°  6 -> rose                   7.00
            article n°  7 -> jasmin                14.00 
            article n°  8 -> nénuphar              78.55
            article n°  9 -> oeillet 
            article n° 10 -> tulipe 
            article n° 11 -> rodhodendron 
     */

    }
}
