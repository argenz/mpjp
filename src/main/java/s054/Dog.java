package s054;

public class Dog implements BarkAndWag {
	
    @Override //anche se il metodo è implementato e non sovrascritto, si chiama override. NON HA MOLTO SENSO, ma è così. 
    public String bark() {
        return "woof!";
    }

    public String bark(int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(bark());
        }

        return sb.toString();
    }

    @Override //implement.  
    public int tailWaggingSpeed(){
        return BarkAndWag.AVG_WAGGING_SPEED;
    }
    
    @Override
    public int a() {
    	return 2;
    }
}