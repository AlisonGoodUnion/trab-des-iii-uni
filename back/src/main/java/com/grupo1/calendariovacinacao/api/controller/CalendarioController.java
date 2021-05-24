package com.grupo1.calendariovacinacao.api.controller;

import com.grupo1.calendariovacinacao.api.controller.resource.CalendarioResponse;
import com.grupo1.calendariovacinacao.core.useCase.BuscarCalendarioUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/vacinacao/calendario")
public class CalendarioController {

    @Autowired
    private BuscarCalendarioUseCase buscarCalendarioUseCase;

    @GetMapping
    public ResponseEntity<List<CalendarioResponse>> getCalendario() {
        return ResponseEntity.ok(buscarCalendarioUseCase.buscar());
    }

    @GetMapping("/idade/{idade}")
    public ResponseEntity<List<CalendarioResponse>> getQuantidade(@PathVariable Integer idade) {
        return ResponseEntity.ok(buscarCalendarioUseCase.buscarPorIdade(idade));
    }

}
