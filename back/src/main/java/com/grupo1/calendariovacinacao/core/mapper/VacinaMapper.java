package com.grupo1.calendariovacinacao.core.mapper;

import com.grupo1.calendariovacinacao.api.controller.resource.VacinaResponse;
import com.grupo1.calendariovacinacao.dataprovider.database.Vacina;

public final class VacinaMapper {

    private VacinaMapper() {
        super();
    }

    public static VacinaResponse entityToResponse(Vacina vacina) {

        var response = new VacinaResponse();

        response.setUsuario(new UsuarioMapper().entityToResponse(vacina.getUsuario()));
        response.setCalendario(new CalendarioMapper().entityToResponse(vacina.getCalendario()));
        response.setId(vacina.getId());
        response.setDataVacina(vacina.getDataVacina());

        return  response;

    }

}
