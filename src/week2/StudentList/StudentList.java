/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adria
 */
public class StudentList {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //print 3 student details id, name
        
        Student s1 = new Student();
        s1.setSid(11);
        s1.setName("peter")
                
        Student s2 = new Student();
        s2.setSid(12);
        s2.setName("chun)
        
        Student s3 = new Student();
        s3.setSid(13);
        s3.setName("Luoli")
        //save objects in array
        Student[] list = new Student[3]; //Array of objects
        list[0]=s1;
        list[1]=s2;
        list[2]=s3; //saved the objects
        for(int i=0;i<list.length;i++)
        {
            System.out.println(list[i].getName() + list[i].getSid());
        }
        }
    }
}
