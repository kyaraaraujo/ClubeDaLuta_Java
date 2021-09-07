import java.util.Random;

public class Luta {
    private Lutador lutador1 = new Lutador("Rodrigo");
    private Lutador lutador2 = new Lutador("Paulo");

    void combate(){
        while(lutador1.getEstamina() > 0 && lutador2.getEstamina() > 0){
            acao(lutador1);
            acao(lutador2);
            if(lutador1.getAcao().equals("Ataque") && lutador2.getAcao().equals("Ataque")){
                lutador1.setEstamina(lutador1.getEstamina() - lutador2.getAtaque()/2);
                lutador2.setEstamina(lutador2.getEstamina() - lutador1.getAtaque()/2);
            } else if(lutador1.getAcao().equals("Ataque") && lutador2.getAcao().equals("Defesa")){
                lutador2.setEstamina(lutador2.getEstamina() - lutador1.getAtaque()/5);

            }else if(lutador1.getAcao().equals("Ataque") && lutador2.getAcao().equals("Recua")){
                lutador2.setEstamina(lutador2.getEstamina() - lutador1.getAtaque());

            }else if(lutador2.getAcao().equals("Ataque") && lutador1.getAcao().equals("Defesa") ){
                lutador1.setEstamina(lutador1.getEstamina() - lutador2.getAtaque()/5);

            }else if(lutador2.getAcao().equals("Ataque") && lutador1.getAcao().equals("Recua")){
                lutador1.setEstamina(lutador1.getEstamina() - lutador2.getAtaque());
            }


            System.out.println(lutador1.getNome() + " tem estamina: " + lutador1.getEstamina());
            System.out.println(lutador2.getNome() + " tem estamina: " + lutador2.getEstamina());
            System.out.println("");

        }

        if(lutador1.getEstamina() > lutador2.getEstamina()){
            System.out.println("**** E o vencedor  foi o lutador " + lutador1.getNome() + "****");
        }else{
            System.out.println("**** E o vencedor  foi o lutador " + lutador2.getNome() + "****");
        }
    }


    void acao(Lutador l){
        Random aleatorio = new Random();
        int movimento = aleatorio.nextInt(3);

        switch (movimento){
            case 0 : l.atacar();
                break;

            case 1 : l.defender();
                break;

            case 2 : l.recuar();
                System.out.println(l.getNome() + " recuou " );
                break;

        }
    }
}
