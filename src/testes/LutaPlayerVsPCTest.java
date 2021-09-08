package testes;

import luta.LutaPlayerVsPC;
import lutadores.LutadorAutomatico;
import lutadores.LutadorPlayer;

public class LutaPlayerVsPCTest {
    public static void main(String[] args) {

        LutadorPlayer lutador1 = new LutadorPlayer("Ichigo");
        LutadorAutomatico lutAuto = new LutadorAutomatico("Kenpachi");

        int rounds = 2;

        LutaPlayerVsPC luta = new LutaPlayerVsPC();

        for(int i = 0; i < rounds; i++ ){
            luta.combate(lutador1, lutAuto);
            System.out.println("");
        }
    }
}
