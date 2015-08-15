package com.lichengfeng.chapterone.sectiontwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BalloonComes {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = 0;
		try {
			N = Integer.valueOf(bf.readLine());
			while (N > 0) {
				String str;
				str = bf.readLine();
				String[] num = str.split(" ");
				char c = num[0].charAt(0);
				int op1 = Integer.valueOf(num[1]);
				int op2 = Integer.valueOf(num[2]);

				switch (c) {
				case '+':
					System.out.println(op1 + op2);
					break;
				case '-':
					System.out.println(op1 - op2);
					break;
				case '*':
					System.out.println(op1 * op2);
					break;
				case '/':
					
					if(op1 % op2 != 0) {
						System.out.format("%.2f",(op1/(1.0*op2))).println();
					} else {
						System.out.println(op1/op2);
					}
					break;
				}
				N--;
			}
		} catch (IOException e1) {
		}
	}
}
