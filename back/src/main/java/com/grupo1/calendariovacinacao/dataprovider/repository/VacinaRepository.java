package com.grupo1.calendariovacinacao.dataprovider.repository;

import com.grupo1.calendariovacinacao.dataprovider.database.Vacina;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VacinaRepository extends CrudRepository<Vacina, Long> {

    List<Vacina> findByUsuario_id(Long usuarioId);

}
