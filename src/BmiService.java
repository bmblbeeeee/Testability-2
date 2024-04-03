public class BmiService {
    public int calculate(double meters, int kilograms) {
        double bmi = kilograms / (meters * meters);
        int result = (int) bmi;
        return result;
    }
}
