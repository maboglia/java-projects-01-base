/** Programma per la prova della classe tempo. */
class ProvaTempo {

  public static void main (String[] args) {
    Tempo t1, t2;

    t1 = new Tempo();
    t2 = new Tempo(12,30,10);
    System.out.println(t1);
    System.out.println(t2);
    t1 = t2;
    System.out.println(t2);
    t1.setTempo(23,59,59);
    System.out.println(t1);
    t1.setTempo(23,61,59);
    System.out.println(t1);
  }
}