public class ReverseDigits {
    public static void main(String[] args) {
        int n=12345;
        System.out.println(n);
        int r=0;
        while (n!=0)
        {
            int d=n%10;
            r=r*10+d;
            n=n/10;
        }
        System.out.println(r);

    }

}