package vietjack.ex.j05methods;

//Cách tạo một phương thức lấy tham số độ dài biến như là một input trong Java?

public class J15VarargsMethod {
	static int sumvarargs(int... intArrays) {
		int sum, i;
		sum = 0;
		for (i = 0; i < intArrays.length; i++) {
			sum += intArrays[i];
		}
		return (sum);
	}

	public static void main(String args[]) {
		int sum = 0;
		sum = sumvarargs(new int[] { 10, 12, 33 });
		System.out.println("The sum of the numbers is: \n" + sum);
	}
}
