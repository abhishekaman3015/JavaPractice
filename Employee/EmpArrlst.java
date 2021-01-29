import java.util.*;
 
class Employee{
    public int id;
    public String name;
    public String address;
    public int sal;
    public static int count = 0;
 
    
    public Employee(){}
 
   
    public Employee(int id, String name,String address, int sal)
    {
        super();
        this.id = id;
        this.name = name;
        this.address=address;
        this.sal=sal;
        count++;
    }
 
    public int getId() {
    return id;
    }
 
    public String getName() {
    return name;
    }
 
    public String getAddress() {
    return address;
    }
    public int getSalary() {
    return sal;
    }
}
 
public class EmpArrlst {
public static void main(String[] args) throws Exception 
    {
     List<Employee> list = new ArrayList<Employee>();
 
     list.add(new Employee(1, "Abhi","Delhi",20000));
     list.add(new Employee(2, "Rajdurai","Mumbai",30000));
     list.add(new Employee(3, "Bhawana","Bangalore",50000));
     list.add(new Employee(4, "Geetha","Pune",35000));
 
        for(Employee emp: list) 
        {
            System.out.println(emp.getId()+" "+emp.getName()+" " +emp.getAddress()+" "+emp.getSalary());
        }}}