class Utilita {
  static int leggiIntero() {
    byte[] b = new byte[9];
    int res = 0;
    try {
      System.in.read(b);
    } catch (Exception e) {}
    for (int i = 0; i < b.length; i++)
      if (b[i] >= '0' && b[i] <= '9')
        res = res * 10 + b[i] - '0';
      else
        break;
    return res;
  }
}