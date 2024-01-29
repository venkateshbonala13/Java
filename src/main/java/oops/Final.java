package Final;

public class Final {
    private final int Y = 145;
    final int GetVariable(){
        return Y;
    }

    public static void main(String[] args) {
        Final f = new Final();
        System.out.println(f.GetVariable());
    }
}
