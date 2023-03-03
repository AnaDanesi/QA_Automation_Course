package day8;

public class Employee {

    //variables
    int eid;
    String ename;
    String job;
    int esal;

    void display() { //method
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(job);
        System.out.println(esal);
    }

   /* public static void main(String[] args) {

        Employee emp1=new Employee();
        emp1.eid=101;
        emp1.ename="John";
        emp1.job="Engineer";
        emp1.esal=50000;

        emp1.display();

        Employee emp2=new Employee();
        emp2.eid=102;
        emp2.ename="Anna";
        emp2.job="Tester";
        emp2.esal=20000;

        emp2.display();

    }
*/
}
