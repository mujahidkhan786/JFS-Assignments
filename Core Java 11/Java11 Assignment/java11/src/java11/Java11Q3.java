package java11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Java11Q3 {
    public static void main(String args[]) {
        String str  = "A quick brown fox jumps over the lazy dog";
        ArrayList <String> list = (ArrayList<String>) Stream.of(str.split(" ",0)).collect(toList());
        String[]  str1 =  list.stream().toArray(String[] :: new);
        System.out.println(Arrays.toString(str1));

    }
}


