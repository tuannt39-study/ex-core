package thantrieu.tu1;

public class B12AccessModifier {
    int age12;
    public String name12;
    protected String addr12;
    private String phone12;
    static double mark12;

    public B12AccessModifier(int age12, String name12, String addr12, String phone12) {
        this.age12 = age12;
        this.name12 = name12;
        this.addr12 = addr12;
        this.phone12 = phone12;
    }

    protected void export(){
        System.out.println("Tên: " + name12 + ", " + age12 + ", " + addr12 + ", " + phone12 + ", " + mark12);
    }

    public String getPhone12() {
        return phone12;
    }

    public void setPhone12(String phone12) {
        this.phone12 = phone12;
    }

    public static void main(String[] args) {
        B12AccessModifier ex = new B12AccessModifier(25, "Tuân ", "Hà Nội ", "567678687");
        mark12=9.8;
        ex.export();
        B12AccessModifier.mark12=9.5;
        ex.age12=32;
        ex.name12="Tuan 12";
        ex.phone12="12121212121212";
        ex.export();
    }
}
