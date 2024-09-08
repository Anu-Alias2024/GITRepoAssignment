package advancejava.assign1;

import java.time.LocalDate;

public class Task {
	
	String description;
	LocalDate duedate;
	
	public Task(String description, LocalDate duedate) {
	
		this.description = description;
		this.duedate = duedate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDuedate() {
		return duedate;
	}

	public void setDuedate(LocalDate duedate) {
		this.duedate = duedate;
	}

	@Override
	public String toString() {
		return "Task [description=" + description + ", duedate=" + duedate + "]";
	}
	
	

}
