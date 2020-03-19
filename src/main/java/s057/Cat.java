package s057;

public class Cat extends Mammal {
    private Tail tail;       //how does it know what the type tail is?

    public Cat(int gestationDays, int tailLen) {
        super(gestationDays);    //construct the Mammal before constructing the cat. This is why an abstract class might needs a constructor. 
        this.tail = new Tail(tailLen);
    }

    @Override
    public String toString() {						//gestation è accessibile perchè proprietà pubblica.
        return "Cat [tail=" + tail + ", gestation=" + gestation + "]";
    }
    
   
}
