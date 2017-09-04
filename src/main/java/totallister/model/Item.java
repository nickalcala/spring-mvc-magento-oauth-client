package totallister.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {

    @JsonProperty("id")
    private String id;

    @JsonProperty("sku")
    private String sku;

    @JsonProperty("weight")
    private double weight;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", sku='" + sku + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}