package be.ecam.basics.exercises;

import java.util.List;

public class ListUtils {
    public static List<String> removeShortStrings(List<String> list, int minLen) {
        // Le problème ici c'est que en Java, tant qu'on parcourt une list, on ne peut rien modifier 
        // On peut utiliser removeif pour régler le pb 

        // for (String s : list) {
        //     if (s.length() < minLen) {
        //         list.remove(s);
        //     }
        // }

        list.removeIf(s -> s.length() < minLen);
        
        return list;
    }
}
