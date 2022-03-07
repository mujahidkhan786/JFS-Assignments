package LambdaAssignment;
import java.util.ArrayList;
import java.util.function.Predicate;


interface RemoveDup
{
    public int removeDup(String str);
}
public class LambdaQ4 {
    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
        ArrayList<String> list = new ArrayList<>();

        Predicate<String> filterEmp = (p)-> {
            if(Math.floorMod(p.length(),2)==0)
                return  true;
            else
                return false;
        };

        employeeList.stream()
                .filter(filterEmp)
                .forEach(p->list.add(p));

        return  list;
    }
    public static void main(String[] args) {
     
        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.add("Mujahid1");
        employeeList.add("Mujahid2");
        employeeList.add("Mujahid3");
        employeeList.add("Mujahid4");
        employeeList.add("Mujahid5");

        LambdaQ4 lambdaQ4 = new LambdaQ4();
        System.out.println(lambdaQ4.removeOddLength(employeeList));

    }
}