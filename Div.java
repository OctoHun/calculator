public class Div {
    public final static int Div(int a, int b){
        check(b);
        return a/b;
    }

    private static void check(int b) {
        if(b == 0){
            System.out.println("분모가 0입니다");
            System.exit(1);
        }
    }
}
