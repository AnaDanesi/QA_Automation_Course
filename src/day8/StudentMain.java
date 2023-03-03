package day8;

public class StudentMain {

    public static void main(String[] args) {

//        Student stu=new Student(); //para approaches 1 y 2

        //Approach 1: Using reference variable stu
       /* stu.sid=102;
        stu.sname="John";
        stu.grade='a';

        //Approach 2: Using method
        stu.setData(102,"John",'a'); */

        //Approach 3: Using constructor , you have to pass the data in the object creation
        Student stu=new Student(102,"John",'a');

        stu.show();


    }
}
