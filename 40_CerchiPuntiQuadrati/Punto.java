class Punto {
  private double x;
  private double y;

  public Punto() {
    this(0,0);
  }

  public Punto(double x, double y) {
    this.x = x; 
    this.y = y;
  }

  public void set(double x, double y) {
    this.x = x; 
    this.y = y;    
  }

  public void setX(double x) {
    this.x = x;
  }

  public void setY(double x) {
    this.y = y;
  }
  
  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}