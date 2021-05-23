package com.grupo1.calendariovacinacao.dataprovider.repository;

import com.grupo1.calendariovacinacao.dataprovider.database.Calendario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CalendarioRepository extends CrudRepository<Calendario, Long> {

    List<Calendario> findAll();

    @Query("SELECT c from Calendario c where ?1 >= c.idadeMinima and ?1 <= c.idadeMaxima")
    List<Calendario> findByIdadeMinimaGreaterThanEqualIdadeMaximaLessThanEqual(Integer idade);

}
