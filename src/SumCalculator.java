/**
 * Created by Abram on 6/13/2015.
 */
public class SumCalculator {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("Sum is " + sum);
    }
}
