/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 *This is branch parttime
 */
public class StudentList {
    public static void main(String[] args) {
        // Create StudentJava objects (not Student)
        StudentJava s1 = new StudentJava("", 0); // Using constructor
        s1.setSid(11);
        s1.setName("peter"); // Added semicolon
        
        StudentJava s2 = new StudentJava("", 0);
        s2.setSid(12);
        s2.setName("chun"); // Added semicolon and fixed quote
        
        StudentJava s3 = new StudentJava("", 0);
        s3.setSid(13);
        s3.setName("Luoli"); // Added semicolon
        
        // Save objects in array
        StudentJava[] list = new StudentJava[3];
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        
        for(int i = 0; i < list.length; i++) {
            System.out.println(list[i].getName() + " " + list[i].getSid()); // Added space for readability
        }
    } // Removed extra closing brace
}