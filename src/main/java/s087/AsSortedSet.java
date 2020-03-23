package s087;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class AsSortedSet {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = aSortedSet();
        System.out.println(sortedSet);
        System.out.println("First: " + sortedSet.first());
        System.out.println("Last: " + sortedSet.last());
        System.out.println(sortedSet.subSet(sortedSet.first() + 1, sortedSet.last()));
    }

    private static SortedSet<Integer> aSortedSet() {
        return new TreeSet<Integer>(Arrays.asList(12, 18, -5, -2233));    
        
        //Per creare le collezioni ci sono due modi: 
        //  1. Creare una collezione vuota e riempirla man mano. 
        //  2. Passare una Lista fatta con Arrays.asList (fatta da un'array).
        
        
    }

}
