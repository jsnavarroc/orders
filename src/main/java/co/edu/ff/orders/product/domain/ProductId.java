package co.edu.ff.orders.product.domain;

import lombok.Value;

@Value(staticConstructor = "of")
public class ProductId {
    Long value;
}
