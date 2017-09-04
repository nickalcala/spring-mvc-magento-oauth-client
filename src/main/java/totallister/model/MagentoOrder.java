package totallister.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MagentoOrder {

    @JsonProperty("items")
    private List<Item> items;

    @JsonProperty("destination")
    private Destination destination;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "MagentoOrder{" +
                "items=" + items +
                ", destination=" + destination +
                '}';
    }

}