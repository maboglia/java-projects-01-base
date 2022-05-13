class Quadrato {
  private Punto altoSx;
  private Punto bassoDx;

  public Quadrato() {
    this (new Punto(), new Punto());
  }

  public Quadrato(int x1, int y1, int x2, int y2) {
    this(new Punto(x1,y1), new Punto(x2,y2));
  }

  public Quadrato(Punto a, Punto b) {
    altoSx = a;
    bassoDx = b;
  }

  public void setAltoSx(Punto x) {
    altoSx = x;
  }

  public void setBassoDx(Punto x) {
    bassoDx = x;
  }
  
  public Punto getAltoSx() {
    return altoSx;
  }

  public Punto getBassoDx() {
    return bassoDx;
  }

  public String toString() {
    return "quadrato: alto Sx " + getAltoSx() + 
           " basso Dx " + getBassoDx();
  }
}