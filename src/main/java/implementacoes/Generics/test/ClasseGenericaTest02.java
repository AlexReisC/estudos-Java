package implementacoes.Generics.test;

import java.util.ArrayList;
import java.util.List;

import implementacoes.Generics.dominio.Barco;
import implementacoes.Generics.dominio.Carro;
import implementacoes.Generics.service.RentalService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        RentalService <Carro> rentalService = new RentalService<>(carrosDisponiveis);

        Carro carro = rentalService.buscarObjetoDisponivel();
        rentalService.retornarObjetoAlugado(carro);
    }
    
    
}