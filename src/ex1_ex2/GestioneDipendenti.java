package ex1_ex2;

import java.util.LinkedList;

public class GestioneDipendenti {
    public static void main(String[] args) {
        Dipendente d = new Dipendente(1, Dipartimento.PRODUZIONE, 1000.65, 12, Livello.OPERARIO);
        Dipendente d2 = new Dipendente(2, Dipartimento.PRODUZIONE, 1030.65, 15, Livello.OPERARIO);
        Dipendente d3 = new Dipendente(3, Dipartimento.AMMINISTRAZIONE, 1200.12, 18, Livello.IMPIEGATO);
        Dipendente d4 = new Dipendente(4, Dipartimento.VENDIDE, 2000.80, 22, Livello.DIRIGENTE);
        //promuovo un operaio a impiegato
        System.out.println("provo a promuovere un operaio,livello: "+d.getLivello());
        Livello ll = d.promuovi();
        System.out.println("nuovo livello: "+ll);
        //promuovo l'impiegato a quadro
        System.out.println("provo a promuovere un impiegato,livello: "+d3.getLivello());
        Livello ll2 = d3.promuovi();
        System.out.println("nuovo livello: "+ll2);
        d.stampaDatiDipendente();
        d2.stampaDatiDipendente();
        d3.stampaDatiDipendente();
        d4.stampaDatiDipendente();
        //calcolo la somma di tutti gli stipendi con 5 ore di straordinario ciascuno
        LinkedList<Dipendente> listaDipendenti = new LinkedList<>();
        listaDipendenti.add(d);
        listaDipendenti.add(d2);
        listaDipendenti.add(d3);
        listaDipendenti.add(d4);
        double sommaStipendi = 0;
        for(Dipendente dipendente: listaDipendenti){
            sommaStipendi += Dipendente.calcolaPaga(dipendente,5);
        }
        System.out.println("Paga di tutti i dipendenti: "+Dipendente.formatoDecimali.format(sommaStipendi));
    }
}
