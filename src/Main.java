public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int price = 10_000; /* цена билета */
        int miles = service.calculate(price); /* расчёт бонусных миль */
        System.out.println(miles);

    }
}