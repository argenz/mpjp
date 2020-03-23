package s079;

import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        System.out.println("Please, enter a few numbers");
        double result = 0;

        // try-with-resources
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    result += scanner.nextDouble();
                } else {
                    System.out.println("Bad input, discarded: " + scanner.next());
                }   // il close avviene automaticamente. 
                
            }       // UTILE perchè spesso se un'eccenzione viene lanciata in mezzo, 
            		// anche se ho messo close() alla fine del blocco, la risorsa rimarrà aperta.  
        }           // Perciò se si usa try ( ){ siamo sicuri che anche se c'è un'eccezione in mezzo, il file sarà chiuso. 

        System.out.println("Total is " + result);
    }
}
