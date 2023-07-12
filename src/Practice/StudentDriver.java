package Practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    private String studId;
    private String name;
    private int age;
    private int marks;

    public Student() {
    }

    public Student(String studId, String name, int age, int marks) {
        super();
        this.studId = studId;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getStudId() {
        return studId;
    }

    public void setStudId(String studId) {
        this.studId = studId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studId='" + studId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                '}';

    }

}

public class StudentDriver {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();
        student.add(new Student("ID104", "RAHUL", 24, 96));
        student.add(new Student("ID108", "NAVEEN", 25, 86));
        student.add(new Student("ID105", "ASHUTOSH", 26, 76));
        student.add(new Student("ID112", "PRAVEEN", 23, 75));
        student.add(new Student("ID110", "TANUSH", 22, 80));
        // System.out.println(student);
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter 1 to sort by Age \n Enter 2 to sort by Name \n Enter 3 to sort by Marks \n Enter 4 to sort by StudentID");
        int input = sc.nextInt();
        switch (input){
            case 1:
                Comparator<Student> comparator1 = (s1, s2) -> s1.getAge() - s2.getAge();
                Collections.sort(student, comparator1);
                for (Student stud : student) {
                    System.out.println(stud);
                } break;
            case 2:
                Comparator<Student> comparator2 = (s1, s2) -> s1.getName().hashCode() - s2.getName().hashCode();
                Collections.sort(student, comparator2);
                for (Student stud : student) {
                    System.out.println(stud);
                } break;
            case 3:
                Comparator<Student> comparator3 = (s1, s2) -> s1.getMarks() - s2.getMarks();
                Collections.sort(student, comparator3);
                for (Student stud : student) {
                    System.out.println(stud);
                } break;
            case 4:
                Comparator<Student> comparator4 = (s1, s2) -> s1.getStudId().hashCode() - s2.getStudId().hashCode();
                Collections.sort(student, comparator4);
                for (Student stud : student) {
                    System.out.println(stud);
                }break;
        }
    }
}
