package br.com.estante.skoob.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record VolumeInfo (String title, List<String> authors, String publishedDate, int pageCount, double averageRating){

    @Override
        public String toString() {
            return "Título: " + title + "\n" +
                    "Autores: " + String.join(", ", authors) + "\n" +
                    "Data de Publicação: " + publishedDate + "\n" +
                    "Número de Páginas: " + pageCount + "\n" +
                    "Avaliação Média: " + averageRating + "\n";
        }
}
