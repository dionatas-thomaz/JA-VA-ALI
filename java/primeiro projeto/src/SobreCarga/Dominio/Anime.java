package SobreCarga.Dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    public void init(String nome, String tipo, int episodios,String genero){
        this.init(nome,tipo,episodios);
        this.genero=genero;
    }

    public void imprime(){
        System.out.println("nome do anime: "+this.nome);
        System.out.println("tipo de anime: "+this.tipo);
        System.out.println("quantidade de eps: "+this.episodios);
        System.out.println("genero do anime: "+this.genero);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }
}
