public class Main {
    public static void main(String[] args) {

        int amount = 100_000;
        int percentRubles = 20;
        int bonusMiles = 1;

        int bonus = amount / percentRubles * bonusMiles;

        System.out.println("Итоговые бонусные мили: " + bonus);
    }
}