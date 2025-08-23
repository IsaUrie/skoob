package br.com.estante.skoob.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Item (VolumeInfo volumeInfo) {
    @Override
    public String toString() {
        return "Item{" +
                "volumeInfo=" + volumeInfo +
                '}';
    }
}
