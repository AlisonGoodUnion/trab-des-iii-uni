package com.grupo1.calendariovacinacao.api.controller;

import com.grupo1.calendariovacinacao.api.controller.resource.ImagemBase64Request;
import com.grupo1.calendariovacinacao.api.controller.resource.ImagemBase64Response;
import com.grupo1.calendariovacinacao.api.controller.resource.VacinaResponse;
import com.grupo1.calendariovacinacao.core.useCase.BuscarVacinaUseCase;
import com.grupo1.calendariovacinacao.core.useCase.ComprovanteUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/vacinacao")
class VacinaController {

    @Autowired
    public BuscarVacinaUseCase buscarVacinaUseCase;

    @Autowired
    public ComprovanteUseCase comprovanteUseCase;

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<VacinaResponse>> getQuantidadePorUsuario(@PathVariable Long usuarioId) {
        return ResponseEntity.ok(buscarVacinaUseCase.buscarVacinas(usuarioId));
    }

    @GetMapping("/quantidade/calendario/{calendarioId}")
    public ResponseEntity<List<VacinaResponse>> getQuantidadePorCalendario(@PathVariable Long calendarioId) {
        return ResponseEntity.ok(buscarVacinaUseCase.buscarVacinasTotais(calendarioId));
    }

    @PostMapping("/usuario/{usuarioId}/vacina/{vacinaId}/comprovante")
    public ResponseEntity<String> cadastrarComprovante(@PathVariable Long usuarioId, @PathVariable Long vacinaId, @RequestBody ImagemBase64Request request) {
        return new ResponseEntity<>(comprovanteUseCase.cadastrar(request.getBase64(), vacinaId), HttpStatus.CREATED);
    }

    @GetMapping("/usuario/{usuarioId}/vacina/comprovante")
    public ResponseEntity<List<ImagemBase64Response>> buscarComprovantes(@PathVariable Long usuarioId) {
        return ResponseEntity.ok(comprovanteUseCase.buscar(usuarioId));
    }

}
