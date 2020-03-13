package s021;

public class MoreStrings {
    public static void main(String[] args) {
        String s = new String("hello");
        System.out.println(s);

        String t = "hello";
        System.out.println(t);
        
        StringBuilder sb = new StringBuilder("hello");   // modificabile
        System.out.println(sb);
        
        // changing the modifiable string
        sb.append('y');
        System.out.println(sb);
        
    }
}
