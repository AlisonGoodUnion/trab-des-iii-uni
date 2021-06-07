package com.grupo1.calendariovacinacao.core.useCase;

import com.grupo1.calendariovacinacao.api.controller.resource.ImagemBase64Request;
import com.grupo1.calendariovacinacao.api.controller.resource.ImagemBase64Response;
import com.grupo1.calendariovacinacao.dataprovider.database.Vacina;
import com.grupo1.calendariovacinacao.dataprovider.repository.VacinaRepository;
import lombok.AllArgsConstructor;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Service
@AllArgsConstructor
public class ComprovanteUseCase {

    private final VacinaRepository vacinaRepository;

    public String cadastrar(String base64, Long vacindaId) {

        var vacina = vacinaRepository.findById(vacindaId);

        if(vacina.isEmpty()) throw new RuntimeException("Vacina não encontrada");

        byte[] decodedBytes = Base64.getDecoder().decode(base64);
        try {
            String imagemPath = "C:\\Users\\Henrique\\Documents\\Unisinos\\DEV3\\".concat(vacindaId.toString()).concat(".jpeg");
            FileUtils.writeByteArrayToFile(new File(imagemPath), decodedBytes);
            var vacinaEncontrada = vacina.get();
            vacinaEncontrada.setImagem(imagemPath);
            vacinaRepository.save(vacinaEncontrada);
        } catch (IOException e) {
            throw new RuntimeException("Não foi possível converter a imagem.");
        }

        return base64;

    }

    public List<ImagemBase64Response> buscar(Long usuarioId) {

        var vacinas = vacinaRepository.findByUsuario_id(usuarioId);

        List<ImagemBase64Response> response = new ArrayList<>();

        for (Vacina vacina : vacinas) {

            try {
                byte[] fileContent = FileUtils.readFileToByteArray(new File(vacina.getImagem()));
                String encodedString = Base64.getEncoder().encodeToString(fileContent);
                response.add(new ImagemBase64Response(encodedString, vacina.getId()));
            } catch (IOException e) {
                throw new RuntimeException("Não foi possível buscar os comprovantes");
            }

        }

        return response;
    }


}
