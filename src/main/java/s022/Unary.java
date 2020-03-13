package s022;

public class Unary {
    public static void main(String[] args) {
        int value = 1;

        System.out.println(value); // 1

        System.out.println(++value); // 2  ++ va a modificare il valore stesso
        System.out.println(--value); // 1

        System.out.println(value++); // 1
        System.out.println(value); // 2
        System.out.println(value--); // 2
        System.out.println(value); // 1

        System.out.println(+value); // 1    non modifica il valore in se
        System.out.println(-value); // -1
    }
}

