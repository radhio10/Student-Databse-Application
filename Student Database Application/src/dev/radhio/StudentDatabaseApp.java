package dev.radhio;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        // Ask how many student want to add
        System.out.println("Enter Number of Student you want to add : ");
        Scanner scanner = new Scanner(System.in);
        int numberOfStudent = scanner.nextInt();
        Student[] students = new Student[numberOfStudent];

        // Create n number of students
        int i = 0;
        while (i<numberOfStudent){
            students[i] = new Student();
            students[i].setStudentID();
            students[i].enroll();
            students[i].payTuition();
            i++;
        }
        // Showing ID Number of student that has created
        for (Student s: students) {
            s.setStudentID();
        }
    }
}
