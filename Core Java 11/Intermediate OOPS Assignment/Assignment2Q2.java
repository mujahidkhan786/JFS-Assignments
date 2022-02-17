import java.util.ArrayList;
import java.util.List;
class Manager extends Assignment2Q2 
{
    Manager(int i_d, int salary)
    {
        super(i_d, salary);
    }
    public int getSalary(int salary)
    {
        int incentive = 5000;
        salary += incentive;
        salaryEarned += salary;
        employeeSalaries.add(salaryEarned);
        return (salary);
    }
}

class Labour extends Assignment2Q2
{
    Labour(int i_d, int salary) 
    {
        super(i_d, salary);
    }
    public int getSalary(int salary) 
    {
        int overtime = 500 ;
        int salaryForHours = (salary/365)/9;
        salary += (salaryForHours*1.5)*overtime;
        return salary;
    }

}

public  class Assignment2Q2 
{
    int salary=10000;
    int salaryEarned = 0 ;
    int i_d;
    static int total;
    static List<Integer> employeeSalaries;
    
    Assignment2Q2(int i_d ,int salary)
    {
        this.i_d = i_d ;
        this.salary = salary;
        salaryEarned = 0;
    }
    public int getSalary(int salary)
    {
        return salary;
    }
    public  int reciveSalary() 
    {
        salary = getSalary(salary);
        salaryEarned += salary;
        return salaryEarned;
    }
    public static int totalEmployeesSalary(List<Integer> employeeSalaries)
    {
        for(int i =0;i<employeeSalaries.size();i++)
        {
             total += employeeSalaries.get(i);
        }
        return total;
    }
    public static void main(String[] args) 
    {
        employeeSalaries = new ArrayList<>();
        Assignment2Q2 emp_1 = new Assignment2Q2(1,20000);
        Assignment2Q2 emp_2 = new Assignment2Q2(2,50000);
        Manager emp_3 = new Manager(2,30000);
        Labour emp_4 = new Labour(2,10000);
        employeeSalaries.add(emp_1.reciveSalary());
        employeeSalaries.add(emp_2.reciveSalary());
        employeeSalaries.add(emp_3.reciveSalary());
        employeeSalaries.add(emp_4.reciveSalary());

        System.out.println(totalEmployeesSalary(employeeSalaries));
    }

}