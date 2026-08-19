import java.time.LocalDate;

    public abstract class Product {

        //attributs
        private String name;
        private double unitPrice;
        private double stockQuantity;
        private String unite;
        private LocalDate pickingDate;
        private int shelfLifeDays;

        public Product(String name, double unitPrice, double stockQuantity, String unite, LocalDate pickingDate, int shelfLifeDays){
            this.name = name;
            this.unitPrice = unitPrice;
            this.unite = unite;
            this.stockQuantity = stockQuantity;
            this.pickingDate = pickingDate;
            this.shelfLifeDays = shelfLifeDays;
        }

        //Accesseurs

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getUnitPrice() {
            return unitPrice;
        }

        public void setUnitPrice(double unitPrice) {
            this.unitPrice = unitPrice;
        }

        public double getStockQuantity() {
            return stockQuantity;
        }

        public void setStockQuantity(double stockQuantity) {
            this.stockQuantity = stockQuantity;
        }

        public String getUnite() {
            return unite;
        }

        public void setUnite(String unite) {
            this.unite = unite;
        }

        public LocalDate getPickingDate() {
            return pickingDate;
        }

        public void setPickingDate(LocalDate pickingDate) {
            this.pickingDate = pickingDate;
        }

        public int getShelfLifeDays() {
            return shelfLifeDays;
        }

        public void setShelfLifeDays(int shelfLifeDays) {
            this.shelfLifeDays = shelfLifeDays;
        }
    }

