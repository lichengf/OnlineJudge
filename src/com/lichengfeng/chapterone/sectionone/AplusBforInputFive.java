package com.lichengfeng.chapterone.sectionone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AplusBforInputFive {

	public static void main(String[] args) {
		BufferedReader bd = new BufferedReader(new InputStreamReader(System.in));
		try {
			int N = Integer.valueOf(bd.readLine());
			while(N != 0) {
				String str = bd.readLine();
				String []M = str.split(" ");
				int start = Integer.valueOf(M[0]);
				int sum = 0;
				while(start!=0) {
					sum += Integer.valueOf(M[start]);
					start = start - 1;
				}
				System.out.println(sum);
				N = N - 1;
			}
		} catch (IOException e) {
		}
	}
}
