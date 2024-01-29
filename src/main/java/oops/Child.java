public class Child extends Parent {
    String ChildName;

    public Child(String ParentName, String ChildName) {
        super(ParentName);
        this.ChildName=ChildName;

    }
    public Child(){
        super("BLN");
        ChildName="venky";
    }

    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.ChildName);
        System.out.println(c.ParentName);
        c = new Child("sai","reddy");
        System.out.println(c.ChildName);
        System.out.println(c.ParentName);

    }
}
