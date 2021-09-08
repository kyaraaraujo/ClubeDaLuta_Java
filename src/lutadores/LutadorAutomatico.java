package lutadores;

import java.util.Random;

public class LutadorAutomatico extends Lutador {

    public LutadorAutomatico(String nome) {
        this.setNome(nome);

        Random aleatorio = new Random();
        this.setAtaque(aleatorio.nextInt(100));

        this.pontos -= this.getAtaque();

        this.setDefesa(aleatorio.nextInt((int)this.pontos));
        this.pontos -= this.getDefesa();

        this.setEstamina(this.pontos * 10);

        this.status();
    }

}
