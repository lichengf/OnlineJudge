package com.lichengfeng.chapterone.sectiontwo;

import java.util.Scanner;

public class HigherMath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int currentNum = 0;
		while(N > 0) {
			int m1 = sc.nextInt();
			int m2 = sc.nextInt();
			int m3 = sc.nextInt();
			boolean isRightTriangle = false;
			if ( (m1 + m2) > m3 && (m1 + m3) > m2 && (m2 + m3) > m1) {
				isRightTriangle = true;
			}
			if (isRightTriangle) {
				if ( (m1*m1 + m2*m2) == m3*m3 || (m1*m1 + m3*m3) == m2*m2 || (m2*m2 + m3*m3) == m1*m1) {
					isRightTriangle = true;
				} else {
					isRightTriangle = false;
				}
			}
			
			currentNum++;
			System.out.println("Scenario #"+currentNum+":");
			if(isRightTriangle) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			System.out.println();
			N--;
		}
	}
}
