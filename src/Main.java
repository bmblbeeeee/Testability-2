public class Main {
    public static void main(String[] args) {
        BmiService index = new BmiService();
        int bodyIndex = index.calculate(1.87, 98);
        System.out.println(bodyIndex);
    }
}