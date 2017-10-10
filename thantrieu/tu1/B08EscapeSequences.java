package thantrieu.tu1;

public class B08EscapeSequences {
    public static void main(String[] args) {
        System.out.println("\\t : Chèn một tab vào văn bản tại điểm này \t1\t2");
        System.out.println("\\b : Chèn một backspace vào văn bản tại điểm này 3\b4");
        System.out.println("\\n : Chèn một dòng mới vào văn bản tại điểm này \n5");
        System.out.println("\\r : Chèn một carriage return vào văn bản tại điểm này \r67 89");
        System.out.println("\\f : Chèn một form feed vào văn bản tại điểm này \f7");
        System.out.println("\\\' : Chèn một dấu trích dẫn đơn vào văn bản tại điểm này \'8");
        System.out.println("\\\" : Chèn một dấu trích dẫn kép vào văn bản tại điểm này \"9");
        System.out.println("\\\\ : Chèn một ký tự dấu chéo ngược vào văn bản tại điểm này \\0");
    }
}
