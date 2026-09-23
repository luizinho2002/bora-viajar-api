package br.com.boraviajar.api.service;

import br.com.boraviajar.api.model.Destino;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service 
public class DestinoService {

    private final List<Destino> destinos = new ArrayList<>();

    public DestinoService() {
        destinos.add(new Destino(1L, "Ouro Preto", "Minas Gerais", "Brasil", "Histórico", "Cidade Históirica famosa pela arquitetura colonial e barroca."));
        destinos.add(new Destino(2L, "Fernando de Noronha", "Pernambuco", "Brasil", "Praia", "Arquipélago famoso por suas praias paradisíacas e vida marinha."));
    }

    public List<Destino> listarTodos() {
        return destinos;
    }

    public Destino buscarPorId(Long id) {
        return destinos.stream()
                .filter(destino -> destino.id().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Destino não encontrado"));
    }
}


