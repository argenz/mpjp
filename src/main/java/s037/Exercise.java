package s037;

public class Exercise {
    final static int GAP = 'a' - 'A';  // final? Costante  
    
    public static void main(String[] args) {
        exercise("Bob");
        exercise("ciAo");

        System.out.println("toUpper(): " + toUpper("Bob"));
        System.out.println("toUpper2(): " + toUpper2("Bob"));
        System.out.println("toUpper3(): " + toUpper3("Bob"));
        System.out.println("toUpper4(): " + toUpper4("Bob"));
    }

    public static String toUpper(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder sb = new StringBuilder(s.length());

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur >= 'a' && cur <= 'z') {
                sb.append((char) (cur - GAP));
            } else {
                sb.append(cur);
            }
        }

        return sb.toString();
    }

    public static String toUpper2(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur >= 'a' && cur <= 'z') {
                sb.setCharAt(i, (char) (cur - GAP));
            }
        }

        return sb.toString();
    }

    public static String toUpper3(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder sb = new StringBuilder(s.length());

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur >= 'a' && cur <= 'z') {
                sb.insert(i, (char) (cur - GAP));
            } else {
                sb.insert(i, cur);
            }
        }

        return sb.toString();
    }

    public static String toUpper4(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur >= 'a' && cur <= 'z') {
                String x = Character.toString((char) (cur - GAP));
                sb.replace(i, i + 1, x);
            }
        }

        return sb.toString();
    }

    public static void exercise(String sample) {
        if (sample == null || sample.isEmpty()) {
            return;
        }

        System.out.println(sample + " to uppercase and lowercase");
        for (int i = 0; i < sample.length(); i++) {
            char cur = sample.charAt(i);
            if (cur >= 'a' && cur <= 'z') {
                System.out.print((char) (cur - GAP));  //CASTING!! per stamparlo come carattere invece di numero 
            } else {
                System.out.print(cur);
            }
        }

        System.out.print(", ");

        for (int i = 0; i < sample.length(); i++) {
            char cur = sample.charAt(i);
            if (cur >= 'A' && cur <= 'Z') {
                System.out.print((char) (cur + GAP));
            } else {
                System.out.print(cur);
            }
        }

        System.out.println();
    }
}
