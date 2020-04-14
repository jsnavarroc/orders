package co.edu.ff.orders.configuration;

import co.edu.ff.orders.user.domain.Username;
import co.edu.ff.orders.user.serialization.UsernameAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GsonConfiguration {

    @Bean
    public Gson gson(){
        return new GsonBuilder()
                .registerTypeAdapter(Username.class, new UsernameAdapter())
                .create();
    }
}
