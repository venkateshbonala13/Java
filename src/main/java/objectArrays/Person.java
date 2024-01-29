public class Person {
    private double height;
    private double weight;
    private String ssn;
    private String phoneNumber;

    public Person(double height, double weight, String ssn, String phoneNumber) {
        this.height = height;
        this.weight = weight;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return ssn.equals(person.ssn);
    }

    public static void main(String[] args) {

        Person person1 = new Person(178.5, 47, "856-45-8476", "618-638-3830");
        Person person2 = new Person(164.8, 85, "987-56-4634", "978-562-8423");
        Person person3 = new Person(175 , 74, "856-45-8476", "913-358-8280");

        System.out.println("Person 1 equals Person 2: " + person1.equals(person2));
        System.out.println("Person 1 equals Person 3: " + person1.equals(person3));
    }
}