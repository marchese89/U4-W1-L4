package ex1_ex2;

import java.text.DecimalFormat;

public class Dipendente {

    public static DecimalFormat formatoDecimali = new DecimalFormat("#.##");
    public double stipendioBase = 1000;

    private int matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;

    public Dipendente(int matricola,Dipartimento dipartimento){
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERARIO;
    }

    public Dipendente(int matricola, Dipartimento dipartimento, double stipendio, double importoOrarioStraordinario, Livello livello){
        this.matricola = matricola;
        this.livello = livello;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public long getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void stampaDatiDipendente(){
        System.out.println("Dati dipendente");
        System.out.println("matricola: "+formatoDecimali.format(this.matricola));
        System.out.println("stipendio: "+formatoDecimali.format(this.stipendio));
        System.out.println("importo orario straordinario: "+formatoDecimali.format(importoOrarioStraordinario));
        System.out.println("livello: "+this.livello);
        System.out.println("dipartimento: "+ this.dipartimento);
    }

    public Livello promuovi(){
        if(this.getLivello() == Livello.OPERARIO){
            this.livello = Livello.IMPIEGATO;
            this.stipendio = this.stipendioBase*1.2;
        }
        else if(this.getLivello() == Livello.IMPIEGATO){
            this.livello = Livello.QUADRO;
            this.stipendio = this.stipendioBase*1.5;
        }
        else if(this.getLivello() == Livello.QUADRO){
            this.livello = Livello.DIRIGENTE;
            this.stipendio = this.stipendioBase*2;
        }
        else if(this.getLivello() == Livello.DIRIGENTE){
            System.out.println("ERRORE! non si può salire di livello! "+this.livello);
        }
        return this.livello;
    }

    public static double calcolaPaga(Dipendente d){
        return d.getStipendio();
    }
    public static double calcolaPaga(Dipendente d, int oreStraordinario){
        return d.stipendio+(oreStraordinario*d.importoOrarioStraordinario);
    }
}
