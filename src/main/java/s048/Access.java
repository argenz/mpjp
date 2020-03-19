package s048;

public class Access {
    private int a;
    static double c;

    static private double f() {
        return c;
    }

    void g() {       //Si semplicizzano i metodi (composti da metodi pubblici e metodi privati) 
    	             //attraverso l'impedire di chiamare i metodi privati in un'altra classe, appunto perchè sono privati. 
        f();
    }

    public int h() {
        return a / 2;
    }
}
