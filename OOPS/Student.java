package OOPS;

import java.util.Arrays;

public class Student {
    String color;
    int roll_no;
    int[] marks = new int[3];
   
    
    //constructor
    Student(){
        System.out.println("I am a default constructor");
    }
     //init block
    {
        color = "Red";
        roll_no = 2;
        System.out.println(color);
        System.out.println(roll_no);
    }
}
