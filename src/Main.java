public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        double weight = 98;
        double BMI = service.calculate(weight, height);
        int index = (int) BMI;
        System.out.println(index);
    }
}