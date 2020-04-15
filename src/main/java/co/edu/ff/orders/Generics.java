package co.edu.ff.orders;

import co.edu.ff.orders.user.domain.Password;

import java.util.function.Function;

public class Generics {
    public static <T> String toString(T object) {
        return object.toString();
    }

    public Password creator(String value, Function<String, Password> creator) {
        return creator.apply(value);
    }

    public static void main(String[] args) {
        Function<String, Password> creator = new Function<String, Password>() {
            @Override
            public Password apply(String s) {
                return Password.of(s);
            }
        };


        Password password = creator.apply("PasswordT");

        System.out.println(password);
    }


}
