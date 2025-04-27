import java.util.ArrayList;

public class ListaAlunos {
    private ArrayList<Aluno> alunos;

    public ListaAlunos() {
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(String nome, double nota) {
        alunos.add(new Aluno(nome, nota));
        System.out.println("Aluno adicionado: " + nome + " - Nota: " + nota);
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de Alunos:");
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }

    public void atualizarNota(String nome, double novaNota) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) {
                aluno.setNota(novaNota);
                System.out.println("Nota atualizada para " + nome);
                return;
            }
        }
        System.out.println("Aluno " + nome + " não encontrado.");
    }

    public double calcularMedia() {
        if (alunos.isEmpty()) return 0;

        double soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.getNota();
        }
        return soma / alunos.size();
    }
}