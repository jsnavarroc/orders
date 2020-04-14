package co.edu.ff.orders;

import co.edu.ff.orders.user.domain.UserAuthRequest;
import co.edu.ff.orders.user.domain.Username;
import co.edu.ff.orders.user.serialization.UsernameAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonExample {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Username.class, new UsernameAdapter())
                .create();

        Username username = Username.of("test-username");
        String password = "password...";
        UserAuthRequest request = UserAuthRequest.from(
                username,
                password
        );

        System.out.println(gson.toJson(request));
        System.out.println(gson.fromJson("{\"username\":\"test-username\",\"password\":\"password...\"}", UserAuthRequest.class));

    }
}
