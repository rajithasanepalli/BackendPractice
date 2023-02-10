package accesmodifiers;

import java.sql.Date;

public class Report extends CEO {
	public int time;
	public String task;
	private String date;
	
	
	Report(){}
	Report(int time,String task, String string){
		
		this.time=time;
		this.task=task;
		this.date=string;
		System.out.println("Reporting time="+time);
		System.out.println("Reporting task="+task);
		System.out.println("Reporting date="+string);
		
		
	}

	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
