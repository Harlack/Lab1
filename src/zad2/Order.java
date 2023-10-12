package zad2;

import java.util.Random;

public class Order {
    private String orderId;
    private int quantity;
    private int totalBill;

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId){
        Random random = new Random();
        this.orderId = orderId + "-" + random.nextInt(100);
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getTotalBill() {
        return totalBill;
    }
    public void setTotalBill(int totalBill){
        this.totalBill = totalBill;
    }


    public void calculateBill(){
        Random rand = new Random();
        int totalAmt
                = rand.nextInt(100) * getQuantity();

        setTotalBill(totalAmt);
        System.out.println("Order with order id "
                + getOrderId()
                + " has a total bill amount of "
                + getTotalBill());
    }
}
