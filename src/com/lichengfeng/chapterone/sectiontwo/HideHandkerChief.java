package com.lichengfeng.chapterone.sectiontwo;
/**
 * @author lichengfeng
 * I can not solve this problem , this is wrong answer.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HideHandkerChief {
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
					int index = 0;
					while(M>0) {
						index = N%M;
						N = M;
						M = index;
					}
					
					if (N == 1) {
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
