package zyBook_Chapter_9.zyBook_36_3;

import java.util.Scanner;

public class CourseInformation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Course myCourse = new Course(); // create an object of class course
        OfferedCourse myOfferedCourse = new OfferedCourse(); // create an object of class OfferedCourse, which is extended by course class

        String courseNumber, courseTitle; // Define the variable
        String oCourseNumber, oCourseTitle, instructorName, location, classTime; // Define the variable

        // Get input of the class course
        courseNumber = scnr.nextLine();
        courseTitle = scnr.nextLine();

        // Get input of the class OfferedCourse
        oCourseNumber =  scnr.nextLine();
        oCourseTitle =  scnr.nextLine();
        instructorName = scnr.nextLine();
        location = scnr.nextLine();
        classTime = scnr.nextLine();

        // Set the information of object course class
        myCourse.setCourseNumber(courseNumber);
        myCourse.setCourseTitle(courseTitle);
        myCourse.printInfo();

        // Set the information of the object OfferedCourse class
        // When I set the information of the object OfferedCourse
        // We also have the instance of course class and method of course class
        // This is a totally new object, this instance don't confuse with the last object
        myOfferedCourse.setCourseNumber(oCourseNumber);
        myOfferedCourse.setCourseTitle(oCourseTitle);
        myOfferedCourse.setInstructorName(instructorName);
        myOfferedCourse.setLocation(location);
        myOfferedCourse.setClassTime(classTime);
        myOfferedCourse.printInfo();

        // Print of the result
        System.out.println("   Instructor Name: " + myOfferedCourse.getInstructorName());
        System.out.println("   Location: " + myOfferedCourse.getLocation());
        System.out.println("   Class Time: " + myOfferedCourse.getClassTime());
    }
}