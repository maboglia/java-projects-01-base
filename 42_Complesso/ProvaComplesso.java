class ProvaComplesso {

  public static void main (String[] args) {
    Complesso x = new Complesso(1,1);
    Complesso i = new Complesso(0,1);
    Complesso y = new Complesso();
    Complesso z = new Complesso();

    y.setRe(3);
    y.setIm(3);
    z.leggiComplesso();
    System.out.println(z);
    System.out.println(x);
    System.out.println(i);
    System.out.println(y);
    y.moltiplicamiPer(x);
    System.out.println(y);
    z = Complesso.moltiplica(x,y);
    System.out.println(z);
  }
}