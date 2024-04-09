package exam2;

public class Cloth {
    String type;
    SIze size;
    double price;

    public String getType() {
        return type;
    }

    public SIze getSize() {
        return size;
    }
    public double getPrice(){
        return price;
    }


    public Cloth(String type, SIze size, double price){
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public void printPriceAfterDiscount(){
        System.out.println();
    }

}
