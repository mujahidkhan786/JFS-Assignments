import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Employee {
	int id;
	String name;
	String department;
	int salary;
	public Employee(int id, String name, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public int getSalary() {
		return salary;
	}
	public String toString() {
		return "ID:"+id+" Name:"+name+" Department:"+department+" Salary:"+salary;
	}
	
}
class IdComparator implements Comparator<Employee>
{
   
    public int compare(Employee id1, Employee id2)
    {
        return id1.getId()-id2.getId();
    }
}
class NameComparator implements Comparator<Employee>
{
   
    public int compare(Employee name1, Employee name2)
    {
        return name1.getName().compareTo(name2.getName());
    }
}
class DepartmentComparator implements Comparator<Employee>
{
   
    public int compare(Employee dep1, Employee dep2)
    {
        return dep1.getDepartment().compareTo(dep2.getDepartment());
    }
}
class SalaryComparator implements Comparator<Employee>
{
   
    public int compare(Employee s1, Employee s2)
    {
        return s1.getSalary()-s2.getSalary();
    }
}
public class CollectionQ3 {

	public static void main(String[] args) {
		Employee emp0= new Employee(1,"Ayush", "cse", 200000);
		Employee emp1= new Employee(2,"Aayush", "mll", 350000);
		Employee emp2= new Employee(3,"pulkit", "iot", 48000);
		Employee emp3= new Employee(4,"mujhaid", "eee", 56789);
		Employee emp4= new Employee(5,"Khan", "it", 6000);
		Employee emp5= new Employee(6,"Jha", "ece", 700989);
		Employee emp6= new Employee(7,"Anshima", "cse", 1800996);
		Employee emp7= new Employee(8,"akriti", "ai", 675767);
		Employee emp8= new Employee(9,"Ayushi", "ml", 185200);
		Employee emp9= new Employee(10,"Sharma", "mech", 150000);
		
		Set<Employee> set = new TreeSet<>();
		
		System.out.print("Enter the option by which you want to sort Employee Details \n 1.ID \n 2.Name \n 3.Department \n 4.Salary \n:");
		Scanner scanner =new Scanner(System.in);
		String title = scanner.nextLine();
		if(title.equals("d")) {
			set = new TreeSet<>(new SalaryComparator());
			
		}
		else if(title.equals("x")) 
		{
			set = new TreeSet<>(new IdComparator());
			set.add(emp0);
			set.add(emp1);
			set.add(emp2);
			set.add(emp3);
			set.add(emp4);
			set.add(emp5);
			set.add(emp6);
			set.add(emp7);
			set.add(emp8);
			set.add(emp9);
		}
		else if(title.equals("y")) 
		{
			set = new TreeSet<>(new NameComparator());
			set.add(emp0);
			set.add(emp1);
			set.add(emp2);
			set.add(emp3);
			set.add(emp4);
			set.add(emp5);
			set.add(emp6);
			set.add(emp7);
			set.add(emp8);
			set.add(emp9);
		}
		else if(title.equals("z")) 
		{
			set= new TreeSet<>(new DepartmentComparator());
			set.add(emp0);
			set.add(emp1);
			set.add(emp2);
			set.add(emp3);
			set.add(emp4);
			set.add(emp5);
			set.add(emp6);
			set.add(emp7);
			set.add(emp8);
			set.add(emp9);
		}
		
		
		for(Employee it: set)
			System.out.println(it);
		scanner.close();

	}

}
