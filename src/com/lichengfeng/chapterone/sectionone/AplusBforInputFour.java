package com.lichengfeng.chapterone.sectionone;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AplusBforInputFour {

	public static void main(String[] args) {
		try {
			BufferedReader bd = new BufferedReader(new InputStreamReader(System.in));
			String str = "";
			while ( (str = bd.readLine()) != null ) {
				String []num = str.split(" ");
				int N = Integer.valueOf(num[0]);
				int temp = 0;
				if (N!=0) {
					while(N!=0){
						temp+=Integer.valueOf(num[N]);
						N = N - 1;
					}
					System.out.println(temp);
				}else {
					break;
				}
			}
		} catch (Exception e) {
		}
	}
}
