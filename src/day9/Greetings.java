package day9;

public class Greetings {

    //1) method no params no return value (void)

    void greeting1() {
        System.out.println("Hello...");
    }

    //2) method no params returns value (no void)

    String greeting2() { //especificar data type
        return "Hello, how are you?";
    }

    //3) method takes param no return value

    void greeting3(String name){
        System.out.println("Hello..."+name);
    }

    //4) method takes param and return value

    String greeting4(String name){
        return ("Hello..."+name);
    }

}
