public class BonusMilesService {
    public int calculate(int cost,int price) {
        int miles = price / cost; // Мили за купленный билет
        return (miles);
    }
}