package additional.tasks;

import java.util.Scanner;

public class DoubleExample {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

//      Double d = 9007199254740991d;
//      d = d + 4.0d - 4.0d;
        Double d = 0.1d, result = 0.0d;

//      53 binary places (double mantissa) 11111111111111111111111111111111111111111111111111111 (bin) = 9007199254740991 (dec)

//      11001100110011001100110011001100110011001100110011010 *10^(-56)        0.1000000000000000055511151231257827021181583404541015625 +
//      11001100110011001100110011001100110011001100110011010 *10^(-56)        0.1000000000000000055511151231257827021181583404541015625 =
//      11001100110011001100110011001100110011001100110011010 *10^(-55)        0.200000000000000011102230246251565404236316680908203125 +

//      11001100110011001100110011001100110011001100110011010 *10^(-55)        0.200000000000000011102230246251565404236316680908203125 +
//      11001100110011001100110011001100110011001100110011010 *10^(-56)        0.1000000000000000055511151231257827021181583404541015625 =
//      if truncate trailing 10:
//      10011001100110011001100110011001100110011001100110011 *10^(-54)        0.299999999999999988897769753748434595763683319091796875 +
//      00000000000000000000000000000000000000000000000000001 *10^(-54)        0.000000000000000055511151231257827021181583404541015625 =
//      if round the number:
//      10011001100110011001100110011001100110011001100110100 *10^(-54)        0.3000000000000000444089209850062616169452667236328125

//      And so on:
//      round trailing 010
//      11001100110011001100110011001100110011001100110011010 *10^(-56)        0.40000000000000002220446049250313080847263336181640625

//      10000000000000000000000000000000000000000000000000000 *10^(-53)        0.5

//      round trailing 010
//      10011001100110011001100110011001100110011001100110011 *10^(-53)        0.59999999999999997779553950749686919152736663818359375

//      round trailing 010
//      10110011001100110011001100110011001100110011001100110 *10^(-53)        0.6999999999999999555910790149937383830547332763671875

//      round trailing 010
//      11001100110011001100110011001100110011001100110011001 *10^(-53)        0.79999999999999993338661852249060757458209991455078125


        // x2 * 0.1d
        result = d + d;
        System.out.printf("%.20f%n", result);

        // x3 * 0.1d
        result = result + d;
        System.out.printf("%.20f%n", result);

        // x4 * 0.1d
        result = result + d;
        System.out.printf("%.20f%n", result);

        // x5 * 0.1d
        result = result + d;
        System.out.printf("%.20f%n", result);

        // x6 * 0.1d
        result = result + d;
        System.out.printf("%.20f%n", result);

        // x7 * 0.1d
        result = result + d;
        System.out.printf("%.20f%n", result);

        // x8 * 0.1d
        result = result + d;
        System.out.printf("%.20f%n", result);

        // x9 * 0.1d
        result = result + d;
        System.out.printf("%.20f%n", result);

        // x10 * 0.1d
        result = result + d;
        System.out.printf("%.20f%n", result);

        // x11 * 0.1d
        result = result + d;
        System.out.printf("%.20f%n", result);

        // x12 * 0.1d
        result = result + d;
        System.out.printf("%.20f%n", result);

        // x13 * 0.1d
        result = result + d;
        System.out.printf("%.20f%n", result);
    }
}
