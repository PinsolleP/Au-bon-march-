import java.time.LocalDate;

public class Vegetables extends Product implements Consumable {

    public Vegetables(String name, double unitPrice, double stockQuantity, String unite, LocalDate pickingDate, int shelfLifeDays) {
        super(name, unitPrice, stockQuantity, unite, pickingDate, shelfLifeDays);
    }

    @Override
    public LocalDate calculateExpirationDate() {
        return null;
    }

    @Override
    public boolean isRipe() {
        return false;
    }

    @Override
    public boolean isExpired(LocalDate dateVerification) {
        return false;
    }

    @Override
    public long daysRemainingBeforeExpiration(LocalDate dateVerification) {
        return 0;
    }
}
