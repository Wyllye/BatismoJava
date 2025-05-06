package Nivel_Intermediario.Desafio3;

public class Uchiha extends Ninja{

    String habilidadeEspecial;

    public void mostrarInformacoes(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Missao: "+ missao);
        System.out.println("Nível de Dificuldade: "+ nivelDificuldade);
        System.out.println("Status da missão: "+ statusMissao);
        mostrarHabilidadeEspecial();

    }

    public void mostrarHabilidadeEspecial(){
        System.out.println("O Sharingan tá ativado e agora a cobra vai fumar!");
    }

}
