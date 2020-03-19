package s056;

public abstract class Abstract {   //abstract, non è istanziabile. 
    public abstract void anAbstractMethod();   //senza body, solo dichiarata.

    public void aConcreteMethod() {
    }
}
//ma nelle interface non si deve dichiarare il metodo come "public abstract" ---> ma nelle interfacce è sottointeso. 