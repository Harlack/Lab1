package zad1;

public class Item {
    private final String name;
    private final int price;

    public Item(String name, int price) {

        this.name = name;
        this.price = price;
    }

    public Item produceItem(String name, int price){
        return new Item(name, price);
    }


    public void setStatus(int statusSold) {
    }
}
