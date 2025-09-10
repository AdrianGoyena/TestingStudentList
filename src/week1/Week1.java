/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week1;

import java.util.Scanner;
/**
 *
 * @author adria
 */
public class Week1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello shart");
        //STEP 1 take input from user
        Scanner in = new Scanner(System.in);
        String word = in.next();
        System.out.println(word); //Take input from user
        //Step 2 split each char and store in array
        char[] reverse = new char[word.length()];
        for( int i=0;i<word.length();i++) {
            reverse[i] = word.charAt(i);
            System.out.println(reverse[i]);
        }
        
        for(int i=reverse.length-1; i>=0;i--){
            System.out.println(reverse[i]);
        }
    }
    
}
