package s019;

public class Primitive {
    public static void main(String[] args) {
        boolean flag = false;
        System.out.println(flag);

        char c = 'c';
        System.out.println(c);

        byte y = 42;
        System.out.println(y);

        short x = 12_000;
        System.out.println(x);

        int i = 1_000_000_000;
        System.out.println(i);

        long z = 1_000_000_000_000_000L;
        System.out.println(z);

        float f = 3.12e20F;
        System.out.println(f);

        double d = 3.12e200;
        System.out.println(d);
        
        // costanti speciali per rappresentare numeri matematicamente possibili ma speciali
        
        double nan = Double.NaN;   //Not a number, not possible
        double posInf = Double.POSITIVE_INFINITY;    // infinito positivo
        double negInf = Double.NEGATIVE_INFINITY;    // infinito negativo 
        
        if(!Double.isNaN(nan) || !Double.isInfinite(posInf) || Double.isFinite(negInf)) {
            System.out.println("Unexpected");
        }
    }
}
