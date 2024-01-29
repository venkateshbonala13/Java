package maps;
import java.util.HashMap;
import collections.Student;
public class StudentHashmap {



    public static Student getStudentByName(HashMap<String, Student> studentMap, String firstName) {
        return studentMap.get(firstName);
    }
}