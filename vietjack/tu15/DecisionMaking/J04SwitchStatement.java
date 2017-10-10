package vietjack.tu15.DecisionMaking;

public class J04SwitchStatement {

	public static void main(String[] args) {
		// char grade = args[0].charAt(0);
		char grade = 'C';

		//Lệnh switch cho phép bạn kiểm tra một biến bình đẳng với một danh sách các giá trị. Mỗi giá trị được gọi là một case – trường hợp. Nếu giá trị này trùng với case nào thì các lệnh tương ứng với case đó sẽ được thực thi.
		switch (grade) {
		case 'A':
			System.out.println("Xuat sac!");
			break;
		case 'B':
		case 'C':
			System.out.println("Tot");
			break;
		case 'D':
			System.out.println("Thong qua");
		case 'F':
			System.out.println("Hay thu lai");
			break;
		default:
			System.out.println("Kem");
		}
		System.out.println("Cap do cua ban la " + grade);
	}

}
