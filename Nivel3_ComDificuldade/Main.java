package Nivel_Intermediario.Nivel3_ComDificuldade;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Ninja[] ninjas = new Ninja[5];
        Uchiha[] ninjaUchiha = new Uchiha[5];
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;
        int contadorNinja = 0;
        int contadorUchiha = 0;

        while (escolha != 4) {

            System.out.println("");
            System.out.println("------------------");
            System.out.println("MENU DE OPÇÕES");
            System.out.println("------------------");
            System.out.println("1 - Exibir informações de todos os ninjas");
            System.out.println("2 - Adicionar novos ninjas");
            System.out.println("3 - Atualizar habilidades especiais dos Uchihas");
            System.out.println("4 - Sair");
            System.out.print("Opção selecionada: ");
            escolha = scanner.nextInt();
            System.out.println("");
            switch (escolha){

                case 1:
                    for (int i = 0; i < contadorNinja; i++) {
                        System.out.println("-----------------");
                        ninjas[i].mostrarInformacoes();
                    }
                    for (int i = 0; i < contadorUchiha; i++) {
                        System.out.println("-----------------");
                        ninjaUchiha[i].mostrarInformacoes();
                    }
                    break;

                case 2:
                    System.out.print("\n O ninja que vamos cadastrar é Uchiha? \n 1 - Sim \n 2 - Não \n Resposta: ");
                    int eUchiha = scanner.nextInt();
                    scanner.nextLine(); //Buffer para limpar o teclado

                    switch (eUchiha){
                        case 1:
                            if (contadorUchiha <= 4 ) {
                                System.out.println("Cadastro Ninja Uchiha");
                                ninjaUchiha[contadorUchiha] = new Uchiha();

                                System.out.print("Digite o nome do Ninja: ");
                                ninjaUchiha[contadorUchiha].nome = scanner.nextLine();

                                System.out.print("\n Digite a idade do Ninja: ");
                                ninjaUchiha[contadorUchiha].idade = scanner.nextInt();
                                scanner.nextLine(); //Buffer para limpar o teclado

                                System.out.print("\n Digite a missão do Ninja: ");
                                ninjaUchiha[contadorUchiha].missao = scanner.nextLine();

                                System.out.print("\n Qual o nível de dificuldade da missão: ");
                                ninjaUchiha[contadorUchiha].nivelDificuldade = scanner.nextLine();

                                System.out.print("\n Qual o status da missão: ");
                                ninjaUchiha[contadorUchiha].statusMissao = scanner.nextLine();

                                System.out.print("\n Qual a habilidade especial do Ninja: ");
                                ninjaUchiha[contadorUchiha].habilidadeEspecial = scanner.nextLine();

                                contadorUchiha++;

                            } else {
                                System.out.println("Não é possível mais cadastrar novos Uchihas");
                            }
                            break;
                        case 2:
                            if (contadorNinja <= 4 ) {
                                System.out.println("Cadastro Ninja Uchiha");
                                ninjas[contadorNinja] = new Ninja();

                                System.out.print("Digite o nome do Ninja: ");
                                ninjas[contadorNinja].nome = scanner.nextLine();

                                System.out.print("\n Digite a idade do Ninja: ");
                                ninjas[contadorNinja].idade = scanner.nextInt();
                                scanner.nextLine(); //Buffer para limpar o teclado

                                System.out.print("\n Digite a missão do Ninja: ");
                                ninjas[contadorNinja].missao = scanner.nextLine();

                                System.out.print("\n Qual o nível de dificuldade da missão: ");
                                ninjas[contadorNinja].nivelDificuldade = scanner.nextLine();

                                System.out.print("\n Qual o status da missão: ");
                                ninjas[contadorNinja].statusMissao = scanner.nextLine();

                                contadorNinja++;
                            } else {
                                System.out.println("Não é possível mais cadastrar novos Ninjas");
                            }
                            break;

                        default:
                            System.out.println("Opção digitada inválida");
                            break;
                        }
                    break;
                case 3:
                    if (contadorUchiha > 0){

                        System.out.println("Lista dos Uchihas: ");
                            for (int i = 0; i < contadorUchiha; i++) {
                                System.out.println((i+1) + "." + ninjaUchiha[i].nome);
                            }

                        System.out.print("De qual Uchiha vamos atualizar as habilidades? ");
                        int alterarHabilidadeUchiha = scanner.nextInt();
                        scanner.nextLine(); //Buffer para limpar o teclado

                        System.out.println("\n Qual a nova habilidade especial do Ninja " + ninjaUchiha[alterarHabilidadeUchiha - 1].nome);
                        System.out.print("Nome da nova habilidade: ");
                        ninjaUchiha[alterarHabilidadeUchiha - 1].habilidadeEspecial = scanner.nextLine();

                    } else {
                        System.out.println("Não existe nenhum Uchiha cadastrado para Atualizarmos as Habilidades especiais");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}