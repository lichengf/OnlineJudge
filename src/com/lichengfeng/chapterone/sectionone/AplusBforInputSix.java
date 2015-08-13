package com.lichengfeng.chapterone.sectionone;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AplusBforInputSix {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String str = "";
			while((str = bf.readLine())!=null){
				String []num = str.split(" ");
				int start = Integer.valueOf(num[0]);
				int sum = 0;
				while(start!=0) {
					sum += Integer.valueOf(num[start]);
					start = start -1;
				}
				System.out.println(sum);
			}
		} catch (Exception e) {
		}
	}
}
