package thantrieu.tu1;

public class B12AccessModifierTest {
    public static void main(String[] args) {
        B12AccessModifier test = new B12AccessModifier(33, "Tuân ", "Hà Nội ", "13131313");
        test.export();
        B12AccessModifier.mark12=9.9;
        test.age12=1212;
        test.name12="Tuan Test";
        test.addr12="Hà Nội";
        test.setPhone12("1111111111111");
        test.export();
    }
}
