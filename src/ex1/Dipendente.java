package ex1;

public class Dipendente {
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
}
