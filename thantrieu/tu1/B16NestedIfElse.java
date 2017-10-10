package thantrieu.tu1;

public class B16NestedIfElse {
    public static void main(String[] args) {
        int a=20, b=20, c=15;
        System.out.println("a= " + a + "\nb= " + b + "\nc= " +c);
        if (a<0){
            System.out.println("a là số âm");
        } else if (a>0 && a<=10){
            System.out.println("0 < a <= 10");
        } else if (a>10 && a<=20){
            if (b>30) b+=10;
            else b+=50;
            System.out.println("10 < a <= 20 , b = " + b);
        } else {
            System.out.println("a > 20");
        }

        System.out.println("Trước khi gán giá trị cho c, c = " + c);
        c = (a<30) ? 100 : -500;
        System.out.println("c = " + c);
        System.out.println("Đây là câu lệnh sau khối if else ");
    }
}
