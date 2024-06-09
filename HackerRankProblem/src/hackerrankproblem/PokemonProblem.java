
package hackerrankproblem;

import java.util.Arrays;


public class PokemonProblem {
    public static void main(String[] args) {
        Integer[] pokemon_1=new Integer[5];
        Integer[] pokemon_2=new Integer[5];
        System.out.println(Arrays.toString(mergeLineup(pokemon_1, pokemon_2)));
    }
    
    public static Integer[] mergeLineup(Integer[] pokemon_1, Integer[] pokemon_2){
        Integer [] a={4, 5, -1, null, null};
        Integer[] b={2, 27, 7, 12, null};
        
        Integer[] mergePokemon=new Integer[a.length];
        
        for(int i=0; i<a.length; i++){
            if(a[i]==null){
                a[i]=0;
            }
            if(b[a.length-i-1]==null){
                b[a.length-i-1]=0;
            }
            mergePokemon[i]= a[i]+b[a.length-i-1];
        }
        
       return mergePokemon;
    }
}
