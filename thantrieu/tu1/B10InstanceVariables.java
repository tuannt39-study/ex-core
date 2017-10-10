package thantrieu.tu1;
//Biến Instance được khai báo trong class nhưng ngoài tất cả các hàm, phương thức.
//Khai báo ở cấp độ class trước khi sử dụng. Được sử dụng access modifires và có giá trị mặc định là 0 hoặc null, hoặc false.
public class B10InstanceVariables {
    private int age10 = 0;
    public String name10;
    protected String addr10;

    public B10InstanceVariables(int age10, String name10, String addr10) {
        this.age10 = age10;
        this.name10 = name10;
        this.addr10 = addr10;
    }

    void display10(){
        System.out.println("Tên: " + name10 + "\nTuổi: " + age10 + "\nĐịa chỉ: " + addr10);
    }

    public static void main(String[] args) {
        B10InstanceVariables student = new B10InstanceVariables(25, "Tuân ", "Hà Nội " );
        student.display10();
    }
}
