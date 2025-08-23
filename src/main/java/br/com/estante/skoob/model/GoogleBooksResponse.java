package br.com.estante.skoob.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record GoogleBooksResponse(List<Item> items) {
    @Override
    public String toString() {
        return "GoogleBooksResponse{" +
                "items=" + items +
                '}';
    }
}
