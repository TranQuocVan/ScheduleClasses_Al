package Genetic_Algorithm;

import java.util.List;

public class Gen {
    private List<Student> listSt;
    private String subject;
    private int timeSlot;
    private String room ;
	public Gen(List<Student> listSt, String subject, int timeSlot, String room) {
		super();
		this.listSt = listSt;
		this.subject = subject;
		this.timeSlot = timeSlot;
		this.room = room;
	}
	@Override
	public String toString() {
		return "Gen [listSt=" + listSt + ", subject=" + subject + ", timeSlot=" + timeSlot + ", room=" + room + "]";
	}
	public List<Student> getListSt() {
		return listSt;
	}
	public String getSubject() {
		return subject;
	}
	public int getTimeSlot() {
		return timeSlot;
	}
	public String getRoom() {
		return room;
	}
	public void setListSt(List<Student> listSt) {
		this.listSt = listSt;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setTimeSlot(int timeSlot) {
		this.timeSlot = timeSlot;
	}
	public void setRoom(String room) {
		this.room = room;
	}

	
    
    
}
