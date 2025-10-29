package firstprj;

import java.util.Scanner;

class Employee {
	String name;
	int yoj;
	float salary;
	String address;
	Employee(){
		name=""; yoj=2025; 
		salary=0.0f; address="";
	}
	Employee(String n, int y, float sal, String add){
		name = n; yoj = y; 
		salary = sal; address = add; 
	}
	void display(Employee e[]) {
		System.out.println("Name\tYOJ\tSalary\tAddress");
		for(int i=0;i<e.length;i++) {
			System.out.println(e[i].name+"\t"+e[i].yoj+"\t"+e[i].salary+"\t"+e[i].address);
		}
	}
}
public class EmployeeTest{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("No. of Employee?:");
		int no_of_emp = s.nextInt();
		Employee[] E = new Employee[no_of_emp];
		E[0] = new Employee("Ram",1994,50000.0f,"64C Vasant Kunj 110070");
		E[1] = new Employee("Sam",2000,60000.0f,"68D Dwarka 110037");
		E[2] = new Employee("Ana",1999,65000.0f,"26B R.K Puram 110022");
		Employee Emp = new Employee();
		//Emp.display(E);
		System.out.println('a'+1);
	}
	
}