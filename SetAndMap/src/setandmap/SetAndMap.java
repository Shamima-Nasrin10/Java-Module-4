
package setandmap;

import java.util.HashSet;
import java.util.Set;


public class SetAndMap {

    
    public static void main(String[] args) {
       Set <String> set=new HashSet<>();
       set.add("Apple");
       set.add("Apricot");
       set.add("Banana");
       set.add("Pineapple");
       set.add("Blueberry");
        System.out.println(set);
        for(String s:set){
            System.out.println(" "+s.toUpperCase());
    }
    
}
}
