package com.lichengfeng.chapterone.sectiontwo;

import java.util.Scanner;

public class DecimalSystem {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner cin=new Scanner(System.in);
		while(cin.hasNextLine()) {
			try {
				int sum = 0;
				String str = cin.nextLine();
				int N = Integer.valueOf(str);
				while (N > 0) {
					String[] currentLine = cin.nextLine().split("\\(");
					int Y = Integer.valueOf(currentLine[1].split("\\)")[0]);
					Integer X = Integer.parseInt(currentLine[0],Y);
					sum+=X;
					N--;
				}
				System.out.println(sum);
			} catch (Exception e) {
			}
		}
	}
}
