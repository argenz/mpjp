package s029;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
    	
    	// inizializzare un'array 
        int[] array = new int[12];   //crea un'array di zeri. 
        
        Arrays.toString(array);
        
        array[0] = 7;

        System.out.println(array[0] + ", " + array[11]);

        int value = array[5];
        System.out.println(value);
        
        // value = array[12]; // exception
        
      
    }
}
