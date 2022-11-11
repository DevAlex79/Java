public class Pyramid {
// Alexandra
    public static void dessineSablier (int hauteur) {

        //sablier haut

        for (int i = 0; i < hauteur; i++) {

            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }

            for (int j = hauteur - i; j > 0 ; j--) {
                System.out.print("*");
            }

            for (int j = hauteur - i; j > 1 ; j--) {
                System.out.print("*");
            }

            System.out.println("");
        }
        
    
        // sablier bas

        for (int i = 2; i <= hauteur; i ++) {

            for (int j = hauteur - i ; j > 0 ; j--) {
                System.out.print(" ");
            }

            for (int j = 0 ; j < i ; j++) {
                System.out.print("* ");
            }

            for (int j = 1 ; j < i ; j++) {
                System.out.print("* ");
            }

            System.out.println("");
        }

   }
     
}



