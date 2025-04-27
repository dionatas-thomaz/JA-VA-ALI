import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDeCompras ListaAlunos = new ListaDeCompras();

        System.out.println("Sistema de Lista de Alunos");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Aluno");
//            System.out.println("2. Remover item");
//            System.out.println("3. Listar itens");
//            System.out.println("4. Alterar item");
//            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o item a adicionar: ");
                    String novoAluno = scanner.nextLine();
                    System.out.println("digite a nota:");
                    Double novaNota = scanner.nextDouble();
                    ListaAlunos.adicionarAluno(novoAluno,novaNota);
                    break;

//                case 2:
//                    System.out.print("Digite o item a remover: ");
//                    String itemRemover = scanner.nextLine();
//                    ListaAlunos.removerItem(itemRemover);
//                    break;
//
//                case 3:
//                    ListaAlunos.listarAlunos();
//                    break;
//
//                case 4:
//                    System.out.print("Digite o item que deseja alterar: ");
//                    String itemAntigo = scanner.nextLine();
//                    System.out.print("Digite o novo valor: ");
//                    String itemNovo = scanner.nextLine();
//                    ListaAlunos.alterarItem(itemAntigo, itemNovo);
//                    break;
//
//                case 5:
//                    System.out.println("Encerrando o programa...");
//                    scanner.close();
//                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}