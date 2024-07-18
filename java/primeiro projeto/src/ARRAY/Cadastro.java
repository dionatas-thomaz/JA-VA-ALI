package ARRAY;
import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int op;
            do {
                System.out.println("escolha uma opcao:\n [1] Cadastrar Usuario\n [2] Consultar Usuarios\n [3] Deletar Usuario\n [4] olhar status de usuario\n [5] sair \n");
                op = sc.nextInt();

                new Dados(op);

            } while (op != 5);
        }
    }
}