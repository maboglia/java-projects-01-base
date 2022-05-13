class Complesso {
  private int re;
  private int im;

  public Complesso() {
    this(0,0);
  }

  public Complesso(int re, int im) {
    this.re = re;
    this.im = im;
  }

  public int getRe() { return re; }
  public int getIm() { return im; }
  public void setRe(int x) { re = x; }
  public void setIm(int x) { im = x; }
  public void set(int x, int y) { setRe(x); setIm(y); }
  
  public void leggiComplesso() {
    System.out.print("Parte reale: ");
    setRe(Utilita.leggiIntero());
    System.out.print("Parte immaginaria: ");
    setIm(Utilita.leggiIntero());
  }

  public String toString() {
    return (getRe() + " + i * " + getIm());
  }
  
  public void moltiplicamiPer(Complesso x) {
    int re, im;
    re = x.getRe() * getRe() - x.getIm() * getIm(); 
    im = x.getRe() * getIm() + x.getIm() * getRe(); 
    this.re = re;
    this.im = im;
  }

  public static Complesso moltiplica (Complesso x, Complesso y){
    return 
     (new 
      Complesso(x.getRe() * y.getRe() - x.getIm() * y.getIm(),
                x.getRe() * y.getIm() + x.getIm() * y.getRe()));
  }
}