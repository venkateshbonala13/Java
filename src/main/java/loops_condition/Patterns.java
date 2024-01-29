public class Patterns {
    public static void main(String[] args) {
        int n=6;
        for (int i=1; i<n;i++){
            for (int j=1; j<n-i; j++){
                System.out.print("+ ");
            }
            for (int k=2; k<=i+2; k++){
                System.out.print("_ ");
            }
            System.out.println();
        }
    }
}