package br.com.boraviajar.api.model;

public record Destino(
    Long id,
    String nome,
    String estadoOuRegiao,
    String pais,
    String categoria,
    String descricao
) {}
