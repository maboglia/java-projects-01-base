public class Persona {
  private String nome;
  private String cognome;
  private String cf;

  // lista di tutti gli oggetti Persona
  private Persona next;
  private static Persona head = null;
  // NB in questo modo un oggetto persona puo' trovarsi
  //    in una sola lista per volta.
  // Ci sono dei problemi se vogliamo fare ad es. una
  // lista per le persone residenti nel comune X, 
  // nella provincia Y etc.

  public Persona(String nome, String cognome, String cf) {
    this.nome = nome;
    this.cognome = cognome;
    this.cf = cf;
    this.next = head;
    head = this;
  }
  public String getCf() {
    return cf;
  }

  public String getCognome() {
    return cognome;
  }

  public String getNome() {
    return nome;
  }
  public static Persona cercaPersona(String input) {
    Persona current = head;
    while (current != null) {
      if (current.cf.equals(input))
        return current;
      current = current.next;
    }
    return null;
  }

}
