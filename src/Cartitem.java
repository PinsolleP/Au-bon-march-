public class Cartitem{

    //Attributs
    private Product product;
    private double quantity;

    public Cartitem(Product product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    //Accesseurs

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    //Méthodes

    public double getTotal(){
        return product.getUnitPrice() * quantity;
    }
}

