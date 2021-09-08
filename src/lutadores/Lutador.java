package lutadores;

import java.util.Random;

public abstract class Lutador implements Lutar {
    private String nome;
    private double ataque;
    private double defesa;
    private double estamina;
    private String acao;
    private int vitorias = 0;
    private int empates = 0;
    private int derrotas = 0;
    protected double pontos = 100;

    public void acao() {
        Random aleatorio = new Random();
        int movimento = aleatorio.nextInt(3);

        switch (movimento) {
            case 0:
                atacar();
                break;

            case 1:
                defender();
                break;

            case 2:
                recuar();
                System.out.println(this.nome + " recuou ");
                break;

        }
    }

    @Override
    public void atacar() {
        this.setAcao("Ataque");
        Random aleatorio = new Random();
        double valor = aleatorio.nextInt(100);
        double dano = this.ataque * (valor / 100);
//        this.setEstamina(this.getEstamina() - dano/5);
        System.out.printf(this.getNome() + " atacou com potência %.2f \n", dano);
    }

    @Override
    public void defender() {
        this.setAcao("Defesa");
        Random aleatorio = new Random();
        double valor = aleatorio.nextInt(100);
        double bloqueia = this.defesa * (valor / 100);
        this.setEstamina(this.getEstamina() - bloqueia / 10);
        System.out.printf(this.getNome() + " defendeu com proteção %.2f \n", bloqueia);
    }

    @Override
    public void recuar() {
        this.setAcao("Recua");
        this.setEstamina(getEstamina() + 1);
    }


    public void status() {
        System.out.println("----------------");
        System.out.println("Lutador(a){" +
                "nome = '" + this.nome + '\'' +
                ", ataque = " + this.ataque +
                ", defesa = " + this.defesa +
                ", estamina = " + this.estamina +
                '}');
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public double getEstamina() {
        return estamina;
    }

    public void setEstamina(double estamina) {
        this.estamina = estamina;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

}
