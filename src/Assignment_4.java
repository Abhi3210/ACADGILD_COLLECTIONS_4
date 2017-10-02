import java.util.*;
class Employee implements Comparable<Employee>{
	String name;
	String designation;
	int salary;
	public Employee(String name,String designation,int salary){
		this.name=name;
		this.designation=designation;
		this.salary=salary;
	}
	public int compareTo(Employee e){
		//Employee e = (Employee)o1;
        int iSalComaprison = Integer.compare(this.salary, e.salary);
        if (iSalComaprison == 0)//Salaries are equal use name as comparison criteria
        {
            //lhs name comparison with rhs name
           // return name.compareTo(e.name);
            int isNameComaprison= name.compareTo(e.name);
            if(isNameComaprison==0){
            	return designation.compareTo(e.designation);
            }
            return isNameComaprison;
        }
        //Now if salaries are not equal, return comparison of salries
        return iSalComaprison;

		
	}
}
public class Assignment_4 {
      public static void main(String args[]){
    	  TreeSet<Employee> set=new TreeSet<Employee>();
    	  Employee em1=new Employee("Zonathan","Midfielder",12220);
    	  Employee em2=new Employee("Zonathan","Defender",12220);
    	  Employee em3=new Employee("Ronaldo","Forward",1222);
    	  set.add(em1);
    	  set.add(em2);
    	  set.add(em3);
    	  for(Employee em:set){
    		  System.out.println(em.name+" "+em.designation+" "+em.salary);
    	  }
      }
}
