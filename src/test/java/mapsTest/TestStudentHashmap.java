package mapsTest;
import collections.Student;
import maps.StudentHashmap;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import java.util.HashMap;

public class TestStudentHashmap {

    @Test
    public void testgetStudentByName(){
        HashMap<String, Student> studentMap = new HashMap<>();

        // Add 8 students to the HashMap
        studentMap.put("John", new Student("John", "Doe", 3.5));
        studentMap.put("Jane", new Student("Jane", "Smith", 3.8));
        studentMap.put("Bob", new Student("Bob", "Johnson", 3.2));
        studentMap.put("Alice", new Student("Alice", "Williams", 3.9));
        studentMap.put("Charlie", new Student("Charlie", "Brown", 3.4));
        studentMap.put("Eva", new Student("Eva", "Davis", 3.6));
        studentMap.put("Michael", new Student("Michael", "Taylor", 3.7));
        studentMap.put("Sophie", new Student("Sophie", "Miller", 3.1));

        // Example: Retrieve a Student object by first name
        String studentNameToSearch = "Alice";
        String studentNameToSearch1="Ali";


        Student result= StudentHashmap.getStudentByName(studentMap, studentNameToSearch);
        System.out.println(result.getfirstName());
        studentNameToSearch.equals(result.getfirstName());
        studentNameToSearch1.equals(null);

    }
}