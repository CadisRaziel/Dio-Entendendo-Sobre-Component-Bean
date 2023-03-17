package dio.springboot.app;


import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//Esse conversor sera um component
//com isso não preciso instancia-lo em lugar nenhum, eu vou é injeta-lo atravez da injeção de dependencia do spring em qualquer lugar da aplicação
//ou seja quando eu preciso fazer a injeção de dependencia uso @Component
public class ConversorJson {
    //nao posso mais fazer a instancia de um objeto, pra isso eu uso @AutoWired
    //private Gson gson = new Gson();

    //Repare que o Gson é um package externo da nossa aplicação, ou seja ele nao tem @Component
    //Então precisamos fazer um Bean dele
    @Autowired
    private Gson gson;

    public ViaCepResponse converter(String json) {
        //vamos converter o json que vem do viaCep em um objeto do nosso dominio
        ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
        return response;
    }
}

//Dica chave: Utiliza @Component porque serão components escaneados na aplicação
//ou seja, quando tenho acesso ao condigo fonte