public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int myCalculate = service.calculate(1.87, 98);
        double height_meters = 1.87; // введите рост в метрах
        int weight_kilograms = 98; // введите вес в килограммах
        System.out.println(myCalculate);
    }
}