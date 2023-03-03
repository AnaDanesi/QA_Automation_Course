package day8;

public class Student {

    int sid;
    String sname;
    char grade;

    void show() {
        System.out.println(sid+"    "+sname+"    "+grade);
    }

    void setData(int id, String name, char g){ //method name could be anything
        sid=id;
        sname=name;
        grade=g;
    }

    Student(int id, String name, char g){ //constructor name should be same as class, no especificar void
        sid=id;
        sname=name;
        grade=g;
    }
}
