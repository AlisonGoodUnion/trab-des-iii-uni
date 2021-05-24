package com.grupo1.calendariovacinacao.dataprovider.repository;

import com.grupo1.calendariovacinacao.dataprovider.database.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository  extends CrudRepository<Usuario, Long> {

    Optional<Usuario> findByCpfAndSenha(String cpf, String senha);

}
