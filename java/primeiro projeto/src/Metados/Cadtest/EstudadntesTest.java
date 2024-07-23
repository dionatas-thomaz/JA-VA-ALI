package Metados.Cadtest;

import Metados.Estudante;
import Metados.ImpressoraEstudy;

public class EstudadntesTest {
        public static void main(String[] args) {
        Estudante aluno = new Estudante();
        Estudante aluno1 = new Estudante();
        ImpressoraEstudy impressora = new ImpressoraEstudy();

        aluno.nome="jhom";
        aluno.idade=12;
        aluno.sexo="masculino";

        aluno1.nome="jao";
        aluno1.idade=32;
        aluno1.sexo="masculino";
impressora.imprimir(aluno);
impressora.imprimir(aluno1);
    }
}
