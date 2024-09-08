package advancejava.assign1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TaskApplication {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			addTask(scanner);

		} catch (Exception e) {

		} finally {
			scanner.close();
		}
	}


	private static void addTask(Scanner scanner) {
		System.out.println("Enter number of tasks");
		int n = scanner.nextInt();
		Task[] taskList = new Task[n];

		for (int i = 0; i < n; i++) {

			System.out.println("Enter the Description");
			String taskDescription = scanner.next();
			System.out.println("Enter the Due Date in yyyy-MM-dd format");
			String userInput = scanner.next();
			DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate date = LocalDate.parse(userInput, dateFormat);
			Task task = new Task(taskDescription, date);

			taskList[i] = task;
		}
	}

}
