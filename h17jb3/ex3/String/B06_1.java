/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h17jb3.ex3.String;

import java.util.*;

/**
 *
 * @author Admin
 */
public class B06_1 {

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        int max;
        System.out.println("Nhap vao chuoi: ");
        str = sc.nextLine();
        int[] sta = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char c;
            c = str.charAt(i);
            sta[(int) c]++;
        }
        
        max = sta[0];
        int k = 0;
        int[] c=new int[256];
        
        for (int i = 0; i < sta.length; i++)
        {
            if (i != 32) {
                if (max <= sta[i]) {
                    k = i;
                    c[i]=k;
                    max = sta[i];
                    
                }
            }
        }
        
        for(int i=0;i<sta.length;i++)
            if(sta[i]==max)
        System.out.println("Ky tu: " +(char)c[i] + " Xuat hien nhieu nhat " + max + " lan");
    }

}
