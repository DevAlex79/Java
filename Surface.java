// Alexandra MASI

public class Surface {

    public static double surfaceRect(int largeur, int longueur)
    {
        return largeur * longueur;
    }

    public static double surfaceCarre(int cote)
    {
        return cote * cote;
    }

    public static double surfaceCercle(double rayon)
    {
        return rayon * rayon * 3.14;
    }
    
    public static void main ( String[] args)
    {
        //System.out.println( args[0] );
        System.out.println( surfaceRect(5, 8));
        System.out.println( surfaceCarre(7));
        System.out.println( surfaceCercle(7.5));

    }
}
