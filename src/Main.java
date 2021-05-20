public class Main {
        public static void main(String[] args) {
            BonusMilesService service = new BonusMilesService();
            int miles = service.calculate (20, 10_000);
            System.out.println(miles);

            int milesForZeroPrice = service.calculate (20, 0);
            System.out.println(milesForZeroPrice);

            int milesForMinusPrice = service.calculate (20, -1_000_000);
            System.out.println(milesForMinusPrice);

            int milesForEqualPrice = service.calculate (20, 20);
            System.out.println(milesForEqualPrice);
        }
    }