public class Main {
    public static void main(String[] args) {
        bmiService service = new bmiService();
        double height = 1.64;
        double weight = 70;
        double BMI = service.calculate(weight, height);
        double bmi = BMI;
        int index = (int) bmi;
        System.out.println(index);
    }
}