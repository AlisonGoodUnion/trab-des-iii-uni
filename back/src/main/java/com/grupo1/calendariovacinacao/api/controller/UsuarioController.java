package com.grupo1.calendariovacinacao.api.controller;

import com.grupo1.calendariovacinacao.api.controller.resource.UsuarioRequest;
import com.grupo1.calendariovacinacao.api.controller.resource.UsuarioResponse;
import com.grupo1.calendariovacinacao.core.useCase.BuscarUsuarioUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/usuario")
class UsuarioController {

    @Autowired
    private BuscarUsuarioUseCase buscarUsuarioUseCase;

    @GetMapping("/{usuarioId}")
    public ResponseEntity<UsuarioResponse> getUsuario(@PathVariable Long usuarioId) {
        return ResponseEntity.ok(buscarUsuarioUseCase.buscarUsuario(usuarioId));
    }

    @GetMapping("/login")
    public ResponseEntity<UsuarioResponse> getUsuarioLogin(@RequestParam String cpf, @RequestParam String senha) {
        return ResponseEntity.ok(buscarUsuarioUseCase.buscarUsuarioLogin(cpf, senha));
    }

    @PostMapping
    public ResponseEntity<UsuarioResponse> criarUsuario(@RequestBody UsuarioRequest usuarioRequest) {
        return new ResponseEntity<>(buscarUsuarioUseCase.criarUsario(usuarioRequest), HttpStatus.CREATED);
    }

}
