package java11;
@FunctionalInterface
interface Func<T1,T2,T3,R> {
     R apply(T1 t1, T2 t2, T3 t3);
}
public class Java11Q1
{
    public static void main (String[] args)
    {
        Func <Integer,Integer,Integer,Integer>  i = (p,t,r) -> (p*t*r);
        System.out.println(i.apply(300,8,5));
    }
}
