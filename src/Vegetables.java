import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vegetables extends Product implements Consumable {

    private int daysToRipen = 2;

    public Vegetables(String name, double unitPrice, double stockQuantity, String unite, LocalDate pickingDate, int shelfLifeDays) {
        super(name, unitPrice, stockQuantity, unite, pickingDate, shelfLifeDays);
    }

    @Override
    public LocalDate calculateExpirationDate() {
        return getPickingDate().plusDays(getShelfLifeDays());
    }

    @Override
    public boolean isRipe() {
        return LocalDate.now().isAfter(getPickingDate().plusDays(daysToRipen));
    }

    @Override
    public boolean isExpired(LocalDate dateVerification) {
        return dateVerification.isAfter(calculateExpirationDate());
    }

    @Override
    public long daysRemainingBeforeExpiration(LocalDate dateVerification) {
        return ChronoUnit.DAYS.between(dateVerification, calculateExpirationDate());
    }
}
