public class BmiService {

    public double calculate(double weight, double height) {

        double BMI = weight / height / height;
        int result = (int) BMI;
        return result;
    }
}