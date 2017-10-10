package vietjack.ex.constructor;

/*
Tạo class mới cho Bank Account
Tạo các trường Account Number, Balance, Customer Name, Phone, Mail
Tạo các hàm getter, setter
Tạo hàm constructer
Tạo 2 phương thức gửi tiền -deposit và rút tiền -withdraw mô tả quá trình gửi tiền và rút tiền.
*/

public class Main {
	public static void main(String[] args) {
		BankAccount tuanAccount = new BankAccount("1234", 100, "Nguyễn Thế Tuân", "tuan@gmail.com", "0964829475");
		System.out.println("Số tài khoản: " + tuanAccount.getAccountNumber());
		System.out.println("Tên tài khoản: " + tuanAccount.getCustomerName());
		System.out.println("Số tiền trong tài khoản: " + tuanAccount.getBalance());
		tuanAccount.withdraw(150);
		tuanAccount.deposit(100);
		tuanAccount.withdraw(150);
		BankAccount theAccount = new BankAccount();
		theAccount.setCustomerName("Thế Nào");
		System.out.println("Số tài khoản: " + theAccount.getAccountNumber());
		System.out.println("Tên tài khoản: " + theAccount.getCustomerName());
		System.out.println("Số tiền trong tài khoản: " + theAccount.getBalance());
	}

}
