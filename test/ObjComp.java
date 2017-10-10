package test;

public class ObjComp {
	public static void main(String[] args) {
		int kq=0;
		ObjComp oc = new ObjComp();
		Object o = oc;
		if (o==oc) kq=1;
		if (o!=oc) kq=kq+10;
		if (o.equals(oc)) kq=kq+100;
		if (oc.equals(o)) kq=kq+1000;
		System.out.println("kq = " + kq);
	}

}
