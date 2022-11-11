public class LoopAlgoTriangle {

    public static void dessineTriangle(int hauteur)
    {
        for(int i = 0; i < hauteur ; i++)
        {
        for( int j = 0 ; j < i ; j++ )
            System.out.print("*");
        System.out.println( "");
        }
    }

    public static void main(String[] args)
    {
        dessineTriangle(8);
    }
}
