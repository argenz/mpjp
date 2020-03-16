package s034;

public class MethodCaller {
    public static void main(String[] args) {
        System.out.println(Simple.h());   
        
        Simple reference = new Simple();  // crea una reference all'oggetto, istanza della classe simple
        
        int result = reference.f(7, 6);   // chiama metodo f definito nella classe simple
        System.out.println(result);
        
        reference.g(true);
        reference.g(false);
    }
}
