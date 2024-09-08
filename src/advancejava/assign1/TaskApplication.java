package advancejava.assign1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TaskApplication {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);

			Task[] taskList = addTask(scanner);
			System.out.println("Remove Task ");
			Task[] updatedList = removeTask(scanner, taskList);

		} catch (Exception e) {

		} finally {
			scanner.close();
		}
	}

//Add remove task functionality
	private static Task[] removeTask(Scanner scanner, Task[] taskList) {
		System.out.println("Enter the task Description to remove");
		String taskDesc = scanner.next();
		int size = taskList.length;
		Task[] updatedtasks = new Task[size - 1];

		for (int i = 0; i < size - 1; i++) {
			if (taskList[i].getDescription() != taskDesc) {
				updatedtasks[i] = taskList[i];
			}
		}
		return updatedtasks;

	}

//Add Tasks to the to-do List
	private static Task[] addTask(Scanner scanner) {

		System.out.println("Enter number of tasks");
		int n = scanner.nextInt();
		Task[] taskList = new Task[n];
		System.out.println("Add task Details");
		for (int i = 0; i < n; i++) {

			System.out.println("Enter the Description");
			String taskDescription = scanner.next();
			System.out.println("Enter the Due Date in dd-MM-yyyy format");
			String userInput = scanner.next();
			DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate date = LocalDate.parse(userInput, dateFormat);
			Task task = new Task(taskDescription, date);

			taskList[i] = task;
		}

		return taskList;
	}

}
