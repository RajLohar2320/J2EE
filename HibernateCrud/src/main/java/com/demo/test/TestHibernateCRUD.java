package com.demo.test;
import com.demo.services.*;
import java.util.*;
import com.demo.model.*;
public class TestHibernateCRUD {

	public static void main(String[] args) {
		EmployeeServices esrvc = new EmpServicesImpl();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. Insert");
			System.out.println("2. Display");
			System.out.println("3. Display By ID");
			System.out.println("4. Update By ID");
			System.out.println("5. Delete By ID");
			System.out.println("0. Exit");
			System.out.println("Enter Choice : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Emp ID : ");
				int id = sc.nextInt();
				System.out.println("Enter Emp Name : ");
				String name = sc.next();
				System.out.println("Enter Emp Salary : ");
				double sal = sc.nextDouble();
				System.out.println("Enter City Name : ");
				String city = sc.next();
				System.out.println("Enter State : ");
				String state = sc.next();
				EmpAddress eadd = new EmpAddress(id, city, state);
				Employee e = new Employee(id, name, sal, eadd);
				if(esrvc.insert(e))
					System.out.println("Data Successfully Inserted");
				break;
				
			case 2:
				List<Employee> elist = new ArrayList<Employee>();
				elist = esrvc.showAll();
				for(Employee e1 : elist)
				{
					System.out.println(e1);
				}
				break;
				
			case 3:
				System.out.println("Enter ID to Display Employee : ");
				id = sc.nextInt();
				e = esrvc.get(id);
				System.out.println(e);
				break;

			case 4:
				break;
			case 5:
				System.out.println("Enter ID to Delete Employee : ");
				id = sc.nextInt();
				if(esrvc.delete(id))
					System.out.println("Data Deleted Successfully");
				break;
			default:
				System.out.println("Thank You 😘😘😘");
			}
		}while(choice != 0);
	}

}
