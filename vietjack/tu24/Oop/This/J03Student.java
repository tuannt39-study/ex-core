package vietjack.tu24.Oop.This;

//không sử dụng từ khóa this. Tham số và biến instance là khác nhau.

public class J03Student {
	 int id;  
	    String name;  
	      
	    J03Student(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	public static void main(String[] args) {
		J03Student e1 = new J03Student(111,"Hoang");  
		J03Student e2 = new J03Student(222, "Thanh");
		e1.display();
		e2.display();
	}

}
