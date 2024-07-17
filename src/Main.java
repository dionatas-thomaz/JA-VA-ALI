import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        String nome = "joao paulo";
        String tipoCnta = "corrente";
        double contaValor = 1500.99;
        System.out.println("Nome: " + nome);
        System.out.println("Conta: " + tipoCnta);
        System.out.println("Saldo bancario: " + contaValor);
        do {
            System.out.println("Operações\n 1-consultar saldo \n 2- receber valor \n 3- transferir valor \n 4- sair \n Digite a opção desejada: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Saldo atual: " + contaValor);
                    break;
                case 2:
                    System.out.println("Receber valor de : ");
                    double somaValor = sc.nextDouble();
                    contaValor += somaValor;
                    break;
                case 3:
                    System.out.println("Transferir valor: ");
                    double subvalor = sc.nextDouble();
                    contaValor -= subvalor;
                    break;
                default:
                    if (op != 4) {
                        System.out.println("valor invalido :/");
                    }
            }
        } while (op != 4);
        System.out.println("fim do programa");


    }
}
