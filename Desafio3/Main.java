package Nivel_Intermediario.Desafio3;

public class Main {

    /*    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;
    * */
    public static void main(String[] args) {

        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 16;
        Naruto.missao = "Escoltar mercador";
        Naruto.nivelDificuldade = "C";
        Naruto.statusMissao = "Em andamento";

        Naruto.mostrarInformacoes();
        System.out.println("---------------------");


        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 16;
        Sasuke.missao = "Matar um certo alguém";
        Sasuke.nivelDificuldade = "SSS";
        Sasuke.statusMissao = "Em andamento";

        Sasuke.mostrarInformacoes();


    }

}
