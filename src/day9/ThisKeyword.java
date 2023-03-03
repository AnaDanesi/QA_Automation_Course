package day9;

public class ThisKeyword {

    int x,y; //class variables or instance variables

   /* void setData(int a, int b){ //local variables or method variables
        x=a;
        y=b;
    }

    /*void setData(int x, int y){ // esto me da 0,0. se confunde el method y tira eso, poner que son identicas las variables externas e internas
        x=x;
        y=y;
    }
    */
    //para evitar ese problema (de usar mismos nombres para las variables):
//tambien sirve para constructor
    void setData(int a, int b){  //this diferencia las variables y java no se confunde.
        this.x=a;
        this.y=b;
    }


    void display() {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {

        ThisKeyword th=new ThisKeyword();
        th.setData(10,20);
        th.display();

    }
}
