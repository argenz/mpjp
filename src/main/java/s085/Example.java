package s085;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		
		List<Dog> myDogList = new ArrayList<>();   //oggetti non ordinati // standard
		
		Set<Dog> myDogs = new TreeSet<>();         //oggetti ordinati 
		
		Set<Dog> myDogTable = new HashSet<>();     //accesso O(1) agli elementi
		
		Map<DogOwner, Dog> myOwnersAndDogs = new TreeMap<>();   // accesso a più elemnti combacianti
		
		Map<DogOwner, Dog> myOwnersAndDogs2 = new HashMap<>();   // accesso a più elemnti combacianti
		

	}

}

class Dog{
	String name;
	DogOwner owner;
}

class DogOwner {
	String owner;
}

