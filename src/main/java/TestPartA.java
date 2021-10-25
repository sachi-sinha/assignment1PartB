import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class TestPartA {
    public static void main(String[] args){
        final Student student1 = new Student("A", 21, DateTime.parse("2000-01-01"));
        final Student student2 = new Student("B", 22, DateTime.parse("2000-02-02"));
        final Student student3 = new Student("C", 23, DateTime.parse("2000-03-03"));
        final Student student4 = new Student("D", 24, DateTime.parse("2000-04-04"));
        final Student student5 = new Student("E", 25, DateTime.parse("2000-05-05"));

        final List<Student> studentList1 = List.of(student1, student2, student3);
        final List<Student> studentList2 = List.of(student1, student3, student5);
        final List<Student> studentList3 = List.of(student2, student4);

        final Module module1 = new Module("Mathematical Methods", "CT2100", studentList1);
        final Module module2 = new Module("Engineering Chemistry", "EE1111", studentList2);
        final Module module3 = new Module("Engineering Computing", "CT3445", studentList3);

        final List<Module> moduleList1 = List.of(module1, module2, module3);
        final List<Module> moduleList2 = List.of(module1, module3);
        final List<Module> moduleList3 = List.of(module2, module3);

        final Course course1 = new Course("ECE", moduleList1, DateTime.parse("2021-09-05"), DateTime.parse("2021-12-18"));
        final Course course2 = new Course("IT", moduleList2, DateTime.parse("2021-09-12"), DateTime.parse("2021-12-25"));
        final Course course3 = new Course("EE", moduleList3, DateTime.parse("2021-09-19"), DateTime.parse("2021-12-31"));

        ArrayList<Course> courseList = new ArrayList<>();
        courseList.addAll(List.of(course1, course2, course3));

        for (Course course : courseList){
            System.out.println("Course Name: " + course.getName());
            for (Module module : course.getModuleList()){
                System.out.println("Module Name: " + module.getName());
                for (Student student : module.getStudentList()){
                    System.out.println("Student Name: " + student.getName());
                    System.out.println("Username: " + student.getUserName());
                }
            }
            System.out.println();
        }
    }
}
