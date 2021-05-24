package com.grupo1.calendariovacinacao.core.useCase;

import com.grupo1.calendariovacinacao.api.controller.resource.UsuarioRequest;
import com.grupo1.calendariovacinacao.api.controller.resource.UsuarioResponse;
import com.grupo1.calendariovacinacao.core.factory.UsuarioFactory;
import com.grupo1.calendariovacinacao.core.mapper.UsuarioMapper;
import com.grupo1.calendariovacinacao.dataprovider.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class BuscarUsuarioUseCase {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioResponse buscarUsuario(Long usuarioId) {

        var usuario = usuarioRepository.findById(usuarioId);

        if (usuario.isEmpty()) throw new RuntimeException("Usuário não existe na tabela.");

        return new UsuarioMapper().entityToResponse(usuario.get());
    }

    public UsuarioResponse buscarUsuarioLogin(String cpf, String senha) {

        var usuario = usuarioRepository.findByCpfAndSenha(cpf, senha);

        if (usuario.isEmpty()) throw new RuntimeException("Ops! CPF não existe ou a senha esta inválida.");

        return new UsuarioMapper().entityToResponse(usuario.get());
    }

    public UsuarioResponse criarUsario(UsuarioRequest usuarioRequest) {
        var usuarioSalvo = usuarioRepository.save(new UsuarioFactory(usuarioRequest).toEntity());
        return new UsuarioMapper().entityToResponse(usuarioSalvo);
    }


}
