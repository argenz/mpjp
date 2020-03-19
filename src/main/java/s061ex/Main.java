package s061ex;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[3];                    //crea array di 3 persone
        persons[0] = new Consultant("Tom", "Jones", 1000);   // la prima persona è un consultant Nome, Cognome, Daily
        persons[1] = new Employee("Jim", "Smith", 3000);     // la seconda persona è un employee Nome, Cognome, Salary
        persons[2] = new Consultant("Bob", "Korn", 800);     // la terza persona è un consultant Nome, Cognome, Daily

        for (Person person : persons) {                      //per ogni persona 
            System.out.println(person);
        }

        for (Person person : persons) {
            if(person instanceof Consultant) {       //Safe downcasting. 
                Consultant c = (Consultant)person;   //Nel momento in cui metto Consultant nell'array person, diventa type Person. Quindi devi fare il downcasting. 
                System.out.println(c.getDaily());
                
            } else if(person instanceof Employee) {
                Employee e = (Employee)person;         //?? inutile
                System.out.println(e.getSalary());
            }

        }
    }
}
