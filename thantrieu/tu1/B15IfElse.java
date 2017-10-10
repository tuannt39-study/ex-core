package thantrieu.tu1;

public class B15IfElse {
    public static void main(String[] args) {
        int a=2, b=10;
        if (a>=0){
            System.out.println("a là số không âm ");
            b++;
            System.out.println("b = " + b);
        } else {
            System.out.println("a là số âm ");
            b--;
            System.out.println("b = " + b);
        }
        System.out.println("Câu lệnh liệt kê sau khối if-else ");
    }
}