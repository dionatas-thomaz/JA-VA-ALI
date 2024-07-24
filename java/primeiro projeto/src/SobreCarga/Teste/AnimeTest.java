package SobreCarga.Teste;

import SobreCarga.Dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("mushuko tensei","tensei",12,"dia a dia");
//        anime.setNome("mushoku tensei");
//        anime.setTipo("tensei");
//        anime.setEpisodios(12);

        anime.imprime();
    }
}
