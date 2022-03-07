package LambdaAssignment;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class LambdaQ8 {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(11,22,33,44,55,66,77,88);

        Consumer<List<Integer> > dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
        Thread t = new Thread(()->dispList.accept(list1));
        t.start();


    }
}
