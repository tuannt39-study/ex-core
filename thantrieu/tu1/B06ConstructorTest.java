package thantrieu.tu1;

public class B06ConstructorTest {
    public int ageTest;
    public String nameTest;
    public String addrTest;

    public B06ConstructorTest(int agTest, String naTest, String adTest) { //constructor
        this.ageTest = agTest;
        this.nameTest = naTest;
        this.addrTest = adTest;
    }

    void display(){ //method
        System.out.println("\nTên: " + nameTest);
        System.out.println("Địa chỉ: " + addrTest);
        System.out.println("Tuổi: " + ageTest);
    }
}
