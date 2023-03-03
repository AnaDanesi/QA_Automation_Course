package day7;

/*1) Reverse a string

s="abc"
reverse string: cba
*/
public class Assignment1ReverseString {

    public static void main(String[] args) {

    //Approach 1: Using (String + Concatenation) operator

        String str="ABCD";
        String rev="";

      /*  int len=str.length();  //4

        for(int i=len-1;i>=0;i--){  //3   2   1   0  -1
            rev=rev+str.charAt(i); //DCBA
        }
        System.out.println("Reverse string is:"+rev);
*/

    //Approach 2: Using character array

       /* char a[]=str.toCharArray();
        int len=a.length;  //4

        for(int i=len-1;i>=0;i--){  //3  2   1   0   -1
            rev=rev+a[i];  //DCBA
        }

        System.out.println("Reverse string is:"+rev);*/

    //Approach 3: Using String Buffer Class

        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());



    }

}
