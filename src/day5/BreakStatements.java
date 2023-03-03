package day5;

public class BreakStatements {

    public static void main(String[] args) {

        for(int i=1;i<=5;i++) {  //1   2
            if(i==3) {
                break;
            }
            System.out.println(i); //1   2
        }

    }

}
