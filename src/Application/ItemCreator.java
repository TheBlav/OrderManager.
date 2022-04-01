package Application;
import Data.OrderStatus;
import Data.Data;

import java.util.Scanner;

public class ItemCreator {

    private  int itemNumber = 0;
    private static final int MAX_ITEMS = 1000;
    Data[] items = new Data[MAX_ITEMS];

    public void addItem (String type, String brand, String model, double price, OrderStatus status) {
        if (itemNumber<MAX_ITEMS) {
            items[itemNumber] = new Data(type, brand, model, price, status);
            itemNumber++;
        }
        else
            System.out.println("Przykro mi, przekroczono limit artykułów w sklepie");
    }

    public void printItems(){
        for (int i=0; i<itemNumber; i++){
            System.out.println(items[i].toString());
        }

        }

    Scanner sc = new Scanner(System.in);
    OrderStatus[] values = OrderStatus.values();
    OrderStatus status;
    public void io() {
        System.out.println("Proszę podać warunek wyszukiwania, jaki status produktu Pana/Panią interesuje: ");
        OrderStatus[] orderStatuses = OrderStatus.values();
        for (OrderStatus orderStatus : orderStatuses) {
            System.out.println(orderStatus.toString());

        }
        System.out.print("wybieram: ");
        String choice = sc.nextLine();
        status = fromDescription(choice.toLowerCase());





        for (int i=0; i<itemNumber; i++){
            if (items[i].getStatus() == status){
                System.out.println( items[i].toString());
            }
        }

        }


    public OrderStatus fromDescription (String description){


        for (OrderStatus value : OrderStatus.values()) {
            if (value.getDescription().equals(description))
                return OrderStatus.valueOf(value.name());
        }
        return null;
        }

    }

