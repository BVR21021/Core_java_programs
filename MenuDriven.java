import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MenuDriven {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.Append");
			System.out.println("2.insert");
			System.out.println("3.Display");
			System.out.println("4.Replace");
			System.out.println("5.Delete");
			System.out.println("6.Seaarch");
			System.out.println("7.Sort");
			System.out.println("8.Quit");
			System.out.println("Enter your choice:");
			int ch = sc.nextInt();
			if (ch == 1) {
				System.out.println("Enter Element:");
				int ele = sc.nextInt();
				list.add(ele);
				System.out.println("Appended");
			} else if (ch == 2) {
				System.out.println("Enter Index:");
				int loc = sc.nextInt();
				if (loc >= 0 && loc <= list.size() - 1) {
					System.out.println("Enter Element:");
					int ele = sc.nextInt();
					list.add(loc, ele);
					System.out.println("inserted");
				} else {
					System.out.println("Invalid Location");
				}
			} else if (ch == 3) {
				System.out.println("List:" + list);
			} else if (ch == 4) {
				System.out.println("Enter Index:");
				int loc = sc.nextInt();
				if (loc >= 0 && loc <= list.size() - 1) {
					System.out.println("Enter Element:");
					int ele = sc.nextInt();
					list.set(loc, ele);
					System.out.println("Replaced");
				} else {
					System.out.println("Invalid Location");
				}
			} else if (ch == 5) {
				System.out.println("Enter Index:");
				int loc = sc.nextInt();
				if (loc >= 0 && loc <= list.size() - 1) {
					list.remove(loc);
					System.out.println("Removed");
				} else {
					System.out.println("Invalid Location");
				}
			} else if (ch == 6) {
				System.out.println("Enter Index:");
				int ele = sc.nextInt();
				int loc = Collections.binarySearch(list, ele);
				if (loc >= 0) {
					System.out.println("Element Found");
				} else {
					System.out.println("Not Element Found");
				}
			} else if (ch == 7) {
				Collections.sort(list);
				System.out.println("Sorted");
			} else if (ch == 8) {
				System.out.println("End");
				System.exit(1);
			} else {
				System.out.println("Invalid Choise");
			}
		}
	}
}
