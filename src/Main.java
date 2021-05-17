public class Main {
    public static void main(String[] args) {
        int ticketCost = 300_000; //Стоимость билета
        int costPerMile = 20; // стоимость одной бонусной мили
        int totalMiles = ticketCost / costPerMile; // Мили за купленный билет
        System.out.println("Total Miles:");
        System.out.println(totalMiles);

    }
}
