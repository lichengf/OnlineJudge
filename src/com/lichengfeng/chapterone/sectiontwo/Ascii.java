package com.lichengfeng.chapterone.sectiontwo;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			int N = Integer.valueOf(str);
			while(N > 0) {
				String ascStr = sc.nextLine();
				String [] ascArray = ascStr.split(" ");
				for(int i = 0 ; i < ascArray.length ; i++) {
					System.out.print((char)(int)Integer.valueOf(ascArray[i]));
					N--;
				}
			}
		}
	}
}
