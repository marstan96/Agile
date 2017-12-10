package agileassignment;

public class menu {
    private String menuItem;
    private double price;
    private int qty;
    private double subttl = 0.0, gst;
    
    public menu(){}
    
    public menu(String menuItem,double price, int qty){
        this.menuItem = menuItem;
        this.price = price;
        this.qty = qty;
    }
    public menu(int qty){
        this.qty = qty;
    }
    public String getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getSubTotal() {
        return price * qty;
    }
}
