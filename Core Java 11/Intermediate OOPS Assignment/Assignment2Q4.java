abstract class name 
{
	    String name;
	    name(String name)
	    {
	        this.name =name;
	    }
	    public  abstract String getname();
	}
	class person extends name
	{
	    person(String name) 
	    {
	        super(name);
	    }
	    public  String getname()
	    {
	        return ("Hello,"+this.name);
	    }
	}
	 abstract class MyClass 
	 {
	    public abstract void dis1();
	}

	class  AbstClassP3 extends MyClass
	{
	    
	    public void dis1()
	    {
	        System.out.println("1)This is the subclass implementation of the display method");
	    }
	}
	abstract class MyClass2 
	{
	    public abstract void dis2();
	}

	class AbstClassP4 extends MyClass2
	{
	    public void dis2()
	    {
	        System.out.println("2)This is not the Private Class");
	    }
	}
	abstract class MyClass3
	{
	    public void dis3()
	    {
	        System.out.println("3)This is an abstract class without abstract method");
	    }
	}
	class AbstClassP6 extends MyClass3
	{
	}
	public class Assignment2Q4 {
	    public static void main(String[] args) {
	        person user1 = new person("Mujahid Hussain Khan");
	        System.out.println(user1.getname());
	        new AbstClassP3().dis1();
	        new AbstClassP4().dis2();
	        new AbstClassP6().dis3();
	        

	    }
	}
