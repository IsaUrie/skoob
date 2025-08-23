package br.com.estante.skoob.service;

public interface ConverteDadosGateway {
    <T> T obterDados(String json, Class<T> tipoClasse);
}
