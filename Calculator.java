public class Calculator {
    public static void main(String[] args) {
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        System.out.println(Sum.Sum(a, b));
        System.out.println(Min.Min(a, b));
        System.out.println(Mul.Mul(a, b));
        System.out.println(Div.Div(a, b));

    }
}