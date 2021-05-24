package com.grupo1.calendariovacinacao.core.mapper;

import com.grupo1.calendariovacinacao.api.controller.resource.UsuarioRequest;
import com.grupo1.calendariovacinacao.api.controller.resource.UsuarioResponse;
import com.grupo1.calendariovacinacao.dataprovider.database.Usuario;
import org.modelmapper.ModelMapper;

public class UsuarioMapper {

    private final ModelMapper modelMapper;

    public UsuarioMapper() {
        this.modelMapper = new ModelMapper();
    }

    public UsuarioResponse entityToResponse(Usuario usuario) {
        return modelMapper.map(usuario, UsuarioResponse.class);
    }

    public Usuario requestToEntity(UsuarioRequest usuarioRequest) {
        return modelMapper.map(usuarioRequest, Usuario.class);
    }

}
