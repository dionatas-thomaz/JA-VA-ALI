package CadCarros;

public class Carros {
    public static void main(String[] args) {
        AtributosCarros carros = new AtributosCarros();

        carros.ano=1999;
        carros.modelo="velho";
        carros.nome="vectra";
        

        System.out.println("nome: "+carros.nome+"\nano: "+carros.ano+"\nmodelo: "+carros.modelo);
    }
}