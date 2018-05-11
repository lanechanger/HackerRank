import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * https://www.hackerrank.com/challenges/java-priority-queue/problem
 * Practice > Java > Data Structures > Java Priority Queue
 * by Jeremy Ng (lanechanger)
 * https://github.com/lanechanger
 * https://www.hackerrank.com/jeremy_ng_86
 *
 */

/*
 * Create the Student and Priorities classes here.
 */
class Student {
	private int myId;
	private String myName;
	private double myCgpa;

	public Student(int id, String name, double cgpa) {
		myId = id;
		myName = name;
		myCgpa = cgpa;
	}

	int getID() {
		return myId;
	}

	String getName() {
		return myName;
	}

	double getCGPA() {
		return myCgpa;
	}
}

class Priorities {
	List<Student> getStudents(List<String> events){
		PriorityQueue<Student> queue = new PriorityQueue<>(Comparator.comparing(Student::getCGPA).reversed()
				.thenComparing(Student::getName).thenComparing(Student::getID));
		for (String event : events) {
			StringTokenizer st = new StringTokenizer(event);
			if (st.nextToken().equals("ENTER")) {
				String name = st.nextToken();
				double gpa = Double.parseDouble(st.nextToken());
				int id = Integer.parseInt(st.nextToken());
				queue.add(new Student(id, name, gpa));
			} else {
				queue.poll();
			}
		}

		List<Student> list = new LinkedList<>();
		while (queue.peek() != null) {
			list.add(queue.poll());
		}

		return list;
	}
}

public class MedJavaPriorityQueue {
	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student st : students) {
				System.out.println(st.getName());
			}
		}
	}
}
