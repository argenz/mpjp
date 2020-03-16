package s005;

import java.util.Arrays;

/* commento 
 * 
 * 
 */
public class Hello {
	public static void main(String[] args) {
    	
        /// System.out.println("Hello!" + args[0] + "!");    //a linea di comando: "java s005.Hello Tom" 
    													     //permette di stampare "Hello! Tom!" 
    	// String[] args è la definizione dell'array di stringhe che vengono passate al metodo quando si esegue il metodo nella java virtual machine. 
    	// magari la maggior parte delle volte è vuota, ma ci deve essere perchè serve alla Javan virtual machine 
        
		
        if (args.length == 0){
        	System.out.println("Hello!");
        
        }else{
        	System.out.println("Hello" + args[0] + "!");
        }
        
        System.out.println(args);
        System.out.println(Arrays.toString(args));
        System.out.println("Lenght is" + args.length);
        System.out.println("Hello" + args[0] + "!");
	}
}
