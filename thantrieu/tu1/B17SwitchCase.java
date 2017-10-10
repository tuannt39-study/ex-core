package thantrieu.tu1;

public class B17SwitchCase {
	public static void main(String[] args) {
		int a = 10, b = 100;
		switch (a) {
		case 0:
			System.out.println("a = 0");
			break;
		case 10:
			switch (b) {
			case 50:
				System.out.println("b = 50");
				break;
			case 100:
				System.out.println("b = 100");
				break;
			case 200:
				System.out.println("b = 200");
				break;
			default:
				System.out.println("Không có giá trị nào thỏa mãn b");
			}
			System.out.println("a = 10");
			break;
		case 20:
			System.out.println("a = 20");
			break;
		case 30:
			System.out.println("a = 30");
			break;
		default:
			System.out.println("Không có giá trị nào thỏa mãn a");
		}
		System.out.println("Đây là câu lệnh sau khối switch case");
	}
}
