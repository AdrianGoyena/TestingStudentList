/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class StudentJava {
    private String name;
    private int sid;
    private int semester;
    private String prgname; // Added semicolon
    
    public StudentJava(String name, int sid) { // Changed to match class name
        this.name = name;
        this.sid = sid;
    }
    
    public int getSid() {
        return sid;
    }
    
    public void setSid(int sid) {
        this.sid = sid;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}