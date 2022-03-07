package LambdaAssignment;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class LambdaQ7 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("x",5);
        map.put("y",1);
        map.put("z",4);

        LambdaQ7 lambdaQ7 = new LambdaQ7();
        lambdaQ7.convertKeyValueToString(map);

    }
    @SuppressWarnings("unchecked")
	public String convertKeyValueToString(HashMap<String, Integer> map) {

        StringBuilder str = new StringBuilder();
        @SuppressWarnings("rawtypes")
		Consumer<Map.Entry> consumer=(p)->str.append(p.getKey()).append(p.getValue());
        @SuppressWarnings("rawtypes")
		Set set  = map.entrySet();
        set.stream()
                .forEach(consumer);



        System.out.println(str);
        return str.toString();


    }
}