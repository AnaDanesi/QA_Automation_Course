package day6;

/*3) Search an element in array
        a={10,20,30,40,50}
        num=30

         */
public class Assignment3SearchElementOfArray {

    public static void main(String[] args) {

        //Linear Search

        int a[]={10,20,40,50,30};  //5

        int search_ele=70;
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
