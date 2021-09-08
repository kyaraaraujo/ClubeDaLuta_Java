package lutadores;

import java.util.Scanner;

public class LutadorPlayer extends Lutador {

    public LutadorPlayer(String nome) {
        this.setNome(nome);
        distribuirPontos();
    }

    public void distribuirPontos() {

        System.out.println("Distribua 100 pontos para ataque, defesa e estamina para o lutador " + this.getNome());
        Scanner scan = new Scanner(System.in);

        System.out.print("Ataque: ");
        double valorAtaqueTemporario = scan.nextDouble();
        if (valorAtaqueTemporario < 0 || valorAtaqueTemporario > 100) {
            do {
                System.out.println("Valor de defesa deve ser entre 0 e 100 ");
                System.out.print("Ataque: ");
                valorAtaqueTemporario = scan.nextDouble();
            } while (valorAtaqueTemporario < 0 || valorAtaqueTemporario > 100);
        }
        this.setAtaque(valorAtaqueTemporario);
        this.pontos -= valorAtaqueTemporario;

        if(this.pontos > 0) {
            System.out.println("Ainda tem " + this.pontos + " para distribuir entre defesa e estamina");

            System.out.print("Defesa: ");
            double valorDefesaTemporario = scan.nextDouble();
            if (valorDefesaTemporario > this.pontos) {
                do {
                    System.out.println("Valor de defesa deve ser menor que " + this.pontos);
                    System.out.print("Defesa: ");
                    valorDefesaTemporario = scan.nextDouble();
                } while (valorDefesaTemporario > this.pontos);
            }
            this.setDefesa(valorDefesaTemporario);
            this.pontos -= valorDefesaTemporario;
        } else {
            System.out.println("Não há pontos disponíveis para defesa.");
        }
        if (this.pontos == 0) {
            this.pontos++;
            System.out.println("Não sobraram pontos para estamina. Recebe pontuação mínima para estamina");
        }
        this.setEstamina(this.pontos * 10);
        System.out.println("Estamina: " + this.getEstamina());
        this.status();
    }

}
