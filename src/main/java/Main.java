import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        printResultFunction();
//        printInForEach();
    }
    
    private static void printResultFunction() {
        //function 25
        calculateResult((a, b, c, d) -> Math.pow(a, b) / Math.cosh(Math.abs(b)) + 4 * Math.log10(c) / Math.pow(d, 1.0 / 5.0),
                2.98, 5.55, 0.045, 0.129);

        //function 26
        calculateResult((a, b, c, d) -> Math.pow(Math.sqrt(Math.tan(a)), c) / 2 - (Math.sinh(b) / Math.log(Math.abs(d + c))),
                1.27, 10.99, 4, -25.32);

        //function 27
        calculateResult((a, b, c, d) -> Math.sin(Math.pow(a, -b)) + 3 * Math.abs(Math.acos(-Math.sqrt(c / d))),
                0.478, -1.26, 2.68, 18.24);
    }

    private static void calculateResult(ResultFunction resultFunction, double a, double b, double c, double d) {
        double result = resultFunction.calculate(a, b, c, d);

        System.out.printf("Parameters. a: %f, b: %f, c: %f, d: %f \t", a, b, c, d);
        System.out.println("Result: " + result);
    }

    private static void printInForEach() {
        List<Product> products = new ArrayList<>();
        products.add(new FoodProduct("apple", 2, 0.5, 10, FoodType.FRUIT));
        products.add(new FoodProduct("pear", 1, 0.5, 10, FoodType.FRUIT));
        products.add(new FoodProduct("apple", 1, 0.5, 10, FoodType.FRUIT));
        products.add(new FoodProduct("blueberry", 1, 0.5, 10, FoodType.FRUIT));
        products.add(new FoodProduct("pear", 4, 0.5, 10, FoodType.FRUIT));

        products.forEach(foodProduct -> System.out.println(foodProduct));
//        products.forEach(System.out::println);
    }
}
