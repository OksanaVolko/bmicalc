public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double ves = 60; // килограммы
        double rost = 1.65; // метры
        double myCalc = service.calculate(ves, rost);

        System.out.println((int) myCalc);

    }

}