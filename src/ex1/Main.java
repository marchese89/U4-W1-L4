package ex1;

public class Main {
    public static void main(String[] args) {
        Dipendente d = new Dipendente(1, Dipartimento.PRODUZIONE, 2000, 12, Livello.IMPIEGATO);
        d.stampaDatiDipendente();
    }
}
