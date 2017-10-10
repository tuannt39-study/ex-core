package thantrieu.tu1;
//Toán tử thao tác bit trong Java
public class B14BitwiseOperators {
    public static void main(String[] args) {
        int a = 60, b = 13;
        System.out.println("a = " + a + " (60 = 0011 1100)" + "\nb = " + b + " (13 = 0000 1101)" + "\na&b = " + (a&b) + " (12 = 0000 1100 - Toán tử AND (VÀ) nhị phân sao chép một bit tới kết quả nếu nó tồn tại trong cả hai toán hạng)" + "\na|b = " + (a|b) + " (61 = 0011 1101 - Toán tử OR (HOẶC) nhị phân sao chép một bit tới kết quả nếu nó tồn tại trong một hoặc hai toán hạng)" + "\na^b = " + (a^b) + " (49 = 0011 0001 -  Toán tử XOR (HOẶC LOẠI TRỪ) nhị phân sao chép bit nếu nó được thiết lập trong một toán hạng nhưng không phải trong cả hai)" + "\n~a = " + (~a) + " (-61 = 1100 0011 -  Toán tử Ones Complement (ĐẢO 1 BIT) là toán tử một ngôi. Đảo bít 1 thành 0 và ngược lại)" + "\na = " + a + "\na<<2 = " + (a<<2) + " (240 = 1111 0000 -  Toán tử Left Shift (DỊCH TRÁI). Giá trị toán hạng trái được dịch chuyển sang trái bởi số các bit được xác định bởi toán hạng bên phải.)" + "\na = " + a + "\na>>2 = " + (a>>2) + " (15 = 1111 -  Toán tử Right Shift (DỊCH PHẢI). Giá trị toán hạng trái được dịch chuyển sang phải bởi số các bit được xác định bởi toán hạng bên phải )" + "\na = " + a + "\na>>>2 = " + (a>>>2) + " (15 = 0000 1111 -  Toán tử Zero Fill Right Shift (dịch phải và điền 0 vào chỗ trống)" +"\na = " + a);
    }
}
