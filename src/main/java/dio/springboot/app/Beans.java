package dio.springboot.app;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//a versões que nao pede essa anotação, mais é sempre bom colocar !
@Configuration
public class Beans {
    //posso criar um Bean do Gson aqui (assim eliminamos o 'new' e a instancia do Gson)
    //tudo que for package externo eu posso vir e criar um Bean pra ele auqi !
    //e tambem classes externas do meu projeto que preciso gerenciar eu coloco aqui
    @Bean
    public Gson gson() {
        return new Gson();
    }
}
