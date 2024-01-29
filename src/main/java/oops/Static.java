public class Static {
    private static int X = 100;
    public static int GetVariable() {
        return X;
    }

    public static void main(String[] args) {

        System.out.println(Static.GetVariable());
    }
}
