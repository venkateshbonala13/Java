public class Fibonaccii {
    public static void main(String[] args) {
        int m=0;
        int n=1;
        int N=10;
        System.out.print(m+" "+n+" ");

        for (int i=2; i<N; i++){
            int l=m+n;

            System.out.print(l+" ");

            m=n;
            n=l;

        }
    }
}