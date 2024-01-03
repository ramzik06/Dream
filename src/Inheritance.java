
import java.util.Scanner;

class Student {
    String firstName;
    String lastName;
    String group;
    double Grade;

    public Student(String firstName, String lastName, String group, double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.Grade = averageGrade;
    }

    public double Scholarship() {
        return (Grade == 5) ? 100 : 80;
    }
}

class Aspirant extends Student {
    String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageGrade, String scientificWork) {
        super(firstName, lastName, group, averageGrade);
        this.scientificWork = scientificWork;
    }


    public double getScholarship() {
        return (Grade == 5) ? 200 : 180;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student("Arman", "Zhasan", "2315", 4.8);
        students[1] = new Aspirant("Namra", "Nasahz", "5132", 5.0, "Research Topic");


        for (Student student : students) {
            System.out.println(student.firstName + " " + student.lastName + " получает стипендию: $" + student.Scholarship());
        }
    }
}

