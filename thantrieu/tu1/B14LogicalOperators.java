package thantrieu.tu1;
//Toán tử logic trong Java
public class B14LogicalOperators {
    public static void main(String[] args) {
        boolean a = true, b = false;
        System.out.println("a ? " + a + "\nb ? " + b + "\na&&b ? " + (a&&b) + " - Toán tử Logical AND (Và logic). Nếu cả hai toán hạng là khác không, thì khi đó điều kiện là true" + "\na||b ? " + (a||b) + " - Toán tử Logical OR (Hoặc logic). Nếu một trong hai toán tử khác 0, thì điều kiện là true" + "\n!a&&b ? " + (!a&&b) + " - Toán tử Logical NOT (Phủ định logic). Sử dụng để đảo ngược lại trạng thái logic của toán hạng đó. Nếu điều kiện toán hạng là true thì phủ định nó sẽ là false ");
    }
}
