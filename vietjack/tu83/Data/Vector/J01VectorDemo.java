package vietjack.tu83.Data.Vector;

//Lớp Vector trong Java
//Lớp Vector trong Java triển khai một mảng động.
//Nó tương tự như ArrayList, nhưng với hai điểm khác biệt:
//Vector được đồng bộ.
//Vector chứa các phương thức legacy mà không là một phần của Collection Framework.

import java.util.Enumeration;
import java.util.Vector;

public class J01VectorDemo {
	public static void main(String args[]) {
		// capacity ban dau la 3, incr la 2
		Vector<Number> v = new Vector<Number>(3, 2);
		System.out.println("Size ban dau: " + v.size());
		System.out.println("Capacity ban dau: " + v.capacity());
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		System.out.println("Capacity sau 4 lan cong la: " + v.capacity());
		System.out.println("Size sau 4 lan cong la: " + v.size());
		
		v.addElement(new Double(5.45));
		System.out.println("Capacity hien tai: " + v.capacity());
		v.addElement(new Double(6.08));
		v.addElement(new Integer(7));
		System.out.println("Capacity hien tai: " + v.capacity());
		v.addElement(new Float(9.4));
		v.addElement(new Integer(10));
		System.out.println("Capacity hien tai: " + v.capacity());
		v.addElement(new Integer(11));
		v.addElement(new Integer(12));
		System.out.println("Phan tu dau tien: " + (Integer) v.firstElement());
		System.out.println("Phan tu cuoi cung: " + (Integer) v.lastElement());
		if (v.contains(new Integer(3)))
			System.out.println("Vector chua 3.");
		// tinh toan so phan tu trong vector.
		Enumeration<Number> vEnum = v.elements();
		System.out.println("\nCac phan tu trong Vector:");
		while (vEnum.hasMoreElements())
			System.out.print(vEnum.nextElement() + " ");
		System.out.println();
	}
}
