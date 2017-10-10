package thantrieu.tu1;
//Biến static được khai báo trong class nhưng ngoài tất cả các hàm, phương thức.
//Chỉ có duy nhất một bản copy của biến static. Khai báo ở cấp độ class trước khi sử dụng. Được sử dụng access modifires và có giá trị mặc định là 0 hoặc null, hoặc false.
public class B11StaticVariables {
    private int age11 = 0;
    public String name11;
    protected String addr11;
    static int numOfObject;

    public B11StaticVariables(int age11, String name11, String addr11) {
        ++numOfObject;
        this.age11 = age11;
        this.name11 = name11;
        this.addr11 = addr11;
    }

    void display11(){
        System.out.println("Tên: " + name11 + "\nTuổi: " + age11 + "\nĐịa chỉ: " + addr11);
    }

    public static void main(String[] args) {
        numOfObject=0;
        B11StaticVariables student = new B11StaticVariables(25, "Tuân ", "Hà Nội " );
        student.display11();
        System.out.println("Number of object: " + B11StaticVariables.numOfObject);
        B11StaticVariables student11 = new B11StaticVariables(31, "Tuân ", "Hà Nội " );
        System.out.println("Number of object: " + B11StaticVariables.numOfObject);
    }
}