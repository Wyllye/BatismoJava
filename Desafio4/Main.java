package Desafio.Desafio4;

public class Main {

    public static void main(String[] args) {

        NinjaBasico naruto = new NinjaBasico("Naruto", 15, "Aldeia da folha", "Clone das sombras", TipoHabilidade.Ninjutsu);
        naruto.mostrarInformacoes();
        naruto.executarHabilidade();

        NinjaBasico sasuke = new NinjaBasico("Sasuke", 15, "Aldeia da folha", "Katon - Bola de fogo", TipoHabilidade.Katon);
        sasuke.mostrarInformacoes();
        sasuke.executarHabilidade();

        NinjaAvançado gai = new NinjaAvançado("Maito Gai", 30, "Aldeia da folha", "Chutes giratórios", TipoHabilidade.Taijutso, "Abrir portões");
        gai.mostrarInformacoes();
        gai.executarHabilidade();


    }
}
