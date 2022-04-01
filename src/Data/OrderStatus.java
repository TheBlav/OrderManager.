package Data;

public enum OrderStatus {
    NEW("nowe"), PAID("opłacone"), SHIPPED("wysłane"),
    DELIVERED("dostarczone"), CANCELLED("anulowane");

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





}
