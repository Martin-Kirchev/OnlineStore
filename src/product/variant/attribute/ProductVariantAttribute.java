package product.variant.attribute;

import util.entity.NamedEntity;

public class ProductVariantAttribute extends NamedEntity {

    public ProductVariantAttribute(int id, String name) {

        this.setId(id);
        this.setName(name);
    }

}
