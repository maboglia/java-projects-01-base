/** Programma per la prova dei cerchi, punti e quadrati */
class ProvaCerchioQuadrato {

  public static void main (String[] args) {
    Punto p1 = new Punto();
    Punto p2 = new Punto(1,1);
    Cerchio c1 = new Cerchio();
    System.out.println(c1);
    Cerchio c2 = new Cerchio(p1,0);
    System.out.println(c2);
    p2.set(1.2,3.3);
    c1.setCentro(new Punto(12,12));
    System.out.println(c1);
    System.out.println(c1.getCentro());
    System.out.println((c1.getCentro()).getX());
    Cerchio c3 = new Cerchio(p2,1);
    System.out.println(c3);
    Quadrato q1 = new Quadrato();
    System.out.println(q1);
    Quadrato q2 = new Quadrato(p1,p2);
    System.out.println(q2);
  }
}