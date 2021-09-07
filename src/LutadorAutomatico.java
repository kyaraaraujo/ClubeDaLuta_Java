
import java.util.Random;
import java.util.Scanner;

public class LutadorAutomatico implements Lutar{
    private String nome;
    private double ataque;
    private double defesa;
    private double estamina;
    private String acao;
    private int vitorias = 0;
    private int empates = 0;
    private int derrotas = 0;


    public LutadorAutomatico(String nome) {
        this.nome = nome;

        Random aleatorio = new Random();
        this.setAtaque(aleatorio.nextInt(100));

        double temp = 100 - this.getAtaque();

        this.setDefesa(aleatorio.nextInt((int)temp));

        this.setEstamina((100 - this.getAtaque() - this.getDefesa()) * 10);

        this.status();
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

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    @Override
    public void atacar() {
        this.setAcao("Ataque");
        Random aleatorio = new Random();
        double valor = aleatorio.nextInt(100);
        double dano = this.ataque * (valor/100);
//        this.setEstamina(this.getEstamina() - dano/3);
        System.out.println(this.getNome() + " atacou com potência " + dano );
    }

    @Override
    public void defender() {
        this.setAcao("Defesa");
        Random aleatorio = new Random();
        double valor = aleatorio.nextInt(100);
        double bloqueia = this.defesa * (valor/100);
//        this.setEstamina(this.getEstamina() - bloqueia/2);
        System.out.println(this.getNome() + " defendeu com proteção " + bloqueia );
    }

    @Override
    public void recuar() {
        this.setAcao("Recua");
        this.setEstamina(getEstamina() + 1);
    }


    public void status() {

        System.out.println("Lutador{" +
                "nome = '" + this.nome + '\'' +
                ", ataque = " + this.ataque +
                ", defesa = " + this.defesa +
                ", estamina = " + this.estamina +
                '}');
    }

}
