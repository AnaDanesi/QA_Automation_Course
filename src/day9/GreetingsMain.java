package day9;

public class GreetingsMain {

    public static void main(String[] args) {

        Greetings gr=new Greetings(); //1, para invocar el metodo 1, creamos un objeto
        //gr.greeting1(); //method 1

        //String str= gr.greeting2(); //method 2 tenemos que crear una variable adicional y luego imprimirla
        //System.out.println(str);
        //o System.out.println(gr.greeting2()); solo eso

        //gr.greeting3("John"); //method 3

        String str=gr.greeting4("John"); //method 4
        System.out.println(str);
    }

}
