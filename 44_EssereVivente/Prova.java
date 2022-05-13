class Prova {
  public static void main (String[] args) {
     Persona p1 = new Persona(); p1.setNome("Sergio");
     p1.setCognome("Porcu"); System.out.println(p1 + "\n");

     Animale a1 = new Animale(); 
     a1.setEta(3); a1.setNome("Cane");
     System.out.println(a1 + "\n");

     Studente s1 = new Studente();
     s1.setNome("Gianni"); s1.setCognome("Rosa");
     s1.setMatricola(123); System.out.println(s1 + "\n");

     Lavoratore l1 = new Lavoratore(); l1.setNome("Stefano");
     l1.setCognome("Quer"); l1.setLavoro("Docente"); 
     l1.setStipendio(10000000); System.out.println(l1 + "\n");
  }
}