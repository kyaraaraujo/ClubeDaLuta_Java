public class MainAuto {

    // neste main os valores de ataque, defesa e estamina dos dois lutadores são atribuidos aleatoriamente pelo computador
    public static void main(String[] args) {

        int rounds = 100; //colocar aqui quantos vezes os competidores lutarão

        LutadorAutomatico lutAuto = new LutadorAutomatico("Pedro");
        LutadorAutomatico lutAuto2 = new LutadorAutomatico("João");

        LutaAutomatica luta = new LutaAutomatica();

        for(int i = 0; i < rounds; i++ ){
            luta.combate(lutAuto,lutAuto2);
            System.out.println("");
        }
    }
}
