public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.64;
        double weight = 70;
        double BMI = service.calculate(weight, height);
        double bmi = BMI;
        int index = (int)bmi;
        System.out.println(index);
    }
}