package Home.sorting;

import java.util.*;

class Student {
    private String name;
    private String major;
    private double gpa;

    public Student(String name, String major, double gpa) {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

public class SortStudents {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "Math", 3.8));
        students.add(new Student("Bob", "Engineering", 3.9));
        students.add(new Student("Charlie", "Math", 3.9));
        students.add(new Student("David", "Engineering", 4.0));

        // Write code here to sort the 'students' list based on their GPAs in descending order.
        // If GPAs are the same, sort alphabetically by names in ascending order.
        // If names are the same, sort by majors in ascending order.
        Collections.sort(students, (x,y) -> {
           int sortGPA = Double.compare(y.getGpa(), x.getGpa());
           if(sortGPA !=0) {
               return sortGPA;
           } else {
               int sortName = x.getName().compareTo(y.getName());
               if(sortName != 0) {
                   return sortName;
               } else {
                   int sortMajor = x.getMajor().compareTo(y.getMajor());
                   return sortMajor;
               }
           }
        });

        // Print the sorted list of students.
        System.out.println(students);
    }
}
