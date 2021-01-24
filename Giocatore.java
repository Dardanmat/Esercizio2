
package com.mycompany.es2;


public class Giocatore {
    
    private String nome;
    private String cognome;
    private int gol;
    private double valore;
    private int numPartite;

    
    public Giocatore(String nome, String cognome, int gol, double valore, int numPartite) {
        this.nome = nome;
        this.cognome = cognome;
        this.gol = gol;
        this.valore = valore;
        this.numPartite = numPartite;
    }
    
    void partitaDisputata (int golFatti){

        numPartite++;
        gol += golFatti;

        for(int i=0; i<golFatti; i++){

            valore = valore*1.01;

        }
    }

    float mediaGolPartita(){

            float mediaGol = 0;

            mediaGol = gol/numPartite;

            return mediaGol;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
 
}
