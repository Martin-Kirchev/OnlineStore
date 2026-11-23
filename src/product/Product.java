package product;

import util.entity.NamedEntity;

public class Product extends NamedEntity {

    private String description;

    public Product(int id, String name, String description) {

        this.setId(id);
        this.setName(name);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
