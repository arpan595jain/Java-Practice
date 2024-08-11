import java.io.*;
import java.util.*;
class GFG {
    // function to convert Iterable into Collection
    public static <T> Collection<T> 
                   getCollectionFromIterable(Iterable<T> itr)
    {
        // Create an empty Collection to hold the result
        Collection<T> cltn = new ArrayList<T>();
 
        // Iterate through the iterable to
        // add each element into the collection
        for (T t : itr)
            cltn.add(t);
        // Return the converted collection
        return cltn;
    }
    public static void main(String[] args)
    {
       Iterable<Integer> i = Arrays.asList(1, 2, 3, 4);
        System.out.println("Iterable List : " + i);
        Collection<Integer> cn = getCollectionFromIterable(i);
        System.out.println("Collection List : " + cn); }}
