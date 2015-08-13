package com.lichengfeng.chapterone.sectionone;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AplusBforInputSeven {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = "";
			int n = 1;
			while((str = bf.readLine())!=null) {
				if (n != 1) {
					System.out.println();
				}
				String []num = str.split(" ");
				System.out.println(Integer.valueOf(num[0])+Integer.valueOf(num[1]));
				n++;
			}
		} catch (Exception e) {
		}
	}
}
