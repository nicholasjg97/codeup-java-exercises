package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {


















    public static void main(String[] args) {

        HashMap <String, Student> students = new HashMap<>();

        Student earl = new Student("Earl");

        earl.addGrade(65);
        earl.addGrade(55);
        earl.addGrade(45);

        Student randy = new Student("Randy");

        randy.addGrade(20);
        randy.addGrade(30);
        randy.addGrade(25);

        Student crabman = new Student("Harry");

        crabman.addGrade(95);
        crabman.addGrade(100);
        crabman.addGrade(101);

        Student catalina = new Student("Catalina");

        catalina.addGrade(50);
        catalina.addGrade(65);
        catalina.addGrade(60);

        students.put("earl123", earl);
        students.put("randy111", randy);
        students.put("crabman3847", crabman);
        students.put("cat01", catalina);

        System.out.println(students);



    }





}
