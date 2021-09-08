import java.util.Random;

public class Main {

    //neste main o usuário irá atribuir valores de ataque,  defesa e estamina de cada lutador via console
    public static void main(String[] args) {

        Lutador lutador1 = new Lutador("Rodrigo");
        Lutador lutador2 = new Lutador("Paulo");

        int rounds = 100; //colocar aqui quantas vezes os competidores lutarão

        Luta luta = new Luta();

        for(int i = 0; i < rounds; i++ ){
            luta.combate(lutador1,lutador2);
            System.out.println("");
        }
    }
}
