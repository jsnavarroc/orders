package co.edu.ff.orders.product.domain;

import lombok.Value;

import java.math.BigDecimal;

@Value(staticConstructor = "of")
public class BasePrice {
    BigDecimal value;
}
