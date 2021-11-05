import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class TestPartA {
    public static void main(String[] args){
        final Student student1 = new Student("A", 21, DateTime.parse("2000-01-01"), List.of("CT2100"), "ECE");
        final Student student2 = new Student("B", 22, DateTime.parse("2000-02-02"), List.of("CT3445"), "EE");
        final Student student3 = new Student("C", 23, DateTime.parse("2000-03-03"), List.of("EE1111", "CT5787"), "IT");
        final Student student4 = new Student("D", 24, DateTime.parse("2000-04-04"), List.of("CT2100","EE2110"), "ECE");
        final Student student5 = new Student("E", 25, DateTime.parse("2000-05-05"), List.of("CT3445"), "EE");

        final Module module1 = new Module("Mathematical Methods", "CT2100", List.of(student1, student4));
        final Module module2 = new Module("Engineering Chemistry", "EE1111", List.of(student3));
        final Module module3 = new Module("Engineering Computing", "CT3445", List.of(student2, student5));
        final Module module4 = new Module("Engineering Graphics", "EE2110", List.of(student4));
        final Module module5 = new Module("Data Mining", "CT5787", List.of(student3));

        final Course course1 = new Course("ECE", List.of(module1, module4), DateTime.parse("2021-09-05"), DateTime.parse("2021-12-18"));
        final Course course2 = new Course("IT", List.of(module2, module5), DateTime.parse("2021-09-12"), DateTime.parse("2021-12-25"));
        final Course course3 = new Course("EE", List.of(module3), DateTime.parse("2021-09-19"), DateTime.parse("2021-12-31"));

        ArrayList<Course> courseList = new ArrayList<>(List.of(course1, course2, course3));

        for (Course course : courseList){
            System.out.println("Course Name: " + course.getName());
            for (Module module : course.getModuleList()){
                System.out.println("Module Name: " + module.getName());
                System.out.println("Module Id: " + module.getId());
                System.out.println();
                for (Student student : module.getStudentList()){
                    System.out.println("Student Name: " + student.getName());
                    System.out.println("Username: " + student.getUserName());
                    System.out.println("Modules Registered: " + student.getModulesRegistered());
                    System.out.println("Course Registered: " + student.getCourse());
                    System.out.println();
                }
            }
            System.out.println("--------------------------");
        }
    }
}
