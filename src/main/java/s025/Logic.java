package s025;

public class Logic {
    public static void main(String[] args) {
        boolean alpha = true;
        boolean beta = false;

        System.out.println(alpha && beta); // false --- AND  shortcut, considera solo la prima espressione (più economici)
        System.out.println(alpha || beta); // true  --- OR   shortcut, considera solo la prima espressione (più economici)
        System.out.println(!alpha); // false --- NOT
        System.out.println(alpha & beta); // false --- AND
        System.out.println(alpha | beta); // true  --- OR 

        int gamma = 0b101; // 5    &int ha 32 bit, qui ne vediamo solo 3, quindi gli altri sono settati a 0 per default. 
        int delta = 0b110; // 6

        System.out.println(gamma & delta); // 4 == 0100   confronto bit per bit //  1 & 1 = 0 // 0 & 1 = 1 // etc.
        System.out.println(gamma | delta); // 7 == 0111
        System.out.println(gamma ^ delta); // 3 == 0011 -->  OR esclusivo, il risultato è 1 solo se uno dei due è 1. 
        								   //         invece OR inclusivo, il risultato è 1 solo se entrambi sono 1. 
        
       
        
        System.out.println(~gamma); // -6
        
        // 00000000...101
        //NOT
        // 11111111...010
        
        
    }
}
