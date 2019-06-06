package rocks.zipcode.io;

/**
 * @author leon on 30/01/2019.
 */
public class Item {
    private String name;
    private Double price;
    private Long id;

    public Item() {
        this(0l, "", 0.01);
    }

    public Item(Long id, String name, Double price) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
