package week3.geometria;

/**
 * Created by mauro on 23/06/16.
 */
public class Rettangolo2
 {

    private Punto angoloSx = null;

    private int base, altezza;

    public Rettangolo(int x, int y, int b, int h){

        angoloSx    = new Punto(x,y);
        base        = b;
        altezza     = h;

    }
    public Rettangolo(Punto p, int b, int h){

        angoloSx    = new Punto(p.getX(), p.getY());
        base        = b;
        altezza     = h;

    }
    public int getPerimetro(){
        return (base + altezza) * 2;
    }
    public int getArea(){
        return base * altezza;
    }



}
