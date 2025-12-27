package com.constructors.Level1;

public class Course {
        
	
	 // instance variable
	    String courseName;          
	    int duration;               
	    double fee;  
	    
	    static String instituteName = "ABC Institute";  // class variable

	    // constructor
	    Course(String name, int dur, double f) {
	        courseName = name;
	        duration = dur;
	        fee = f;
	    }

	    // instance method
	    void displayCourseDetails() {
	        System.out.println(courseName);
	        System.out.println(duration);
	        System.out.println(fee);
	        System.out.println(instituteName);
	    }

	    // class method
	    static void updateInstituteName(String name) {
	        instituteName = name;
	    }

	    public static void main(String[] args) {
	        Course c1 = new Course("Java", 3, 15000);
	        Course c2 = new Course("Python", 2, 12000);

	        Course.updateInstituteName("XYZ Institute");

	        c1.displayCourseDetails();
	        c2.displayCourseDetails();
	    }
	}
