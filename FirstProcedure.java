public class FirstProcedure {

    private static int abs(int x) {
        return (x < 0) ? -x : x;
    }

    private static void absProcedure(int x) {
        if (x < 0)
            System.out.println(-x);
        else
            System.out.println(x);
    }

    public static void main(String[] args) {
        System.out.println(abs(-100));
        absProcedure(-200);
    }
}