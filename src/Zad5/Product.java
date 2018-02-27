package Zad5;

public class Product {
    private String name;
    private String descryption;
    private String specification;

    public Product(String name, String descryption, String specification) {
        this.name = name;
        this.descryption = descryption;
        this.specification = specification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescryption() {
        return descryption;
    }

    public void setDescryption(String descryption) {
        this.descryption = descryption;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", descryption='" + descryption + '\'' +
                ", specification='" + specification + '\'' +
                '}';
    }
}
