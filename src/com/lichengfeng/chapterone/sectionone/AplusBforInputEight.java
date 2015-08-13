package com.lichengfeng.chapterone.sectionone;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AplusBforInputEight {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			int N = Integer.valueOf(bf.readLine());
			int flag = 1;
			while(N != 0) {
				if (flag != 1) {
					System.out.println();
				}
				String str = bf.readLine();
				String []num = str.split(" ");
				int start = Integer.valueOf(num[0]);
				int sum = 0;
				while(start!=0) {
					sum += Integer.valueOf(num[start]);
					start--;
				}
				System.out.println(sum);
				N--;
				flag++;
			}
		} catch (Exception e) {
		}
	}
}
