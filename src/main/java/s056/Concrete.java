package s056;

// The type Concrete must implement the inherited abstract method
//public class Concrete extends Abstract {
//}

public class Concrete extends Abstract { //imports an abstract method. so is an abstract class.
    @Override
    public void anAbstractMethod() {     //becomes a concrete class because the abstract method is overrode.
        System.out.println("not abstract anymore");
    }
}
