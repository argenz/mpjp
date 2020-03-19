package s047;

public class Access {
	//di istanza
    private int a;       //di solito le costanti o proprietà della classe si mettono a private. 
    protected short b;   
    
    //di classe (static)
    static double c;  
    
    //not correct but for the sake of examples. 
    public long d;       
    
    //inizializzatore statico; 
    static {			//inizializza le variabili statche.  
        c = 18;
    }

    //costruttore
    public Access() {
        this.a = 42;    // this si riferisce all'oggetto corrente
        this.b = 23;    // a , b devono essere variabili di istanza
        				// variabili private si modificano attraverso il costruttore 
    }
    //metodo d'istanza
    public int h() {   
        return a / 2;
    }
    
    //metodo statico MAIN
    public static void main(String[] args) {
    	
    	Access access = new Access();
    	System.out.println(access.h());
    	System.out.println(c);
    	//System.out.println(a); Error!!  private
    	//System.out.println(b); Error!!  protected
    	//System.out.println(d); Error!!  non-static
    	System.out.println(access.d);
    	
    	System.out.println(access.a); 
    	System.out.println(access.b);
    	
    	
    	
    	
    }
}
