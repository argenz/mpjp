package s034;

public class Simple {
    static String h() {
        return "Hi";
    }

    int f(int a, int b) {
        return a * b;
    }

    void g(boolean flag) {
        if (flag) {
            System.out.println("Hello");
            return;
        }

        System.out.println("Goodbye");
    }
    
    /// same as above, less readable. 
    
    void g2(boolean flag) {
        if (flag) {
            System.out.println("Hello");
         
        }else {
        System.out.println("Goodbye");
        }	
    }
}