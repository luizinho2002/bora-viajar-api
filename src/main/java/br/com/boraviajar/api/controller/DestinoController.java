package br.com.boraviajar.api.controller;

import br.com.boraviajar.api.model.Destino;
import br.com.boraviajar.api.service.DestinoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController 
@RequestMapping("/api/v1/destinos")
public class DestinoController {

    private final DestinoService destinoService;

    public DestinoController(DestinoService destinoService) {
        this.destinoService = destinoService;
    }

    @GetMapping
    public List<Destino> listarTodos() {
        return destinoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Destino buscarPorId(@PathVariable Long id) {
        return destinoService.buscarPorId(id);
    }

    @PostMapping
    public Destino salvar(@RequestBody Destino destino) {
        return destinoService.salvar(destino);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Long id) {
        destinoService.deletar(id);
    }
}