package s018;

public class Variable {
    public static void main(String[] args) {
        int value = 42;
        String name = "Bob";

        System.out.println(name);
        System.out.println(value);

        // Dangerous! Beware of null!
        String noName = null;   // non ha un valore. 
        						// inizialmente una buona idea 
        						// ma poi resi conto che un'idea pessima.
        
        System.out.println(noName);
        
        // Java 10 inferred type
        var bValue = 42;
        StringBuilder bName = new StringBuilder("Tom");

        System.out.println(bName);
        System.out.println(bValue);
        
        System.out.println(bName.charAt(0));
        bName.setCharAt(1, 'x');   //replaces char @ 1 with 'x'
        System.out.println(bName); 
        
    }
}
