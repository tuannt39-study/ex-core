/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h17jb3.tu4.op;

/**
 *
 * @author haopv
 */
public class COb extends BOb {
    int f1;
    //int f2;

    public boolean aVariable; //hides aVariable in Superclass
    public void aMethod() { //overrides aMethod in Superclass
        f1 = 3;
        super.aMethod();
        System.out.format("f1 in COb %d%n", f1);
        System.out.format("f1 in BOb %d%n", super.f1);
        System.out.format("f1 in AOb %d%n", super.getSuper());
    }
/*
    public int getF1() {
        return f1;
    }

    public void setF1(int f1) {
        this.f1 = f1;
    }

    public int getF2() {
        return f2;
    }

    public void setF2(int f2) {
        this.f2 = f2;
    }
    */
}
