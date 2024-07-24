package BlocoDeInicializacao.Testss;
import BlocoDeInicializacao.Dominio.Anime;
public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("kiko");
 
         for (int eps : anime.getEpisodios()) {
             System.out.print(eps+ " ");
         }
     }
}
