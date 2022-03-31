package Data;

public enum OrderStatus {
    NEW("nowe"), PAID("npłacone"), SHIPPED("nysłane"),
    DELIVERED("nostarczone"), CANCELLED("anulowane");

    private final  String description;

    OrderStatus( String description) {
        this.description = description;
    }

    public String getDescription (){
        return description;
    }

    @Override
    public String toString() {
        return   description ;
    }

    public OrderStatus fromDescription (String description){
        OrderStatus[] values = values();
        for (OrderStatus value : values) {
            if (OrderStatus.get)

        }
    }

}
