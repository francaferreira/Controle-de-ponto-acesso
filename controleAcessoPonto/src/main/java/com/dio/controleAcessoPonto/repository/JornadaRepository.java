package com.dio.controleAcessoPonto.repository;

import com.dio.controleAcessoPonto.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Facilita nas buscas dos dados através do métodos criados autompaticamente pelo JPA
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
