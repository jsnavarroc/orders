package co.edu.ff.orders.product.domain;

import lombok.Value;

@Value(staticConstructor = "from")
public class Product {
    ProductId id;
    Name name;
    Description description;
    BasePrice basePrice;
    TaxRate taxRate;
    ProductStatus productStatus;
    InventoryQuantity inventoryQuantity;
}
