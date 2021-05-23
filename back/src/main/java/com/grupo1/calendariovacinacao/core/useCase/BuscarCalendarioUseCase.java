package com.grupo1.calendariovacinacao.core.useCase;

import com.grupo1.calendariovacinacao.api.controller.resource.CalendarioResponse;
import com.grupo1.calendariovacinacao.core.mapper.CalendarioMapper;
import com.grupo1.calendariovacinacao.dataprovider.repository.CalendarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class BuscarCalendarioUseCase {

    private final CalendarioRepository calendarioRepository;

    public List<CalendarioResponse> buscar() {
        var response = calendarioRepository.findAll();
        return new CalendarioMapper().entityToResponse(response);
    }

    public List<CalendarioResponse> buscarPorIdade(Integer idade) {
        var response = calendarioRepository.findByIdadeMinimaGreaterThanEqualIdadeMaximaLessThanEqual(idade);
        return new CalendarioMapper().entityToResponse(response);
    }

}
