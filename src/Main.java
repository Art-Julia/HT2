public class Main {
    public static void main(String[] args) {
        int TicketCost = 300_000; //Стоимость билета
        int CostPerMile = 20; // стоимость одной бонусной мили
        int TotalMiles = TicketCost/CostPerMile; // Мили за купленный билет
        System.out.println("Total Miles:");
        System.out.println(TotalMiles);

    }
}
