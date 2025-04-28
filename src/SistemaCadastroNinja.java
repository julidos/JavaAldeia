import java.util.ArrayList;
import java.util.Scanner;

public class SistemaCadastroNinja {
    public static void main(String[] args) {
        ArrayList<Ninja> listaNinjas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=========== Sistema de ninjas ===========");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Atualizar Ninja");
            System.out.println("4. Excluir Ninja");
            System.out.println("5. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1:
                    System.out.println("Digite o Nome do Ninja: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a Idade do Ninja: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Escolha a Aldeia do Ninja: \n   1.FOLHA \n   2.NEVOA\n   3.AREIA\n   4.NUVEM");
                    int opcaoAldeia = scanner.nextInt();
                    scanner.nextLine();
                    Aldeia aldeiaSelecionada;
                    switch (opcaoAldeia) {
                        case 1:
                            aldeiaSelecionada = Aldeia.FOLHA;
                            break;
                        case 2:
                            aldeiaSelecionada = Aldeia.NEVOA;
                            break;
                        case 3:
                            aldeiaSelecionada = Aldeia.AREIA;
                            break;
                        case 4:
                            aldeiaSelecionada = Aldeia.NUVEM;
                            break;
                        default:
                            System.out.println("Opção inválida! Definido como FOLHA por padrão");
                            aldeiaSelecionada = Aldeia.FOLHA;
                    }
                    System.out.println("Escolha o Rank do Ninja: \n   1.GENIN \n   2.CHUNIN\n   3.JOUNIN\n   4.ANBU");
                    int opcaoRank = scanner.nextInt();
                    scanner.nextLine();
                    Rank rankSelecionado;
                    switch (opcaoRank) {
                        case 1:
                            rankSelecionado = Rank.GENIN;
                            break;
                        case 2:
                            rankSelecionado = Rank.CHUNIN;
                            break;
                        case 3:
                            rankSelecionado = Rank.JOUNIN;
                            break;
                        case 4:
                            rankSelecionado = Rank.ANBU;
                            break;
                        default:
                            System.out.println("Opção inválida! Definido como GENIN por padrão");
                            rankSelecionado = Rank.GENIN;
                    }
                    System.out.println("É um ninja básico (1) ou avançado (2)?");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    Ninja novoNinja;
                    switch (tipo) {
                        case 1:
                            novoNinja = new NinjaBasico(nome, idade, aldeiaSelecionada, rankSelecionado);
                            break;
                        case 2:
                            System.out.println("Digite o jutsu especial:");
                            String jutsuEspecial = scanner.nextLine();
                            novoNinja = new NinjaAvancado(nome, idade, aldeiaSelecionada, rankSelecionado, jutsuEspecial);
                            break;
                        default:
                            System.out.println("Opção inválida! Definido como ninja básico por padrão");
                            novoNinja = new NinjaBasico(nome, idade, aldeiaSelecionada, rankSelecionado);
                    }

                    listaNinjas.add(novoNinja);

                    System.out.println("Ninja cadastrado com sucesso!");
                    break;
                case 2:
                    if (listaNinjas.isEmpty()) {
                        System.out.println("Não há nenhum ninja cadastrado!!");
                    } else {
                        System.out.println("============ Lista de ninjas ============");
                        for (Ninja ninja : listaNinjas) {
                            System.out.println(ninja.toString());
                            System.out.println("=========================================");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o ID do Ninja que deseja alterar as informações");
                    System.out.println("============ Lista de ninjas ============");
                    for (Ninja ninja : listaNinjas) {
                        System.out.println("ID: " + ninja.id + "\nNome: " + ninja.nome);
                        System.out.println("=========================================");
                    }

                    int idAlterar = scanner.nextInt();
                    scanner.nextLine();

                    for(Ninja ninja : listaNinjas) {
                        if (ninja.getId() == idAlterar) {
                            System.out.println("Digite o novo Nome: (Atual: "+ ninja.nome+")");
                            String novoNome = scanner.nextLine();
                            System.out.println("Digite a nova Idade: (Atual: "+ ninja.idade+")");
                            int novaIdade = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Escolha a nova Aldeia do Ninja: \n   1.FOLHA \n   2.NEVOA\n   3.AREIA\n   4.NUVEM\n(Atual: "+ ninja.aldeia+")");
                            int novaOpcaoAldeia = scanner.nextInt();
                            scanner.nextLine();
                            Aldeia novaAldeiaSelecionada;
                            switch (novaOpcaoAldeia) {
                                case 1:
                                    novaAldeiaSelecionada = Aldeia.FOLHA;
                                    break;
                                case 2:
                                    novaAldeiaSelecionada = Aldeia.NEVOA;
                                    break;
                                case 3:
                                    novaAldeiaSelecionada = Aldeia.AREIA;
                                    break;
                                case 4:
                                    novaAldeiaSelecionada = Aldeia.NUVEM;
                                    break;
                                default:
                                    System.out.println("Opção inválida! Definido como FOLHA por padrão");
                                    novaAldeiaSelecionada = Aldeia.FOLHA;
                            }
                            System.out.println("Escolha o novo Rank do Ninja: \n   1.GENIN \n   2.CHUNIN\n   3.JOUNIN\n   4.ANBU\n(Atual: "+ ninja.rank+")");
                            int novaOpcaoRank = scanner.nextInt();
                            scanner.nextLine();
                            Rank novoRankSelecionado;
                            switch (novaOpcaoRank) {
                                case 1:
                                    novoRankSelecionado = Rank.GENIN;
                                    break;
                                case 2:
                                    novoRankSelecionado = Rank.CHUNIN;
                                    break;
                                case 3:
                                    novoRankSelecionado = Rank.JOUNIN;
                                    break;
                                case 4:
                                    novoRankSelecionado = Rank.ANBU;
                                    break;
                                default:
                                    System.out.println("Opção inválida! Definido como GENIN por padrão");
                                    novoRankSelecionado = Rank.GENIN;
                            }

                            ninja.nome = novoNome;
                            ninja.idade = novaIdade;
                            ninja.aldeia = novaAldeiaSelecionada;
                            ninja.rank = novoRankSelecionado;

                            System.out.println("Ninja atualizado com sucesso!");
                            break;
                        } else {
                            System.out.println("Ninja com ID " + idAlterar + " não encontrado.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Digite o ID do Ninja que deseja excluir");
                    System.out.println("============ Lista de ninjas ============");
                    for (Ninja ninja : listaNinjas) {
                        System.out.println("ID: " + ninja.id + "\nNome: " + ninja.nome);
                        System.out.println("=========================================");
                    }
                    int idExcluir = scanner.nextInt();
                    scanner.nextLine();

                    for(Ninja ninja : listaNinjas) {
                        if (ninja.getId() == idExcluir) {
                            listaNinjas.remove(ninja);
                            System.out.println("Ninja excluído com sucesso!");
                            break;
                        } else {
                            System.out.println("Ninja com ID " + idExcluir + " não encontrado.");
                        }
                    }

                    break;
            }
        } while(opcao != 5);

    }
}
