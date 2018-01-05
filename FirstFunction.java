public class FirstFunction {

    private static int abs(int x) {
        return (x < 0) ? -x : x;
    }

    public static void main(String[] args) {
            System.out.println(abs(-100));
    }
}