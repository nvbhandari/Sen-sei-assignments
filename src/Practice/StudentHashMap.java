package Practice;

import java.util.HashMap;

public class StudentHashMap {
    public static void main(String[] args) {
        HashMap<Integer, Student> student = new HashMap<>();
        student.put(1,new Student("ID104", "RAHUL", 24, 96));
        student.put(7,new Student("ID108", "NAVEEN", 25, 86));
        student.put(6,new Student("ID105", "ASHUTOSH", 26, 76));
        student.put(2,new Student("ID112", "PRAVEEN", 23, 75));
        student.put(3,new Student("ID110", "TANUSH", 22, 80));
        student.put(8,new Student("ID108", "NAVEEN", 25, 86));

        System.out.println(student);

    }
}
