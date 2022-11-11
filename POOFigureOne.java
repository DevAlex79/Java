import java.util.*;
import java.util.ArrayList.*;


class Point
{
    protected Integer x, y;

    public Point( int x, int y )
    {
        this.x = x;
        this.y = y;
    }

    public void affiche()
    {
        System.out.println( String.format( "Point : (%d, %d)", this.x, this.y ) );
    }
}

class Cercle extends Point
{
    int rayon;

    public Cercle( int x, int y, int r )
    {
        super(x, y);
        this.rayon = r;
    }

    public void affiche()
    {
        System.out.println( String.format( "Cercle : (%d, %d) rayon=%d", this.x, this.y, this.rayon ) );
    }
}

class Carre extends Point
{
    int cote;

    public Carre( int x, int y, int c )
    {
        super(x, y);
        this.cote = c;
    }

    public void affiche()
    {
        System.out.println( String.format( "Carre : (%d, %d) cote=%d", this.x, this.y, this.cote ) );
    }
}

class Rectangle extends Point
{
    int lar;
    int lon;

    public Rectangle( int x, int y, int l, int L)
    {
        super(x, y);
        this.lar = l;
        this.lon = L;
    }

    public void affiche()
    {
        System.out.println( String.format( "Rectangle : (%d, %d) Lar=%d Long=%d", this.x, this.y, this.lar, this.lon ) );
    }
}




class  POOFigureOne {
    // Alexandra

    public static void main(String[] args) 
    {

        Point p1 = new Point( 5, 6 );
        p1.affiche();
        // (5, 6)

        Cercle c1 = new Cercle( 11, 61, 45 );
        c1.affiche();
        // (5, 6)

        Carre k1 = new Carre( 18, -3, 15 );
        k1.affiche();
        // Carre : (5, 6) cote=15
        Rectangle r1 = new Rectangle( 3, 19, 99, 18 );
        r1.affiche();
        // Rectangle : (5, 6) long=99 lar=18
    }
}