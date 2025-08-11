package Desafio.Desafio4;

public class NinjaAvançado extends NinjaBasico implements Ninja{

    String especialidade;

    @Override
    public void executarHabilidade (){
        System.out.println("Vou executar minha habilidade: " + habilidade + "do tipo: " + tipoHabilidade);
        System.out.println("Minha especialidade é com " + especialidade);
        System.out.println("");
    }

    /*Construtores*/

    public NinjaAvançado(String nome, int idade, String aldeia, String habilidade, TipoHabilidade tipoHabilidade, String especialidade) {
        super(nome, idade, aldeia, habilidade, tipoHabilidade);
        this.especialidade = especialidade;
    }

    public  NinjaAvançado(){

    }
}
