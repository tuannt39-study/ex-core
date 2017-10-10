package thantrieu.tu1;

public class B06Constructor {
    public int age;
    public String name;
    public String addr;

    public B06Constructor(int ag, String na, String ad) { //constructor
        this.age = ag;
        this.name = na;
        this.addr = ad;
        System.out.println("\nTên: " + na);
        System.out.println("Địa chỉ: " + ad);
        System.out.println("Tuổi: " + ag);
    }

    public static void main(String[] args) {
        B06Constructor p1 = new B06Constructor(21, "Tuân ", "Hà Nội "); //Object
        B06Constructor p2 = new B06Constructor(22, "Tuân ", "Hà Nội ");
    }
}
