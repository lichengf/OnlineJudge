package com.lichengfeng.chapterone.sectiontwo;

import java.util.Scanner;

public class Buildings {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num > 0) {
			int totalGreen = 0;
			int N = sc.nextInt();
			int M = sc.nextInt();
			for (int i = 0 ; i < N ; i++) {
				for (int j = 0 ; j < M ; j++) {
					if(sc.nextInt() == 1) {
						totalGreen++;
					}
				}
			}
			num--;
			System.out.println(totalGreen);
		}
	}
}
