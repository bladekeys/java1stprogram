package com.company;

import java.util.Scanner;

public class Main {
    private static int i;
    private static float b;
    private static int[] a;
    public static void main(String[] args) {
        // 1.3
        a = new int[]{1, 4, 6, 8, 40, 123, 46, 6787, 5868};
        b=0;
        for(i=0; i<a.length;i++) {
            b+=a[i];
        }
        System.out.println(b);
        obnulenie();

        while (i<a.length){
            b+=a[i];
            i++;
        }
        System.out.println(b);
        obnulenie();

        do{
            b+=a[i];
            i++;
        } while(i<a.length);
        System.out.println(b);
        obnulenie();

        // 1.5
        b=1;
        for(i=0;i<10;i++){
            System.out.print(b+"\t");
            b/=2;
        }
        obnulenie();
        //

        //1.7
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        b=1;
        if (num<=0) System.out.println("bad boy" +num);
        else for(i=1;i<=num;i++)
            b*=i;
        System.out.println(b);
        obnulenie();

    };

    private static void obnulenie(){
        i=0;
        b=0;
    }
}