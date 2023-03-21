import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.venky.Emp1;

public class Employee {
	public static void main(String[] args) {
		List<Emp1> list = new ArrayList<Emp1>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter Employee Details:");
			int id = sc.nextInt();
			String name = sc.next();
			double salary = sc.nextDouble();
			Emp1 e = new Emp1();
			e.setId(id);
			e.setName(name);
			e.setSalary(salary);
			list.add(e);
			System.out.println("Do You Want To Continue(y/n)");
			char ch = sc.next().charAt(0);
			if (ch == 'n') {
				break;
			}
		}
		for (Emp1 e : list) {
			System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());

		}
	}

}
