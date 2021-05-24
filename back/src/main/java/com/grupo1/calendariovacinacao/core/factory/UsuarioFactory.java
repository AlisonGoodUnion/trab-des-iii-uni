package com.grupo1.calendariovacinacao.core.factory;

import com.grupo1.calendariovacinacao.api.controller.resource.UsuarioRequest;
import com.grupo1.calendariovacinacao.dataprovider.database.Usuario;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UsuarioFactory {

    private final UsuarioRequest usuarioRequest;

    public Usuario toEntity() {
        return Usuario.builder()
                .cpf(usuarioRequest.getCpf())
                .celular(usuarioRequest.getCelular())
                .dataNascimento(usuarioRequest.getDataNascimento())
                .email(usuarioRequest.getEmail())
                .habilitado(usuarioRequest.isHabilitado())
                .nome(usuarioRequest.getNome())
                .senha(usuarioRequest.getSenha())
                .build();
    }

}
