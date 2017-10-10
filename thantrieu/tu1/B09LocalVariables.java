package thantrieu.tu1;
//Biến local là các biến được khai báo và sử dụng trong các phương thức, trong hàm tạo, trong các khối.
// Không có giá trị mặc, phải khởi tạo giá trị cho nó trước khi có thể sử dụng.
public class B09LocalVariables {
    B09LocalVariables(){
        int age = 25;
        String name = "Tuân";
        String addr = "Hà Nội";
        System.out.println("\nTên: " + name + "\nTuổi: " + age + "\nĐịa chỉ: " + addr);
    }
    public static void main(String[] args) {
        int a = 20;
        a = a + 10;
        System.out.println("a = " + a);
        B09LocalVariables student = new B09LocalVariables();
    }
}
