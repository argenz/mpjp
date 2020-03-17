package s037;

public class Exercise {
    final static int GAP = 'a' - 'A';  // final? Costante  
    final static int MIDDLE = 6;
    
    public static void main(String[] args) {// scope == { ... }
        //exercise("Bob");
        //exercise("ciAo");

        //System.out.println("toUpper(): " + toUpper("Bob"));
        //System.out.println("toUpper2(): " + toUpper2("Bob"));
        //System.out.println("toUpper3(): " + toUpper3("Bob"));
        //System.out.println("toUpper4(): " + toUpper4("Bob"));
        
        // Main 
        String mes = "ZOO";
        System.out.println("Ceasar encoding of " + mes + " is: " + cesareMethod(mes, 2));
        System.out.println("Ceasar encoding of " + mes + " is: " + cesareMethod(mes, -2));
        System.out.println("Ceasar encoding of " + mes + " is: " + cesareMethod(mes, 25)); //check this one
        System.out.println("Ceasar encoding of " + mes + " is: " + cesareMethod(mes, 25)); //check this one
        System.out.println("Ceasar encoding of " + mes + " is: " + cesareMethod(mes, 0));
        System.out.println("Ceasar encoding of " + null + " is: " + cesareMethod(null, 2));
        }
    
    	// Method
    
    public static String cesareMethod(String s, int shift) {
    	 if (s == null || s.isEmpty()) {
             return s;
         }
    	 if (shift==0 ) {
    		 return s;
    	 }
    	 while(shift>=25){   //non necessario 
    		 shift = shift%25;
    	 }
    	 StringBuilder sb = new StringBuilder(s.length());
    	 
         for (int i = 0; i < s.length(); i++) {
        	 
        	 char cur = s.charAt(i);
        	 
        	 if ((cur >= 'A' && cur < 'Z')||(cur >= 'a' && cur < 'z')){
        			 sb.append((char)(cur + shift));	 
        	 }
        	 else if(cur == 'Z' || cur == 'z'){
        		 if (shift>0) {
        			 sb.append((char)(cur - GAP + MIDDLE + shift));
        		 }
        		 else if (shift<0) { 
					 sb.append((char)(cur + shift)); }
        	 }
        	 else{
        		 return "Error! the word must contain letters only.";	
        	 }	 
         }
    return sb.toString();	
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
                System.out.print((char) (cur - GAP));  //CASTING!! per salvarlo come carattere invece di numero 
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
