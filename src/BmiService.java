public class BmiService {
    public int calculate(double height, int weight) {
        int index;
        index = (int) (weight / (height * height));
        return index;
    }
}