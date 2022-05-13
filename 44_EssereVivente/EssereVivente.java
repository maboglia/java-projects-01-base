class EssereVivente {
  protected int eta;

  public int getEta() { return eta; }
  public void setEta(int x) { eta = x; }

  public String toString () {
    return "ESSERE VIVENTE \nEta': " + getEta();
  }
}

class Animale extends EssereVivente {
  protected String nome;

  public String getNome() { return nome; }
  public void setNome(String n) { nome = n; }

  public String toString () {
    return ("ANIMALE\n" + 
            "Nome: " + getNome() + "\n" + super.toString());
  }
}

class Persona extends EssereVivente {
  protected String cognome;
  protected String nome;

  public String getCognome() { return cognome; }
  public String getNome() { return nome; }
  public void setCognome(String c) { cognome = c; }
  public void setNome(String n) { nome = n; }

  public String toString () {
    return ("PERSONA\n" + 
            "Cognome: " + getCognome() + "\n" +
            "Nome: " + getNome() + "\n" + super.toString());
  }
}

class Lavoratore extends Persona {
  protected String lavoro;
  protected int stipendio;

  public int getStipendio() {return stipendio;}
  public String getLavoro() {return lavoro;}
  public void setStipendio(int s) {stipendio = s;}
  public void setLavoro(String s) {lavoro = s;}
  public String toString () {
    return ("LAVORATORE\n"  +
            "Lavoro: " + getLavoro() + "\n" + "Stipendio: " + 
            getStipendio()) + "\n" + super.toString();
  }
}

class Studente extends Persona {
  protected int matricola;

  public void setMatricola(int m) { matricola = m; }
  public int getMatricola() { return matricola; }

  public String toString () {
    return ("STUDENTE" + "\n" + "Matricola: " + getMatricola())
            + "\n" + super.toString();
  }
}