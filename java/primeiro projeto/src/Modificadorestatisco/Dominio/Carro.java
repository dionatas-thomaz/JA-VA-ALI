package Modificadorestatisco.Dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimine= 250;


    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
    System.out.println("----------");
    System.out.println("nome "+this.nome);
    System.out.println("Velocidade maxima"+this.velocidadeMaxima);
        System.out.println("Velocidade limite"+Carro.velocidadeLimine);
}


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMacima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
