package s023;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println(a + b); // 13
        System.out.println(a - b); // 7
        System.out.println(a * b); // 30
        System.out.println(a / b); // 3
        System.out.println(a % b); // 1   resto della divisione a&b

        // System.out.println(a / 0); // ArithmeticException
     
        double c = 3.0;

       //  intero & frazionario vince frazionario
        
        System.out.println(a + c); // 13.0   
        System.out.println(a / c); // 3.3333333333333335  
        System.out.println(a % c); // 1.0   

        System.out.println(c - 2.1); // 0.8999999999999999 così perchè 2.1 è rappresentato in base due invece che base 10 
 
        System.out.println(c / 0); // Infinity
    }
}
