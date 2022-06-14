class P {
  public static void main (String[] args) {
    A a = new A();
    B b = new B();
    a.m();
    b.m();
    a = b;
    a.m();
  }
}
