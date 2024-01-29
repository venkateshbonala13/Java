public class PersonAgee {

    public static void main(String[] args) {
        int age=25;
        if (age<13){
            System.out.println("kid");
        } else if (age>=13 && age<=19) {
            System.out.println("teen");
        }
        else {
            System.out.println("adult");
        }
    }
}