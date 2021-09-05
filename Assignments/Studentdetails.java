package com.sonata.one;

public class Studentdetails {
	
	    public static void main(String s[])
	    {
	        Student students[] = new Student[5];
	    
	        students[0] = new Student();
	        students[0].name = "Rajesh";
	        students[0].id = 01;
	        students[0].class1 = 10;
	    
	        students[1] = new Student();
	        students[1].name = "Suresh";
	        students[1].id = 02;
	        students[1].class1 = 9;
	    
	        students[2] = new Student();
	        students[2].name = "Ramesh";
	        students[2].id = 03;
	        students[2].class1 = 8;
	    
	       
	    
	    
	        for(int i = 0; i < students.length; i++)
	        {
	            System.out.println( students[i].name + students[i].id  + students[i].class1  );
	        }
	    }

	}

	class Student
	{
	    String name;
	    int class1;
	    int id;
	}


