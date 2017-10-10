package h17jb3.ex7.Streams.baichuaex5;

import java.io.Serializable;
import java.util.ArrayList;

public class StaffsManagement implements Serializable{
	private ArrayList<staffs> staff_list;
	
	public StaffsManagement() {
		//super();
		staff_list = new ArrayList<>();
	}
	public ArrayList<staffs> getStaffsList(){
		return this.staff_list;
	} 
	public void setStaffsList(staffs staff){
		this.staff_list.add(staff);
	}
}
