package grades;

import java.util.ArrayList;

public class Student {

    private String studentName;

    private ArrayList<Integer> grades;

    public Student(String studentName) {
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return studentName;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        double length = this.grades.size();
        for (int grade : this.grades) {
            sum += grade;
        }
        return sum / length;
    }

    public static void main(String[] args) {
        Student john = new Student("john");

        System.out.println(john.getName());

        john.addGrade(3);
        john.addGrade(4);
        john.addGrade(5);

        System.out.println(john.getGrades());
        System.out.println(john.getGradeAverage());


    }







}
