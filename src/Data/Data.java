package Data;

import java.util.Objects;

public class Data {
    private String type;
    private String brand;
    private String model;
    private double price;
    private OrderStatus status;


    public  Data(String type, String brand, String model, double price, OrderStatus status) {
            this.type = type;
            this.brand = brand;
            this.model = model;
            this.price = price;
            this.status = status;

    }



    @Override
    public String toString() {
        return type + " " + brand + " " + model + " (" + price + " )  - " + status;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return Double.compare(data.price, price) == 0 && Objects.equals(type, data.type) && Objects.equals(brand, data.brand) && Objects.equals(model, data.model) && status == data.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, brand, model, price, status);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
