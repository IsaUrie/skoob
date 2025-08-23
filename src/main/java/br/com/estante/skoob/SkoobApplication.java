package br.com.estante.skoob;

import br.com.estante.skoob.model.GoogleBooksResponse;
import br.com.estante.skoob.model.VolumeInfo;
import br.com.estante.skoob.service.ConsumoApi;
import br.com.estante.skoob.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SkoobApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SkoobApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        ConsumoApi consumoApi = new ConsumoApi();
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=flowers+inauthor:keyes&key=AIzaSyCqS4vAeJs5P0figrapfF0_EG-UnrW2db8";
        String json = consumoApi.obterDados(endereco);
        //System.out.println(json);
        ConverteDados converteDados = new ConverteDados();
        GoogleBooksResponse dadosLivro = converteDados.obterDados(json, GoogleBooksResponse.class);
        VolumeInfo primeiroVolume = dadosLivro.items().getFirst().volumeInfo();

        System.out.println(primeiroVolume);
    }
}
