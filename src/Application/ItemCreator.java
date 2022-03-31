package Application;
import Data.OrderStatus;
import Data.Data;

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
    }

