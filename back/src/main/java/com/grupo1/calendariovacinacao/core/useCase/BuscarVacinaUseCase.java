package com.grupo1.calendariovacinacao.core.useCase;

import com.grupo1.calendariovacinacao.api.controller.resource.VacinaResponse;
import com.grupo1.calendariovacinacao.core.mapper.VacinaMapper;
import com.grupo1.calendariovacinacao.dataprovider.database.Vacina;
import com.grupo1.calendariovacinacao.dataprovider.repository.VacinaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BuscarVacinaUseCase {

    private final VacinaRepository vacinaRepository;

    public List<VacinaResponse> buscarVacinas(Long usuarioId) {
        var vacinas = vacinaRepository.findByUsuario_id(usuarioId);
        return vacinas.stream().map(VacinaMapper::entityToResponse).collect(Collectors.toList());
    }

}
