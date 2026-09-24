package br.com.boraviajar.api.service;

import br.com.boraviajar.api.model.Destino;
import br.com.boraviajar.api.repository.DestinoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DestinoService {

    private final DestinoRepository destinoRepository;

    // Injeção de dependência via construtor
    public DestinoService(DestinoRepository destinoRepository) {
        this.destinoRepository = destinoRepository;
    }

    public List<Destino> listarTodos() {
        return destinoRepository.findAll();
    }

    public Destino buscarPorId(Long id) {
        return destinoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Destino não encontrado"));
    }

    public Destino salvar(Destino destino) {
        return destinoRepository.save(destino);
    }

    public Destino atualizar(Long id, Destino destinoAtualizado) {
        Destino destinoExistente = buscarPorId(id);

        destinoExistente.setNome(destinoAtualizado.getNome());
        destinoExistente.setEstadoOuRegiao(destinoAtualizado.getEstadoOuRegiao());
        destinoExistente.setPais(destinoAtualizado.getPais());
        destinoExistente.setCategoria(destinoAtualizado.getCategoria());
        destinoExistente.setDescricao(destinoAtualizado.getDescricao());

        return destinoRepository.save(destinoExistente);
    }

    public void deletar(Long id) {
        Destino destino = buscarPorId(id);
        destinoRepository.delete(destino);
    }
}