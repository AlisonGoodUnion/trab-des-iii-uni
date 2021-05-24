package com.grupo1.calendariovacinacao.core.mapper;

import com.grupo1.calendariovacinacao.api.controller.resource.CalendarioResponse;
import com.grupo1.calendariovacinacao.dataprovider.database.Calendario;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public final class CalendarioMapper {

    private final ModelMapper modelMapper;

    public CalendarioMapper() {
        this.modelMapper = new ModelMapper();
    }

    public CalendarioResponse entityToResponse(Calendario calendario) {
        return modelMapper.map(calendario, CalendarioResponse.class);
    }

    public List<CalendarioResponse> entityToResponse(List<Calendario> calendarios) {
        return calendarios.stream().map(this::entityToResponse).collect(Collectors.toList());
    }

}
