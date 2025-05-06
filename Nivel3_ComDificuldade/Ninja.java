package Nivel_Intermediario.Nivel3_ComDificuldade;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void setNome(String nome) { this.nome = nome;}
    public void setIdade(int idade) { this.idade = idade;}
    public void setMissao(String missao) { this.missao = missao;}
    public void setNivelDificuldade(String nivelDificuldade) {this.nivelDificuldade = nivelDificuldade;}
    public void setStatusMissao(String statusMissao) {this.statusMissao = statusMissao;}

    public String getNome() { return nome; }


    public void mostrarInformacoes(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Missao: "+ missao);
        System.out.println("Nível de Dificuldade: "+ nivelDificuldade);
        System.out.println("Status da missão: "+ statusMissao);
    }

}
