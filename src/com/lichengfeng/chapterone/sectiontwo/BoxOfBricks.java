package com.lichengfeng.chapterone.sectiontwo;

import java.util.Scanner;

public class BoxOfBricks {

	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner cin=new Scanner(System.in);
        int ave , i , n , ans , t = 1;
        int a[] = new int[50];
        while (true) {
            n = cin.nextInt();
            if (n == 0) break;
            ave = 0;
            for (i = 0;i < n;i++) {
                a[i] = cin.nextInt();
                ave += a[i];
            }
            ave /= n; ans = 0;
            for (i = 0;i < n;i++)
                if (a[i] > ave) ans += a[i] - ave;
            System.out.println("Set #"+t);
            System.out.println("The minimum number of moves is "+ans+".");
            System.out.println();
            t ++;
        }
    }
}
