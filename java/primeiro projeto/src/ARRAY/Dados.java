package ARRAY;

import java.util.ArrayList;
import java.util.Scanner;

public class Dados {
    String nome;
    int cep;
    int idade;

    static ArrayList<String> nomes = new ArrayList<>();
    static ArrayList<String> idades = new ArrayList<>();
    static ArrayList<String> ceps = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Dados(int consultar) {

        if (1 == consultar) {

            do {
                System.out.println("Digite o nome (ou digite 'sair' para finalizar): ");
                nome = sc.nextLine();

                if (nome.equalsIgnoreCase("sair")) {
                    break;
                }
                System.out.println("Digitea idade : ");
                idade = sc.nextInt();
                System.out.println("Digite o cep : ");
                cep = sc.nextInt();
                sc.nextLine();

                nomes.add(nome);
                idades.add(Integer.toString(idade));
                ceps.add(Integer.toString(cep));
                //  break;
            } while (true);

        } else if (2 == consultar) {

            for (String n : nomes) {
                System.out.println("nomes: " + n);
            }

        } else if (3 == consultar) {

            System.out.println("qual usuario voce deseja remover? ");
            String rmnome = sc.nextLine();

            for (int i = 0; i < nomes.size(); i++) {
                if (nomes.remove(rmnome)) {
                    idades.remove(i);
                    ceps.remove(i);
                    System.out.println("usuario " + rmnome + " removido");
                    for (String name : nomes) {
                        System.out.println("pessoas ainda  cadastradas: " + name);
                    }
                }
            }
        } else if (4 == consultar) {

            System.out.println("qual usuario voce deseja olhar o status: ");
            String status = sc.nextLine();
            for (int i = 0; i < nomes.size(); i++) {
                if (status.equalsIgnoreCase(nomes.get(i))) {
                    System.out.println("nome do usuario: "+nomes.get(i));
                    System.out.println("idade do usuario: "+idades.get(i));
                    System.out.println("cep do usuario: "+ceps.get(i));
                }
            }
        } else if (5 == consultar) {
            System.out.println("finalizando programa");
        }
    }

}
