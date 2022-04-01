package Application;
import Data.OrderStatus;

public class OrderManager {

    public static void main(String[] args) {
        ItemCreator create = new ItemCreator();
      

        create.addItem("Komputer", "Apple", "Macvook Pros 2018", 4999, OrderStatus.PAID);
        create.addItem("Telefon" , "Xiaomi", "Redmi Note 8", 4999, OrderStatus.NEW);
        create.addItem("Adapter", "OSBC", "HDMI", 19, OrderStatus.SHIPPED);
        create.addItem("Router", "Asus", "RT-AC707", 99, OrderStatus.DELIVERED);
        create.addItem("Tablet", "Samsung", "Galaxy Tab a5", 299, OrderStatus.CANCELLED);
        create.addItem("Laptop", "Dell", "IPV 12 304", 2999, OrderStatus.NEW);

//        create.printItems();
      create.io();



    }
}
