package testes;

import luta.LutaAutomatica;
import lutadores.LutadorAutomatico;

public class MelhorLutadorTest {

    //este main cria lutadores e e lutas automáticamente para determinar a melhor combinação de ataque, defesa e estamina
    public static void main(String[] args) {



        int lutadores = 1; //Escolha o número de lutadores para analisar


        LutadorAutomatico lut[] = new LutadorAutomatico[lutadores];

        for (int i = 0; i < lut.length; i++) {
            lut[i] = new LutadorAutomatico("Auto");
        }

        for (int i = 0; i < lut.length; i++) {
            for (int j = 0; j < lut.length; j++) {
                LutaAutomatica lutaAuto = new LutaAutomatica();
                if (i != j) {
                    lutaAuto.combate(lut[i], lut[j]);
                }
            }
        }

        LutadorAutomatico campeao = lut[0];

        for (int i = 0; i < lut.length; i++) {
            if (lut[i].getVitorias() > campeao.getVitorias()) {
                campeao = lut[i];
            }
        }

        System.out.println("lutadores.Lutador  detentor do cinturarão com "
                + "\n" + campeao.getVitorias() + " Vitórias"
                + "\n" + campeao.getEmpates() + " Empates"
                + "\n" + campeao.getDerrotas() + " Derrotas");
        campeao.status();

    }
}
