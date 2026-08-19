import java.util.ArrayList;
import java.util.List;

public class Cart {

    //Attributs
    private List<Cartitem> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    //Accesseurs

    public List<Cartitem> getItems() {
        return items;
    }

    public void setItems(List<Cartitem> items) {
        this.items = items;
    }

    //Méthodes

    public void addItems(Product product, double quantity){

        product.updateStock(quantity);

        boolean found = false;

        for (Cartitem item : items){
            if (item.getProduct() == product){
                item.setQuantity(item.getQuantity() + quantity);
                found = true;
                break;
            }
        }
        if (!found) {
            items.add(new Cartitem(product, quantity));
        }
    }

    public double getTotal(){
        double total = 0;
        for (Cartitem item : items){
            total += item.getTotal();
        }
        return total;
    }

    public void displayCart(){

        System.out.println("====== PANIER ======");
        System.out.println();

        for ( Cartitem item : items){
            System.out.println(item.getProduct().getName() + "   " +
                               item.getQuantity() + " " +
                               item.getProduct().getUnite() + "   " +
                               item.getTotal() + " €");
        }
        System.out.println();
        System.out.println("TOTAL : " + getTotal() + " €");
    }
}



