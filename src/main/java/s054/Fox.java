package s054;

public class Fox implements Barker {
    @Override //implements
    public String bark() {
        return "yap!";
    }
    
    @Override
    public String toString() {
    	return "I'm a fox";
    }
    
    //@Overload
    //serve a dichiarare il fatto che i due metodi hanno lo stesso nome ma hanno input in più o in meno; 
    //serve a diversificare il metodo. 
}