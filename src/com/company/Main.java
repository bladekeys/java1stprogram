package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a = {1, 4 , 6, 8, 40, 123 ,46, 6787, 586868};
        int b=0;
        for(int i=0; i<a.length;i++) {
            b+=a[i];
        }
        System.out.println(b);

        b=0;
        int i=0;
        while (i<a.length){
            b+=a[i];
            i++;
        }
        System.out.println(b);

        b=0;
        i=0;
        do{
            b+=a[i];
            i++;
        } while(i<a.length);
        System.out.println(b);
    }
}