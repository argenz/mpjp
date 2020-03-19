package s046;

import static java.lang.Math.*;   //importa i metodi statici, così si possono chiamare senza chiamare le classi.
                             //import all methods. 
import java.lang.Math; //senza definirlo "static" , importa la classe e metodi di istanza. 

public class Scope {
    private static int staticMember = 5;   
    private long member = 5;				

    public void f() {
        int local = 7;
        if (staticMember == 2) {
//            float local = 0.0F;
            short inner = 12;
            staticMember = 1 + inner;
            member = 3 + local;
        }
    }

    public void g() {
        System.out.println(member);
    }
    
    public static void k() {
    	
    }

    public static void main(String[] args) {  //metodi statici vedono solo le variabili statiche. 
        double local = 5;
        System.out.println(local);
        staticMember = 12;
        
        //f(); Error!!
        
        Scope scope = new Scope();   //you must define the object first 
        scope.f();					 //to be able to call methods f() & g();
        //f(); Error!!               //must be tied to an object.
        
      //nomeOggetto.nomeMetodoDiIstanza();  
        scope.g();
      //nomeClasse.nomeMetodoStatico();
        Scope.k();
        
      //se nella classe stessa, non è necessario chiamare la classe. 
        k();      
       
        double con = Math.pow(2,3); //
        double con2 = pow(2,3);     // accessibile anche senza chiamare la classe perchè importato come metodo statico. 
        
        con = con + con2; //
        
    }
}
