package com.grupo1.calendariovacinacao.api.controller;

import com.grupo1.calendariovacinacao.api.controller.resource.CalendarioResponse;
import com.grupo1.calendariovacinacao.api.controller.resource.VacinaResponse;
import com.grupo1.calendariovacinacao.core.useCase.BuscarVacinaUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/vacina")
class VacinaController {

    @Autowired
    public BuscarVacinaUseCase buscarVacinaUseCase;

    @GetMapping("/{usuarioId}")
    public ResponseEntity<List<VacinaResponse>> getQuantidade(@PathVariable Long usuarioId) {
        return ResponseEntity.ok(buscarVacinaUseCase.buscarVacinas(usuarioId));
    }

}