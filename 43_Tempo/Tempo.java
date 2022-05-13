class Tempo {
  private int ore;
  private int minuti;
  private int secondi;

  public Tempo() {
    this(0,0,0);
  }

  public Tempo(int o, int m, int s) {
    if (tempoCorretto(o,m,s)) {
      ore = o;
      minuti = m;
      secondi = s;
    }
    else {
      System.out.println("Errore");
      ore = 0;
      minuti = 0;
      secondi = 0;
    }
  }

  public boolean tempoCorretto(int o, int m, int s) {
    return (o >= 0 && o <= 24 && m >= 0 && 
            m <= 60 && s >= 0 && s <= 60);
  }

  public void setTempo(int o, int m, int s) {
    if (tempoCorretto(o,m,s)) {
      ore = o;
      minuti = m;
      secondi = s;
    }
    else 
      System.out.println("Errore");
  }

  public int getOre() {
    return ore;
  }

  public int getMinuti() {
    return minuti;
  }

  public int getSecondi() {
    return secondi;
  }

  public String toString() {
    return getOre() + ":" + getMinuti() + ":" + getSecondi();
  }
}