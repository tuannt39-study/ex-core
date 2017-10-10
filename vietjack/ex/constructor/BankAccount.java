package vietjack.ex.constructor;

public class BankAccount {
	private String accountNumber;
	private int balance;
	private String customerName;
	private String email;
	private String phone;

	protected void withdraw(int amount) {
		if (this.balance < amount) {
			System.out.println("Rút tiền thất bại. Số tiền tối đa bạn có thể rút là: " + this.balance);
		} else {
			this.balance -= amount;
			System.out.println("Rút tiền thành công. Số tiền còn lại trong tài khoản là: " + this.balance);
		}
	}

	protected void deposit(int amount) {
		this.balance += amount;
		System.out.println("Gửi tiền thành công. Bạn đã gửi " + amount + " vào tài khoản");
		System.out.println("Số tiền trong tài khoản của bạn là: " + this.balance);
	}

	public BankAccount() {
		this("0000", 0, "Unknow", "Unknow@gmail.com", "0000000000");
	}

	public BankAccount(String accountNumber, int balance, String customerName, String email, String phone) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phone = phone;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
