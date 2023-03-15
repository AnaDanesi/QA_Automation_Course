package day14;
/*2 approaches when we put thread.sleep :
1) the system allows us and makes the try catch method
or
2)the system allows us and makes the throws interrupted exception in the main
 */

public class CheckedExceptionDemo {

    public static void main(String[] args) throws InterruptedException {//o add throws

        System.out.println("program is started...");

        System.out.println("program is in progress...");

        Thread.sleep(5000);

       /* try {
            Thread.sleep(5000);//unhandled exception,it tells you what to do
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        System.out.println("program is finished...");

        System.out.println("program is terminated...");

    }
}
