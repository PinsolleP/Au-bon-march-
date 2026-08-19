import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> products;
    private List<Customer> customers;

    public store(){
        products = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void initStock(){

        products.add(new Fruit("Clémentine", 2.90, 6, "kg", LocalDate.of(2026, 8, 15), 8));
        products.add(new Fruit("Datte", 7.00, 4, "kg", LocalDate.of(2026, 8, 17), 14));
        products.add(new Fruit("Grenade", 3.50, 3, "kg", LocalDate.of(2026, 8, 14), 6));
        products.add(new Fruit("Kaki", 4.50, 3, "kg", LocalDate.of(2026, 8, 19), 5));
        products.add(new Fruit("Kiwi", 3.50, 5, "kg", LocalDate.of(2026, 8, 18), 9));
        products.add(new Fruit("Mandarine", 2.80, 6, "kg", LocalDate.of(2026, 8, 16), 8));
        products.add(new Fruit("Orange", 1.50, 8, "kg", LocalDate.of(2026, 8, 15), 8));
        products.add(new Fruit("Pamplemousse", 2.00, 8, "pièce", LocalDate.of(2026, 8, 15), 8));
        products.add(new Fruit("Poire", 2.50, 5, "kg", LocalDate.of(2026, 8, 17), 7));
        products.add(new Fruit("Pomme", 1.50, 8, "kg", LocalDate.of(2026, 8, 16), 7));
        products.add(new Vegetables("Carotte", 1.30, 7, "kg", LocalDate.of(2026, 8, 16), 10));
        products.add(new Vegetables("Choux de Bruxelles", 4.00, 4, "kg", LocalDate.of(2026, 8, 14), 9));
        products.add(new Vegetables("Choux vert", 2.50, 12, "pièce", LocalDate.of(2026, 8, 18), 6));
        products.add(new Vegetables("Courge butternut", 2.50, 6, "pièce", LocalDate.of(2026, 8, 13), 11));
        products.add(new Vegetables("Endive", 2.50, 5, "kg", LocalDate.of(2026, 8, 17), 4));
        products.add(new Vegetables("Epinard", 2.60, 4, "kg", LocalDate.of(2026, 8, 18), 8));
        products.add(new Vegetables("Poireau", 1.20, 5, "kg", LocalDate.of(2026, 8, 14), 7));
        products.add(new Vegetables("Potiron", 2.50, 6, "pièce", LocalDate.of(2026, 8, 13), 10));
        products.add(new Vegetables("Radis noir", 5.00, 10, "pièce", LocalDate.of(2026, 8, 19), 12));
        products.add(new Vegetables("Salsifis", 2.50, 3, "kg", LocalDate.of(2026, 8, 16), 4));
    }

    public void displayStock(){

        System.out.println("====== STOCK DISPONIBLE ======");
        System.out.println();

        for ( Product product : products){
            System.out.println(product.getName() + "   " +
                    product.getStockQuantity() + " " +
                    product.getUnite() + "   " +
                    product.getUnitPrice() + " €");
        }

    }
}
