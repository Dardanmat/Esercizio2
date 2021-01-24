
package com.mycompany.es2;
import java.util.ArrayList;

public class SquadraDiCalcio {
    
    private String nome; //nome della squadra di calcio
    private String nomePres; //nome presidente della squadra
    private String nomeAll; //nome dell'allenatore
    private String citta; //città della squadra
    private double capitale; //capitale iniziale della squadra
    private int punti; //punti in campionato
    
    ArrayList <Giocatore> giocatori = new ArrayList<>();

    public SquadraDiCalcio(String nome, String nomePres, String nomeAll, String citta, double capitale, int punti) {
        this.nome = nome;
        this.nomePres = nomePres;
        this.nomeAll = nomeAll;
        this.citta = citta;
        this.capitale = capitale;
        this.punti = punti;
    }

    public String getNome() {
        return nome;
    }

    public String getNomePres() {
        return nomePres;
    }

    public String getNomeAll() {
        return nomeAll;
    }

    public String getCitta() {
        return citta;
    }

    public double getCapitale() {
        return capitale;
    }

    public int getPunti() {
        return punti;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNomePres(String nomePres) {
        this.nomePres = nomePres;
    }

    public void setNomeAll(String nomeAll) {
        this.nomeAll = nomeAll;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public void setCapitale(double capitale) {
        this.capitale = capitale;
    }
    
    public boolean compraGiocatore(Giocatore g, double prezzoAcquisto){
        
        if(prezzoAcquisto <= capitale){
            
            capitale -= prezzoAcquisto;
            giocatori.add(g);
            
            return true;
            
        }else return false;
        
    }
    
    public void vendiGiocatore(Giocatore g, double prezzoVendita){
        
        capitale += prezzoVendita;
        giocatori.remove(g);
        
    }
    
    public boolean compraAllenatore (String nomeCompleto, double prezzoAcquisto){
        
        if(prezzoAcquisto <= capitale){
            
            capitale -= prezzoAcquisto;
            nomeAll = nomeCompleto;
            
            return true;
            
        }else return false;
        
    }
    
    public void vendiAllenatore (double prezzoVendita){
        
        nomeAll = "None";
        capitale += prezzoVendita;
        
    }
    
    public void partitaDisputata(SquadraDiCalcio squadraAvversaria, int golFatti, int golSubiti, double incasso){
        
        capitale += incasso;
        
        punti += golFatti - golSubiti;
        
    }
    
}
