package s095;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

/* 
 * [1 ...... 90]   numeri possibili nella tombola 
 * 
 * [a, b, c, d, e, f]
 * 
 * [23, 5, 6, 81, 18]  
 * 
 * algoritmo che dice se il numero c'è nella schedina con tempo O(1);
 * 
 * 
 * Sorting costa O(NlogN);
 * 
 * 
 * [5, 6, 18, 23, 81]
 * 
 * Hashtable crea una array 
 * [false, false, false, false, true, true, false, ...... ] O(1);
 * per valore più di 90 è un po' tragico.
 * 
 * si può risovere con intervalli
 * 
 * [[1...10][11...20][21...30].....[81...90]]
 *   [5, 6]  [18]      [23]         [81]	   si riducono il numero di valori nell'itervallo usando la chiave;
 * 
 *  [5, 6, 18, 23, 81]
 *  
 *  %10
 *  [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 *  [*,81, *,23, *, 5, 6, 7,18, *, * ]
 *  
 *  [5, 6, 18, 23, 85]
 *  
 *  %10 --> hash number. load factor è la dispoibilità di memoria.
 *  [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 *  [*, *, *,23, *, [5, 85], 6, 7,18, *, * ]
 *  
 *  
 * Binary Sorte Tree
 * 
 * a destra ci sono i nodi più piccoli, a sinistra i nodi più grandi. 
 * ci permette di gestire la ricerca degli elementi con tempi logaritmici.
 */
