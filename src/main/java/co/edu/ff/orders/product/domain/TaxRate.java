package co.edu.ff.orders.product.domain;

import co.edu.ff.orders.common.Preconditions;
import lombok.Value;

import java.math.BigDecimal;

@Value(staticConstructor = "of")
public class TaxRate {
    BigDecimal value;

    public TaxRate(BigDecimal value) {
        Preconditions.checkNotNull(value);
        boolean condition =  value.compareTo(BigDecimal.ZERO) >= 0 && value.compareTo(BigDecimal.ONE) <= 0;
        Preconditions.checkArgument(condition);
        this.value = value;
    }
}
