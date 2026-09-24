package br.com.boraviajar.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_destinos")
public class Destino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 2, max = 100, message = "O nome deve ter entre 2 e 100 caracteres")
    private String nome;

    @NotBlank(message = "O estado ou região é obrigatório")
    private String estadoOuRegiao;

    @NotBlank(message = "O país é obrigatório")
    private String pais;

    @NotBlank(message = "A categoria é obrigatória")
    private String categoria;

    @Size(max = 500, message = "A descrição não pode ter mais de 500 caracteres")
    private String descricao;

    // Construtor padrão (exigido pelo JPA)
    public Destino() {
    }

    // Construtor completo
    public Destino(Long id, String nome, String estadoOuRegiao, String pais, String categoria, String descricao) {
        this.id = id;
        this.nome = nome;
        this.estadoOuRegiao = estadoOuRegiao;
        this.pais = pais;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstadoOuRegiao() {
        return estadoOuRegiao;
    }

    public void setEstadoOuRegiao(String estadoOuRegiao) {
        this.estadoOuRegiao = estadoOuRegiao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}