import java.time.LocalDate;

public class TestProduct {
    public static void main(String[] args) {
        LocalDate pickingDate = LocalDate.of(2026, 8, 18);

        Fruit pomme = new Fruit("Pomme", 1.50, 8, "kg", pickingDate, 10);

        System.out.println(pomme.calculateExpirationDate());
        System.out.println(pomme.isRipe());
        System.out.println(pomme.isExpired(LocalDate.now()));
        System.out.println(pomme.daysRemainingBeforeExpiration(LocalDate.now()));
    }
}
