package day7;

public class Assignment3StringPresenceArray {

    public static void main(String[] args) {


        //Linear Search

        String a[]={"hola","chau","bombi","malo"};  //4

        String search_ele="bombi";
        boolean flag=false;

        for(int i=0;i<a.length;i++) {
            //  System.out.println(a[i]);

            if(search_ele==a[i]) {
                System.out.println("Element found at:"+i);
                flag=true;
                break;
            }

        }
        if(flag==false) {

            System.out.println("Element not found");
        }
    }

    }


