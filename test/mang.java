package test;

import java.util.Arrays;

public class mang {
    public static void main(String[] args) {
        int M[] = new int[4];
        M[0] = 7;
        M[1] = 0;
        M[2] = 3;
        M[3] = 9;
        System.out.println("Mang cua ban la: ");
        for (int i=0; i<M.length; i++){
            System.out.println(M[i] + "\t");
        }

        Arrays.sort(M);
        System.out.println("Mang cua ban la: ");
        for (int i=0; i<M.length; i++){
            System.out.println(M[i] + "\t");
        }
    }
}
