package com.lichengfeng.chapterone.sectiontwo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HideHandkerChief {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		boolean []isChecked = new boolean[100000000];
		try {
			String str = "";
			while((str = bf.readLine()) != null) {
				Arrays.fill(isChecked, false);
				String[] num = str.split(" ");
				int N = Integer.valueOf(num[0]);
				int M = Integer.valueOf(num[1]);
				if(N == -1 && M == -1) {
					break;
				} else {
					int temp = 1;
					int sum = 0;
					for (int i = 1 ; i <= N ; i++) {
						temp = (temp+M)%N;
						if (isChecked[temp]) {
							isChecked[temp] = true;
							sum++;
						} else {
							break;
						}
					}
					if (sum == N) {
						System.out.println("YES");
					} else {
						System.out.println("POOR Haha");
					}
				}
			}
		} catch (Exception e) {
		}
	}
} 
