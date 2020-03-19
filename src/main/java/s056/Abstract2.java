package s056;

public abstract class Abstract2 {//seems like a normal class, cause has concrete
								 //method, but by saying "abstract" it cannot create an instance/object.  
								 //used to prevent people from making objects. Don't allow to make "animal" object, but allow "Lion" object or "Zebra", but not the general class. 
    public void aConcreteMethod() {
        System.out.println("hello");
    }
}

