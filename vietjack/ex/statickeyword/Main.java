package vietjack.ex.statickeyword;

public class Main {

	public static void main(String[] args) {
		Student sv1 = new Student("Hà");
		Student sv2 = new Student("Hòa");
		Student sv3 = new Student("Hoàng");
		System.out.println("--------");
		System.out.println(sv1.getName() + "---" + sv1.getNumbers());
		System.out.println(sv2.getName() + "---" + sv2.getNumbers());
		System.out.println(sv3.getName() + "---" + sv3.getNumbers());
		System.out.println(Student.getNumbers());
	}

}
