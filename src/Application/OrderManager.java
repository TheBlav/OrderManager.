package Application;
import Data.OrderStatus;
import Application.ItemCreator;
import java.util.Scanner
public class OrderManager {

    public static void main(String[] args) {
        ItemCreator create = new ItemCreator();
        Scanner sc = new Scanner(System.in);
        create.addItem("Komputer", "Apple", "Macvook Pros 2018", 4999, OrderStatus.PAID);
        create.addItem("Telefon" , "Xiaomi", "Redmi Note 8", 4999, OrderStatus.NEW);
        create.addItem("Adapter", "OSBC", "HDMI", 19, OrderStatus.SHIPPED);
        create.addItem("Router", "Asus", "RT-AC707", 99, OrderStatus.DELIVERED);
        create.addItem("Tablet", "Samsung", "Galaxy Tab a5", 299, OrderStatus.CANCELLED);
        create.addItem("Laptop", "Dell", "IPV 12 304", 2999, OrderStatus.NEW);

//        create.printItems();
        System.out.println("Proszę podać warunek wyszukiwania, jaki status produktu Pana/Panią interesuje: ");
        OrderStatus[] orderStatuses = OrderStatus.values();
        for (OrderStatus orderStatus : orderStatuses) {
            System.out.println(orderStatus.toString());
        }
        System.out.print("wybieram: ");
        String choice = sc.nextLine();
        OrderStatus.valueOf(choice);


    }
}
