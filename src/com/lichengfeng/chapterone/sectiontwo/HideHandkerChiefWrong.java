package com.lichengfeng.chapterone.sectiontwo;
/**
 * @author lichengfeng
 * I can not solve this problem , this is wrong answer.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HideHandkerChiefWrong {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = "";
			while((str = bf.readLine()) != null) {
				String[] num = str.split(" ");
				int N = Integer.valueOf(num[0]);
				int M = Integer.valueOf(num[1]);
				if(N == -1 && M == -1) {
					break;
				} else {
					int index = 1 , sum = N;
					while(sum > 0) {
						index = (index + M)%N;
						sum--;
						if (index == 1) {
							if(sum > 0) {
								System.out.println("POOR Haha");
								break;
							} else {
								System.out.println("YES");
								break;
							}
						}
					}
				}
			}
		} catch (Exception e) {
			
		}
	}
}
