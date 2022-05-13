class Cerchio {
  private Punto centro;
  private double raggio;

  public Cerchio() {
    this(new Punto(),0);
  }

  public Cerchio(double x, double y, double r) {
    this(new Punto(x,y),r);
  }

  public Cerchio(Punto c, double r) {
    centro = c;
    raggio = r;
  }

  public void setCentro(Punto c) {
    centro = c;
  }

  public void setRaggio(double r) {
    raggio = r;
  }
  
  public Punto getCentro() {
    return centro;
  }

  public double getRaggio() {
    return raggio;
  }

  public String toString() {
    return "cerchio: centro " + getCentro() + 
           " raggio " + getRaggio();
  }
}