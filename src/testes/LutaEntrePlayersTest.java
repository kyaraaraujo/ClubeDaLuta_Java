package testes;

import luta.Luta;
import lutadores.LutadorPlayer;

public class LutaEntrePlayersTest {

    //neste main o usuário irá atribuir valores de ataque,  defesa e estamina de cada lutador via console
    public static void main(String[] args) {

        LutadorPlayer lutador1 = new LutadorPlayer("Marcelo");
        LutadorPlayer lutador2 = new LutadorPlayer("Isabela");

        int rounds = 100; //colocar aqui quantas vezes os competidores lutarão

        Luta luta = new Luta();

        for(int i = 0; i < rounds; i++ ){
            luta.combate(lutador1,lutador2);
            System.out.println("");
        }
    }
}
