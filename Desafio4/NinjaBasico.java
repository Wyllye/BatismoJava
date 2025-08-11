package Desafio.Desafio4;

import java.sql.SQLOutput;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    String aldeia;
    String habilidade;
    TipoHabilidade tipoHabilidade;


    public void  mostrarInformacoes(){
        System.out.println("Eu sou : " + nome);
        System.out.println("Tenho: " + idade + " anos de idade");
        System.out.println("Pertenço a " + aldeia);
        System.out.println("");
    }

    public void executarHabilidade (){
        System.out.println("Vou executar minha habilidade: " + habilidade + " do tipo: " + tipoHabilidade);
        System.out.println("");
    }

    /*Construtores*/

    public NinjaBasico(String nome, int idade, String aldeia, String habilidade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;
    }

    public NinjaBasico (){

    }
}
