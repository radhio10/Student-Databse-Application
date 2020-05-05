package dev.radhio;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentID;
    private static int id = 1000;
    private static int costOfCourse = 600;
    private int tuitionBalance = 0;

    // Constructor :  prompted to enter student's name and year
    Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        firstName = in.nextLine();

        System.out.println("Enter your last name: ");
        lastName = in.nextLine();

        System.out.println("1 for 2008 \n2 for 2009 \n3 for 2010\n4 for 2011\nEnter your Grade year: ");
        year = in.nextInt();
        System.out.println(firstName + " " + lastName + " " + year);
    }

    // Generate an ID
    public void setStudentID() {
        // Grade Level + ID (5 digits)
        id++;
        studentID = year + "" + id;
        System.out.println("Your ID is:" + studentID);
    }

    // Enroll in the courses
    public void enroll() {
        System.out.print("Enter How many courses you want to enroll : ");
        Scanner scanner = new Scanner(System.in);
        int courseNumber = scanner.nextInt();
        String[] courses= new String[courseNumber];;
        int i = 0;
        while (i < courseNumber) {
            System.out.print("Enter Courses To Enroll : ");
            Scanner scannerr = new Scanner(System.in);
            String course = scannerr.nextLine();
            courses[i] = course;
            i++;
            tuitionBalance = tuitionBalance + costOfCourse;
        }
        System.out.println("Enrolled Courses : ");
        for (String coursess : courses) {
            System.out.println(coursess);
        }
        System.out.println("Total Cost : " + tuitionBalance);
    }

    // Pay Tuition
    public void payTuition(){
        System.out.println("Enter your payment : ");
        Scanner scanner = new Scanner(System.in);
        int payment = scanner.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Yor Due Balance :" + tuitionBalance);
    }
}
