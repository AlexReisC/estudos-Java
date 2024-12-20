package implementacoes.Lambdas.test;

import java.util.ArrayList;
import java.util.List;

import implementacoes.Lambdas.dominio.Anime;
import implementacoes.Lambdas.service.AnimeComparator;
// Reference a static method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("A viagem de Chico", 1), new Anime("One piece",1100), new Anime("Sakamoto", 22)));
        // animeList.sort((a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
        // animeList.sort(AnimeComparator::compareByTitle);
        animeList.sort(AnimeComparator::compareByEpisodes);
        System.out.println(animeList);
    }
}
