package s031;

public class SwitchInt {
    public static void main(String[] args) {
        int value = 4;

        // ...

        switch (value) {
        
        case 1:
            System.out.println("value is one");
            break;
        case 2:
            System.out.println("value is two");
            break;
        default:
            System.out.println("value is neither one nor two");
            break;
        }
        
        
    
        
        
        
        //done with switch
        
        switch (value) {
        
        case 1:
        case 3:
        case 5:
            System.out.println("value is odd and small");
            break;
            
        case 2:
        case 4: 
        case 6: 
            System.out.println("value is even and small");
            break;
            
        default:
            System.out.println("value is big");
            break;
        }
        
        
        // done with if-else 
        
        if (value>0 && value <=6){
        	if (value % 2 == 0){
        		System.out.println("Number is even and small");
        	} else{
        		System.out.println("Number is odd and small");
        	}
        }
        else {
      		System.out.println("Number is big");
        	}
        
    
    
    }
}
