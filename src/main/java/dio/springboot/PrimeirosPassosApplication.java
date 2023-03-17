package dio.springboot;

import com.google.gson.Gson;
import dio.springboot.app.ConversorJson;
import dio.springboot.app.ViaCepResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrimeirosPassosApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrimeirosPassosApplication.class, args);
    }

    //qui temos um bean pois estamos injetando dependencia via paramentro da função o 'ConversorJson'
    //porque o CommandLineRunner nao é uma classe, ou interface ou implementação da MINHA APLICAÇÂO
    //ele é uma biblioteca externa (mais eu quero inicia a construção de um bean nele)
    @Bean
    public CommandLineRunner run(ConversorJson conversor) throws Exception {
        return args -> {
            String json = "{\"cep\": \"01001-000\", \"logradouro\": \"Praça da Sé\" , \"localidade\":\"São paulo\"}";
            ViaCepResponse response = conversor.converter(json);
            System.out.println("Dados do CEP: " + response);
        };
    }

}
