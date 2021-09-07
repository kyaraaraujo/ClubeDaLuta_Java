import java.util.Random;

public class Main {


    public static void main(String[] args) {
        int valor = -1;


//        LutadorAutomatico lutAuto = new LutadorAutomatico("Pedro");
//        LutadorAutomatico lutAuto2 = new LutadorAutomatico("João");

        LutadorAutomatico lut[] = new LutadorAutomatico[3];

        for (int i = 0; i < lut.length;i++ ){
            lut[i] = new LutadorAutomatico("Auto");
        }

        for (int i = 0; i < lut.length; i++){
            for (int j = 0; j < lut.length; j++){
                LutaAutomatica lutaAuto = new LutaAutomatica();
                lutaAuto.combate(lut[i], lut[j]);
            }
        }








//        LutaAutomatica lutaAuto = new LutaAutomatica();
//
//        for (int i = 0; i < 1000; i++) {
//            lutaAuto.combate(lutAuto, lutAuto2);
//        }


//        Lutador lutador1 = new Lutador("Rodrigo");
//        Lutador lutador2 = new Lutador("Paulo");
//
//        System.out.println(lutador2.getEstamina());
//        System.out.println(lutador1.getEstamina());
//
//
//
//        Luta luta = new Luta();
//
//        for(int i = 0; i < 100; i++ ){
//            luta.combate(lutador1,lutador2);
//        }
    }
}
