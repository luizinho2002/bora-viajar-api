package br.com.boraviajar.api.service;

import br.com.boraviajar.api.model.Destino;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinoService {
    
    public List<Destino> listarTodos() {
        return List.of(
            new Destino(
                1L,
                "Ouro Preto",
                "Minas Gerais",
                "Brasil",
                "Histórico",
                "Cidade histórica famosa pela arquitetua colonial e barroca."
            ),
            new Destino(
                2L,
                "Paris",
                "Île-de-France",
                "França",
                "Internacional",
                "A cidade luz, famosa pela Torre Eiffel e rica cultura mundial."
            ),
            new Destino(
                3L,
                "Salvador",
                "Bahia",
                "Brasil",
                "Litoral e Histórico",
                "Primeira capital do Brasil, famosa pelo Pelourinho e culinária marcante."
            ),
            new Destino(
               4L,
               "Tóquio",
               "Kanto",
               "Japão",
               "Internacional",
               "Metrópole fascinante que une tecnologia e tradições milenares." 
            )
        );
    }

    // O novo método entra aqui:
    public Destino buscarPorId(Long id) {
        return listarTodos().stream()
                .filter(destino -> destino.id().equals(id))
                .findFirst()
                .orElse(null);
    }
}
