package h17jb3.ex3.String;
//Nhập họ tên bất kỳ 3 lần. Chương trình in ra họ tên chứa tên cần tìm trong findName();
import java.util.Scanner;

public class B02_1
{
    public static void main(String[] args) {
        findName("thuc");
    }
    private static String[] NameInitial(int number){
        String[] name = new String[number];
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<number;i++){
            name[i] = scanner.nextLine();
        }
        return name;
    }
    private static boolean CheckName(String sample,String name){
        String[] hoVaTen = sample.trim().split(" ");
        if (name.equals(hoVaTen[hoVaTen.length-1])){
            return true;
        }else return false;
    }
    private static void findName(String name){
        String[] sample = NameInitial(3);
        StringBuilder stringBuilder = new StringBuilder();
        for (String a:sample) {
            if (CheckName(a,name)){
                stringBuilder.append(a+"\n");
            }
        }
        if (stringBuilder.length()!=0){
            System.out.println(stringBuilder.toString());
        }else System.out.println("ban da nhap sai ten");
    }
}
