package br.com.boraviajar.api.repository;

import br.com.boraviajar.api.model.Destino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinoRepository extends JpaRepository<Destino, Long> {}