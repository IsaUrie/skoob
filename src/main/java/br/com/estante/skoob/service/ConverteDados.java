package br.com.estante.skoob.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements ConverteDadosGateway {

    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDados(String json, Class<T> tipoClasse) {
        try {
            return mapper.readValue(json, tipoClasse);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
