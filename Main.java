
package com.mycompany.es2;

public class Main {

    public static void main(String[] args){

            SquadraDiCalcio sq1 = new SquadraDiCalcio("Falchi", "Gionni Luce", "Gianni Buio", "Mosca", 20000.4 , 0);
            SquadraDiCalcio sq2 = new SquadraDiCalcio("Dinosauri", "Robin R. Petterson", "Peter G. Robinson", "Tokyo", 250000, 0);

            sq1.compraGiocatore(new Giocatore("Gianni", "Beri", 3, 30, 4), 30);
            sq1.compraGiocatore(new Giocatore("Filippo", "Beri", 2, 50, 4), 40);
            sq1.compraGiocatore(new Giocatore("Bartolomeo", "Bartoli", 4, 60, 4), 60);
            sq1.compraGiocatore(new Giocatore("Vincenzo", "Bottega", 4, 90, 1), 100);
            
            sq2.compraGiocatore(new Giocatore("Ciro", "Esposito", 3, 30, 4), 30);
            sq2.compraGiocatore(new Giocatore("Beppe", "Conti", 2, 50, 4), 25);
            sq2.compraGiocatore(new Giocatore("Nardoni", "Mazzo", 4, 60, 4), 30);
            sq2.compraGiocatore(new Giocatore("Andrea", "Cardinale", 4, 90, 1), 120);


        }
    
}
