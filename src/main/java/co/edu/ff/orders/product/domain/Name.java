package co.edu.ff.orders.product.domain;

import co.edu.ff.orders.common.Preconditions;
import lombok.Value;

@Value(staticConstructor = "of")
public class Name {
    String value;

    public Name(String value) {
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(value.length()> 2 && value.length()<=100);
        this.value = value;
    }
}
